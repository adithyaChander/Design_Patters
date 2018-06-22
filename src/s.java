package state;
import outputpro.op;
public class s 
{
	op op_o;//object of the output processor
	int StateId;    
    public int getStateId()
    {
        return StateId;
    }
    public void set_op(op o)
    {
        op_o = o;
    }
    public void setStateId(int a)
    {
        StateId = a;
    }
    public void Activate(){}
    public void Start(){}
    public void PayCash(){}
    public void PayCredit(){}
    public void Approved(){}
    public void Reject(){}
    public void SelectGas(int g){}
    public void Cancel(){}
    public void StartPump(){}
    public void Pump(){}
    public void StopPump(){}
    public void Receipt(){}
    public void NoReceipt(){}
    
}
