
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturals(2426948));
    }
    static int sumOfNaturals(int n) {
        long sum = ((long)n*(n+1)/2);
        
        sum = sum % (int)(Math.pow(10,9) + 7);
        
        return (int)sum;
    }
}