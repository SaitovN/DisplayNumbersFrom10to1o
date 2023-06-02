package academy.devonline.java.basic.section01_setup.section05_setup;

public class DisplayNumbersFrom10to1o {
    public static void main(String[] args) {
      var from = 100;
      var to = 1;
      var stop = 1;
      int i = from;
        while (i >= to){
            System.out.print(i +"\t");
            i-=stop;
            if (i % 10==0){
                System.out.println();
            }
        }
        System.out.println();
        {
            var p = 50;
            var e = 0;
            var g = 2;
            int y = e;
            while (y<=p){
                System.out.print(y + "\t");
                y+=g;
                if (y % 10 ==0){
                    System.out.println();
                }
            }
        }










    }

}
