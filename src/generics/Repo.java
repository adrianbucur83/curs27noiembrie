package generics;

import java.util.Map;

public interface Repo <T, X>{

    void save(T t, X x);
    void remove(T t);
    Map<T, X> list();
    int count();
   // public  <T, X extends Comparable<? super X>> void sortByValue(Map<T, X> map);

}
