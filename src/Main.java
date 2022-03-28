/*
\\----------------------------------------------//
|| @Name getInLine          @Made     2.14.22   ||
|| @By Tyler Romanowski     @Modified 2.16.22   ||
|| @P-Comment An Arraylist exercise that uses,  ||
|| that uses the add, size,get, and indexOf     ||
|| method of the ArrayList class                ||
\\----------------------------------------------//
|| @Comment the getInLine program handles an    ||
|| an array of names in the form of names, and  ||
|| uses that array to model a line, with        ||
|| different people leaving and joining         ||
//----------------------------------------------//

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    private static final ArrayList<String> lineArray = new ArrayList<>();

    public static void main(String[] args)
    {
	   Scanner stringReader = new Scanner(System.in);
       Scanner intReader = new Scanner(System.in);

       String name;

        lineArray.add("Andrew");
        lineArray.add("Sarah");
        lineArray.add("Will ");
        lineArray.add("Evelyn");
        lineArray.add("David");
        lineArray.add("Steven");
        lineArray.remove("Evelyn");


        lineArray.set(1, "Samantha");

        System.out.println("Will, is currently in the (" +  (lineArray.indexOf("Will") + 1) + ") Position");

        lineArray.add("Jessica");
        lineArray.add(lineArray.indexOf("Jessica"),lineArray.remove(lineArray.indexOf("Will")));

        System.out.println("The Last person in Line is (" +  lineArray.get(lineArray.size() - 2) + ") ");


        lineArray.set(0, lineArray.remove(lineArray.size() - 1));

        if(lineArray.contains("David"))
            System.out.println("David is not in Line");
        else
            System.out.println("David is in Line");

        System.out.print("Would you like to Add a Person\n Type [1] to add person ");


        while(intReader.nextInt() == 1)
        {
            System.out.print("What is the person name? ");
            name = stringReader.nextLine();
            System.out.print("Where Would you like to put this person?");
            System.out.println(addPerson(intReader.nextInt(), name));
            System.out.print("Would you like to Add a Person\n Type [1] to add person ");

        }

        System.out.println("Moving on... \nKicking out everyone with the starting letter 'S'");
        removeNameStartingWithLetter('S');
        System.out.print(lineArray);








    }

    static String addPerson(int index, String name)
    {
        if(index < 0 || index > lineArray.size() - 1)
            return "Not Valid index";

        lineArray.add(index, name);
        return name + " Added @ Index [" + index + "]";
    }


    static void removeNameStartingWithLetter(char letter)
    {
        for(int i = 0; i < lineArray.size(); i++)
            if(lineArray.get(i).charAt(0) == letter)
            {
                lineArray.remove(i);
                i--;
            }


    }
}
