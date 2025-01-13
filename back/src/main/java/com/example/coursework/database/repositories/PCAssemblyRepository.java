//package com.example.coursework.database.repositories;
//
//import com.example.coursework.database.PCAssembly;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface PCAssemblyRepository extends JpaRepository<PCAssembly, Long> {
//    @Query(value = "SELECT * FROM getcomputerforprice(?1)", nativeQuery = true)
//    PCAssembly getPCAssembly(int price);
//}
