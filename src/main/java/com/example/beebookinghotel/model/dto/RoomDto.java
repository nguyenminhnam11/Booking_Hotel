package com.example.beebookinghotel.model.dto;


import com.example.beebookinghotel.enums.RoomStatus;
import com.example.beebookinghotel.enums.RoomType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {
    private Long id;
    @NotNull
    @NotBlank
    private String name;
    private String description;
    private RoomStatus status;
    @NotNull
    @Positive(message = "Phải là số nguyên dương")
    private Double price;
    @NotNull
    @Positive(message = "Phải là số nguyên dương")
    private Integer floor;
    @NotNull
    @Positive(message = "Phải là số nguyên dương")
    private Integer capacity;
    @NotNull
    @Positive(message = "Phải là số nguyên dương")
    private Integer acreage;
    @NotNull
    @Positive(message = "Phải là số nguyên dương")
    private Integer quantityBed;
    @NotNull(message = "RoomType không được null")
    private RoomType type;
    private String image;

    private Double discountedPrice;

    private List<AmenitiesDto> amenities;
    @JsonIgnore
    private List<MultipartFile> images;

}