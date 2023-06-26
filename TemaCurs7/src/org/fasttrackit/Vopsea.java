package org.fasttrackit;

public class Vopsea {
    //ex3
    String name;
    int price;
    int quantity;
    String category;




    public Vopsea(String name, int price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (this.quantity > 0)
            return true;
        else
            return false;

    }
}
