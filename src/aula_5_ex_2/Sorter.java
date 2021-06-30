package aula_5_ex_2;

import java.util.Comparator;

public interface Sorter<T> {
    abstract void sort(T[] array, Comparator<T> comparator);
}
