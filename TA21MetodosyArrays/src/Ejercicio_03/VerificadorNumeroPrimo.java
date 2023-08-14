/**
 * 
 */
package Ejercicio_03;
/**
 * 
 */
import javax.swing.JOptionPane;
public class VerificadorNumeroPrimo {
	/**
	 * 
	 */
	public VerificadorNumeroPrimo() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        boolean esPrimo = esNumeroPrimo(numero);

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    

	}

}
