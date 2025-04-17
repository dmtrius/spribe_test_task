package pl.spribe.spribe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.spribe.spribe.entity.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {
}
