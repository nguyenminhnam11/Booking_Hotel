package com.example.beebookinghotel.entity;


import com.example.beebookinghotel.enums.VoucherType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "nvarchar(500)")
    private String voucherCode;

    @Column(columnDefinition = "nvarchar(500)")
    private String voucherName;

    private LocalDate startAt;

    private LocalDate endAt;

    private Long quantity;

    private Double minApply;

    private Double maxApply;


    @Enumerated(EnumType.STRING)
    private VoucherType voucherType;

    private Double discount;


    @Column(columnDefinition = "nvarchar(2000)")
    private String notes;

    @OneToMany(mappedBy = "voucher")
    private List<Booking> bookings;
}
