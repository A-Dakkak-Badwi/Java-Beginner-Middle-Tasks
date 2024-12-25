package tag01;
import javax.swing.*;

public class ConvertTemperatur{

    public static void main(String[] Strings) {
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Input a degree in Fahrenheit: "));

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        JOptionPane.showMessageDialog(null,fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}