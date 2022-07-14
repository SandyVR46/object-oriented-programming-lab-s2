import java.io.*; import java.util.*;
public class filelist
{
public static void main(String[] args) 
{
File file = new File("C:\\Users\\SANDRA\\Desktop\\Folder\\");
String[] list = file.list();
for(String str : list)
{ 
    System.out.println(str);
}
System.out.println("\nSEARCHING FOR FILENAMES STARTING WITH 'i':\n");
FilenameFilter filter = new FilenameFilter() 
{ 
    public boolean accept(File dir, String fname) 
    {
        return fname.startsWith("i");
    }
};
String[] search = file.list(filter); 
if(search == null) 
{
    System.out.println("File does not exist.");
}
else 
{
    for(int i=0; i<search.length;i++) 
    { 
        String fn = search[i]; System.out.println(fn);
    }
}
}
}