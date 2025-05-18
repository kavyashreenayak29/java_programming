//Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list.
package Swings;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private Map<String, String> countryCapitals;

    public CountryCapitalList() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Vietnam", "Hanoi");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Denmark", "Copenhagen");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Great Britain", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Africa", "Addis Ababa");
        countryCapitals.put("Greenland", "Nuuk");
        countryCapitals.put("Singapore", "Singapore");

        countryList = new JList<>(listModel);
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    for (String country : selectedCountries) {
                        String capital = countryCapitals.get(country);
                        if (capital != null) {
                            System.out.println("Capital of " + country + " is: " + capital);
                        }
                    }
                }
            }
        });

        add(new JScrollPane(countryList));
        setTitle("Country and Capital");
        setSize(250, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
