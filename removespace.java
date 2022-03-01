package activity1;

public class removespace {
public static void main(String[] args)
    {
        String str = "H E L L O      ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}

