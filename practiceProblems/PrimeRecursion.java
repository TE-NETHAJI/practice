public class PrimeRecursion
{
    // recursion is an alternative to looping
    public static String isPrime( int n, int i)
    {
        if( n<=2)
            return n+" Neither prime nor composite";
        if( n%i ==0 )
            return n+" Composite : Not a prime number";
        if( i>n/2)
            return n+" Prime";
        
        return isPrime(n, ++i);
    }
    public static void main(String[] args) 
    {
        System.out.println( isPrime(10,2) );
        System.out.println( isPrime(1, 2) );
        System.out.println( isPrime(17, 2));
    }
}