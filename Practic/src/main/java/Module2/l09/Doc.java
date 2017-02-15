package Module2.l09;

/**
 * Created by PharuS on 21.12.2016.
 */
public abstract class Doc implements flyable, flyable2, Cloneable {
    void m1(){

    }

    public void m2(){
        System.out.println(flyable.AXE);

    }
}

interface flyable extends Cloneable{
    int AXE = 2;

    void m2();

}

interface flyable2{
    int AXE = 3;
    void m2();
}
