public static int saveThePrisoner(int n, int m, int s) {
        int result = (s - 1 + m - 1) % n + 1;
        return result;

    }
