package org.fasttrackit;

public class TemaCurs7 {
    public static void main(String[] args) {
        //ex1
        Person person1 = new Person("Vlad", 20, true);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old " + " and " + person1.isMarried());
        //ex2
        Person person2 = new Person("Gery", 28,  true);
        Person person3 = new Person("Maria", 15, false);
        Person person4 = new Person("Alina", 48, true);
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old " + " and " + person2.isMarried());
        System.out.println(person3.getName() + " is " + person3.getAge() + " years old " + " and " + person3.isMarried());
        System.out.println(person4.getName() + " is " + person4.getAge() + " years old " + " and " + person4.isMarried());

        //ex3
        Vopsea vopsea1 =new Vopsea("rosie", 20,500, "lavabil");
        System.out.println(vopsea1.getName() +" " + vopsea1.getPrice() + " disponibil: " + vopsea1.hasStock() + " " + vopsea1.getCategory() );
        //ex4
        Vopsea vopsea2 =new Vopsea("verde", 15,700, "lavabil");
        System.out.println(vopsea1.getName() +" " + vopsea1.getPrice() + "  " + vopsea2.getQuantity() + " " + vopsea2.getCategory() );
        Vopsea vopsea3 =new Vopsea("alba", 12,1000, "lavabil");
        System.out.println(vopsea3.getName() +" " + vopsea1.getPrice() + "  " + vopsea3.getQuantity() + " " + vopsea3.getCategory() );

        //ex5
        Fanta fanta1 = new Fanta(200, 200, true);
        System.out.println(fanta1.maxAvailability());
        Fanta fanta2 = new Fanta(200, 135, false);
        System.out.println(fanta2.theAvailableLiquid());
        Fanta fanta3 = new Fanta(200, 80, false);
        System.out.println(fanta3.emptyCapacity());
        System.out.println(fanta3.openBottle());
        System.out.println(fanta3.closedBottle());
        fanta3.drink(50);

    }

    public String toString() {

        return toString();
    }


}

