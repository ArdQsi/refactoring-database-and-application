package com.example.coursework.database.repositories;

import com.example.coursework.components.GraphicsCards;
import com.example.coursework.components.MotherBoards;
import com.example.coursework.components.PowerSupply;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotherBoardsRepository extends JpaRepository<MotherBoards, Long> {

}
