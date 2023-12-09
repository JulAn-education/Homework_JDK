package homework_3;
/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
а также переопределение метода toString(), возвращающее строковое представление пары.
 */

public class Pair<E, T> {

    private E e;
    private T t;

    public Pair(E e, T t) {
        this.e = e;
        this.t = t;
    }

    public E getFirst() {
        return e;
    }

    public T getSecond() {
        return t;
    }

    @Override
    public String toString() {
        return "e=" + e +
                ", t=" + t;
    }
}
