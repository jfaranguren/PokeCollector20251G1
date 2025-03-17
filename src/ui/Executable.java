package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

    private static Scanner input;
    private static Controller controller; //

    public static void main(String[] args) {

        initializer();
        menu();

    }

    public static void initializer() {

        input = new Scanner(System.in);
        controller = new Controller(); //

    }

    public static void registerPokemonCard() {

        System.out.println("Digite el nombre");
        String name = input.nextLine();

        System.out.println("Digite los puntos de vida");
        int hp = input.nextInt();

        System.out.println(controller.getPokemonTypeList());

        System.out.println("Digite el tipo del Pokemon");
        int type = input.nextInt();

        System.out.println("Digite el poder de ataque");
        int aP = input.nextInt();

        if (controller.savePokemonCard(name, hp, type, aP)) {
            System.out.println("Carta registrada exitosamente");
        } else {
            System.out.println("Coleccion llena");
        }
    }

    public static void menu() {

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

    public static void modifyPokemonCard(){

        System.out.println(controller.getCollection());
        System.out.println("");
        System.out.println("digite la posicion de la carta la cual quiere modificar");
        int cardmod=input.nextInt();
        if((cardmod>200)||(cardmod<0)){
            System.out.println("digite una posicion valida");
        }else if(controller.verifyCard(cardmod-1)){
            
            input.nextLine();
            System.out.println("digite el nombre del pokemon: ");
            String name= input.nextLine();
    
            System.out.println("digite los puntos de vida");
            int hp=input.nextInt();
                
            System.out.println(controller.getPokemonTypeList());
            System.out.println("digite el tipo de pokemon: ");
            int type= input.nextInt();
    
            System.out.println("digite el poder de ataque: ");
            int aP =input.nextInt();

            controller.modifyCard(name, hp, type, aP, cardmod);
             
        }

    }

    public static void deletePokemonCard(){

    }

}