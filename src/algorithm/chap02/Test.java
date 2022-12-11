package algorithm.chap02;

public class Test {
    static int seqSearch(int[] a, int n, int key) {

//        int i = 0;
//        while(true){
//            if(i == n)
//                return -1;
//            if(a[i] == key)
//                return i;
//            i++;
//        }
        for(int i=0; i<n; i++) {
            if(a[i] == key)
                return i;
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(seqSearch(a,5,2));
    }
}
