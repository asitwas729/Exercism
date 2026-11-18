class Acronym {
    private String acronym;
    Acronym(String phrase) {
        // 공백,-로 단어 나누기
        String[] input = phrase.split("[\\s-_]+");
        StringBuilder sb = new StringBuilder();
        // 각 단어의 첫글자를 대문자로 저장하기
        for(String i: input){
            char j = i.charAt(0);
            sb.append(Character.toUpperCase(j));
        }
        this.acronym = sb.toString();
    }

    String get() {
        return this.acronym;
    }

}
