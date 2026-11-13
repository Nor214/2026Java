class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

    int PennyDays(){
      int pennyamount = 0
      int days = 1
      while (!(pennyamount>500)){
        pennyamount++
        days++
        int doubling = Math.pow(2, pennyamount)
      }

      print(days)
    }

    boolean addTwoNumbers(int answer){
      int num1 = randInt(1, 20)
      int num2 = randInt(1, 20)
      int sum = num1 + num2
      int Guess = -1
      while(Guess != sum){
        print("What is" + num1 + " + " + num2)
        Guess = Input.readInt();
        if(Guess != sum){
          print("Try again")
          Guess = Input.readInt();
        }
      }
      print("Correct.")
    }

    int GCF(int numb1, int numb2){
      while(!(numb1 % numb1 && numb1))
    }
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}