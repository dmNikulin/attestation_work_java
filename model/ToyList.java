package attestation_work_java.model;

import java.util.ArrayList;
import java.util.List;

public class ToyList {

    public List<Toy> toyList = new ArrayList<>();

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

    public Integer size() {
        return toyList.size();
    }

    public List<Toy> getToyList(){
        return toyList;
    }

}
