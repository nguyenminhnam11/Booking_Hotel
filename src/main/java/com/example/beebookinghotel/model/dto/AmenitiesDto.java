package com.example.beebookinghotel.model.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AmenitiesDto {
    private Long id;
    @NotBlank(message = "Vui lòng nhập tên tiện ích!")
    private String name;
}
