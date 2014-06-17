package org.breeswish.garage;

/**
 * Created by Breezewish on 6/15/14.
 */
public class Car implements Comparable<Car> {
    /**
     * @return The registration number of the car
     */
    public String getRegistrationNumber() {
        return regNum;
    }

    /**
     * @return The repair hours
     */
    public int getRepairHours() {
        return repairHours;
    }

    /**
     * @return The repair price
     */
    public int getRepairPrice() {
        return repairPrice;
    }

    /**
     * Registration number
     */
    private String regNum;

    /**
     * The number of hours it takes to fix the car
     */
    private int repairHours;

    /**
     * The number of euros you can charge the customer for the repairs
     */
    private int repairPrice;

    /**
     * Constructor
     * @param _regNum       Registration number
     * @param _repairHours  Repair hours
     * @param _repairPrice  Repair price
     */
    public Car(String _regNum, int _repairHours, int _repairPrice) {
        regNum = _regNum;
        repairHours = _repairHours;
        repairPrice = _repairPrice;
    }

    public String toString() {
        return regNum + "_" + repairHours + "_" + repairPrice;
    }

    @Override
    /**
     * for sorting
     */
    public int compareTo(Car c) {
        return regNum.compareTo(c.getRegistrationNumber());
    }

}
