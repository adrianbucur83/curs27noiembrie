package generics;

public class Main {


    public static void main(String[] args) {

        GenericRepo<String, Integer> listaOrdonata = new GenericRepo<>(1);

        listaOrdonata.save("Bb", 8);
        listaOrdonata.save("Cc", 7);
        listaOrdonata.save("Aa", 9);
        listaOrdonata.save("Dd", 6);

        System.out.println("Numar obiecte in lista ordonata: " + listaOrdonata.count());

        listaOrdonata.list().forEach((o, o2) -> System.out.println(o + " and " + o2));


        GenericRepo<Integer, Person> listaPersoanSortataDupaNume = new GenericRepo<>(1);

        listaPersoanSortataDupaNume.save(10, new Person("Adi", 20, "11111"));
        listaPersoanSortataDupaNume.save(5, new Person("Bog", 25, "22222"));
        listaPersoanSortataDupaNume.save(7, new Person("Cccc", 20, "11111"));
        listaPersoanSortataDupaNume.save(190, new Person("Dddd", 20, "11111"));

        listaPersoanSortataDupaNume.sort();
        listaPersoanSortataDupaNume.list().forEach((o, o2) -> System.out.println(o + " and " + o2));


    }


}
