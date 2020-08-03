/* Call-by-value / Pass-by-value                                                  */
/* In this Java example, we use reference variables to successfully swap integers */

//========================================

class MyInt
{
  public int data ;

  public MyInt ( int d )  { data = d ; }
}

//========================================

public class Swap2
{
  public static void swap ( MyInt a , MyInt b )
  {
    int temp = a.data ;
      a.data = b.data ;
      b.data = temp   ;
  }

  public static void main ( String[] args )
  {
    MyInt i = new MyInt(3) ;
    MyInt j = new MyInt(5) ;

    System.out.printf( "Before swap: i = %d , j = %d%n" , i.data , j.data ) ;

    swap( i , j ) ;

    System.out.printf( "After  swap: i = %d , j = %d%n" , i.data , j.data ) ;
  }
}
