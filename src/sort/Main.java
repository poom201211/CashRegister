package sort;

public class Main {

    private static SortAllData sad = new SortAllData();

    public static void main(String[] args) {
        Fish a[] = { new Fish(4.3),
                new Fish(1.2),
                new Fish(8.6),
                new Fish(4.4)};
        sad.sort(a, new FishComparator());
        for (Fish data : a) {
            System.out.println("Fish with width: "+data.getWidth());
        }
    }

}
