package inputoutput;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

    public static void main(String[] args) {
        try {
            String fileName = "/Users/byeonguhun/github/javaStudy/src/inputoutput/test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fileReader = new FileReader(fileName);

            int data = 0;
            // FileInputStream을 이용해서 파일 내용을 읽어 화면에 출력한다.  => 한글이 깨져서 출력됨
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();

            // FileReader를 이용해서 파일 내용을 읽어 화면에 출력한다. => 한글 정상 출력
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
