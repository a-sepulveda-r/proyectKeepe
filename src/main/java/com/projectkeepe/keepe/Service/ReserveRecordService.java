package com.projectkeepe.keepe.Service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.projectkeepe.keepe.Model.ReserveRecord;
import com.projectkeepe.keepe.Repository.ReserveRecordRepository;

@Service
@Transactional
public class ReserveRecordService {

    private ReserveRecordRepository reserveRecordRepository;

    public ReserveRecordService(ReserveRecordRepository reserveRecordRepository){
        this.reserveRecordRepository = reserveRecordRepository;
    }

    public void saveReserveRecord(ReserveRecord reserveRecord){
        reserveRecordRepository.save(reserveRecord);
    }

    public void updateReserveRecord (ReserveRecord reserveRecord){
        reserveRecordRepository.save(reserveRecord);
    }

    public List<ReserveRecord> findAll(){
        return reserveRecordRepository.findAll();
    }

    public List<ReserveRecord> buscarPorFecha(Date reserveRecordDate){
        return reserveRecordRepository.findAllReserveRecordsDate(reserveRecordDate);
    }

    public void eliminarReserveRecord (Integer id){
        reserveRecordRepository.deleteById(id);
    }
    
}
