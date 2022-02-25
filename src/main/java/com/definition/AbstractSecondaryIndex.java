package com.definition;

import java.util.List;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
abstract public class AbstractSecondaryIndex extends AbstractIndex {

    private String indexName;

    public AbstractSecondaryIndex(String indexName, List<String> fields) {
        super(fields);
        this.indexName = indexName;
    }

    abstract public boolean isUnique();

    public String indexName() {
        return indexName;
    }

}
