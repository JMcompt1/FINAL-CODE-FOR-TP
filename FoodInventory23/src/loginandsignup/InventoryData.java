package loginandsignup;

import javax.swing.table.DefaultTableModel;

public class InventoryData {
     public static DefaultTableModel fishModel =
            new DefaultTableModel(
                    new String[]{"Name", "Weight(kg)", "Quantity"}, 0);

    public static DefaultTableModel vegetableModel =
            new DefaultTableModel(
                    new String[]{"Name", "Weight(kg)", "Quantity"}, 0);

    public static DefaultTableModel meatModel =
            new DefaultTableModel(
                    new String[]{"Name", "Weight(kg)", "Quantity"}, 0);
}
