package com.example.beebookinghotel.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "nvarchar(500)")
    private String imageUrl;

    @Column(columnDefinition = "nvarchar(500)")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

}
