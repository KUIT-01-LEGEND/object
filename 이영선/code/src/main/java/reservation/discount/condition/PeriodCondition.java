package reservation.discount.condition;

import reservation.Screening;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        LocalDateTime screeningStart = screening.getStartTime();
        return screeningStart.getDayOfWeek().equals(dayOfWeek) &&
                startTime.isBefore(screeningStart.toLocalTime()) &&
                endTime.isAfter(screeningStart.toLocalTime());
    }
}
