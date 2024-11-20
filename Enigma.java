public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }

    //reverse encrypt
    //start at top roter letter
    //look at middle roter letter
    //find that in the outer
    //look at inner roter letter from that outer, return that letter. Decrypted!
    //rotate
    public String decrypt(String message){        
        //TODO
        String decrypted = "";

        for(int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            int index = rotors[2].indexOf(current);
            if (index > -1) {
                char firstMiddle = rotors[1].charAt(index);
                int indexTwo = rotors[2].indexOf(firstMiddle);
                if (indexTwo > -1) {
                    decrypted += rotors[0].charAt(indexTwo);
                } 
            }

            rotate();
        }
        //System.out.println(decrypted);
        return decrypted;
    }


    //look at inner roter letter
    //look at top roter letter 
    //find that top roter letter on the inner wheel
    //look up from inner wheel to the top wheel and return that letter. Encrypted!
    //have to rotate inner after this
    public String encrypt(String message){
        //TODO
        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            int index = rotors[0].indexOf(current);
            if (index > -1) { 
                char firstOuter = rotors[2].charAt(index);
                int indexTwo = rotors[1].indexOf(firstOuter);
                if (indexTwo > -1) {
                    encrypted += rotors[2].charAt(indexTwo);
                }
            }

            rotate();
        }

        //System.out.println(encrypted);
        return encrypted;
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
