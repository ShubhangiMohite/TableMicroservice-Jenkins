package com.example.table.controller;

import com.example.table.entity.Table1;
import com.example.table.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Table1-app")
public class TableController
{
    @Autowired
    TableService tableService;

    @PostMapping("/create")
    public Table1 create(@RequestBody Table1 table)
    {
        return tableService.create(table);
    }

    @GetMapping("/getById/{id}")
    public Table1 getById(@PathVariable Integer id)
    {
        return tableService.getById(id);
    }
    @GetMapping("getall")
    public List<Table1> getAll()
    {
        return tableService.getAll();
    }
    @PutMapping("/update")
    public Table1 update(@RequestBody Table1 table)
    {
        return tableService.update(table);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id)
    {
        tableService.delete(id);
    }

}
