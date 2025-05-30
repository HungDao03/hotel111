package com.hotelmanager.controller;

import com.hotelmanager.entity.Room;
import com.hotelmanager.enums.RoomStatus;
import com.hotelmanager.service.room.IRoomService;
import com.hotelmanager.service.room.RoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IRoomService roomService;

    // Trang dashboard
    @GetMapping({"", "/"})
    public String showAdminDashboard() {
        return "admin/dashboard/admin-dashboard";
    }

//    // Danh sách phòng
//    @GetMapping("/rooms")
//    public String showRooms(Model model) {
//        List<Room> rooms = roomService.findAll();
//        model.addAttribute("rooms", rooms);
//        return "admin/room/admin-rooms";
//    }
//
//    // Chi tiết phòng
//    @GetMapping("/rooms/{id}")
//    public String showRoomDetail(@PathVariable Long id, Model model) {
//        Room room = roomService.findById(id);
//        model.addAttribute("room", room);
//        return "admin/room/room-detail";
//    }
//
//    // ✅ Hiển thị form tạo phòng
//    @GetMapping("/rooms/create")
//    public String showCreateForm(Model model) {
//        model.addAttribute("room", new Room());
//        model.addAttribute("roomStatuses", RoomStatus.values());
//        return "admin/room/admin-room-create";
//    }
//
//    // ✅ Xử lý tạo mới phòng
//    @PostMapping("/rooms/create")
//    public String createRoom(@ModelAttribute("room") @Valid Room room,
//                             BindingResult result,
//                             Model model) {
//
//        RoomStatus status = room.getStatus();
//
//        // Kiểm tra status có null không
//        if (status == null) {
//            result.rejectValue("status", "error.room", "Trạng thái phòng không được để trống.");
//        }
//
//        if (status == RoomStatus.EMPTY) {
//            // Nếu phòng trống thì không cần thông tin người thuê
//            room.setTenantName(null);
//            room.setPhoneNumber(null);
//            room.setEmail(null);
//        } else {
//            // Nếu không trống thì validate người thuê
//            if (room.getTenantName() == null || !room.getTenantName().matches("^[\\p{L}\\s]+$")) {
//                result.rejectValue("tenantName", "error.room", "Tên người thuê chỉ được chứa chữ và không được để trống.");
//            }
//
//            if (room.getPhoneNumber() == null || !room.getPhoneNumber().matches("^0\\d{9}$")) {
//                result.rejectValue("phoneNumber", "error.room", "Số điện thoại phải bắt đầu bằng 0 và có 10 chữ số.");
//            }
//
//            if (room.getEmail() == null || !room.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
//                result.rejectValue("email", "error.room", "Email không hợp lệ.");
//            }
//        }
//
//        // Nếu có lỗi, quay lại form
//        if (result.hasErrors()) {
//            model.addAttribute("roomStatuses", RoomStatus.values());
//            return "admin/room/admin-room-create";
//        }
//
//        // Lưu phòng
//        roomService.save(room);
//        return "redirect:/admin/rooms";
//    }
//
//    // ✅ Cập nhật phòng
//    @PostMapping("/rooms/update")
//    public String updateRoom(@ModelAttribute("room") @Valid Room room,
//                             BindingResult result,
//                             Model model) {
//
//        RoomStatus status = room.getStatus();
//
//        if (status == RoomStatus.EMPTY) {
//            room.setTenantName(null);
//            room.setPhoneNumber(null);
//            room.setEmail(null);
//        } else {
//            if (room.getTenantName() == null || !room.getTenantName().matches("^[\\p{L}\\s]+$")) {
//                result.rejectValue("tenantName", "error.room", "Tên người thuê chỉ được chứa chữ và không được để trống.");
//            }
//            if (room.getPhoneNumber() == null || !room.getPhoneNumber().matches("^0\\d{9}$")) {
//                result.rejectValue("phoneNumber", "error.room", "Số điện thoại phải bắt đầu bằng 0 và có 10 chữ số.");
//            }
//            if (room.getEmail() == null || !room.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
//                result.rejectValue("email", "error.room", "Email không hợp lệ.");
//            }
//        }
//
//        if (result.hasErrors()) {
//            model.addAttribute("room", room);
//            return "admin/room/room-detail";
//        }
//
//        roomService.save(room);
//        return "redirect:/admin/rooms";
//    }
//
//    @GetMapping("/rooms/delete/{id}")
//    public String deleteRoom(@PathVariable Long id) {
//        roomService.deleteById(id);
//        return "redirect:/admin/rooms";
//    }

}
