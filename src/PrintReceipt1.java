package strategy;
public class PrintReceipt1 extends PrintReceipt
{
	@Override
    public void printReceipt()
    {
    	float total = dobj.gettotal();
      	System.out.printf("The toatl amount that the gas that has been pumped is "+total);
     
    }
    
}
