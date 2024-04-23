import java.util.ArrayList;
import java.util.List;

public class SafeArrayList<T> {
    private final List<T> list = new ArrayList<>();

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized void remove(T element) {
        list.remove(element);
    }

    public synchronized int size() {
        return list.size();
    }
}
