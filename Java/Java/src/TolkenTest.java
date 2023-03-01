public class TolkenTest
{
    public static void main(String[] args)
    {
        String str = "William, Paulo, Joana, Camila, Anna, John, Matheus";
        String[] tolkens = str.split(",");
        for (String arr: tolkens)
        {
            System.out.println(arr.trim());
        }

    }
}
