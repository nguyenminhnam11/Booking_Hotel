package com.example.beebookinghotel.model.dto;



import com.example.beebookinghotel.enums.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingDto {
    private Long id;
    @NotNull
    private LocalDate checkInAt;
    @NotNull
    private LocalDate checkOutAt;
    @NotNull
    private LocalDate createAt;
    @NotNull
    private BookingStatus status ;
    @NotNull
    private PaymentMethod paymentMethod ;
    @NotNull
    private PaymentStatus paymentStatus;
    @NotNull
    private Long userId;
    @NotNull
    private Long voucherId;
    @NotNull
    private Long roomId;

    @NotNull
    private Long total;
    @NotNull
    private List<Long> facilityId;
  
    private long discount;
  
    private String fullname;

    private String roomName;

    private String roomImage;

}
