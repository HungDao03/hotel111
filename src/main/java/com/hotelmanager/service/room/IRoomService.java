package com.hotelmanager.service.room;

import com.hotelmanager.entity.Room;
import com.hotelmanager.service.IGenericService;

import java.util.List;

public interface IRoomService extends IGenericService<Room> {
    List<Room> findAllWithRoomType(); // ⛳ Thêm dòng này
}
