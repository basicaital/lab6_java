package src;

import java.io.*;

public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Student\\Desktop\\AitalPIE22\\Алгоритмизация 6 лаба\\MyFile1.txt")));
             bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Student\\Desktop\\AitalPIE22\\Алгоритмизация 6 лаба\\MyFile2.txt")));

             int lineCount = 0;
             String s;
             while ((s=br.readLine())!=null){
                 lineCount++;
                 System.out.println(lineCount+":"+s);
                 bw.write(lineCount+":"+s);
                 bw.newLine();
             }
        }catch (IOException e ){
            System.out.println("Ошибка!!!!!!");
        }finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
