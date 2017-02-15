package Module2.l10_annotations;

/**
 * Created by PharuS on 23.12.2016.
 */
public interface DemoInterface {

    default void DemoInterface(){

    }

    int m1(double d);
    default byte m2(double d){
        return  1;
    };
}
