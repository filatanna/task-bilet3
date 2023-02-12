public class Main {
  public static void  printHalfLine(String text){
      System.out.println(text.substring(0,text.length()/2));
      System.out.println(text.substring(text.length()/2, text.length()));
  }
    public static void main(String[] args) {
    String text = "Чехов родился в Таганроге,небольшом южном городе на берегу Азовского моря.";
        System.out.println(text);
        printHalfLine(text);
    }
}