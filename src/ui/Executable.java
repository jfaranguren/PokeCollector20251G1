package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

    private Scanner input;
    private Controller controller; //

    public static void main(String[] args) {
       Executable exe = new Executable();
       exe.menu();
    }

    public Executable(){
        initializer();
    }

    public void initializer() {
        input = new Scanner(System.in);
        controller = new Controller(); //

    }

    public void registerPokemonCard() {

        input.nextLine();

        System.out.println("Digite el nombre");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida");
        int hp = input.nextInt();

        System.out.println(controller.getPokemonTypeList());

        System.out.println("Digite el tipo del Pokemon");
        int type = input.nextInt();

        input.nextLine();

        System.out.println("Digite el nombre del ataque");
        String attackName = input.nextLine();

        System.out.println("Digite el poder de ataque");
        int attackPower = input.nextInt();

        System.out.println(controller.getPokemonTypeList());

        System.out.println("Digite el tipo del ataque");
        int attackType = input.nextInt();

        if (controller.savePokemonCard(name, hp, type, attackName, attackPower, attackType)) {
            System.out.println("Carta registrada exitosamente");
        } else {
            System.out.println("Coleccion llena");
        }
    }

    public void menu() {

        int option = 0;
        do {
            System.out.println("Bienvenido a PokeCollector");
            System.out.println("Digite una opcion");
            System.out.println("1) Registrar carta");
            System.out.println("2) Consultar coleccion");
            System.out.println("3) Modificar carta");
            System.out.println("4) Borrar carta");
            System.out.println("0) Salir");
            option = input.nextInt();
            switch (option) {
                case 1:
                    registerPokemonCard();
                    break;
                case 2:
                    System.out.println(controller.getCollection());
                    break;
                case 3:
                    modifyPokemonCard();
                    break;
                case 4:
                    deletePokemonCard();
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (option != 0);     

    }

    public void modifyPokemonCard(){

        System.out.println(controller.getCollection());
        System.out.println("");
        System.out.println("Digite la posicion de la carta la cual quiere modificar");
        int cardmod=input.nextInt();
        if((cardmod>200)||(cardmod<0)){
            System.out.println("Digite una posicion valida");
        }else if(controller.verifyCard(cardmod-1)){
            
            input.nextLine();
            System.out.println("Digite el nombre del pokemon: ");
            String name= input.nextLine();
    
            System.out.println("Digite los puntos de vida");
            int hp=input.nextInt();
                
            System.out.println(controller.getPokemonTypeList());
            System.out.println("Digite el tipo de pokemon: ");
            int type= input.nextInt();
    
            input.nextLine();

            System.out.println("Digite el nombre del ataque");
            String attackName = input.nextLine();
    
            System.out.println("Digite el poder de ataque");
            int attackPower = input.nextInt();

            System.out.println(controller.getPokemonTypeList());
    
            System.out.println("Digite el tipo del ataque");
            int attackType = input.nextInt();

            controller.modifyCard(name, hp, type, attackName, attackPower, attackType, cardmod);
             
        }

    }

    public void modifyFieldPokemonCard(){

        System.out.println(controller.getCollection());
        System.out.println("");
        System.out.println("Digite la posicion de la carta la cual quiere modificar");
        int cardmod=input.nextInt();
        if((cardmod>200)||(cardmod<0)){
            System.out.println("Digite una posicion valida");
        }else if(controller.verifyCard(cardmod-1)){

            System.out.println("Digite que quiere modificar \n1. Nombre\n2. Tipo\n3. Puntos de vida\4. Puntos de ataque");
            int option = input.nextInt();
            String data = "";

            input.nextLine();

            switch(option){
                case 1:
                System.out.println("Digite el nuevo nombre");
                break;
                case 2:
                System.out.println(controller.getPokemonTypeList());
                System.out.println("Digite el nuevo tipo");
                break;
                case 3:
                System.out.println("Digite los nuevos puntos de vida");
                break;
                case 4:
                System.out.println("Digite los nuevos puntos de ataque");
                break;
            }
            data = input.nextLine();

            boolean result = controller.modifyFieldPokemonCard(cardmod,option,data);

            if(result){
                System.out.println("Campo actualizado exitosamente");
            }else{

                System.out.println("Error, no fue posible actualizar el campo");
            }
        }
    }

    public void deletePokemonCard(){

    }

}