package Module2.l10_annotations;/**
 * Created by PharuS on 23.12.2016.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface myTestAnnotation {
    //String[] params = ;
}
