package Array.KickOff;

public class RemoveColorPiecesIfBothNeighborsAreSame {
    public static void main(String[] args) {
        String colors = "AAABABB";
        boolean result = RemoveColorPiecesIfBothNeighborsAreSame.winnerOfGame(colors);
        System.out.println(result);
    }
    public static boolean winnerOfGame(String colors) {
        int alice = 0;
        int bob = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i  + 1)) {
                if (colors.charAt(i) == 'A') {
                    alice++;
                } else {
                    bob++;
                }
            }
        }

        return alice - bob >= 1;
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)
