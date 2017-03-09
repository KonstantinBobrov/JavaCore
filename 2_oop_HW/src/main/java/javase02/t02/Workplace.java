package javase02.t02;

import java.util.ArrayList;
import java.util.List;

public class Workplace {
    List<Stationery> set = new ArrayList<>();

    public void addStationery(Stationery obj) {
        if (null != obj)
            set.add(obj);
    }

    public double getCoastAllStationery() {

        double coast = 0.0;
        for (Stationery pair : set) {
            coast += pair.getPrice();
        }

        return coast;
    }
}
