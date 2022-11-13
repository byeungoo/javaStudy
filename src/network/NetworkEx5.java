package network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * 이진 데이터를 읽어서 파일에 저장하는 예제
 */
public class NetworkEx5 {

    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out  = null;
        String address = "http://www.codechobo.com/book/src/javajungsuk3_src.zip";

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("javajungsuk3_src.zip");

            while ((ch=in.read()) != -1) {
                out.write(ch);
            }

            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
