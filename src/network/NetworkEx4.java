package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * URLConnection을 얻은 다음 내용을 읽어오는 예제
 */
public class NetworkEx4 {

    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "https://nanagong-api.com/api/health";
        String line = "";

        try {
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line = input.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
