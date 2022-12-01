package com.projectkeepe.keepe.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectkeepe.keepe.Model.ReserveRecord;

public interface ReserveRecordRepository extends JpaRepository<ReserveRecord, Integer> {

        @Query(value = "SELECT * FROM ReserveRecord WHERE reserveRecordDate = ?1", nativeQuery = true)
        List<ReserveRecord> findAllReserveRecordsDate(Date reserveRecordDate);
    
        @Query(value = "SELECT * FROM ReserveRecord WHERE review = ?1", nativeQuery = true)
        List<ReserveRecord> findAllReserveRecordsReview(String review);
    
        // @Query(value = "SELECT * FROM ReserveRecord WHERE fullName = ?1", nativeQuery = true)
        // List<ReserveRecord> findAllUserFullName(String fullName);
    
        // @Query(value = "SELECT * FROM ReserveRecord WHERE rut = ?1", nativeQuery = true)
        // List<ReserveRecord> findAllUserRut(String rut);
    }

