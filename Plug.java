//Represents one of the plugs found on the plug board. Up to 10.
public class Plug {
    //ATTRIBUTES
    //letter connections. Swap A and G, for example. ("AG")
    String connections;

    //plug constructor
    public Plug(String connections) {
        this.connections = connections;
    }

    //PRE: Takes Char matching a char in connections
    //POST: return other char
    public char inToOut(char input) {

        int outputIndex;
        int inputIndex = this.connections.indexOf(input);
        if (inputIndex == 0)
            outputIndex = 1;
        else
            outputIndex = 0;
        char output = this.connections.charAt(outputIndex);
        return output;
        
    }

}
