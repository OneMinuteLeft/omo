import java.util.Scanner; // for user input

public class Main {
  static void servlist() {
    // set input 'stuff'
    Scanner servobj = new Scanner(System.in);
    String servnum;

    // list servers
    System.out.println("<< Server List >>");
    System.out.println("1 | OneMinuteLeft serv");
    System.out.println("Type the corresponding # to connect to a listed server.");
    servnum = servobj.nextLine();

    // check input
    if (servnum.equals("1")) {
      System.out.println("Sending you to OneMinuteLeft...");
    } else {
      System.out.println("INPUT ERROR: invalid server number [provided " + servnum + "]");
    }
}

  public static void main(String[] args) {
    System.out.println("One Minute Online v0.1.0");
    servlist();

  }
}
