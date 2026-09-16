public class Settings {
    //ATTRIBUTES

        //Which reflector
            //Example: B
        char reflector;
    
        //Which 3 of the 5 rotors in which order
            //Example: II, V, IV
        String [] rotors = new String[3];

        //Ring setting of each rotor. Number to letter to turn notch.
            //Example: 2, 21, 12
                //(II, set a to 2), (V, set a to 21), (IV, set a to 12)
        int [] ringSettings = new int[3];

        //Starting positions of rotors. Which number is it starting on.
            //Example: 3, 24, 2
        int [] rotorPositions = new int[3];

        //Plug board configurations
            //Example: AV BS CG DL FU HZ IN KM OW RX
        String [] plugConfiguration = new String[10];

        //Settings constructor
        public Settings(char reflector, String[] rotors, int[] ringSettings, int[] rotorPositions, String[] plugConfiguration) {
            this.reflector = reflector;
            this.rotors = rotors;
            this.ringSettings = ringSettings;
            this.rotorPositions = rotorPositions;
            this.plugConfiguration = plugConfiguration;
        }

}

