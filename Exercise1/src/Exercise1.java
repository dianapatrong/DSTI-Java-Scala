import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        HelloWorld();

        int sum = addition(2,2);
        int subs = substraction(sum,2);
        int mult = multiplication(subs, 5);
        float  div = division(mult,  1);
        int mod = modulo(mult, 3);

        //readUserInput();

        isEvenOrOdd(7);
        hangmanGame();

    }

    public static void HelloWorld(){
        System.out.println("Hello World");
    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static int substraction(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static float division(int a, int b){
        return a/b;
    }

    public static int modulo(int a, int b){
        return a%b;
    }

    public static void readUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        System.out.println("The sentence " + input + " has " + input.length() + " characters");
    }

    public static void isEvenOrOdd(int a){
        if (a%2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
    
    public static void hangmanGame(){
        Scanner sc = new Scanner(System.in);
        String word = "";
        do {
            System.out.println("Enter a letter to play hangman: ");
            word = sc.next().toLowerCase();
        }
        while(word.isEmpty());

        char[] wordToFind = word.toCharArray();
        char[] gameWord = new char[word.length()];

        for(int i=0; i< wordToFind.length; i++){
            gameWord[i] = '_';
        }

        System.out.println("Try to find the word: " + new String(gameWord));

        int wrong = 0;
        int letterCount = 0;
        while(wrong <=10){
            System.out.println("Type a char: ");
            char userInput = sc.next().toLowerCase().charAt(0);
            int index = word.indexOf(userInput);
            if (index == -1){
                System.out.println("Error!");
                wrong++;
            }
            else {
                int count = replaceAllIndexes(wordToFind, gameWord, userInput);
                letterCount+=count;
                System.out.println("You have this: " + new String(gameWord));
                if (letterCount == wordToFind.length){
                    System.out.println("You have found the word!! ");
                    break;
                }
            }


        }
    }

    public static int replaceAllIndexes(char[] word, char[] gameWord, char inputLetter){
        int count = 0;
        for(int i=0; i < word.length; i++){
            if( word[i] == inputLetter){
                gameWord[i] = inputLetter;
                count++;
            }
        }
        return count;
    }
}
