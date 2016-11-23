package aufgaben.tag3;

import java.util.Scanner;

public class Primzahlprogramm
{
  public static void main( String[] args )
  {
    System.out.println( "Geben Sie eine Zahl ein: \n" );
    Scanner sc = new Scanner( System.in );
    int eingabe = sc.nextInt();
    System.out.println( "Von 0 bis " + eingabe + " sind folgende Zahlen prim: \n" );

    boolean istPrimzahl;

    for ( int i = 2; i <= eingabe; i++ )
    {
      istPrimzahl = true;

      for ( int j = 2; j <= i / 2; j++ )
      {
        if ( i % j == 0 )
        {
          istPrimzahl = false;
          break;
        }
      }

      if ( istPrimzahl )
        System.out.println( i );
    }

    sc.close();
  }
}
