
import com.sun.jna.Library;
import com.sun.jna.Native;

public class HelloWorld {

  public interface GOLib extends Library {
	GOLib INSTANCE = (GOLib) Native.loadLibrary("golib", GOLib.class);
    int Sum(int x, int y);
  }

  public static void main(String[] args) {
    System.out.println("Java says: about to call Go ..");
    int total = GOLib.INSTANCE.Sum(31, 12);
    System.out.println("java says: result from is " + total);
  }
}