import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created by PharuS on 09.03.2017.
 */
public class MapResources {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        Iterator iter = props.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
