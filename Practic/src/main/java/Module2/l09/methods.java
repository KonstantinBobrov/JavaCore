package Module2.l09;

import java.util.*;

/**
 * Created by PharuS on 21.12.2016.
 */
public class methods {
    public static void main(String[] args) {
        B obj1 = new B();

        int[] a = {1,2};

        a.clone();

        Set abs = new TreeSet<B>();
        abs.add(obj1);

    }

}

class A{
    // final - запрет на переопределении в потомке

    void met1(){

    }

}

class B extends A implements Cloneable, Comparable<A>{

    @Override
    public int compareTo(A o) {
        return 0;
    }

    @Override
    public void met1(){

    }
}

class C implements Comparator<C>{

    @Override
    public int compare(C o1, C o2) {
        return 0;
    }

    @Override
    public Comparator<C> reversed() {
        return null;
    }
}
