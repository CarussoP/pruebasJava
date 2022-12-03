package buscar;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class DiferenciasCSV 
{
	public static void main(String[] args) throws IOException 
	{
	
		File archivo = new File("I:\\prueba\\corto.txt");
		
		//Stream<String> texto = Files.lines(archivo.toPath());
		//texto.parallel().forEach(System.out::println);
		//texto.close();
		
		List<String> txtCorto = Files.readAllLines(archivo.toPath());
		archivo = new File("I:\\prueba\\largo.txt");
		List<String> txtlargo = Files.readAllLines(archivo.toPath());
		
		int i=0;
		boolean encontrado=false;
		for(String matricula:txtCorto)
		{
			
			for(String matricula2:txtlargo)
			{
				if(matricula.equals(matricula2))
				{
					i++;
					System.out.println(i+".- Se encontro la matricula "+matricula+" en el largo");
					encontrado = true;
					break;
				}
			}
			if(!encontrado)
			{
				System.out.println("NO se encontro la matricula "+matricula+" en el largo!!!!");
			}
			encontrado=false;
		}
//		txtCorto.parallelStream().forEach(System.out::println);	
	}
}
