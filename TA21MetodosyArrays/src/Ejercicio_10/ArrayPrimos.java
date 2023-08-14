/**
 * 
 */
package Ejercicio_10;

/**
 * 
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class ArrayPrimos {

	/**
	 * 
	 */
	public ArrayPrimos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamañoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo:"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo:"));

        int[] numerosPrimos = generarArrayPrimos(tamañoArray, min, max);
        mostrarArray(numerosPrimos);
        int mayor = encontrarMayor(numerosPrimos);
        JOptionPane.showMessageDialog(null, "El mayor número primo en el array es: " + mayor);
    }

    public static boolean esPrimo(int numero) {
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

    public static int[] generarArrayPrimos(int tamaño, int min, int max) {
        Random random = new Random();
        int[] array = new int[tamaño];
        int contador = 0;

        while (contador < tamaño) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            if (esPrimo(numeroAleatorio)) {
                array[contador] = numeroAleatorio;
                contador++;
            }
        }

        return array;
    }

    public static void mostrarArray(int[] array) {
        StringBuilder mensaje = new StringBuilder("Array de números primos:\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public static int encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    

	}

}
