class Bob {
    
    String hey(String input) {
        String a = "";
        boolean yn = true;
        boolean q = false;

        input = input.replaceAll("[\\s]", "");
        if(input.isEmpty()){
            a = "Fine. Be that way!";
        } else{
            if(input.charAt(input.length() - 1) == '?'){
                q = true;
            } else {
                q = false;
            }
            
            input = input.replaceAll("[^a-zA-Z0-9]", "");
            input = input.replaceAll("[0-9]", "");
            
            if(input.isEmpty()){
                yn = false;
            } else{
                for(int i=0; i<input.length(); i++){
                    char ch = input.charAt(i);
                    if(!Character.isUpperCase(ch)){
                        yn = false;
                    }
                }
            }
            if(yn && q){
                a = "Calm down, I know what I'm doing!";
            } else if(yn && !q){
                a = "Whoa, chill out!";
            } else if(!yn && q){
                a= "Sure.";
            } else {
                a = "Whatever.";
            }
        }
        return a;
    }
}