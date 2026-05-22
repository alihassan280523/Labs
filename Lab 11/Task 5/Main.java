import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{

        FileReader fr=new FileReader("Data.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        int count=0;
        int charactersCount=0;
        char[] arr=null;
        while((line=br.readLine())!=null){
            arr=line.toCharArray();
            charactersCount+=arr.length;
            count++;
        }

        System.out.println("Lines: "+count);
        System.out.println(charactersCount);
    }
}