static String catAndMouse(int x, int y, int z) {
        String result;
        if(Math.abs(x-z) > Math.abs(y-z)){
                result = "Cat B";
        }
        else if(Math.abs(x-z) < Math.abs(y-z)){
                result = "Cat A";
        }
        else{
                result = "Mouse C";
        }
        return result;

    }
