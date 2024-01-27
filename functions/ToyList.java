package attestation_work_java.functions;

import java.util.ArrayList;

import attestation_work_java.Toy;

public class ToyList {

    public ArrayList<Toy> toyList = new ArrayList<>();

    public void addToy(Toy toy){
        this.toyList.add(toy);
    }

    public void showToyList(){
        for (Toy toy : toyList) {
            System.out.println(toy.toString() + "\n");
        }
    }

    public void changePercent(Integer id, double percernt){
        for (Toy toy : toyList) {
            if(toy.getId() == id){
                toy.changePer(percernt);
            }
        }
    }
}
