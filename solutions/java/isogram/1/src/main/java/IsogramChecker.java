class IsogramChecker {

    boolean isIsogram(String phrase) {
        String uniq = phrase.toLowerCase().replaceAll("[^a-z]", "");
        long count = uniq.chars().distinct().count();
        return count == uniq.length();
    }

}
