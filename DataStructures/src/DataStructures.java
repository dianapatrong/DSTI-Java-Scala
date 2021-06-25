import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class DataStructures {

    public static void main(String[] args){
        // LinkedList
        System.out.println("======================= LinkedList =======================");
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Clement");
        myLinkedList.add("Diana");
        myLinkedList.add("Peter");
        myLinkedList.remove();
        myLinkedList.removeLast();

        for (String node: myLinkedList){
            System.out.println(node);
        }

        // ArrayList
        System.out.println("======================= ArrayList =======================");
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Harry");
        myArrayList.add("Hermione");
        myArrayList.add(1, "Peeves");
        myArrayList.set(0, "Lily");
        myArrayList.add("Ron");
        myArrayList.remove(0);

        for (String element: myArrayList){
            System.out.println(element);
        }

        for (int i=0; i < myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));
        }

        // Stack
        System.out.println("======================= Stack =======================");
        Stack<String> myStack = new Stack<>();

        myStack.add("Rick");

        String value = myStack.pop();
        System.out.println(value);

        // HashMap
        System.out.println("======================= HashMap =======================");

        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Harry", "03248394339");
        String number = phoneNumbers.get("Harry");
        phoneNumbers.remove("Harry");

        number.hashCode();

    }
}
