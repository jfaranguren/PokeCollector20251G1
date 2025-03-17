package model;

public class Controller {

    private PokemonCard[] collection;

    public Controller(){
       collection = new PokemonCard[200];
       testData();
    }

    public void testData(){

        savePokemonCard("Leafeon", 80, 3, 40);
        savePokemonCard("Jolteon", 80, 4, 100);

    }

    /**
     * Descripcion: ...
     * pre: El arreglo collection debe estar inicializado
     * pos: PokemonCard queda añadido al arreglo collection
     * @param name String El nombre de la carta a registrar 
     * @param healthPoints int ...
     * @param pokemonType int ...
     * @param attackPower int ...
     * @return boolean true si se añade, false si no
     */
    public boolean savePokemonCard(String name, int healthPoints, int pokemonType, int attackPower){

        PokemonType temp = PokemonType.AGUA;

        switch (pokemonType) {
            case 1:
                temp = PokemonType.AGUA;
                break;
            case 2:
                temp = PokemonType.FUEGO;
                break;
            case 3:
                temp = PokemonType.PLANTA;
                break;
            case 4:
                temp = PokemonType.ELECTRICO;
                break;
            default:
                temp = PokemonType.AGUA;
            break;
        }

        PokemonCard newCard = new PokemonCard(name, healthPoints, temp, attackPower);

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
        String list="Las cartas registradas son:\n";

        for (int i = 0; i < collection.length; i++) {
            if(collection[i]!=null){
                list+=(i+1)+"|"+collection[i].getName()+"\n"; //collection[i] es un objeto PokemonCard
            }
        }
        return list;
    }

    public String getPokemonTypeList(){

        String msg = "Los tipos registrados son: ";
        PokemonType[] types = PokemonType.values();

        for (int i = 0; i < types.length; i++) {
            msg+=(i+1)+". "+types[i]+"\n";
       }

        return msg+"\n";

    }

    public boolean verifyCard(int position){
        if (collection[position]!=null){
            return true;
        }
        return false;
    }

    public void modifyCard(String name, int healthpoints, int pokemontype, int attackPower, int position){
        PokemonType temp=PokemonType.AGUA;
        switch (pokemontype) {
            case 1:
                temp=PokemonType.AGUA;
                break;
            case 2:
                temp=PokemonType.FUEGO;
                break;
            case 3:
                temp=PokemonType.PLANTA;
                break;
            case 4:
                temp=PokemonType.ELECTRICO;
                break;
            default:
            temp=PokemonType.AGUA;
                break;
        }
        PokemonCard newCard=new PokemonCard(name, healthpoints, temp, attackPower);
        collection[position-1]=newCard;
    }



    
}
