public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean prime [] = new boolean[n+1];
        int i = 2;
        int j = 2;
        int num = 2;
        while (i <= n) {
            prime [i] = true;
            i++;
        }
        while (j <= Math.sqrt(n)) {
            if (prime[j] == true) {
                num = j +j;
                while (num <= n) {
                    prime[num] = false;
                    num = num +j;
                }
            }
            j++;
        }
        j = 0;
        num = 0;
        System.out.println("Prime numbers up to " + n + ":");
        while (num <= n) {
            if (prime[num] == true) {
                System.out.println(num);
                j++;
            }
            num++;     
        }
        double precent = (((double) j / (double) n) * 100);
        System.out.println("There are " + j + " primes between 2 and " + n + " (" + (int)precent + "% are primes)");
    }
}