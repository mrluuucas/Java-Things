package Wio.test;

import java.io.*;

public class BufferedTest
{
    public static void main(String[] args)
    {
        File file = new File("arquivo.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader bf = new BufferedReader(new FileReader(file)))
        {
            bw.write("Escrevendo No Arquivo ");
            bw.newLine();
            bw.write("Teste De Linha");
            bw.flush();

            String s = null;

            while ((s = bf.readLine()) != null)
            {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write("Escrevendo No Arquivo ");
//            bw.newLine();
//            bw.write("Teste De Linha");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader bf = new BufferedReader(fr);
//
//            String s = null;
//
//            while ((s = bf.readLine()) != null)
//            {
//                System.out.println(s);
//            }
//            bf.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
