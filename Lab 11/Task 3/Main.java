import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{

        FileReader fr=new FileReader("Data.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        int count=0;

        while((line=br.readLine())!=null){
            count++;
        }

        System.out.println("Lines: "+count);
    }
}