package Lab4_Magora_KI_307;
public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        calc.doCalculation(2);
        
        System.out.println("  y=cos/tg(2x)  = " + calc.doCalculationWithInputInside());
        System.out.println("Result has been written to the file."); 

    }
}
