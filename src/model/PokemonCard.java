package model;

public class PokemonCard {

    private String name;
    private int healthPoints;
    private PokemonType pokemonType;
    private PokemonAttack[] attacks;

    public PokemonCard(String name, int healthPoints, PokemonType pokemonType, PokemonAttack attack){
        this.name=name;
        this.healthPoints=healthPoints;
        this.pokemonType=pokemonType;
        attacks = new PokemonAttack[2];
        addAttack(attack);
    }

    public PokemonCard(String name, int healthPoints, PokemonType pokemonType, PokemonAttack[] attacks){
        this.name=name;
        this.healthPoints=healthPoints;
        this.pokemonType=pokemonType;
        this.attacks = attacks;
    }

    public void addAttack(PokemonAttack attack){
        for (int i = 0; i < attacks.length; i++) {
            if(attacks[i]==null){
                attacks[i]=attack;
                break;
            }
        }
     
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints=healthPoints;
    }

    public PokemonType getPokemonType(){
        return pokemonType;
    } 

    public void setPokemonType(PokemonType pokemonType){
        this.pokemonType = pokemonType;
    }
    
    public PokemonAttack[] getAttacks() {
        return attacks;
    }

      public String toString(){
        return name+", "+healthPoints+", "+pokemonType;
        //Añadir el toString del ataque


    }
}
