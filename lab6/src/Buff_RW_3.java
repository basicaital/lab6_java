package src;

import java.io.*;

public class Buff_RW_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Student\\Desktop\\AitalPIE22\\Алгоритмизация 6 лаба\\BufferedReader.txt"),1024);
            out = new BufferedWriter(new FileWriter("C:\\Users\\Student\\Desktop\\AitalPIE22\\Алгоритмизация 6 лаба\\BufferedWriter.txt"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine())!=null){
                lineCount ++;
                System.out.println(lineCount+":"+s);
                out.write(s);
                out.newLine();
            }
        }catch (IOException e){
            System.out.println("Ошибка!!!!!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
