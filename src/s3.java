package state;
import outputpro.op;
public class s3 extends s
{
	@Override
    public void Approved()
    {
      op.setW(1);
      op.displayMenu();
      
    }
    public void Reject()
    {
     op.rejectMsg();
    
    }
}
