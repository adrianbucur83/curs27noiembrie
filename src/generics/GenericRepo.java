package generics;

import java.util.*;


public class GenericRepo<T, X> implements Repo<T, X> {

    int sorted;

    GenericRepo(int sorted) {
        this.sorted = sorted;

    }

    private T t;
    private X x;
    private Map<T, X> storage = ((sorted != 0) ? new HashMap<>() : new TreeMap<>());


    @Override
    public void save(T t, X x) {
        storage.put(t, x);

    }

    @Override
    public void remove(T t) {
        storage.remove(t);
    }

    @Override
    public Map list() {
        return storage;
    }

    @Override
    public int count() {
        return storage.size();
    }

    void sort() {

        List valuesAsList = new ArrayList();
        List<Map.Entry<T, X>> list = new ArrayList<>(storage.entrySet());

        for (X value : storage.values()) {
            valuesAsList.add(value);
        }
        Collections.sort(valuesAsList);

        Map<T, X> result = new TreeMap<>();


        for (Object v : valuesAsList) {
            for (Map.Entry<T, X> l : list) {
                if (l.getValue() == v) {
                    result.put(l.getKey(), l.getValue());
                }

            }
        }

        storage.clear();
        storage.putAll(result);


    }

/*
    <T, X extends Comparable> void sortByValue(Map<T, X> map) {
        List<Map.Entry<T, X>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<T, X> result = new LinkedHashMap<>();
        for (Map.Entry<T, X> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

     //   storage.putAll(result);
    }
*/


}
