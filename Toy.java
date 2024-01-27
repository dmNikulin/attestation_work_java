package attestation_work_java;

public class Toy {
    public Integer id;
    public String name;
    public Integer count;
    public double percent;
    
    public Toy(Integer id, String name, Integer count, double percent) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public double getPercent() {
        return percent;
    }

    public void changePer(double per){
        this.percent = per;
    }
      
    @Override
    public String toString() {
        return "[id= " + id + ", Название= " + name + ", Осталось= " + count + ", Вероятность= " + percent + "]";
    }
}
