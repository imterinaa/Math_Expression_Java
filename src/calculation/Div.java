package calculation;

import Exceptions.CharUndef;
import Exceptions.ZeroDivException;

public class Div implements ICalc  {

    ICalc l,r;
    public Div(ICalc l,ICalc r){
        this.l=l;
        this.r=r;
    }
    @Override
    public int Calc() throws ZeroDivException {
        int lv= l.Calc();
        int rv=r.Calc();
        if (rv==0){throw new ZeroDivException("Деление на 0");}
        System.out.println(this.getCalcStr() + " = " + lv/rv);
        return lv/rv;
    }
    public void SetParameter(String name, Integer value) throws CharUndef {
        l.SetParameter(name, value);
        r.SetParameter(name, value);
    }
    @Override
    public String getCalcStr() {
        String ls = l.getCalcStr();
        String rs = r.getCalcStr();
        return ls+"/"+rs;
    }
}


