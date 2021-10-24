public class BottlesOfBeerSong {

    public static void printFirstString(int count) {

        if (count > 1) {
            System.out.println(
                    String.format("%d bottles of beer on the wall, %d bottles of beer.", count, count)
            );
        } else {
            System.out.println(
                    String.format("%d bottle of beer on the wall, %d bottle of beer.", count, count)
            );
        }
    }

    public static void printSecondString(int count) {

        if (count > 1) {
            System.out.println(
                    String.format("Take one down and pass it around, %d bottles of beer on the wall.\n", count)
            );
        } else if (count == 1) {
            System.out.println(
                    String.format("Take one down and pass it around, %d bottle of beer on the wall.\n", count)
            );
        } else {
            System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
        }
    }

    public static void printLastString() {
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.print("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }

    public static void main(String[] args) {
        for (int i = 99, j = 98; i > 0; i--, j--) {
            printFirstString(i);
            printSecondString(j);
        }
        printLastString();
    }
}
