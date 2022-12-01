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

import com.projectkeepe.keepe.Model.Place;
import com.projectkeepe.keepe.Service.PlaceService;

@RestController
@CrossOrigin("*")
public class PlaceController {

    private PlaceService placeService;

    public PlaceController(@Autowired PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/place/findAll")
    public List<Place> getPlaceAll() {
        return placeService.findAll();
    }

    @PostMapping("/place/save")
    public void newPlace(@RequestBody Place place) {
        placeService.savePlace(place);
    }

    @PutMapping("/place/update")
    public void updatePlace(@RequestBody Place place) {
        placeService.savePlace(place);
    }

    @DeleteMapping("/deletePlace/{id}")
    public void eliminarPlace(@PathVariable Integer id) {
        placeService.deletePlace(id);
    }
}
