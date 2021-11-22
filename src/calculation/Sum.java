package calculation;

import Exceptions.CharUndef;
import Exceptions.ZeroDivException;
import calculation.ICalc;

public class Sum implements ICalc {
    ICalc l,r;
    public Sum(ICalc l,ICalc r){
        this.l=l;
        this.r=r;
    }
    public void SetParameter(String name, Integer value) throws CharUndef {
        l.SetParameter(name, value);
        r.SetParameter(name, value);
    }
    @Override
    public int Calc() throws ZeroDivException {
        int lv= l.Calc();
        int rv=r.Calc();
        System.out.println(this.getCalcStr() + " = " + (rv+lv));
        return lv+rv;
    }

    @Override
    public String getCalcStr() {
        String ls = l.getCalcStr();
        String rs = r.getCalcStr();
        return ls+"+"+rs;
    }
}
