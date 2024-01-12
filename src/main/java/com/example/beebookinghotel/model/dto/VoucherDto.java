package com.example.beebookinghotel.model.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VoucherDto {
    private Long id;

    private String voucherCode;

    private String voucherName;
    private LocalDate startAt;

    @NotNull(message = "Vui lòng chọn ngày kết thúc")
    private LocalDate endAt;

    @NotNull(message = "Vui lòng nhập số lượng")
    @Positive(message = "Số lụợng phải là số nguyên dương")
    private Long quantity;

    @NotNull(message = "Vui lòng nhập đầy đủ thông tin")
    @Positive(message = "Áp dụng tối thiểu phải lớn hơn 0")
    private Double minApply;

    @NotNull(message = "Vui lòng nhập đầy đủ thông tin")
    @Positive(message = "Áp dụng tối đa phải là số nguyên dương")
    private Double maxApply;

    @NotNull(message = "Vui lòng chọn kiểu giám giá")
    private int voucherType;

    @NotNull(message = "Vui lòng nhập giám giá")
    private Double discount;

    private String notes;


}
