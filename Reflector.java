public class Reflector {

    //ATTRIBUTES

    //What letter is wired to what letter
    //Reflector B (Standard WWII Wehrmacht/Army/Luftwaffe)
    String [] wireConfiguration = {"AY", "BR", "CU", "DH", "EQ", "FS", "GL", "HD", "IP", "JX", "KN", "LG", "MO", "NK", "OM", "PI", "QE", "RB", "SF", "TZ", "UC", "VW", "WV", "XJ", "YA", "ZT"};

    //METHODS

    //PRE: Takes char
    //POST: return reflected char
    public char inToOut(char input) {

        String configString = this.getConfigString(input);

        int outputIndex;
        int inputIndex = configString.indexOf(input);

        if (inputIndex == 0)
            outputIndex = 1;
        else
            outputIndex = 0;

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
