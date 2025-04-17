package pl.spribe.spribe.Service;

import org.springframework.stereotype.Service;
import pl.spribe.spribe.entity.Unit;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CacheService {
    private final Map<Long, Boolean> availabilityCache = new ConcurrentHashMap<>();

    public void updateAvailability(Long unitId, boolean isAvailable) {
        availabilityCache.put(unitId, isAvailable);
    }

    public long getAvailableCount() {
        return availabilityCache.values().stream().filter(Boolean::booleanValue).count();
    }

    public void restoreCache(List<Unit> allUnits) {
        for (Unit unit : allUnits) {
            boolean available =
                    Boolean.TRUE.equals(availabilityCache.put(unit.getId(), true));
        }
    }
}
