package strategy;

public class PrintReceipt2 extends PrintReceipt
{
	@Override
    public void printReceipt()
    {
    	
    	float total = dobj.gettotal();
      	System.out.printf(" \n The total amount the gas has been pumped is \t "+total);
      	float L=dobj.getL();
      	System.out.printf(" \n The total Litres of Gas that has been pumped is \t "+L);
     
    }
    
}

