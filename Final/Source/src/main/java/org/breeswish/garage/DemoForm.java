package org.breeswish.garage;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class DemoForm {
    private JPanel panel1;
    private JTextField regNumberField;
    private JTextField repairHourField;
    private JTextField repairPriceField;
    private JButton addButton;
    private JButton clearButton;
    private JButton calculateButton;
    private JButton exitButton;
    private JTextField availableField;
    private JTable carTable;

    public DemoForm() {
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // check data
                if (regNumberField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Please input register number");
                    regNumberField.grabFocus();
                    return;
                }

                if (repairHourField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Please input repair hours");
                    repairHourField.grabFocus();
                    return;
                }

                try {
                    Integer.parseInt(repairHourField.getText());
                } catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null, "Please input valid repair hours");
                    repairHourField.grabFocus();
                    return;
                }

                if (repairPriceField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Please input repair price");
                    repairPriceField.grabFocus();
                    return;
                }

                try {
                    Integer.parseInt(repairPriceField.getText());
                } catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null, "Please input valid repair price");
                    repairPriceField.grabFocus();
                    return;
                }

                // insert into table
                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                model.addRow(new Object[]{regNumberField.getText(), repairHourField.getText(), repairPriceField.getText()});

                // clear form
                regNumberField.setText("");
                repairHourField.setText("");
                repairPriceField.setText("");

                regNumberField.grabFocus();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regNumberField.setText("");
                repairHourField.setText("");
                repairPriceField.setText("");
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int hrs = Integer.parseInt(availableField.getText());

                    DefaultTableModel model = (DefaultTableModel) carTable.getModel();

                    if (model.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(null, "Please add at least one car");
                        return;
                    }

                    // extract data from table
                    HashSet<Car> cars = new HashSet<Car>();
                    for (int i = 0; i < model.getRowCount(); ++i) {
                        Car c = new Car((String) model.getValueAt(i, 0), Integer.parseInt((String) model.getValueAt(i, 1)), Integer.parseInt((String) model.getValueAt(i, 2)));
                        cars.add(c);
                    }

                    // calculate!
                    RepairCar garage = new RepairCar();
                    Set<Car> _repairedCars = garage.repair(cars, hrs);

                    // sort the result array to make it looks better when outputing
                    Car[] repairedCars = _repairedCars.toArray(new Car[_repairedCars.size()]);
                    Arrays.sort(repairedCars);

                    // output the result
                    String output = "";
                    int priceSum = 0;
                    for (Car c : repairedCars) {
                        priceSum += c.getRepairPrice();
                        output += c.getRegistrationNumber() + "\n";
                    }

                    JOptionPane.showMessageDialog(null, "Should repair these cars: \n" + output + "\nMaximum revenue: " + priceSum);

                } catch (NumberFormatException _) {
                    JOptionPane.showMessageDialog(null, "Please input valid available hours");
                    availableField.grabFocus();
                    return;
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "TheGarage");
        JFrame frame = new JFrame("The Garage");
        frame.setContentPane(new DemoForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        DefaultTableModel model = new DefaultTableModel();
        carTable = new JTable(model);

        model.addColumn("Reg Number");
        model.addColumn("Hours");
        model.addColumn("Price");
    }

}
