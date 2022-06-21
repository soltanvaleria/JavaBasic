public class Palindromes {
    int num;
    int verify_length()
    {
        int temp = 1;
        int length =0 ;
        while (temp<= num)
        {
            length++;
            temp*= 10;
        }
        return length;
    }
    void verify_palindrome()
    {
        int n1, n2,n3, n4, n5;
        n1 = num/10000;
        n2 = num/1000- n1*10;
        n3 = num/100 - n1*100- n2*10;
        n4 = num/10 - n1*1000-n2*100-n3*10;
        n5 = num%10;
        if(n1==n5 & n2==n4)
        System.out.printf("%d is a palindrome", num);
        else System.out.printf("%d is not a palindrome", num);
    }
}
