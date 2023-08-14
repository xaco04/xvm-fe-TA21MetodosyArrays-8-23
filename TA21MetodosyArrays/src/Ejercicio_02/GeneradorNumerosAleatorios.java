/**
 * 
 */
package Ejercicio_02;

/**
 * 
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class GeneradorNumerosAleatorios {

	/**
	 * 
	 */
	public GeneradorNumerosAleatorios() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números aleatorios a generar:"));
        int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo para los números aleatorios:"));
        int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo para los números aleatorios:"));

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = generarNumeroAleatorio(minimo, maximo);
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }
    }

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    

	}

}
