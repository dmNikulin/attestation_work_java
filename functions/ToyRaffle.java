package attestation_work_java.functions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import attestation_work_java.model.Toy;
import attestation_work_java.model.ToyList;

public class ToyRaffle {

    public List<Toy> toyList = new ArrayList<>();
    Random randomResult = new Random();
    int check = 0;

    public void gameOn(ToyList toys){
        this.toyList = toys.getToyList();
        for (Toy toy : toyList) {
            if ((Math.random()>(100 - toy.getPercent())/100) && (toy.count != 0)){
                toy.changeCount();
                System.out.println("Вы выиграли: " + toy);
                check += 1;
                try {
                    FileWriter writer = new FileWriter("attestation_work_java\\doc\\prize.csv", true);
                    writer.write(toy.toString() + "\n");
                    writer.close();
                } catch (IOException e) {
                     System.out.println("Ошибка при записи в файл");
                     e.printStackTrace();
                    }
                break;
            }
        }
        if (check == 0) System.out.println("К сожалению, вы ничего не выиграли.");
    }


}
