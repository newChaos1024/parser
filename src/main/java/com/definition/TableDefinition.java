package com.definition;

import java.util.List;

/**
 * @author xinqian.zhu
 * @date 2022/2/21
 */
public class TableDefinition {

    private String dbName;

    private String tableName;

    private String engine;

    private String defaultCharset;

    private String comment;

    private List<Field> fields;

    private List<Attribute> attributes;

    private PrimaryIndex primaryIndex;

    private List<AbstractSecondaryIndex> secondaryIndices;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDefaultCharset() {
        return defaultCharset;
    }

    public void setDefaultCharset(String defaultCharset) {
        this.defaultCharset = defaultCharset;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public PrimaryIndex getPrimaryIndex() {
        return primaryIndex;
    }

    public void setPrimaryIndex(PrimaryIndex primaryIndex) {
        this.primaryIndex = primaryIndex;
    }

    public List<AbstractSecondaryIndex> getSecondaryIndices() {
        return secondaryIndices;
    }

    public void setSecondaryIndices(List<AbstractSecondaryIndex> secondaryIndices) {
        this.secondaryIndices = secondaryIndices;
    }
}
