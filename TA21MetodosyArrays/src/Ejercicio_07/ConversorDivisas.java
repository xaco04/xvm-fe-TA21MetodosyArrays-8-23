/**
 * 
 */
package Ejercicio_07;

/**
 * 
 */
import javax.swing.JOptionPane;
public class ConversorDivisas {

	/**
	 * 
	 */
	public ConversorDivisas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cantidadEuros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad en euros:"));
        String monedaDestino = JOptionPane.showInputDialog("Introduce la moneda a la que deseas convertir (dolares, yenes, libras):");

        convertirDivisa(cantidadEuros, monedaDestino);
    }

    public static void convertirDivisa(double euros, String moneda) {
        double cambio = 0.0;
        String monedaSimbolo = "";

        switch (moneda.toLowerCase()) {
            case "dolares":
                cambio = 1.28611;
                monedaSimbolo = "$";
                break;
            case "yenes":
                cambio = 129.852;
                monedaSimbolo = "¥";
                break;
            case "libras":
                cambio = 0.86;
                monedaSimbolo = "£";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Moneda no válida.");
                return;
        }

        double cantidadConvertida = euros * cambio;
        JOptionPane.showMessageDialog(null, euros + " euros equivalen a " + cantidadConvertida + " " + monedaSimbolo);
    

	}

}
