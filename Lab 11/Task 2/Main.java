import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        FileReader fr=new FileReader("Announcements.txt");
        BufferedReader br=new BufferedReader(fr);


        String line;

        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        

    }
}