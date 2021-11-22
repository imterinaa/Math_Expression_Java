package calculation;

import Exceptions.CharUndef;
import Exceptions.ZeroDivException;

public interface ICalc {
    int Calc() throws ZeroDivException;
    String getCalcStr();
    public void SetParameter(String name, Integer value) throws CharUndef;
}
