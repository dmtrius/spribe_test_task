package pl.spribe.spribe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.spribe.spribe.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
