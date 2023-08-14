/**
 * 
 */
package Ejercicio_01;
/**
 * 
 */
import javax.swing.JOptionPane;
public class CalculadoraAreas {
	/**
	 * 
	 */
	public CalculadoraAreas() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String figura = JOptionPane.showInputDialog("Introduce la figura para calcular el área (círculo, cuadrado, triángulo):");
        figura = figura.toLowerCase();

        double area = 0.0;

        switch (figura) {
            case "círculo":
                double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo:"));
                area = calcularAreaCirculo(radioCirculo);
                break;
            case "cuadrado":
                double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado:"));
                area = calcularAreaCuadrado(ladoCuadrado);
                break;
            case "triángulo":
                double baseTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triángulo:"));
                double alturaTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triángulo:"));
                area = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Figura no válida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El área del " + figura + " es: " + area);
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

	}


