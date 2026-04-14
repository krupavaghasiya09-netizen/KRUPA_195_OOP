import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws Exception{
        File f1=new File("a.txt");
        File f2=new File("b.txt");

        if(f1.exists()){
            f1.renameTo(f2);
        }

        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.length());
        System.out.println(f2.canRead());
        System.out.println(f2.lastModified());
    }
}
