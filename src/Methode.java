public class Methode {

    int[][] tableau = {
            {10,11,12,13,14,15},
            {16,17,18,19,20,21},
            {10,11,12,13,14,15},
            {10,11,12,13,14,15},
        };

    public int additionChiffre(int a){
        int b =0;
        for(;a != 0;a--){
            b += a;
        }
        return b;
    }

    public boolean dès(){
        int dès1 = (int) Math.floor(Math.random()*7-1+1);
        int dès2 = (int) Math.floor(Math.random()*7-1+1);

        if (dès1+dès2 == 7){
            return true;
        }
        return false;
    }


}
