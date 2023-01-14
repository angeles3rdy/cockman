package main.storeMethods;

public interface AEInterface {

    public abstract void login();

    public abstract void adminTask();

    public abstract void staffTask();

    public abstract void adminManageProducts();

    public abstract void staffManageProducts();

    public abstract void viewCriticalLevel();

    public abstract void viewProductStatistics();

    public abstract void frozenProducts();

    public abstract void toyProducts();

    public abstract void craftProducts();

    public abstract void cannedProducts();

    public abstract void liquorProducts();

    public abstract void utensilProducts();

    public abstract void snacksProducts();

    public abstract void pdrCondiProducts();

    public abstract void essentialProducts();

    public abstract void containerProducts();

    public abstract void sortDaysLeftASC();

    public abstract void sortDaysLeftDESC();

    public abstract void searchByDaysLeft();

    public abstract void adminMenu();

    public abstract void displaySpecificDaysLeft();

    public abstract void restockProduct();

    public abstract void moveExpiredProductsQnt();

    public abstract void moveEmptyProductsQnt();

    public abstract void moveProductSoldQnt();

    public abstract void updateSoldTable();

    public abstract void sellProduct();

    public abstract void checkIfDaysZero();

    public abstract void setExpiredStatus();

    public abstract void setEmptyStatus();
    
    //---- revision ends

    public abstract void addProduct();

    public abstract void viewItemsExpiry();

    public abstract void viewExpiredItems();

    public abstract void exitSystem();

    public abstract void postMethod();

    public abstract long compareDates(java.sql.Date dateToday, java.sql.Date expiryDate);

    public abstract void nonExpiryItems();

    public abstract void updateTodaysDate();

    public abstract void idSetter();
}
