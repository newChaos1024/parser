package com.file;

import java.io.File;
import java.util.function.Consumer;

/**
 * @author xinqian.zhu
 * @date 2022/2/24
 */
public interface ResourceWalker {

    void walk(Consumer<File> processor);

}
