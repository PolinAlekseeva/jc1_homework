package my.tasks12_23;

public class ArrayThree {
    public static void main(String[] args) {
        int[] elm = new int[10];
        elm[0] = 25;
        elm[1] = 70;
        elm[2] = 27;
        elm[3] = 57;
        elm[4] = 29;
        elm[5] = 89;
        elm[6] = 99;
        elm[7] = 131;
        elm[8] = 205;
        elm[9] = 27;
        int maxElm = elm[0];
        int maxInd = 0;
        for (int i = 0; i< elm.length; i++) {
            if (maxElm < elm[i]) {
                maxElm= elm[i];
                maxInd = i;
            }
        }
        System.out.println("Maximum element is " + maxElm);
        System.out.println("Index of maximum element is " +maxInd);

    }

}
