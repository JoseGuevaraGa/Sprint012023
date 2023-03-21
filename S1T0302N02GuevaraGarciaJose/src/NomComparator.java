import java.util.Comparator;

public class NomComparator implements Comparator {

    @Override
    public int compare(Object o1,Object o2){
        Restaurant s1=(Restaurant) o1;
        Restaurant s2=(Restaurant) o2;

        return s1.getNom().compareTo(s2.getNom());
    }


}
