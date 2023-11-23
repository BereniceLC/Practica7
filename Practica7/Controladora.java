import java.util.Scanner;
import java.io.*;

public class Controladora {
	public static void main(String [] args) {
		DataOutputStream escritor = new	DataOutputStream(new FileOutputStream(“hola.bin”));
		escritor.writeInt(33465);
		escritor.writeChar(‘a’);
		escritor.writeChar(‘z’);
		escritor.writeShort(10);
		escritor.close()
		DataInputStream	lector = new DataInputStream(new FileInputStream(“hola.bin”));
		System.out.println(lector.readInt());
		System.out.println(lector.readChar());
		System.out.println(lector.readChar());
		System.out.println(lector.readShort());
		escritor.close();
	}
}
