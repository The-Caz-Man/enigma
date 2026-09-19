import java.util.ArrayList;
import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        //PlugBoard Tests
        ArrayList<String> testPlugConfig = new ArrayList<>(Arrays.asList("HL", "NT", "EJ", "OV", "FR", "ZK", "SY", "DI", "WU", "MG"));
        char notInConfigChar = 'A';
        char inConfigChar = 'E';
        PlugBoard testPlugBoard = new PlugBoard(testPlugConfig);
        System.out.println("\nRUNNING PLUGBOARD TEST\n");
        System.out.printf("Not in configuration letter: %c\n", notInConfigChar);
        char firstTestOut = testPlugBoard.inToOut(notInConfigChar);
        System.out.printf("%c outputs as %c\n\n", notInConfigChar, firstTestOut);
        System.out.printf("In configuration letter: %c\n", inConfigChar);
        char secondTestOut = testPlugBoard.inToOut(inConfigChar);
        System.out.printf("%c outputs as %c\n", inConfigChar, secondTestOut);
        char thirdTestOut = testPlugBoard.inToOut(secondTestOut);
        System.out.printf("%c outputs as %c\n\n", secondTestOut, thirdTestOut);

    }
}
