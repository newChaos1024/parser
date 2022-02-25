package com.definition;

import java.util.List;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
abstract public class AbstractIndex {

    private List<String> fields;

    protected AbstractIndex(List<String> fields) {
        this.fields = fields;
    }


    public List<String> fields() {
        return fields;
    }

}
