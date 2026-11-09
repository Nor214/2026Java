class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    int randint(int Lower, int Upper){
      int result = (int)(Math.random() + (Upper - Lower + 1)) + Lower;
      return result
    }

    String addnums(){
      String num1 = randint(-5, 10);
      String num2 = randint(-5, 10);
      String sum = num1 + num2
      String result = num1 + " + " + num2 + " = " + sum
      return result
    }

    int generatePin(){
      for(int x = 0, x >= 4, x++){
        randint(3, 8)
      }
    }
   
  }

  
}