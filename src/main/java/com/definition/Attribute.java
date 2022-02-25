package com.definition;

/**
 * @author xinqian.zhu
 * @date 2022/2/24
 */
public class Attribute {

    private String key;

    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static Attribute of(String key, String value) {
        Attribute attribute = new Attribute();
        attribute.key = key;
        attribute.value = value;
        return attribute;
    }

}
