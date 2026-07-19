package Klausurvorbereitung.AufgabenVorlesung.Collections;

import java.util.Scanner;
import java.util.Stack;

public class UmgedrehteReihenfolge {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int i;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Zahl eingeben:");
            i = sc.nextInt();

            stack.push(i);

        } while (i != 0);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
