package pl.spribe.spribe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfRooms;

    @Enumerated(EnumType.STRING)
    private AccommodationType accommodationType;

    private Integer floor;

    private BigDecimal baseCost;

    private String description;

    @OneToMany(mappedBy = "unit", cascade = CascadeType.ALL)
    private List<Booking> bookings = new ArrayList<>();
}
