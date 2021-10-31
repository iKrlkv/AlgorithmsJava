public class BottlesOfBeerSongWithSB {
    public static StringBuilder printFirstString(StringBuilder sb, int count) {

        if (count > 1) {
            sb.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\n", count, count));
        } else {
            sb.append(String.format("%d bottle of beer on the wall, %d bottle of beer.\n", count, count));
        }

        return sb;
    }

    public static StringBuilder printSecondString(StringBuilder sb, int count) {

        if (count > 1) {
            sb.append(String.format("Take one down and pass it around, %d bottles of beer on the wall.", count));
        } else if (count == 1) {
            sb.append(String.format("Take one down and pass it around, %d bottle of beer on the wall.", count));
        } else {
            sb.append("Take one down and pass it around, no more bottles of beer on the wall.");
        }

        return sb;
    }

    public static StringBuilder printLastString(StringBuilder sb) {
        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
        sb.append("Go to the store and buy some more, 99 bottles of beer on the wall.");

        return sb;
    }


    public static StringBuilder getSongText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 99, j = 98; i > 0; i--, j--) {
            printFirstString(sb, i);
            printSecondString(sb, j);
        }
        printLastString(sb);

        return sb;
    }
}
