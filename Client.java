
package veri.iletişimi.ödevi.pkg2;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("127.0.0.1", 300);

        //dosya gönderme
        File myFile = new File("C:\\Users\\Murat\\Desktop\\test.txt");
        byte[] mybytearray = new byte[(int) myFile.length()];

        FileInputStream fis = new FileInputStream(myFile);
        BufferedInputStream bis = new BufferedInputStream(fis);

        bis.read(mybytearray, 0, mybytearray.length);

        OutputStream os = sock.getOutputStream();

        os.write(mybytearray, 0, mybytearray.length);

        os.flush();

        sock.close();
    }
}
