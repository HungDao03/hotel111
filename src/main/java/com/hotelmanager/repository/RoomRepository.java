package com.hotelmanager.repository;

import com.hotelmanager.entity.Room;
import com.hotelmanager.entity.RoomType;
import com.hotelmanager.enums.RoomStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    int countByRoomType(RoomType roomType);
    int countByRoomTypeAndStatus(RoomType roomType, RoomStatus status);
}
