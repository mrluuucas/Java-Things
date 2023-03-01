package Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest
{
    public static void main(String[] args) throws IOException
    {
        buscarArquivos();
//        File diretorio = new File("arquivo");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio Criado" + mkdir);
//        File arquivo = new  File(diretorio, "rquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo Criado" + newFile);
//        File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
//        boolean rename = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("renomeado Arquivo " + rename);
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioNovoNome =  diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Diretorio Renomeado" + diretorioNovoNome);
    }

    public static void buscarArquivos()
    {
        File file = new File("/home/central/IdeaProjects/continuando_curso_javano_linux");
        String[] list = file.list();
        for (String arquivo: list)
        {
            System.out.println(arquivo);
        }
    }
}
