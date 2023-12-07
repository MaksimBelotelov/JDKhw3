package homework;

public class Pair<T, E> {
    T n1;
    E n2;

    Pair(T number1, E number2) {
        n1 = number1;
        n2 = number2;
    }

    public T getN1() {
        return n1;
    }

    public E getN2() {
        return n2;
    }

    @Override
    public String toString() {
        return "[" + n1 + ", " + n2 + "]";
    }

    public static void main(String[] args) {
        Pair<Integer, Double> pair1 = new Pair<>(1, 5.1);
        System.out.println(pair1);
    }
}
