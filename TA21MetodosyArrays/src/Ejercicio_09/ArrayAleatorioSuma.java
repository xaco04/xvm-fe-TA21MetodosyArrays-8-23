/**
 * 
 */
package Ejercicio_09;

/**
 * 
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class ArrayAleatorioSuma {

	/**
	 * 
	 */
	public ArrayAleatorioSuma() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamañoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));
        int[] numeros = new int[tamañoArray];

        rellenarArray(numeros, 0, 9);
        mostrarArrayYSuma(numeros);
    }

    public static void rellenarArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void mostrarArrayYSuma(int[] array) {
        StringBuilder mensaje = new StringBuilder("Valores del array:\n");
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            mensaje.append("Posición ").append(i).append(": ").append(array[i]).append("\n");
            suma += array[i];
        }
        mensaje.append("Suma total: ").append(suma);
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

	

}
