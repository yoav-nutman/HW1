public class Assignment01Q05 {

    public static int findShortestPath(
            int[][] matrix, int i, int j) {

        int length = matrix.length;
        int[] next = {i};
        int[] distance = new int[length];
        for (int k = 0; k < length; k++) {
            distance[k] = -1;
        }
        distance[i] = 0;

        for(int step=0; step<next.length; step++){
            for(int x=0;x<length;x++){
                if(matrix[next[step]][x] == 1 && distance[x] == -1){
                    distance[x] = distance[next[step]] + 1;
                    next = java.util.Arrays.copyOf(next, next.length + 1);
                    next[next.length - 1] = x;
                }
            }
        }

        return distance[j];
    }
}