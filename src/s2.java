package state;
import outputpro.op;
public class s2 extends s
{
	@Override
    public void PayCash()
    {
     op.storeCash();
     op.setW(0);
     op.displayMenu();
     }
}
