import Exceptions.*;
import calculation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main  {
    public static void main(String[] args) throws ZeroDivException,CharUndef {
      //  Value v1= new Value(1);
      //  Value v2= new Value(2);
     //   ICalc ex = new Sum(new Mult(v1,v2),new Sum(v2,v1));
     //   System.out.println(ex.getCalcStr());
     //   System.out.println(ex.Calc());
        List<ICalc> expressions = new ArrayList<>();

        Ex e = new Ex();

        //(4+0+3)*5+6
        e.add(new Value(4), '+');
        e.add(new Value(3), '+');
        e.add(new Value(5 ),'*');
        e.add(new Value(6),'+');
         System.out.println(e);
         System.out.println(e.calc());

         //Выражение с параметром
        Map<String, Integer> parameters = new HashMap<>();
        parameters.put("a", 42);
        parameters.put("b", 24);
        expressions.add(new Div(new Mult(CreateParametr.Create("a"),
                        new Sum(new Value(45),
                        CreateParametr.Create("c"))),
                new Value(2)));
        V_s_param v_s_param = new V_s_param(expressions, parameters);
        for ( int i=0;i< expressions.size();i++) {
            System.out.println("Выражение:  "  +expressions.get(i).getCalcStr()
                    + "   ,где " + parameters);

            int result = expressions.get(i).Calc();
            System.out.println("    Результат: " + result);

        }
    }
}//нужно доделать try и catch
//сделать форму

