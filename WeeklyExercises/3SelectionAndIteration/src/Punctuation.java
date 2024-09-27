public class Punctuation {
    public static void main (String[] args)
    {

        String rhyme = "\"Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.\n" +
                "-that was a nice poem-\n" +
                "the end.\"";

        String comma = ",";
        String fullStop = ".";
        String speechMark = "\"";
        String dash = "-";

        int commaCount = countOccurrences(rhyme, comma);
        int fullStopCount = countOccurrences(rhyme, fullStop);
        int speechMarkCount = countOccurrences(rhyme, speechMark);
        int dashCount = countOccurrences(rhyme, dash);


        System.out.println("Punctuation Counter");
        System.out.println("-------------------");

        System.out.println("In the following rhyme:\n"+rhyme+"\nThere are");

        System.out.println("No. of commas: "+commaCount);
        System.out.println("No. of full stops: "+fullStopCount);
        System.out.println("No. of speech marks: "+speechMarkCount);
        System.out.println("No. of dashes: "+dashCount);


    }

    public static int countOccurrences(String str, String target) {
        int count = 0;
        int Char = 0;

        while (Char != -1) {
            Char = str.indexOf(target, Char);

            if (Char != -1) {
                count++;
                Char += target.length();
            }
        }
        return count;
    }
}
