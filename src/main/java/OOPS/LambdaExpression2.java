/*
Lambda expressions basically express instances of functional interfaces
(An interface with single abstract method is called functional interface. An example is java.lang.Runnable).
lambda expressions implement the only abstract function and therefore implement functional interfaces

1) () -> System.out.println("Zero parameter lambda");
2) (p) -> System.out.println("One parameter: " + p);
3) (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
 */

package OOPS;
import com.vdurmont.emoji.EmojiParser;

import java.util.ArrayList;

public class LambdaExpression2 {
    public static void main(String args[])
    {
        // Creating an ArrayList with elements
        // Team members name
        ArrayList<String> List = new ArrayList<>();
        List.add("Ega");
        List.add("Ram");
        List.add("Naveen");
        List.add("Priya");
        List.add("Sabitha");
        List.add("Angel");
        List.add("Kali");
        List.add("Pavan");

        // Using lambda expression to print all elements
        // of List
        List.forEach(name -> System.out.println(name));
        System.out.println("Team size " + List.size());
        String str = "Welcome :grinning:Mr :smiley:Ram &#128516;Anna :wink:by Team! :sparkling_heart::heart_eyes:";
        String result = EmojiParser.parseToUnicode(str);

        // Using lambda expression to print welcome message to Ram
        // of List
        List.forEach(name -> { if (name == "Ram") System.out.println(result); });
    }
}
