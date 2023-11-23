java.util.Scanner;
java.io.*;

public class Controladora {
	public static void main(String[]args){
		WebMaker generador = new WebMaker();
		PrintWriter escritor = new PrintWriter("index.txt");
		Scanner lector = new Scanner(new FileWriter("form.txt"));
		
		escritor.println(generador.imprimirEncabezado());
	}
}
