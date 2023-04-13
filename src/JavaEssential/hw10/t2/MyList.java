package JavaEssential.hw10.t2;

class MyList<T> {
    private final T[] listEl = (T[]) new Object[1];

    T[] tmp;

    public MyList(T arg) {
        this.listEl[0]=arg;
    }

    public String toString() {
        System.out.println(listEl[0]);
return "dd";
    }
}
