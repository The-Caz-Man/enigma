public class Rotor {

    //ATTRIBUTES

    //What letter is wired to what letter
    private String [] wireConfiguration = new String[26];
    
    //Which number the turn notch is on. This always lines up with the same number
    private int willTurnOtherRotorNum;

    private int position;

    //METHODS
    //Constructer
    public Rotor(String romanNumeral) {

        //Rotor attributes change depending on if it's I, II, II, IV, or V.
        if (romanNumeral.equals("I")) {
            this.wireConfiguration = new String[] {"AE", "BK", "CM", "DF", "EL", "FG", "GD", "HQ", "IV", "JZ", "KN", "LT", "MO", "NW", "OY", "PH", "QX", "RU", "SS", "TP", "UA", "VI", "WB", "XR", "YC", "ZJ"};
            this.willTurnOtherRotorNum = 17;
        } else if (romanNumeral.equals("II")) {
            this.wireConfiguration = new String[] {"AA", "BJ", "CD", "DK", "ES", "FI", "GR", "HU", "IX", "JB", "KL", "LH", "MW", "NT", "OM", "PC", "QQ", "RG", "SZ", "TN", "UP", "VY", "WF", "XV", "YO", "ZE"};
            this.willTurnOtherRotorNum = 5;
        } else if (romanNumeral.equals("III")) {
            this.wireConfiguration = new String[] {"AB", "BD", "CF", "DH", "EJ", "FL", "GC", "HP", "IR", "JT", "KX", "LV", "MZ", "NN", "OY", "PE", "QI", "RW", "SG", "TA", "UK", "VM", "WU", "XS", "YQ", "ZO"};
            this.willTurnOtherRotorNum = 22;
        } else if (romanNumeral.equals("IV")) {
            this.wireConfiguration = new String[] {"AE", "BS", "CO", "DV", "EP", "FZ", "GJ", "HA", "IY", "JQ", "KU", "LI", "MR", "NH", "OX", "PL", "QN", "RF", "ST", "TG", "UK", "VD", "WC", "XM", "YW", "ZB"};
            this.willTurnOtherRotorNum = 10;
        } else if (romanNumeral.equals("V")) {
            this.wireConfiguration = new String[] {"AV", "BZ", "CB", "DR", "EG", "FI", "GT", "HY", "IU", "JP", "KS", "LD", "MN", "NH", "OL", "PX", "QA", "RW", "SM", "TJ", "UQ", "VO", "WF", "XE", "YC", "ZK"};
            this.willTurnOtherRotorNum = 26;
        }
        this.position = 1;
    }

    //PRE: Takes char input and a boolean that is true 
    //      if the input is flowing torwards the 
    //      reflecter or false if moving away
    //POST: Return swapped letter.
    public char inToOut(char input, boolean preRelfector) {
        //Default in case output doesn't work
        char output = (Character) null;

        //Get new wire config base on rotor position
        String [] tempWireConfiguration = this.getAdjustedConfig();

        if (preRelfector) {
            //Find config with index 0 matching input and return index 1
            for (String config: tempWireConfiguration) {
                if (config.charAt(0) == input) {
                    output = config.charAt(1);
                    break;
                }
            }
        } else {
            //Find config with index 1 matching input and return index 0
            for (String config: tempWireConfiguration) {
                if (config.charAt(1) == input) {
                    output = config.charAt(0);
                    break;
                }
            }

        }
        return output;
    }

    public int getPosition() {return this.position;}
    public void setPosition(int position) {this.position = position;}
    public String[] getWireConfiguration() {return this.wireConfiguration;}

    //PRE: 
    //POST: Gets current rotor position and returns an
    //      adjusted wireconfiguration based on the rotor
    //      position
    private String [] getAdjustedConfig () {
        //Get current rotor position
        int position = this.getPosition();

        String [] tempWireConfiguration = new String[26];
        //Loop through wire config and switch letters based on rotor position
        for (int i = 0; i < this.wireConfiguration.length; i++) {
            //Adjusted config (starts empty)
            String tempConfig = "";
            for (char c: this.wireConfiguration[i].toCharArray()) {
                int asciiValue = c;
                //Adjust ascii based on rotor position
                asciiValue += position;
                //If ascii goes beyond Z decrement by 26
                if (asciiValue > 90)
                    asciiValue -= 26;
                char newLetter = (char) asciiValue;
                //Add new letter to temp config
                tempConfig += newLetter;
            //Change the wire config in tempWireConfig
            tempWireConfiguration[i] = tempConfig;
            }
        }

        return tempWireConfiguration;
    }
}
