        public static boolean arePrimeFactors(int n, int[]array) {
        int product= 1;

        for(int element: array) {
            product *= element;
            }

        for(int element: array) {
            if(n% element == 0 && product == n) {
                return true;
            }

        }
        return false;
        
        }
