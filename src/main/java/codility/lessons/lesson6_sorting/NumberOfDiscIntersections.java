package codility.lessons.lesson6_sorting;

public class NumberOfDiscIntersections {
    public int findDiscIntersection(int[] A){
        int N = A.length;
        int[] activated = new int[N];
        int[] deactivated = new int[N];
        for(int i = 0; i < N; i++){
            long lowerLim = i - (long)A[i];
            lowerLim = Math.max(lowerLim, 0);
            activated[(int)lowerLim]++;

            long upperLim = i + (long)A[i];
            upperLim = Math.min(upperLim, N - 1);
            deactivated[(int)upperLim]++;
        }

        int intersect = 0;
        int active = 0;
        for(int i = 0; i < N; i++){
            active += activated[i];

            while(deactivated[i] > 0){
                intersect += active - 1;
                if(intersect > 10000000) return -1;

                active--;
                deactivated[i]--;
            }
        }
        return intersect;
    }
}
