class Badge {
    public String chartrans(String department){
        char[] arr = department.toCharArray();
        String up = "";
        for(int i=0; i<arr.length; i++){
            up += Character.toUpperCase(arr[i]);
        }
        return up;
    }
    
    public String print(Integer id, String name, String department) {
        String result = "";
        if(id == null){
            result = name + " - ";
        } else{
            result = "[" + id + "] - " + name + " - ";
        }
        if(department == null){
            result += "OWNER";
        } else {
            result += chartrans(department);
        }
        return result; 
    }

}
