package reservation.discount.policy;

import reservation.Money;
import reservation.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

    public NoneDiscountPolicy() {
        super();
    }
}
