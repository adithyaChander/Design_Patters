package state;
import outputpro.op;
public class s7 extends s
{
	@Override
    public void Receipt()
    {
     op.printReceipt();
     
    }
	public void NoReceipt()
    {
     op.NoReceipt();
     
    }
}
