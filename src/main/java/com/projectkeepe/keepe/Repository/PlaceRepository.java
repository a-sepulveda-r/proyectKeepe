package com.projectkeepe.keepe.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectkeepe.keepe.Model.Place;

public interface PlaceRepository extends JpaRepository<Place,Integer>{

    @Query (value = "SELECT * FROM Place WHERE placeName = ?1", nativeQuery = true)
    List<Place> findAllPlaceName(String placeName);

    @Query (value = "SELECT * FROM Place WHERE placeType = ?1", nativeQuery = true)
    List<Place> findAllPlaceType(String placeType);

    @Query (value = "SELECT * FROM Place WHERE adress = ?1", nativeQuery = true)
    List<Place> findAllAdress (String adress);

    @Query (value = "SELECT * FROM Place WHERE ticket = ?1",nativeQuery = true)
    List<Place> findAllPlaceTicket (String ticket); 
    
}
