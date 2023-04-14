package JavaEssential.hw10.t2;

class MyList<T> {
    private Object[] listEl;

    private int pointer = 0;
    public MyList() {
    }
    public MyList(T arg) {
        listEl = new Object[1];
        listEl[pointer] = arg;
        pointer++;
    }
    public void add(T arg) {
        if (listEl == null) {
            listEl = new Object[1];
            listEl[pointer] = arg;
            pointer++;
            return;
        }
        Object[] tmp = new Object[pointer + 1];
        System.arraycopy(listEl, 0, tmp, 0, pointer);
        tmp[pointer++] = arg;
        listEl = tmp;
    }
    public Object get(int index) {
        return listEl[index - 1];
    }

    public int size() {
        return pointer;
    }

    @Override
    public String toString() {
        String str = "";
        for (Object tmp : listEl) {
            str += tmp.toString() + "\n";
        }
        return str;
    }
}
