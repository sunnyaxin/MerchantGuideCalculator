import model.Roman;
import model.Unit;

public class ExtractExpression {
    public Unit extract(String expression) {
        String[] array = expression.split(" ");
        return new Unit(array[0], Roman.valueOf(array[2]));
    }
}
