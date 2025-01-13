package com.example.coursework.database.repositories;

import com.example.coursework.components.Processors;
import com.example.coursework.components.RamMemory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RamMemoryRepository extends JpaRepository<RamMemory, Long> {

}
