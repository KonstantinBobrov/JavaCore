package javase02.t01;

import java.awt.*;

/**
 * Разработайте спецификацию и создайте класс Ручка (Pen).
 * Определите в этом классе методы equals(), hashCode() и toString().
 */
public class Pen {
    private Color penColor;
    private int penRange = 100;

    public Pen(){
        penColor = Color.black;
    }

    public Pen(Color penColor){
            this.penColor = penColor;
    }

    public boolean write(){
      if (penRange>0){
          penRange--;
          return true;
      }else return false;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
