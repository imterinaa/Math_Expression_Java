package calculation;
import Exceptions.*;
public class Param implements ICalc{
    private final String name;
    int value=-1;
    int flag =0;
    public  Param(String name){
        this.name = name;
         value = -1;
    }
    @Override
    public int Calc() {
        return value;
    }

    @Override
    public String getCalcStr() {
        return name;
    }

    @Override
    public void SetParameter(String name, Integer value) throws CharUndef
    { if(flag==0){
        throw new CharUndef(name);
    }
    flag = 1;
        if (this.name.equals(name)) {
            this.value = Integer.valueOf(value);
        }
    }
}
