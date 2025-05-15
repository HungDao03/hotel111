package com.hotelmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomTypeInfoDTO {
    private Long id;
    private String name;
    private String description;
    private Double pricePerNight;

    private int totalRooms;
    private int availableRooms;
    private int occupiedRooms;
}
