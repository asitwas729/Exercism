class ResistorColor {
    int colorCode(String color) {
        int code = -1;
        if(color == "black"){
            code = 0;
        } else if(color == "brown"){
            code = 1;
        } else if(color == "red"){
            code = 2;
        } else if(color == "orange"){
            code = 3;
        } else if(color == "yellow"){
            code = 4;
        } else if(color == "green"){
            code = 5;
        } else if(color == "blue"){
            code = 6;
        } else if(color == "violet"){
            code = 7;
        } else if(color == "grey"){
            code = 8;
        } else if(color == "white"){
            code = 9;
        }
        return code;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
