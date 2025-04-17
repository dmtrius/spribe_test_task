package pl.spribe.spribe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.spribe.spribe.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
