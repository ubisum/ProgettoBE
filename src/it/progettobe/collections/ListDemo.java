package it.progettobe.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 
  
public class ListDemo { 
    public static void main(String[] args) 
    { 
        // CREAZIONE LISTA
        List<String> frutti1 = new ArrayList<String>(); 

        // POPOLAMENTO LISTA
        frutti1.add("mela");
        frutti1.add("pera");
        frutti1.add("arancia");

//        System.out.println(frutti1); 

//
        /* AGGIUNTA ELEMENTI DA ALTRA LISTA */
        List<String> frutti2 = new ArrayList<String>(); 

        // adding elements
        frutti1.add("banana");
        frutti1.add("mango");
        frutti1.add("fragola");

        frutti1.addAll(frutti2);

//        System.out.println(frutti1); 

        /* CANCELLAZIONE DI UN ELEMENTO */
//        frutti1.remove(2);
//        System.out.println(frutti1); 

        /* UTILIZZO DEL NUMERO ELEMENTI */
//        System.out.println("Dimensione lista: " + frutti1.size());


        /* SCANSIONE DELLA LISTA USANDO UN CICLO CLASSICO */
//         for(int index = 0; index < frutti1.size(); index++)
//             System.out.println("Frutto " + (index+1) + ": " + frutti1.get(index));

        /* SCANSIONE LISTA CON FOREACH */
//         int counter = 0;
//         for(String fruit : frutti1)
//             System.out.println("Frutto " + (++counter) + ": " + fruit);

        /* SCANSIONE LISTA CON ITERATORE */
//        Iterator<String> iterator = frutti1.iterator();
//        int iteratorCounter = 0;
//        while(iterator.hasNext())
//            System.out.println("Frutto " + (++iteratorCounter) + ": " + iterator.next());

        /* aggiunta elementi in posizione specifiche */
         List<Integer> l1 = new ArrayList<>();
         l1.add(10);
         l1.add(20);
         l1.add(30);
         l1.add(40);
         
         System.out.println(l1);
//         
//         l1.add(0, 1); // adds 1 at 0 index 
//         System.out.println(l1);
//         l1.add(1, 2); // adds 2 at 1 index 
//         System.out.println(l1); // [1, 2] 
  
        // // Creating another list 
         List<Integer> l2 = new ArrayList<Integer>(); 
         l2.add(1); 
         l2.add(2); 
         l2.add(3); 
  
        // // Will add list l2 from 1 index 
         l1.addAll(1, l2); 
         System.out.println(l1); 
  
        // // Removes element from index 1 
         l1.remove(1); 
         System.out.println(l1); 
  
        // // Prints element at index 3 
//         System.out.println(l1.get(3)); 
  
        // // Replace 0th element with 5 
         l1.set(0, 5); 
         System.out.println(l1); 
        
        /* errore di compilazione */
//        List<Persona> lista = new ArrayList<Alunno>();
    } 
} 