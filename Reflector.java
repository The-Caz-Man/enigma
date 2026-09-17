public class Reflector {

    //ATTRIBUTES

    //What letter is wired to what letter
    //Reflector B (Standard WWII Wehrmacht/Army/Luftwaffe)
    String [] wireConfiguration = {"AY", "BR", "CU", "DH", "EQ", "FS", "GL", "HD", "IP", "JX", "KN", "LG", "MO", "NK", "OM", "PI", "QE", "RB", "SF", "TZ", "UC", "VW", "WV", "XJ", "YA", "ZT"};



    //METHODS

    //PRE: Takes char input
    //POST: return char that comes out of the reflector
    public char inToOut(char input) {

        //Get the wiring string that matches input. Example: 'A' -> "AY"
        String configString = this.getConfigString(input);

        //Index variables for knowing if input is on left or right side of configString
        int outputIndex;
        int inputIndex = configString.indexOf(input);

        //outputIndex = 1 if inputIndex = 0, and vice versa
        if (inputIndex == 0)
            outputIndex = 1;
        else
            outputIndex = 0;

        //Get char based on index
        char output = configString.charAt(outputIndex);

        return output;

    }

    //PRE: Takes Char input.
    //POST: return a matching single configuration matching the input
    private String getConfigString(char input) {

        //Convert char to string for String.contains()
        String inputStr = String.valueOf(input);
        String output = null;
        for (String config: this.wireConfiguration) {
            if (config.contains(inputStr))
                output = config;
        }
        return output;
    }

}
