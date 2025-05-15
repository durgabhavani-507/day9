public class Multi{
  public void multiOfNum(){
    int num=6;
    for (int i=10;i>=1;i--)
    System.out.println(num+"x"+i+"="+(num*i));
  }
  public static void main(String [] args){
    Multi obj=new Multi();
    obj.multiOfNum();
  }
}