public class Settings {
    //ATTRIBUTES
    
        //Which 3 of the 5 rotors in which order
            //Example: II, V, IV
        String [] rotors = new String[3];

        //Starting positions of rotors. Which number is it starting on.
            //Example: 3, 24, 2
        int [] rotorPositions = new int[3];

        //Plug board configurations
            //Example: AV BS CG DL FU HZ IN KM OW RX
        String [] plugConfiguration = new String[10];

        //Settings constructor
        public Settings(String[] rotors, int[] rotorPositions, String[] plugConfiguration) {
            this.rotors = rotors;
            this.rotorPositions = rotorPositions;
            this.plugConfiguration = plugConfiguration;
        }

}

