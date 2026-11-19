public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(
            int[] array, int move, char direction) {

        if (direction != 'L' && direction != 'R') {
            return array;
        }

        if (direction == 'L') {
            move = -move;
        }

        return (shiftArrayCyclic(array, move));
    }

    public static int[] shiftArrayCyclic(
            int[] array, int move){

        int length = array.length;
        move = move % length;
        if (move == 0) {
            return array;
        }
        int[] shifted = new int[length];
        for (int i = 0; i < length; i++) {
            int newIndex = (i + move) % length;
            shifted[newIndex] = array[i];
        }
        return shifted;
    }
}