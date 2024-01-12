package com.example.beebookinghotel.model.dto;

import lombok.*;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class FacilityDto {

    private Long id;

    @NonNull
    private String name;

    @NonNull
    private Long price;

    private String notes;
    private Boolean isDelete;
}
