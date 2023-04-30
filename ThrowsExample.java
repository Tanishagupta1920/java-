import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
class ReadAndWrite{
    void readfile()throws FileNotFoundException{
        FileInputStream fil= new FileInputStream("d:/abc.txt");

    }
    void writefile()throws FileNotFoundException{
        FileOutputStream file = new FileOutputStream("d:/xyz.txt");
    }

}
public class ThrowsExample {
    public static void main(String[] args) {
        ReadAndWrite rw= new ReadAndWrite();
        try{
        rw.readfile();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            rw.writefile();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
            System.out.println("hello");
    }
}
