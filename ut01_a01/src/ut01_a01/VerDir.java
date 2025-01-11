package ut01_a01;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public abstract class VerDir {

	public static void VerDirectorio (String ruta) {
		System.out.println("Los ficheros del directorio " + ruta + " son:" );
		File f = new File(ruta);
		String[] ficheros = f.list();
		for (int i = 0; i < ficheros.length; i++) {
			System.out.println(ficheros[i]);
		}
		
	}
}