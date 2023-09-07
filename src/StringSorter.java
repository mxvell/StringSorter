import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public List<String>sortStrings(List<String>unsortedString, String exceptionChar){
        List<String> startWithException = new ArrayList<>();
        List<String> doesNotStartWithException = new ArrayList<>();
        for (String str : unsortedString) {
            if (str.startsWith(exceptionChar)) {
                startWithException.add(str);
            } else {
                doesNotStartWithException.add(str);
            }
        }
        Collections.sort(doesNotStartWithException);
        Collections.sort(startWithException, Collections.reverseOrder());
        doesNotStartWithException.addAll(startWithException);
        return doesNotStartWithException;
    }
}
