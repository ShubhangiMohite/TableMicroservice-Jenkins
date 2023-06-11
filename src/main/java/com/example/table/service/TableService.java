package com.example.table.service;

import com.example.table.dao.TableRepository;
import com.example.table.entity.Table1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService
{
    @Autowired
    TableRepository tableRepository;

    public Table1 create(Table1 table)
    {
        return tableRepository.save(table);
    }
    public Table1 getById(Integer id)
    {
        return tableRepository.findById(id).get();
    }

    public List<Table1> getAll()
    {
        return tableRepository.findAll();
    }

    public Table1 update(Table1 table)
    {
        return tableRepository.save(table);
    }

    public void delete(Integer id)
    {
        tableRepository.deleteById(id);
    }

}
