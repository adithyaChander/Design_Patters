package state;
import outputpro.op;

public class s5 extends s
{
	@Override
    public void StartPump()
    {
      op.setInitialValues();
      op.readyMsg();
      
    }
}
