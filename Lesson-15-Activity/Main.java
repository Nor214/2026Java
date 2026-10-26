class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    int spaces(int N){
      String bld="";
      for(int x=0; x<=N; x++){
        bld += " ";
      }
      return bld;
    }

    double harmonic(int N){
      double sum=0;
      for(int x=0; x<=N; x++){
        sum += 1./x;
      }
      return sum;
    }

    
    
  }


  
}