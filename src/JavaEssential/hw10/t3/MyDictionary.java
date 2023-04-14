package JavaEssential.hw10.t3;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary<K, V> {
    private final List<Dictionary<K, V>> dictionaries = new ArrayList<>();
    private int i=0;
    public void add(K word, V name) {
        dictionaries.add(new Dictionary<>(word, name));
        i++;
    }

    public Dictionary<K, V> get(int index) {
        return dictionaries.get(index);
    }
    public int size(){
        return i;
    }
    @Override
    public String toString() {
        String str = "";
        for (Dictionary<K, V> tmp : dictionaries) {
            str += tmp.toString() + "\n";
        }
        return str;
    }
}

