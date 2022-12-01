package com.projectkeepe.keepe.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectkeepe.keepe.Model.ReserveRecord;
import com.projectkeepe.keepe.Service.ReserveRecordService;

@CrossOrigin("*")
@RestController
public class ReserveRecordController {

    private ReserveRecordService reserveRecordService;

    public ReserveRecordController(@Autowired ReserveRecordService reserveRecordService) {
        this.reserveRecordService = reserveRecordService;
    }

    @GetMapping("/reserveRecord/findAll")
    public List<ReserveRecord> getReserveRecordAll() {
        return reserveRecordService.findAll();
    }

    @PostMapping("/reserveRecord/save")
    public void newReserveRecord(@RequestBody ReserveRecord reserveRecord) {
        reserveRecordService.saveReserveRecord(reserveRecord);
    }

    @PutMapping("/reserveRecord")
    public void updateReserveRecord(@RequestBody ReserveRecord reserveRecord) {
        reserveRecordService.saveReserveRecord(reserveRecord);
    }

    @DeleteMapping("/deleteReserveRecord/{id}")
    public void eliminarReserveRecord(@PathVariable Integer id) {
        reserveRecordService.eliminarReserveRecord(id);
    }
}
