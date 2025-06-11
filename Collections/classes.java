package Collections;

class Data {
    private Integer num;
    private String name;
    // private InternalData internalData;

    Data(int _num, String _name, int revenue) {
        this.num = _num;
        this.name = _name;
        // this.internalData = new InternalData(10000);
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setNum(int _num) {
        this.num = _num;
    }

    public Integer getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

}

class InternalData {
    public Integer revenue;

    InternalData(int _revenue) {
        this.revenue = _revenue;
    }
}

public class classes {
    public static void main(String[] args) {

        Data dataob1 = new Data(9, "Random", 1000);
        Data dataob2 = new Data(12, "Praham", 100);
        // System.out.println(dataob1.name + " " + dataob2.name);
        System.out.println(dataob1.getName());
        dataob2.setName("Hello");
        dataob2.setNum(69);
        System.out.println(dataob2.getNum());

    }
}
