public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
    }
    
    public boolean rotate(){
        //TODO
        char temp2 = this.rotorValues.charAt(rotorValues.length()-1);
        this.rotorValues = temp2 + this.rotorValues.substring(0, this.rotorValues.length()-1);
        //System.out.println(this.rotorValues);
        if (this.rotorValues.charAt(0) == this.startChar) {
            return true;
        }
        return false;
    }
    

    public int indexOf(char c){
        //TODO
        return this.rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        //TODO
        return this.rotorValues.charAt(idx);
    }
}
    
