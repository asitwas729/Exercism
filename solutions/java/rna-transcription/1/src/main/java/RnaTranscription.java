class RnaTranscription {

    String transcribe(String dnaStrand) {
        String result = "";
        if(dnaStrand != ""){
            char[] arr = dnaStrand.toCharArray();

            for(int i=0; i<arr.length; i++){
                if(arr[i] == 'G'){
                    result += "C";
                } else if(arr[i] == 'C'){
                    result += "G";
                } else if(arr[i] == 'T'){
                    result += "A";
                } else if(arr[i] == 'A'){
                    result += "U";
                }
            }
            
        }
        return result;
        
    }

}
