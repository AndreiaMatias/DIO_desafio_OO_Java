class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int number){
        for(int i = 2; i < number;i++){
            if(number == 2){
                return true;
            } if else (number < 2){
                return false;
            }
            if(number%i==0){
                return false;
            }else{
                return true;
            }

        }
        return true;
    }
}

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(7));

    }

}