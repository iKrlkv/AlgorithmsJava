public class PosNegSequence {

    public static int posNeqSequence(int n) {
        int result = 0;

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                result  += i;
            }
        } else {
            result = 1;
            for (int i = n; i < 0; i++) {
                result -= i;
            }
        }

        return result;
    }
}
