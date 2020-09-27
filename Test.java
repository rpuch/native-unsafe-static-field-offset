import sun.misc.Unsafe;
import java.lang.reflect.*;

public class Test {
	public static void main(String[] args) throws Exception {
		Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) unsafeField.get(null);
		long offset = unsafe.staticFieldOffset(unsafeField);
		System.out.println(offset);
	}
}
