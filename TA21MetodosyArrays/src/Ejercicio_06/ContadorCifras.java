/**
 * 
 */
package Ejercicio_06;

/**
 * 
 */
import javax.swing.JOptionPane;
public class ContadorCifras {

	/**
	 * 
	 */
	public ContadorCifras() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = obtenerNumeroEnteroPositivo();

        int cantidadCifras = contarCifras(numero);

        JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + cantidadCifras + " cifras.");
    }

    public static int obtenerNumeroEnteroPositivo() {
        int numero = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero positivo:"));
                if (numero >= 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Introduce un número entero positivo válido.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce un número válido.");
            }
        }
        
        return numero;
    }

    public static int contarCifras(int numero) {
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        
        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    

	}

}
