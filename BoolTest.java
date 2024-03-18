/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package booltest.booltest;

/**
 * Демонстрація використання значення boolean
 * @author romah
 */

public class BoolTest {

    public static void main(String[] args) {
        boolean b;
        
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // Значення boolean може управлятися оператором if
        if(b) System.out.println("Is run. ");
        b = false;
        if(b) System.out.println("No run");
        // Результато операції відносності являється значення boolean.
        System.out.println("10 > 9 is " + (10 > 9));
    }
}