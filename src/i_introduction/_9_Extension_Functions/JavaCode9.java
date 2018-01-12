package i_introduction._9_Extension_Functions;

import java.util.Comparator;
import java.util.stream.Stream;

import util.JavaCode;

public class JavaCode9 extends JavaCode {
    public void useExtension() {

        Stream.of(1,2,3,4,5,6)
                .sorted(Comparator.reverseOrder())
                .toArray();
        char c = N09ExtensionFunctionsKt.lastChar("abc");
    }
}
