import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LeituraEEscritaEmArquivo {
	
	public static void main(String[] args) throws IOException {
		InputStream arquivoEntrada = new FileInputStream("create-table-livro.sql");
		Scanner scanner = new Scanner(arquivoEntrada);
		FileOutputStream arquivoSaida = new FileOutputStream("create-table-livro2.sql");
		PrintStream printStream = new PrintStream(arquivoSaida);
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			printStream.println(linha);
		}
		scanner.close();
		printStream.close();
	}
	
}
