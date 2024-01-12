package com.example.beebookinghotel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "nvarchar(500)")
    private String name;

    @Column(nullable = false)
    private Long price;


    @Column(columnDefinition = "nvarchar(2000)")
    private String notes;

    private Boolean isDelete;

    @OneToMany(mappedBy = "facility")
    private List<BookingFacility> bookingFacilities;
}
