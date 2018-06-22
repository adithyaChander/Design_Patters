package state;
import outputpro.op;
public class s6 extends s
{
	@Override
    public void Pump()
    {
		op.pumpGasUnit();
		op.gasPumpedMsg();
     
    }
    public void StopPump()
    {
    	
    	op.stopMsg();
    }
}