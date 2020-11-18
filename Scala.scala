import java.util.Scanner;
import scala.util.control.Breaks._
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    breakable  {
    while(true){
    var x=input.nextInt()
    var y=input.nextInt()
    if(x!=0 && y!=0)
    {
        if(x>0 && y>0)
        {
            printf("primeiro\n")
        }
        if(x>0 && y<0)
        {
            printf("quarto\n")
        }
        if(x<0 && y>0)
        {
            printf("segundo\n")
        }
        if(x<0 && y<0)
        {
            printf("terceiro\n")
        }
    }else{
        break
    }
    }
    }
}
}
 
