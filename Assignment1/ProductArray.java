import java.util.*;
class Item
{
  Scanner sc=new Scanner(System.in);
  final int max_pd=10;
  String pdID[]=new String[max_pd];
  String pdName[]=new String[max_pd];
  String pdDesc[]=new String[max_pd];
  int pdQty[]=new int[max_pd];
  float pdCost[]=new float[max_pd];
  int i=0;
  public void addProduct(String pid,String pname,String psep,int pcount,float pcost)
  {
     if(i>=10)
         System.out.println("There is no space to add new product");
     else
     {
     	pdID[i]=pid;
     	pdName[i]=pname;
     	pdDesc[i]=psep;
     	pdQty[i]=pcount;
     	pdCost[i]=pcost;
     	i++;
      }
 }
 public int PdCount()
  {
      return i;
  }
 public void addPdQty(String pid,int qty)
  {
      for(int j=0;j<i;j++)
      {
          if(pdID[j].equalsIgnoreCase(pid))
           {
 		pdQty[j]+=qty;
                return;
           }
      }
      System.out.println("Invalid Product ID");
  }
 public void reducePdQty(String pid,int qty)
  {
      for(int j=0;j<i;j++)
      {
          if(pdID[j].equalsIgnoreCase(pid))
           {
 		pdQty[j]-=qty;
                return;
           }
      }
      System.out.println("Invalid Product ID");
  }
 public void ProductDetails(String pid)
  {
     for(int j=0;j<i;j++)
      {
          if(pdID[j].equalsIgnoreCase(pid))
           {
 		System.out.println(pdID[j]+" "+pdName[j]+" "+pdDesc[j]+" "+pdQty[j]+" "+pdCost[j]);
              return;
           }
      }
      System.out.println("Invalid Product ID");

  }
public void AllProductDetails()
  {
     if(i==0)
      System.out.println("No products are added till now");
     else
       for(int j=0;j<i;j++)
       {
          
         System.out.println(pdID[j]+" "+pdName[j]+" "+pdDesc[j]+" "+pdQty[j]+" "+pdCost[j]);
              
      }
  }
}
public class ProductArray
{
  public static void main(String args[])
  {
     Item p=new Item();
     Scanner sc=new Scanner(System.in);
     String pid,pname,psep;
     int pcount,ch;
     float pcost;
     while(true)
     {
       System.out.println("1.Add Product\n2.View Product\n3.List All Products\n4.Add Quantity\n5.Reduce Quantity\n6.Count Products\n7.Exit");
     ch=sc.nextInt();
     switch(ch)
     {
       case 1:
               pid=sc.nextLine();
               pname=sc.nextLine();
               psep=sc.nextLine();
	       pcount=sc.nextInt();
	       pcost=sc.nextFloat();
               sc.nextLine();
               p.addProduct(pid,pname,psep,pcount,pcost);
               break;
        case 2:
	       pid=sc.nextLine();
               p.ProductDetails(pid);
               break;
        case 3:
               p.AllProductDetails();
	       break;
        case 4:
               pid=sc.nextLine();
	       pcount=sc.nextInt();
	       sc.nextLine();
               p.addPdQty(pid,pcount);
               break;
        case 5:
               pid=sc.nextLine();
               pcount=sc.nextInt();
               sc.nextLine();
               p.reducePdQty(pid,pcount);
               break;
        case 6:
               int count=p.PdCount();
               System.out.println(count);
               break;
        case 7:
               System.exit(0);
       }
       sc.close();
     }
  }
}
