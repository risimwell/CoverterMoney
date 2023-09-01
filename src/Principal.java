import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Declarar las variables que vamos a usar
		double cantidad, resultado;
		int opcion, monedaOrigen, monedaDestino;

		// Crear un arreglo con los nombres de las monedas
		String[] monedas = {"Peso colombiano", "Dólar", "Euro"};

		// Crear un arreglo bidimensional con las tasas de cambio
		double[][] tasas = {{1, 0.00025, 0.00022}, {4000, 1, 0.85}, {4500, 1.18, 1}};

		// Mostrar un mensaje de bienvenida
		JOptionPane.showMessageDialog(null, "Bienvenido al conversor de moneda");

		// Iniciar un bucle para repetir el proceso de conversión
		do {
		// Pedir al usuario la cantidad de dinero que quiere convertir
		cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Qué cantidad de dinero quieres convertir?"));

		// Pedir al usuario la moneda de origen
		monedaOrigen = JOptionPane.showOptionDialog(null, "¿Qué moneda tienes?", "Elige una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);

		// Pedir al usuario la moneda de destino
		monedaDestino = JOptionPane.showOptionDialog(null, "¿A qué moneda quieres convertir?", "Elige una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);

		// Aplicar la fórmula de conversión usando las tasas correspondientes
		resultado = cantidad * tasas[monedaOrigen][monedaDestino];

		// Mostrar el resultado por pantalla
		JOptionPane.showMessageDialog(null, String.format("%.2f %s son %.2f %s", cantidad, monedas[monedaOrigen], resultado, monedas[monedaDestino]));

		// Preguntar al usuario si quiere salir o convertir otra moneda
		opcion = JOptionPane.showConfirmDialog(null, "¿Quieres salir o convertir otra moneda?", "Elige una opción", JOptionPane.YES_NO_OPTION);

		} while (opcion == JOptionPane.NO_OPTION); // Repetir el bucle mientras el usuario no quiera salir

		// Mostrar un mensaje de despedida
		JOptionPane.showMessageDialog(null, "Gracias por usar el conversor de moneda. Hasta pronto.");
		}
		
		// TODO Auto-generated method stub

	}


