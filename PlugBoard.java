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
            //set plug in use
            String config = this.getConfigString(input);
            Plug plug = new Plug(config);
            //use plug.inOut() to get output
            char output = plug.inToOut(input);
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
