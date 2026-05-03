class Solution {
    public int countPrimes(int n) {

    //     int count=0;

    //     for(int i=2;i<n;i++){
    //         if(isprime(i)){
    //             count++;
    //         }
    //     }

    //     return count;

    // }
    //     public boolean isprime(int n){
    //         for(int i=2;i<n;i++){//Math.sqrt(n);
    //             if(n%i==0) return false;
    //         }
    //         return true;
    //     }
    
//Sieve of Eratosthenes
        int count=0;

        boolean[] primes=new boolean[n];

        Arrays.fill(primes,true);

        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes[i]){
                for(int j=i*i;j<n;j+=i){
                    primes[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(primes[i]){
                count++;
            }
        }

        return count;






















}
}