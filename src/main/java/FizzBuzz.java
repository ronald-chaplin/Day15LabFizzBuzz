public class FizzBuzz {
    public FizzBuzz(){}

    public String fizz(){
        String fizz = "";
        for(int i = 1; i <= 100; i++){
            if(i%3 == 0 && i%5!=0)
                fizz += "Fizz, ";
            else if (i%5 == 0 && i%3!=0)
                if(i!=100)
                    fizz += "Buzz, ";
                else
                    fizz +="Buzz";
            else if(i%3 == 0 && i%5 == 0)

                    fizz += "Fizzbuzz, ";
            else
                fizz += i + ", ";
            }
        return fizz;
    }

}
