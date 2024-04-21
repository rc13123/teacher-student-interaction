import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class AddSession 
{
    static String email="";
    static String name="";
    AddSession(String email,String name)
    {
        this.email=email;
        this.name=name;
    }
    public static void func() 
    {
         // Replace with the actual username
        Properties props = new Properties();

        try (FileOutputStream out = new FileOutputStream("config.properties")) 
        {
         props.setProperty(name, email);
         props.store(out, null);
        } 
        catch (IOException e) 
        {
        e.printStackTrace();
        }
    }
    
}