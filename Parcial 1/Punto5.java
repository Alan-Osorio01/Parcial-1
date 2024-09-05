import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class punto5 {
    public static void main(String[] args) throws Exception {
        punto5Lexer lexer = new punto5Lexer(CharStreams.fromFileName("expr.in"));
        punto5Parser parser = new punto5Parser(new CommonTokenStream(lexer));
        List<Double> results = new ArrayList<>();
        
        while (parser.expr() != null) {
            String func = parser.func().getText();
            double num = Double.parseDouble(parser.NUM().getText());
            double result = 0;
            switch (func) {
                case "Sin":
                    result = sin(toRadians(num));
                    break;
                case "Cos":
                    result = cos(toRadians(num));
                    break;
                case "Tan":
                    result = tan(toRadians(num));
                    break;
            }
            results.add(result);
        }
        
        results.forEach(System.out::println);
    }
}
