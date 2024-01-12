package com.example.beebookinghotel.entity;



import com.example.beebookinghotel.enums.BookingStatus;
import com.example.beebookinghotel.enums.PaymentMethod;
import com.example.beebookinghotel.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate createAt;

    private LocalDate checkInAt;

    private LocalDate checkOutAt;

    private Long total;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;


    private long discount;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToMany(mappedBy = "booking")
    private List<BookingFacility> bookingFacilities;

    public List<Facility> getAllFacility() {
        List<Facility> list = new ArrayList<>();

        for (BookingFacility bookingFacility : this.getBookingFacilities()) {
            list.add(bookingFacility.getFacility());
        }

        return list;

    }

    public Long getBookingDate() {
        if (checkInAt != null && checkOutAt != null) {
            return ChronoUnit.DAYS.between(checkInAt, checkOutAt);
        }
        return 0l;
    }

}



