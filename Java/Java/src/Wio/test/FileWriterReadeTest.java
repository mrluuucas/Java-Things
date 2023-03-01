package Wio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReadeTest
{
    public static void main(String[] args) 
    {
        File file = new File("arquivo.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file))
        {
            fw.write("Escrevendo No Arquivo \n pulando uma linha");
            fw.flush();

            char[] in = new char[41];
            int size = fr.read(in);
            System.out.println("tamanho " + size);
            for (char c : in)
            {
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileWriter fw = new FileWriter(file);
//            fw.write("Escrevendo No Arquivo \n pulando uma linha");
//            fw.flush();
//            fw.close();
//
//            FileReader fr = new FileReader(file);
//            char[] in = new char[41];
//            int size = fr.read(in);
//            System.out.println("tamanho " + size);
//            for (char c : in)
//            {
//                System.out.print(c);
//            }
//            fr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
