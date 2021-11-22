package calculation;

import Exceptions.CharUndef;
import Exceptions.ZeroDivException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class V_s_param {

         List<ICalc> expressions;
         Map<String, Integer> parameters;

        public V_s_param(List<ICalc> expressions, Map<String, Integer> parameters) throws CharUndef {
            this.expressions = expressions;
            this.parameters = parameters;

            setParameters();
        }

        private void setParameters() throws CharUndef {
            for (var parameter : parameters.keySet()) {
                for (var e : expressions) {
                    e.SetParameter(parameter, parameters.get(parameter));
                }
            }
        }

        public List<Integer> EvaluateExpressions() throws ZeroDivException, CharUndef {
            List<Integer> results = new ArrayList<>();
            for (var e : expressions) {
                results.add(e.Calc());
            }

            return results;
        }
    }


