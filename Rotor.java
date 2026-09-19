public class Rotor {

    //ATTRIBUTES

    //What letter is wired to what letter
    //FIXME: Change this to an array list so it is mutable
    String [] wireConfiguration = new String[26];
    
    //Which number the turn notch is on. This always lines up with the same number
    int willTurnOtherRotorNum;

    //METHODS
    //Constructer
    public Rotor(String romanNumeral) {

        //Rotor attributes change depending on if it's I, II, II, IV, or V.
        if (romanNumeral.equals("I")) {
            //FIXME: Change this to an array list so it is mutable
            this.wireConfiguration = new String[] {"AE", "BK", "CM", "DF", "EL", "FG", "GD", "HQ", "IV", "JZ", "KN", "LT", "MO", "NW", "OY", "PH", "QX", "RU", "SS", "TP", "UA", "VI", "WB", "XR", "YC", "ZJ"};
            this.willTurnOtherRotorNum = 17;
        } else if (romanNumeral.equals("II")) {
            //FIXME: Change this to an array list so it is mutable
            this.wireConfiguration = new String[] {"AA", "BJ", "CD", "DK", "ES", "FI", "GR", "HU", "IX", "JB", "KL", "LH", "MW", "NT", "OM", "PC", "QQ", "RG", "SZ", "TN", "UP", "VY", "WF", "XV", "YO", "ZE"};
            this.willTurnOtherRotorNum = 5;
        } else if (romanNumeral.equals("III")) {
            //FIXME: Change this to an array list so it is mutable
            this.wireConfiguration = new String[] {"AB", "BD", "CF", "DH", "EJ", "FL", "GC", "HP", "IR", "JT", "KX", "LV", "MZ", "NN", "OY", "PE", "QI", "RW", "SG", "TA", "UK", "VM", "WU", "XS", "YQ", "ZO"};
            this.willTurnOtherRotorNum = 22;
        } else if (romanNumeral.equals("IV")) {
            //FIXME: Change this to an array list so it is mutable
            this.wireConfiguration = new String[] {"AE", "BS", "CO", "DV", "EP", "FZ", "GJ", "HA", "IY", "JQ", "KU", "LI", "MR", "NH", "OX", "PL", "QN", "RF", "ST", "TG", "UK", "VD", "WC", "XM", "YW", "ZB"};
            this.willTurnOtherRotorNum = 10;
        } else if (romanNumeral.equals("V")) {
            //FIXME: Change this to an array list so it is mutable
            this.wireConfiguration = new String[] {"AV", "BZ", "CB", "DR", "EG", "FI", "GT", "HY", "IU", "JP", "KS", "LD", "MN", "NH", "OL", "PX", "QA", "RW", "SM", "TJ", "UQ", "VO", "WF", "XE", "YC", "ZK"};
            this.willTurnOtherRotorNum = 26;
        }
    }


        //Switch in letter with out letter

        //Rotor on turn. Return true or false


}
