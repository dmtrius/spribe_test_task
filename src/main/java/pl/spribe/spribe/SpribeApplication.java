package pl.spribe.spribe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.spribe.spribe.entity.AccommodationType;
import pl.spribe.spribe.entity.Unit;
import pl.spribe.spribe.repository.UnitRepository;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class SpribeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpribeApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(UnitRepository unitRepository) {
        return args -> {
            if (unitRepository.count() < 100) {
                for (int i = 0; i < 90; i++) {
                    Unit unit = new Unit();
                    unit.setNumberOfRooms(ThreadLocalRandom.current().nextInt(1, 6));
                    unit.setAccommodationType(AccommodationType.values()[ThreadLocalRandom.current().nextInt(3)]);
                    unit.setFloor(ThreadLocalRandom.current().nextInt(1, 10));
                    unit.setBaseCost(BigDecimal.valueOf(ThreadLocalRandom.current().nextInt(100, 500)));
                    unit.setDescription("Random unit " + i);
                    unitRepository.save(unit);
                }
            }
        };
    }

}
