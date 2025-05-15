package com.hotelmanager.controller;

import com.hotelmanager.entity.Room;
import com.hotelmanager.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")

public class UserController {

    @Autowired
    private RoomService roomService;


    @GetMapping({"", "/"})
    public String showAdminDashboard() {
        return "user/user-rooms";
    }
}
