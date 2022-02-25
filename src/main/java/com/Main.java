package com;

import com.definition.TableDefinition;
import com.definition.TableDefinitionParser;
import com.file.SqlFileResourceWalker;
import com.output.ExcelOutputer;
import com.output.ZipFileOutputer;
import com.process.AtpcoDataProcessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
public class Main {

    public static void main(String[] argv) throws Exception {
        if (argv.length != 2) {
            System.err.println("invalid parameter!program inputPath outputFile");
            return;
        }
        String inputFilePath = argv[0];
        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            System.err.println("file doesn't exist!");
        }
        File outputFile = new File(argv[1]);
        if (outputFile.exists()) {
            outputFile.delete();
        }
        outputFile.createNewFile();
        SqlFileResourceWalker sqlFileResourceWalker = new SqlFileResourceWalker(inputFile);
        SqlDefinitionScanner sqlDefinitionScanner = new SqlDefinitionScanner();
        sqlFileResourceWalker.walk(sqlDefinitionScanner);
        List<TableDefinition> tableDefinitions = sqlDefinitionScanner.getTableDefinitions();

        tableDefinitions = new AtpcoDataProcessor().apply(tableDefinitions);

        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            if (argv[1].endsWith(".xlsx")) {
                ExcelOutputer excelOutputer = new ExcelOutputer();
                excelOutputer.output(tableDefinitions, fileOutputStream);
            } else if (argv[1].endsWith(".zip")) {
                ZipFileOutputer zipFileOutputer = new ZipFileOutputer();
                zipFileOutputer.output(tableDefinitions, fileOutputStream);
            }

        } catch (Exception e) {
            outputFile.delete();
            throw e;
        }
    }

    private static class SqlDefinitionScanner implements Consumer<File> {

        private TableDefinitionParser tableDefinitionParser = new TableDefinitionParser();


        private List<TableDefinition> tableDefinitions = new ArrayList<>();

        @Override
        public void accept(File file) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                tableDefinitions.addAll(tableDefinitionParser.parse(fileInputStream));
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        public List<TableDefinition> getTableDefinitions() {
            return tableDefinitions;
        }
    }

}
