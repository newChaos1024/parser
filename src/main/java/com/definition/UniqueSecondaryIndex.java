package com.definition;

import java.util.List;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
public class UniqueSecondaryIndex extends AbstractSecondaryIndex {

    public UniqueSecondaryIndex(String indexName, List<String> fields) {
        super(indexName, fields);
    }

    @Override
    public boolean isUnique() {
        return true;
    }

}
