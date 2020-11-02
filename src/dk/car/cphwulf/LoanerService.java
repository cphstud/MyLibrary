package dk.car.cphwulf;

import java.util.List;

public interface LoanerService {
    public List<Loaner> getAllLoaners();
    public Loaner getLoaner(CPRNr cprNr);
}
