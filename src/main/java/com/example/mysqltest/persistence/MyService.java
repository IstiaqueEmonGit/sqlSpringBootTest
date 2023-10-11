package com.example.mysqltest.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    private final MyRepo myRepo;


    public MyService(MyRepo myRepo) {
        this.myRepo = myRepo;
    }

    @Transactional
    public void getAllSalesRecord() {
        var results = myRepo.callGetAllSalesRecord();


        for (SalesRecordResult result :results )
        {

            System.out.println("response from the sql database:  " + result.toString());
        }

    }


//    public void callGetAllSalesRecord() {
//        var a = myRepo.getAllSalesRecord();
//        System.out.println("response from the sql database:  " + a);
//    }
//
//    @Transactional
//    public void getAllSalesRecordsAndPrintToConsole() {
//        StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("get_all_sales_record");
//        query.execute();
//
//        List<Object[]> resultList = query.getResultList();
//
//        for (Object[] row : resultList) {
//            for (Object obj : row) {
//                System.out.print(obj + " ");
//            }
//            System.out.println(); // Move to the next row
//        }
//    }


}
