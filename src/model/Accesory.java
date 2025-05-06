package model;

public class Accesory implements Priceable{

    private String name;

    public Accesory(String name) {
        this.name = name;
    }

    @Override
    public double calculatePrice() {
       
        return 0.0;
    }

    
    
    
}
