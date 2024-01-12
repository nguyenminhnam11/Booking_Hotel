package com.example.beebookinghotel.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomImageDto {

    private Long id;
    private String imageUrl;
    private String notes;
    private Long room;

}