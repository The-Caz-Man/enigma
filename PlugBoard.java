public class PlugBoard {
    //ATTRIBUTES
    String [] plugConfiguration = new String[10];

    //PlugBoard constructor
    public PlugBoard(String[] plugConfiguration) {
        this.plugConfiguration = plugConfiguration;
    }

    //METHODS

    //PRE: Takes Char matching a char in connections
    //POST: return other char
    public char inToOut(char input) {

        //If input is in plugConfiguration
        if (this.inConfiguration(input)) {
            //Get configuration string. Example "AH"
            String config = this.getConfigString(input);
            
            //set input and output index
            //If input is 'A' and config is "AH", inputIdex is 0 and outputIndex is 1
            int outputIndex;
            int inputIndex = config.indexOf(input);
            if (inputIndex == 0)
                outputIndex = 1;
            else
                outputIndex = 0;

            //Get output char via outputIndex. Example 1 in "AH" gives you 'H'
            char output = config.charAt(outputIndex);
        
            return output;


        } else {
            return input;
        }
        
    }

    //PRE: Takes Char input.
    //POST: return true if in plug configuration. else flase
    private boolean inConfiguration(char input) {

        //Convert char to string for String.contains()
        String inputStr = String.valueOf(input);

        for (String config: this.plugConfiguration) {
            if (config.contains(inputStr))
                return true;
        }

        return false;
    }

    //PRE: Takes Char input.
    //POST: return a matching single plug configuration matching the input
    private String getConfigString(char input) {

        //Convert char to string for String.contains()
        String inputStr = String.valueOf(input);
        String output = null;
        for (String config: this.plugConfiguration) {
            if (config.contains(inputStr))
                output = config;
        }

        return output;
    }
}
