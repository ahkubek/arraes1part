public class Main {
    public static void main(String[] args) {
        //task1

        System.out.println("задача1");
        int[] chislo = new int[3];
        for (int i = 0; i < chislo.length; i++) {
            chislo[i] = i + 1;
            System.out.println(chislo[i]);

        }
/*        chislo[0]=1;
        chislo[1]=2;
        chislo[2]=3;*/
        System.out.println();
/*        System.out.println(chislo[0]);
        System.out.println(chislo[1]);
        System.out.println(chislo[2]);*/
        double[] nomer = {1.57, 7.654, 9.986};
        for (int i = 0; i < nomer.length; i++) {
            System.out.println(nomer[i]);

        }
        boolean[] proizvolno = {true, false};
        for (int i = 0; i < proizvolno.length; i++) {
            System.out.println(proizvolno[i]);

        }
        //task2
        System.out.println();
        System.out.println("Задача2");
        for (int i = 0; i < chislo.length; i++) {
            chislo[i] = i + 1;
            System.out.print(chislo[i]);
            if (i != chislo.length - 1) {
                System.out.print(",");
            }


        }
        //task3
        System.out.println();
        System.out.println("Задача3");
        for (int i = chislo.length -1;i>=0;i--) {
            System.out.print(chislo[i]);
            if (i!=0){
                System.out.print(",");
            }

        }

            }

        }
