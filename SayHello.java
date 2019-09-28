public class HelloWorld{
 public static void main(String[] args){
  //System.out.println("Hello World !");
  //sayHello(sum());
  HelloWorld helloworld = new HelloWorld();
  helloworld.sayHello(helloworld.sum());
 }
 
 public void sayHello(int sum){
  System.out.println("Hello World !" + sum);
 }
 
 public int sum(){
  int sum = 0;
  for(int i = 0; i<=100;i++){
   sum += i;
  }
  return sum;
 }
}