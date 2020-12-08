package br.com.teste.order.converter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
	public static String getJsonToObject(String file) throws IOException{
		return new String(Files.readAllBytes(Paths.get(file)));
	}
}