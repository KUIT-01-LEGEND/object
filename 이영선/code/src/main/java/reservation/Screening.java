package reservation;

import java.time.LocalDateTime;

public class Screening {        // 상영
    private Movie movie;
    private int sequence;       // 상영 순번 (하루 중 몇번째로 상영되는 영화인지)
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    // 책임 : 영화를 예매하라.
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    // 영화 예매 요금을 계산하라는 책임을 Movie 객체에게 할당
    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);

        // 나는 sequence와 whenScreened 변수를 파라미터로 넘기는게 좋을 것이라 생각했는데,
        // 그렇게 넘겨버리면 Screening 객체의 캡슐화가 깨진다. (인터페이스에 이 객체가 가지고 있는 데이터가 노출됨)
    }
}
