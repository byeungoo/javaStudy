package inputoutput;

import java.io.*;

public class BufferedOutputStreamEx1 {

    public static void main(String[] args) {
        BufferedOutputStream bufferedOutputStream;
        try(FileOutputStream fileOutputStream = new FileOutputStream("/Users/byeonguhun/github/javaStudy/src/inputoutput/789.txt")) {
            // BufferedOutputStream의 버퍼 크기를 5로 한다.
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 5);
            for (int i = 0; i <= '9'; i++) {
                bufferedOutputStream.write(i);
            }
            bufferedOutputStream.close();   // 버퍼에 남아있는 모든 내용을 출력해준다. 보조스트림을 사용하면 기반 스트림의 close나 flush를 호출하지 않아도 된다.
                                            // 보조스트림을 close해주면된다.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
