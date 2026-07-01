package HashMap;

import java.util.HashSet;

public class HashSetCF {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(3);
        set.add(-9);
        set.add(3);
        set.add(8);
        set.add(2);
        System.out.println(set);
        System.out.println("element size of the set : "+set.size());
        System.out.println(set.contains(9));
        System.out.println(set.contains(-3));
        System.out.println(set.contains(2));
        System.out.println(set.remove(3));
        System.out.println(set.size());

        // traversal

        for(int ele : set) {
            System.out.print(ele+" ");
        }


    }


}
