package calculation;

public class CreateParametr {
    public static ICalc Create(int value) {
        return new Value(value);
    }

    public static ICalc Create(String name) {
        return new Param(name);
    }

}
