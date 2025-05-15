package com.hotelmanager.entity;

import com.hotelmanager.enums.RoomStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String roomNumber;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    private String tenantName;

    private String phoneNumber;

    private String email;

    private String imageUrl; // Có thể bỏ qua nếu chưa dùng

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
}
