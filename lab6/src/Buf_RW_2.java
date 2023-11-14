import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out;
        out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Student\\Desktop\\AitalPIE22\\Алгоритмизация 6 лаба\\MyFile1.txt")));
            out = new PrintWriter("C:\\Users\\Student\\Desktop\\AitalPIE22\\Алгоритмизация 6 лаба\\MyFile2.txt");

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ":" + s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
