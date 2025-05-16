package com.hotelmanager.repository;

import com.hotelmanager.entity.Room;
import com.hotelmanager.entity.RoomType;
import com.hotelmanager.enums.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query("SELECT r FROM Room r JOIN FETCH r.roomType")
    List<Room> findAllWithRoomType();
}
