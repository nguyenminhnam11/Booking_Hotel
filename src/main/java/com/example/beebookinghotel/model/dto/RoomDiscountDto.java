package com.example.beebookinghotel.model.dto;

import com.example.beebookinghotel.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDiscountDto {

    Long discountId;

    RoomType roomType;


}
