package com.example.mysqltest.persistence;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MyRepo extends JpaRepository<SalesRecordResult, String> {

    @Transactional
    @Procedure("get_all_sales_record")
    List<SalesRecordResult> callGetAllSalesRecord();

//    @Query(value = "CALL get_all_sales_record()", nativeQuery = true)
//    public List<SalesRecordResult> callGetAllSalesRecord2();
}
