package com.example.table.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Table1
{
    @Id
    private Integer tableId;
    private String tableType;

    public Table1(Integer tableId, String tableType)
    {
        this.tableId = tableId;
        this.tableType = tableType;
    }

    public Table1()
    {

    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableType() {
        return tableType;
    }


    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
}
