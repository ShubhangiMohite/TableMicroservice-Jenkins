package com.example.table.dao;

import com.example.table.entity.Table1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
public interface TableRepository extends JpaRepository<Table1,Integer>
{

}
