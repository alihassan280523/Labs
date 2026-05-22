import java.io.*;

public class Main{

    public static void main(String[] args)throws Exception{

        FileReader fr=new FileReader("Pakistan.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        int lineCount=0;

        while((line=br.readLine())!=null){
            line=line.concat(".");
            System.out.println(line);
            lineCount++;
        }

        System.out.println("Total number of lines: "+lineCount);
    }
}