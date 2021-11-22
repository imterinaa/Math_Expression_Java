package calculation;

import Exceptions.ZeroDivException;
import calculation.*;

public class Ex {
    ICalc ex= new Value(0);
    int i=0;
    public Ex(){

    }

    public void add(ICalc v, char op){

        switch(op)
        {
            case '+':
                ICalc new_ex=new Sum(ex,v);
                ex=new Sum(ex,v);
                ex = new_ex;
                break;
            case '*':
                ICalc new_ex_m=new Mult(ex,v);
                ex=new Mult(ex,v);
                ex = new_ex_m;
                break;
            case '/':
                ICalc new_ex_d=new Div(ex,v);
                ex=new Div(ex,v);
                ex = new_ex_d;
                break;
            case ' ':
                break;
        }}


    public int calc() throws ZeroDivException {
        return ex.Calc();
    }
    public String toString(){
        return "ex="+ex.getCalcStr();


}}
