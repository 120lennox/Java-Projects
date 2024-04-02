public class Coupon_collector {
    public static void collected_coupons(){
        int limit = 10;
        boolean[] isCollected = new boolean[limit];
        int distinct = 0;
        int count = 0;

        while (count < limit){
            int rnd = (int) (Math.random() * limit);
            count++;

            /**
             * !isCollected checks if the index has not been collected yet
             * if it has not been collected yet, the distincts are incremented and that index is is set to true or marked collected
            */             
             if (!isCollected[rnd]){
                distinct++;
                isCollected[rnd] = true;
            }
        }
        System.out.println(distinct);
        
    }

    public static void main(String[] args) {
        collected_coupons();
    }
}
