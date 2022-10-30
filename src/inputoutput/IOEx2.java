package inputoutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 *  배열을 사용할 경우 작업 효율이 조금 더 좋아진다.
 */
public class IOEx2 {

    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        input.read(temp, 0 ,temp.length); // 읽어 온 데이터를 배열 temp에 담는다.
        output.write(temp, 5, 5);
        outSrc = output.toByteArray();

        System.out.println("Input Source : " + Arrays.toString(inSrc));
        System.out.println("temp : " + Arrays.toString(temp));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }

}
