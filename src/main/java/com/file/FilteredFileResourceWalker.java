package com.file;

import java.io.File;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author xinqian.zhu
 * @date 2022/2/22
 */
public class FilteredFileResourceWalker implements ResourceWalker {

    private File base;

    private Predicate<File> predicate;

    public FilteredFileResourceWalker(File base, Predicate<File> predicate) {
        this.base = base;
        this.predicate = predicate;
    }

    @Override
    public void walk(Consumer<File> processor) {
        doWalk(base, processor);
    }

    private void doWalk(File file, Consumer<File> processor) {
        File[] children;
        if (file.isFile()) {
            if (predicate.test(file)) {
                processor.accept(file);
            }
        } else if ((children = file.listFiles()) != null) {
            for (File child : children) {
                doWalk(child, processor);
            }
        }
    }
}
