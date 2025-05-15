package com.hotelmanager.service.roomtype;

import com.hotelmanager.entity.RoomType;
import com.hotelmanager.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService implements IRoomTypeService {

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Override
    public List<RoomType> findAll() {
        return roomTypeRepository.findAll();
    }
    @Override
    public RoomType findById(Long id) {
        return roomTypeRepository.findById(id).orElse(null);
    }
    @Override
    public RoomType save(RoomType roomType) {
        return roomTypeRepository.save(roomType);
    }
    @Override
    public void delete(RoomType roomType) {
        roomTypeRepository.delete(roomType);
    }

    @Override
    public void deleteById(Long id) {
        roomTypeRepository.deleteById(id);
    }



}
