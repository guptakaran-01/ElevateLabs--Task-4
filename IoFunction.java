import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoFunction {

    public void readFromFile(String filename) {

        try {
            FileInputStream fn = new FileInputStream(filename);
            byte[] data = fn.readAllBytes();
            String str = new String(data);
            System.out.println(str);
            fn.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public void writeToFile(String str,String filename) {
        try {
            FileOutputStream fo = new FileOutputStream(filename);
            fo.write(str.getBytes());
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
