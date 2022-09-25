
import java.util.Scanner; 
public class test {
    public static void  main(String []args){
    System.out.println("请输入你的信用分");
     Scanner myscanner=new Scanner (System.in);
     int grade=myscanner.nextInt();
   if(grade>100)
   {System.out.println("信用极好");}
   else if(grade>80&&grade<99)
   {System.out.println("信用优秀");}
   else if(grade>60&&grade<80)
   {System.out.println("信用一般");}
   else (grade<60)
   {System.out.println("信用不及格");}
   /*if(grade>80&&grade<99)
   {System.out.println("信用优秀");}
   if(grade>60&&grade<80)
   {System.out.println("信用一般");}
   if(grade<60)
   {System.out.println("信用不及格");}*/
}
}
