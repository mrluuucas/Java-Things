package Wio.test;

import java.io.File;
import java.io.IOException;

public class FileTest
{
    public static void main(String[] args)
    {
        File file = new File("Arquivo.txt");
        if (file.exists())
        {
            System.out.println("O Arquivo existe logo esperando entradada de dados");
        }
        else
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("O Arquivo não existe Logo será criado");
        }
        System.out.println("O Que Sera Escrito No Arquivo");

    }
}
