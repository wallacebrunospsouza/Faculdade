public class hora {
    public static void main(String[] args) {
        
    
 
    for(int h = 0; h < 24; h++){
        for(int m = 0; m < 60; m++){
            for(int s = 0; s < 60; s++){
                System.out.printf("%02d:%02d:%02d\n", h, m, s);

                try {
                    Thread.sleep(1000);;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
}
