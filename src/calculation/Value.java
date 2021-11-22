package calculation;

import calculation.ICalc;

public class Value implements ICalc {
    int val=0;
    public Value(){

    }
    public void SetParameter(String name, Integer value) {

    }
    public Value(int v){
        this.val=v;
    }
    @Override
    public int Calc() {
        return val;
    }

    @Override
    public String getCalcStr() {
        return String.valueOf(val);
    }
}
