/**
 * 
 */
package Ejercicio_04;

/**
 * 
 */
import javax.swing.JOptionPane;
public class CalculadoraFactorial {
	/**
	 * 
	 */
	public CalculadoraFactorial() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        long factorial = calcularFactorial(numero);

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }

        long factorial = 1;

        for (int i = numero; i > 1; i--) {
            factorial *= i;
        }

        return factorial;
    

	}

}
