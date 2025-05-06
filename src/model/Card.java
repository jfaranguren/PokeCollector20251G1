package model;

import java.io.Serializable;

public abstract class Card implements Priceable, Serializable{
    
    private String name;

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    


}
