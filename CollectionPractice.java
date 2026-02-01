import java.util.*;
class CollectionPractice {
public static void main(String[] args) {    

        List<Integer> list = Arrays.asList(7,7,1, 2, 3, 2, 1, 4);

        Integer first = 0;
        Integer second = 0;

        for(var i : list)
        {
            if(i>first)
            {
                second=first;
                first=i;
            }
            else if(i>=second && i!=first)
                second=i;
        }
        System.out.println("Second Largest No : "+second);
    }
}


/*
    List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 4);

        for(var x : list)
            if(list.indexOf(x)==list.lastIndexOf(x))
            {
                System.out.println("First Non Repeated Number : "+x);
                break;
            }


    List<Integer> list = Arrays.asList(1,5, 2, 3, 2, 1, 4);
        Set<Integer> set = new LinkedHashSet<>();

        for(var x : list)
            set.add(x);
        System.out.println(set);

    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1, 4));
        Integer max = Collections.max(list);
        list.remove(Integer.valueOf(max));

        System.out.print(Collections.max(list));
 */