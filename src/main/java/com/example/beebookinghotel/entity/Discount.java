package com.example.beebookinghotel.entity;


import com.example.beebookinghotel.enums.DiscountType;
import com.example.beebookinghotel.enums.RoomType;
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
@Builder
@Data
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startAt;

    private LocalDate endAt;

    private double percentChange;

    @Enumerated(EnumType.STRING)
    private DiscountType type;

    private double maxApply;

    @OneToMany(mappedBy = "discount",fetch = FetchType.EAGER)
    private List<RoomDiscount> roomDiscounts;

    public List<RoomType> getAllDiscountApply() {

        List<RoomType> roomTypes = this.getRoomDiscounts()
                .stream()
                .map(roomDiscount -> roomDiscount.getRoom().getType())
                .distinct()
                .toList();
        return roomTypes;
    }
}
