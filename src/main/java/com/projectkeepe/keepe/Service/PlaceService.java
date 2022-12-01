package com.projectkeepe.keepe.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.projectkeepe.keepe.Model.Place;
import com.projectkeepe.keepe.Repository.PlaceRepository;

@Service
@Transactional
public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    public void savePlace(Place place){
        placeRepository.save(place);
    }

    public void updatePlace(Place place){
        placeRepository.save(place);
    }

    public List<Place> findAll(){
        return placeRepository.findAll();
    }

    public void deletePlace(Integer id){
        placeRepository.deleteById(id);
    }

    public List<Place> findForPlaceName(String placeName){
        return placeRepository.findAllPlaceName(placeName);
    }
}
