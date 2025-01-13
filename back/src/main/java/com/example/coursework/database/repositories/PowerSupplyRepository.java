package com.example.coursework.database.repositories;

import com.example.coursework.components.MotherBoards;
import com.example.coursework.components.PowerSupply;
import com.example.coursework.components.Processors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerSupplyRepository extends JpaRepository<PowerSupply, Long> {

}
