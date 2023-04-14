package JavaEssential.hw10.t3;

public class Dictionary<K, V> {
    private K word;
    private V translate;

//    public Dictionary() {
//
//    }

    public K getWord() {
        return word;
    }

    public Dictionary(K word, V translate) {
        this.word = word;
        this.translate = translate;
    }

    public void setWord(K word) {
        this.word = word;
    }

    public V getTranslate() {
        return translate;
    }

    public void setTranslate(V translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        String str = "";
        str = "Слово - " + word + " переклад - " + translate;
        return str;
    }
}
