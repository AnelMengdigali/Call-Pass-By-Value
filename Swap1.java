/* Call-by-value / Pass-by-value                  */
/* In this Java example, we fail to swap integers */

public class Swap1
{
  public static void swap ( int a , int b )
  {
    int temp = a    ;
           a = b    ;
           b = temp ;
  }

  public static void main ( String[] args )
  {
    int i = 3 ;
    int j = 5 ;

    System.out.printf( "Before swap: i = %d , j = %d%n" , i , j ) ;

    swap( i , j ) ;

    System.out.printf( "After  swap: i = %d , j = %d%n" , i , j ) ;
  }
}
