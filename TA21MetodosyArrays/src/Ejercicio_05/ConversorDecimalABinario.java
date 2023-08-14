/**
 * 
 */
package Ejercicio_05;

/**
 * 
 */
import javax.swing.JOptionPane;
public class ConversorDecimalABinario {

	/**
	 * 
	 */
	public ConversorDecimalABinario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número decimal:"));

        String numeroBinario = convertirDecimalABinario(numeroDecimal);

        JOptionPane.showMessageDialog(null, "El número binario equivalente es: " + numeroBinario);
    }

    public static String convertirDecimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero /= 2;
        }
        return binario.toString();
	}

}
