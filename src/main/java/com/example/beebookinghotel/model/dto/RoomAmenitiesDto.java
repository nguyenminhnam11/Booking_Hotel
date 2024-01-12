package com.example.beebookinghotel.model.dto;

import com.example.beebookinghotel.entity.Room;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomAmenitiesDto {
    Long id;
    Long amenities;
    Room room;
}
