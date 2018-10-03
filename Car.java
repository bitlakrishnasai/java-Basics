public class Car {
    private int wheele;
    private int doors;
    private String model;

    public void setModel(String model) {
        this.model = model;
        if (model=="00"){

        }else{this.model="unknown";}
    }

    public String getModel() {
        return model;
    }
}
