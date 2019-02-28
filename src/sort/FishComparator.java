package sort;

public class FishComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Fish f1 = (Fish) o1;
        Fish f2 = (Fish) o2;

        if(f1.getWidth() < f2.getWidth()){
            return -1;
        }
        else if(f1.getWidth() > f2.getWidth()){
            return 1;
        }
        return 0;
    }
}
