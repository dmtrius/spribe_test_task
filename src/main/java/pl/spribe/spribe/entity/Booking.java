package pl.spribe.spribe.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Unit unit;

    private LocalDate startDate;
    private LocalDate endDate;
    private boolean paid;
    private LocalDateTime createdAt;
    private boolean cancelled;
}
