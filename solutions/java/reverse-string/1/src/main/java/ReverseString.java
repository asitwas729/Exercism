class ReverseString {

    String reverse(String inputString) {
        int i = inputString.length()-1;
        StringBuffer sb = new StringBuffer();
        for(int j=i; j>=0; j--){
            sb.append(inputString.charAt(j));
        }
        return sb.toString();
    }
  
}
