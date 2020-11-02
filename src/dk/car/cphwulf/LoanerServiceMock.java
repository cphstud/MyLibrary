package dk.car.cphwulf;

import java.util.List;

public class LoanerServiceMock implements LoanerService{
    @Override
    public List<Loaner> getAllLoaners() {
        return null;
    }

    @Override
    public Loaner getLoaner(CPRNr cprNr) {
        return null;
    }
}
