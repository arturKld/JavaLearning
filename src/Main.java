import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //types
        /*{
            //int g = (a + b) / c);

            // a+ ((b+c);

            long x = 100000;

            //Int размер 32 бита, int должен быть не более 2^31
            // long размер 64 бита

            System.out.println((int) (x*x));;
            System.out.println(x);

        }*/

        //operations
        /*{
            System.out.println(5 / 3); //Можем разделить только один раз, т.к. Int
            System.out.println((double) 5); // 5.0, т.к. double
            System.out.println((double) 5 / 3); // Можем разделить полностью, т.к. double

            //Проверка чётности

            Scanner in = new Scanner(System.in);
            double value = in.nextDouble();

            if( value%2 == 0){
                System.out.println("Вы ввели чётное число");
            } else  System.out.println("Вы ввели нечётное число");
        }*/

        //minutes
        /*{
            int minutes = 10;
            System.out.println(minutes++);
            System.out.println(minutes);
            minutes -= 1;
            System.out.println(minutes);
        }*/

        //Char
        /*{
            //[010101010110011] 31
            char a = 8667;
            char b = '\u21DB';
            char c = '⇛';

            System.out.println(a);
            System.out.println(b);
            System.out.println((int) c);
        }*/

        //logic operators
        /*{
                Scanner in = new Scanner(System.in);
                int x = in.nextInt();
                Boolean a = !(x < 5 || x > 5 && x < 7);   // все числа меньше 5, не включая 5 и 6, будут выводить true
                System.out.println(a);
            }*/

        /*{
            Boolean a = true;
            Boolean b = false;

            int x = 5;
            Boolean b1 = x>0;
            Boolean b2 = b1 && (x<20);


        }*/

        //ternary operator
        /*{
            int a = 10;
            int b = 20;

            int max = (a>b ? a:b);
            System.out.println(max);
        }*/

        //Шаблон решения
        /*{
            Scanner in = new Scanner(System.in); //Создаём сканер
            in.useLocale(Locale.US); //Точки вместо запятых
            double x = in.nextDouble(); //Создаём переменную
            double y = in.nextDouble(); //Создаём переменную

            System.out.println(<условие> ? "YES" : "NO");
        }*/

        //Решение №1
        /*{
            Scanner in = new Scanner(System.in); //Создаём сканер
            in.useLocale(Locale.US); //Точки вместо запятых
            double x = in.nextDouble(); //Создаём переменную
            double y = in.nextDouble(); //Создаём переменную

            System.out.println(x<2 && y < x && x * x + y * y > 4 && y>0 ? "YES" : "NO");
        }*/

        //Решение №2
        /*{
            Scanner in = new Scanner(System.in); //Создаём сканер
            in.useLocale(Locale.US); //Точки вместо запятых
            double x = in.nextDouble(); //Создаём переменную
            double y = in.nextDouble(); //Создаём переменную

            System.out.println( (y < 2 - x*x && x <+ 0) || (y < 2 - x*x && y > 0 && x >=0) ? "YES" : "NO");
        }*/

        //if else
        /*{
            int max = 0;
            int a = 10, b = 5;
            if (a>b) {
                max = a;
            } else{
                max = b;
            }
        }*/

        //Сравнение цифр в 2-значном числе
        /*{
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            if (x1>9 && x1<100){
                x2 = x1 %10;
                x1 = x1 /10;
                System.out.println(x1 +";" + x2);
                if (x1 == x2){
                    System.out.println("В числе одинаковые цифры");
                } else if (x2 < x1){
                    System.out.println("Первая цифра больше второй");
                }else System.out.println("Вторая цифра больше первой");
            }else System.out.println("Введено не двухзначное число");
        }*/

        //Кол-во дней в месяце
        /*{
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()){
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("30");
                    break;
                case 6:
                    System.out.println("31");
                    break;
                case 7:
                    System.out.println("30");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;
                default:
                    System.out.println("0");
                    break;
            }
        }*/

        //Blocks
        /*{
            int inf = 10;
            if (inf>0){
                int price = 4;
                price += inf * price /100;
                System.out.println(price);
            }
            System.out.println(price);
        }*/

        //Наличие в числе цифры 3
        /*{
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            x2 = x1 %10;
            x1 = x1/10;

            if(x2 == 3 || x1 == 3) {
                System.out.println("В числе присутствует цифра 3");
            }
            else {
                System.out.println("В числе отсутствует цифра 3");
            }
        }*/

        //while...do
        /*{
            int x = 0;
            while (x<5){
                System.out.println(x+" ");
                x++;
            }
        }*/

        //dowhile
        /*{
            int x = 0;
            do {
                System.out.println(x+" ");
                x++;
            } while (false);
            System.out.println(x);
        }*/

        //Автобусы и мосты
        {
            Scanner in = new Scanner(System.in);
            int t = 0;
            int k = 1;
            int N = in.nextInt();

            while (k<N){
                t = in.nextInt();
                if (t<437){
                    System.out.println("Crush " + k);
                    break;
                }
                k++;
            }
            if (t>437) {
                System.out.println("No crush");
            }
        }
    }
}