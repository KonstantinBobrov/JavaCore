package Module2.l10_annotations;

import java.lang.annotation.Annotation;

/**
 * Created by PharuS on 23.12.2016.
 */

@myTestAnnotation // указываем мою тестовую аннотацию
public class Demo {
    public static void main(String[] args) {
        Class<Demo> aClass = Demo.class;
        Annotation[] ann = Demo.class.getDeclaredAnnotations();
        Annotation ann_single = Demo.class.getDeclaredAnnotation(myTestAnnotation.class);
        System.out.println(ann_single);


    }
}
