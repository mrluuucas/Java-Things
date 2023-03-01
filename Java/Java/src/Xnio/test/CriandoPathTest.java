package Xnio.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest
{
    public static void main(String[] args)
    {
        ///home/central/IdeaProjects/continuando_curso_javano_linux
        Path p1 = Paths.get("/home/central/IdeaProjects/continuando_curso_javano_linux");
        System.out.println(p1.toAbsolutePath());
        File file = p1.toFile();
        Path path = file.toPath();


    }
}
