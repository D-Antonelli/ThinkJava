    public static boolean areFactors(int n, int[] array) {

        for(int element: array) {
            if(n % element != 0) {
                return false;
            }

        }
        return true;

        }
