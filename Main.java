package attestation_work_java;

import attestation_work_java.functions.ToyRaffle;
import attestation_work_java.model.Toy;
import attestation_work_java.model.ToyList;

public class Main {
    public static void main(String[] args) {
        Toy bear = new Toy(1, "Teddy Bear", 12, 25.00);  //Создание экземпляров игрушек
        Toy rabbit = new Toy(2, "Plush Bunny", 8, 15);
        Toy monkey = new Toy(3, "Plush Monkey", 10, 30);
        Toy tiger = new Toy(4, "Plush Tiger", 7, 15);
        Toy dragon = new Toy(5, "Plush Dragon", 4, 75);

        ToyList toyList = new ToyList();                                       // Список для игрушек

        toyList.addToy(bear);
        toyList.addToy(rabbit);
        toyList.addToy(monkey);
        toyList.addToy(tiger);
        toyList.addToy(dragon);

        // toyList.showToyList();                                     // Вывести список

        // toyList.changePercent(2, 15);                              // Замена процента

        ToyRaffle raffle = new ToyRaffle();

        raffle.gameOn(toyList);
    }
}
