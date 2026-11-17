class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean next = false;
        for(char c: identifier.toCharArray()){
            if(c == ' '){
                result.append('_');
            } else if(c == '-'){
                next = true;
            } else if( c=='0' || c=='1' || c=='3' || c=='4' || c=='7') {
                switch(c){
                    case '0' -> result.append("o");
                    case '1' -> result.append("l");
                    case '3' -> result.append("e");
                    case '4' -> result.append("a");
                    case '7' -> result.append("t");
                }
            } else if(Character.isLetter(c)) {
                if(next){
                    result.append(Character.toUpperCase(c));
                    next = false;
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
