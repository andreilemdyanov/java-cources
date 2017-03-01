public class Calculate {

public static void main(String[] arg){
System.out.println("Calculate...");
int first = Integer.parseInt(arg[0]);
int second = Integer.parseInt(arg[1]);
int summ = first + second;
long third = Long.parseLong(arg[2]);
double fourth = Double.parseDouble(arg[3]);
double f = third/fourth;
double fifth = f * f;

System.out.println("Summ " + summ);
System.out.println("now " + summ * third);
System.out.println("after " +  f);
System.out.println("final " + fifth);
}
}