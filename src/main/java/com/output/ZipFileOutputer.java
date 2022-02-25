package com.output;

import com.definition.TableDefinition;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author xinqian.zhu
 * @date 2022/2/23
 */
public class ZipFileOutputer implements Outputer {

    @Override
    public void output(Iterable<TableDefinition> tableDefinitions, OutputStream outputStream) throws Exception {
        Map<String, List<TableDefinition>> tmp = new HashMap<>();
        for (TableDefinition tableDefinition : tableDefinitions) {
            tmp.computeIfAbsent(tableDefinition.getDbName(), key -> new ArrayList<>()).add(tableDefinition);
        }
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream)) {
            ExcelOutputer excelOutputer = new ExcelOutputer();
            for (Map.Entry<String, List<TableDefinition>> entry : tmp.entrySet()) {
                zipOutputStream.putNextEntry(new ZipEntry(entry.getKey() + ".xlsx"));
                excelOutputer.output(entry.getValue(), zipOutputStream);
                zipOutputStream.closeEntry();
            }
            zipOutputStream.flush();
        }

    }

}
