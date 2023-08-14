/**
 * 
 */
package Ejercicio_08;

/**
 * 
 */
import javax.swing.JOptionPane;

public class ArrayRellenarYMostrar {

	/**
	 * 
	 */
	public ArrayRellenarYMostrar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
        rellenarValores(numeros);
        mostrarArray(numeros);
    }

    public static void rellenarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String valorStr = JOptionPane.showInputDialog("Introduce el valor " + (i + 1) + ":");
            int valor = Integer.parseInt(valorStr);
            array[i] = valor;
        }
    }

    public static void mostrarArray(int[] array) {
        StringBuilder mensaje = new StringBuilder("Índice\tValor\n");
        for (int i = 0; i < array.length; i++) {
            mensaje.append(i).append("\t").append(array[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }


	

}
