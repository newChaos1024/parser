package com.file;

import java.io.File;

/**
 * @author xinqian.zhu
 * @date 2022/2/22
 */
public class SqlFileResourceWalker extends FilteredFileResourceWalker {

    public SqlFileResourceWalker(File base) {
        super(base, (file -> file.getName().endsWith(".sql")));
    }

}
