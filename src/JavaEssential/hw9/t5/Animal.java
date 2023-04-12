package JavaEssential.hw9.t5;

//        Використовуючи Intelij IDEA, створити проект, пакет.
//        Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
//        У класі перевизначити метод toString, щоб висновок був наступним
//        «Ім'я: Васька, вік: 45, хвіст: ні».
//        У класі Animal перевизначити методи equals & hashCode.
public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if (age != animal.age) return false;
        if (tail != animal.tail) return false;
        return name.equals(animal.name);
    }

    //    A for nearly all cases reasonable good implementation
//    was proposed in Josh Bloch's Effective Java in Item 8 (second edition).
//    The best thing is to look it up there because the author explains there why the approach is good.
//
//    A short version
//    Create a int result and assign a non-zero value.
//
//    For every field f tested in the equals() method, calculate a hash code c by:
//
//    If the field f is a boolean: calculate (f ? 0 : 1);
//    If the field f is a byte, char, short or int: calculate (int)f;
//    If the field f is a long: calculate (int)(f ^ (f >>> 32));
//    If the field f is a float: calculate Float.floatToIntBits(f);
//    If the field f is a double: calculate Double.doubleToLongBits(f)
//    and handle the return value like every long value;
//    If the field f is an object: Use the result of the hashCode() method or 0 if f == null;
//    If the field f is an array: see every field as separate element
//    and calculate the hash value in a recursive fashion and combine the values as described next.
//    Combine the hash value c with result:
//
//    result = 37 * result + c
//    Return result
//
//    This should result in a proper distribution of hash values for most use situations.
    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (name != null ? name.hashCode() : 0);
        result = 37 * result + (int) ((long) age ^ ((long) age >>> 32));
        result = 37 * result + (tail ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ім'я: " + getName() + ", вік: " + getAge() + ", хвіст:" + (isTail() ? " так" : " ні");
    }
}
