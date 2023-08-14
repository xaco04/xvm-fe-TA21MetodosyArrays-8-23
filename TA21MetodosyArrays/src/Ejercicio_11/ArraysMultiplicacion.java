/**
 * 
 */
package Ejercicio_11;

/**
 * 
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class ArraysMultiplicacion {

	/**
	 * 
	 */
	public ArraysMultiplicacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tamañoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los arrays:"));
        
        int[] array1 = new int[tamañoArray];
        rellenarArrayAleatorio(array1);
        
        int[] array2 = new int[tamañoArray];
        array2 = array1.clone();
        
        int[] resultado = multiplicarArrays(array1, array2);
        
        mostrarArray("Array 1:", array1);
        mostrarArray("Array 2:", array2);
        mostrarArray("Resultado:", resultado);
    }

    public static void rellenarArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }
        return resultado;
    }

    public static void mostrarArray(String titulo, int[] array) {
        StringBuilder mensaje = new StringBuilder(titulo + "\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}
