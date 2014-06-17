package org.breeswish.garage;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Breezewish on 6/15/14.
 */
public class RepairCar implements Garage {

    @Override
    public Set<Car> repair(Set<Car> _cars, int availableHours) {

        Car[] cars = _cars.toArray(new Car[_cars.size()]);

        // f[i][v]=max{f[i-1][v],f[i-1][v-c[i]]+w[i]}

        int[][] f = new int[cars.length+1][availableHours+1];

        for (int i = 1; i <= cars.length; ++i) {
            for (int v = 0; v <= availableHours; ++v) {
                f[i][v] = f[i-1][v];
                if (v >= cars[i - 1].getRepairHours()) {
                    int f2 = f[i-1][v-cars[i-1].getRepairHours()] + cars[i-1].getRepairPrice();
                    if (f2 > f[i][v]) {
                        f[i][v] = f2;
                    }
                }
            }
        }

        Set<Car> ret = new HashSet<Car>();

        // determine which car is selected

        int v = availableHours;

        for (int i = cars.length; i > 0; --i) {
            if (f[i][v] > f[i-1][v]) {
                ret.add(cars[i-1]);
                v = v - cars[i-1].getRepairHours();
            }
        }

        return ret;
    }
}
