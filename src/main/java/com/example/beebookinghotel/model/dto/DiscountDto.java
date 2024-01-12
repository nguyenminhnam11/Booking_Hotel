package com.example.beebookinghotel.model.dto;

import com.hotelbooking.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDto {

    private Long id;

    private LocalDate startAt;

    private LocalDate endAt;

    private double percentChange;

    private int type;

    private double maxApply;

    private long roomId;

    private List<RoomType> discountsApply;

}
