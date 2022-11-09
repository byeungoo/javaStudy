package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/byeonguhun/github/javaStudy/src/inputoutput/BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr); // 버퍼를 사용하면 입출력의 효율이 비교할 수 없을 정도로 좋아진다.

            String line = "";
            for(int i=1;(line = br.readLine()) != null; i++) {
                if(line.indexOf(";") != -1) {
                    System.out.println(i + ":" +line);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
