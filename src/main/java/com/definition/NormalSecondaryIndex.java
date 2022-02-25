package com.definition;

import java.util.List;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
public class NormalSecondaryIndex extends AbstractSecondaryIndex {

    public NormalSecondaryIndex(String indexName, List<String> fields) {
        super(indexName, fields);
    }

    @Override
    public boolean isUnique() {
        return false;
    }
}
