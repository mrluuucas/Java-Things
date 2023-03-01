package Vresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste
{
    public static void main(String[] args)
    {
        ResourceBundle sb = ResourceBundle.getBundle("messages.properties",new Locale("en", "US"));
        System.out.println(sb.getString("hello"));
        System.out.println(sb.getString("tu_e"));
        sb = ResourceBundle.getBundle("messages.properties", new Locale ("pt", "BR"));
        System.out.println(sb.getString("hello"));
        System.out.println(sb.getString("goodmorning"));
    }
}
