package com.hotelmanager.service.room;

import com.hotelmanager.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotelmanager.repository.RoomRepository;

import java.util.List;

@Service
public class RoomService implements IRoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }
    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }
    @Override
    public void delete(Room room) {
        roomRepository.delete(room);
    }
    @Override
    public void deleteById(Long id) {
        roomRepository.deleteById(id);
    }


    @Override
    public List<Room> findAllWithRoomType() {
        return roomRepository.findAllWithRoomType();
    }
}
