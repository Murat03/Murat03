import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class VeriIletişimiÖdevi {

    public static void main(String[] args) throws IOException {
        int bytesRead;
        int current = 0;

        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(300);

        while (true) {
            Socket clientSocket = null;
            clientSocket = serverSocket.accept();

            InputStream in = clientSocket.getInputStream();

            //dosya alma
            OutputStream output = new FileOutputStream("‪C:\\Users\\Murat\\Desktop\\test\\test.txt");

            byte[] buffer = new byte[1024];
            while ((bytesRead = in.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            
            output.close();
        }
    }
}
