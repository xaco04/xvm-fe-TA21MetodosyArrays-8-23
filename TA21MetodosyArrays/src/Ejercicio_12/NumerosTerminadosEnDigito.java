/**
 * 
 */
package Ejercicio_12;

/**
 * 
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class NumerosTerminadosEnDigito {

	/**
	 * 
	 */
	public NumerosTerminadosEnDigito() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamañoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));
        int digito = obtenerDigito();

        int[] numeros = generarNumerosAleatorios(tamañoArray);
        int[] numerosTerminadosEnDigito = obtenerNumerosTerminadosEnDigito(numeros, digito);

        mostrarArray("Array original:", numeros);
        mostrarArray("Números terminados en " + digito + ":", numerosTerminadosEnDigito);
    }

    public static int obtenerDigito() {
        int digito = -1;
        boolean valido = false;

        while (!valido) {
            try {
                digito = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dígito (0-9) para filtrar:"));
                if (digito >= 0 && digito <= 9) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Introduce un dígito válido (0-9).");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce un número válido.");
            }
        }

        return digito;
    }

    public static int[] generarNumerosAleatorios(int tamaño) {
        Random random = new Random();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(300) + 1;
        }
        return array;
    }

    public static int[] obtenerNumerosTerminadosEnDigito(int[] array, int digito) {
        int contador = 0;
        for (int numero : array) {
            if (numero % 10 == digito) {
                contador++;
            }
        }

        int[] numerosTerminadosEnDigito = new int[contador];
        int indice = 0;
        for (int numero : array) {
            if (numero % 10 == digito) {
                numerosTerminadosEnDigito[indice] = numero;
                indice++;
            }
        }

        return numerosTerminadosEnDigito;
    }

    public static void mostrarArray(String titulo, int[] array) {
        StringBuilder mensaje = new StringBuilder(titulo + "\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());

	}

}
