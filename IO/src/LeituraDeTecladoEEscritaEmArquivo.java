import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LeituraDeTecladoEEscritaEmArquivo {
	
	public static void main(String[] args) throws IOException {
		InputStream teclado = System.in;
		Scanner scanner = new Scanner(teclado);
		FileOutputStream arquivoSaida = new FileOutputStream("saidaTeclado.txt");
		PrintStream printStream = new PrintStream(arquivoSaida);
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			printStream.println(linha);
		}
		scanner.close();
		printStream.close();
	}
	
}
