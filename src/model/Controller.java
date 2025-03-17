package model;

public class Controller {

    private PokemonCard[] collection;

    public Controller(){
       collection = new PokemonCard[200];
    }

    /**
     * Descripcion: ...
     * pre: El arreglo collection debe estar inicializado
     * pos: PokemonCard queda añadido al arreglo collection
     * @param name String El nombre de la carta a registrar 
     * @param healthPoints int ...
     * @param pokemonType String ...
     * @param attackPower int ...
     * @return boolean true si se añade, false si no
     */
    public boolean savePokemonCard(String name, int healthPoints, String pokemonType, int attackPower){

        PokemonCard newCard = new PokemonCard(name, healthPoints, pokemonType, attackPower);

        for (int i = 0; i < collection.length; i++) {

            if(collection[i]==null){
                collection[i]=newCard;
                return true;
            }
            
        }        
        
        return false;
    }

    /**
     * Descripcion: 
     * pre: El arreglo collection debe estar inicializado
     * @return String la lista de cartas registradas
     */
    public String getCollection(){
        String list="";

        for (int i = 0; i < collection.length; i++) {
            if(collection[i]!=null){
                list+=(i+1)+"|"+collection[i].getName(); //collection[i] es un objeto PokemonCard
            }
        }
        return list;
    }



    
}
