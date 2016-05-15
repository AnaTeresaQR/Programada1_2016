package objectLists;

import enums.EnumFiles;
import java.util.ArrayList;
import java.util.List;
import managerList.ListLoader;
import managerList.ListSaver;
import salesBuilder.Sale;

/**
 * Class that is responsible for handling the sale list. Only this class can
 * create an instance of itself. Singleton pattern
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class SaleList {

    private List<Sale> saleList;
    private static SaleList uniqueInstance;

    private SaleList() {
        saleList = new ArrayList<>();
        listLoader();
    }

    /**
     * Method that creates a single instance of class
     *
     * @return the unique instance of this class
     */
    public static SaleList getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SaleList();
        }
        return uniqueInstance;
    }

    /**
     * Adds a sale into the list, returns true if can addList, or false if
     * failing to addList
     *
     * @param sale, receives the sale to addList
     * @return true, if a sale could addList, false if a sale failed to addList
     */
    public boolean addList(Sale sale) {
        if (!exist(sale)) {
            return saleList.add(sale);
        }
        return false;
    }

    /**
     * Returns a sale in the list with the index in this list
     *
     * @param i ,the index for search in the list
     * @return the sale that matches the list
     */
    public Sale getIndex(int i) {
        return saleList.get(i);
    }

    /**
     * Contains the size of the list
     *
     * @return the size of the list
     */
    public int size() {
        return saleList.size();
    }

    /**
     * Refreshes the list if new sales are added
     */
    public void refresh() {
        saleList.clear();
        listLoader();
    }

    /**
     * Load the list with file elements
     */
    private void listLoader() {
        ListLoader<Sale> loader = new ListLoader<>(EnumFiles.SALE_FILE_NAME.getValue());
        this.saleList = loader.loadList();
    }

    /**
     * Save the list in the binary file
     */
    public void save() {
        ListSaver<Sale> save = new ListSaver<>(EnumFiles.SALE_FILE_NAME.getValue());
        save.saveList(this.saleList);
    }

    /**
     * Check if a sale already exist in the list with te same car id
     *
     * @param sale, receives the sale to compare with the elements of the list
     * @return, true if have the same attributes with another object in the
     * list, false if does not existe the local object
     */
    public boolean exist(Sale sale) {
        for (Sale s : saleList) {
            if (s.getCarId().equals(sale.getCarId())) {
                return true;
            }
        }
        return false;
    }

}
