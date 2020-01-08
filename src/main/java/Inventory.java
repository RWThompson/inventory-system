import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Peripheral> list = new ArrayList<Peripheral>();

    public List<Peripheral> getEntireInventory() {
        return list;
    }

    public void addItem(Peripheral peripheral) {
        if(peripheral != null) {
            list.add(peripheral);
        }
    }

    public void removeItem(Peripheral peripheral) {
        if(list.contains(peripheral)) {
            int i = list.indexOf(peripheral);
            list.remove(i);
        }
    }

    public void editItem(int id, Peripheral edit) {
        //how do i want it edited? complete new obj? params for all vars? edit method per var?
        for(Peripheral p : list) {
            if(p.getItemId() == id) {
                list.remove(p);
                list.add(edit);
            }
        }
    }

    public boolean checkInventoryProductName(String productName) {
        boolean inStock = false;
        if(productName != null) {
            for(Peripheral p : list) {
                if(p.getProductName() == productName) {
                    inStock = true;
                }
            }
        }
        return inStock;
    }
}
