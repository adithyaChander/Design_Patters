package inputpro;
import abstractfactory.af;
import datastore.data;
import mdaefsm.mda;
public class GP2
{
	af af_o;
	mda mda_o;
	data d_o;
	public void setMDA(mda x)
	{
		mda_o = x;
	}
	public void setdata(data x)
	{
		d_o = x;
	}
	public void setfactory(af x)
	{
		af_o = x;
	}
    public void Activate(float a,float b)
    {
    	if((a>0)&&(b>0))
    	{
         d_o.setfloata(a);
         d_o.setfloatb(b);
         mda_o.Activate();
                      
    	}
    }
    public void Start()
    {
        mda_o.Start();
    }
    public void PayCredit()
    {
        mda_o.PayCredit();
    }
    public void Reject()
    {
        mda_o.Reject();
    }
    public void Cancel()
    {
        mda_o.Cancel();
    }
    public void Approved()
    {
       mda_o.Approved();
       
    }
    public void Super()
    {
    	mda_o.SelectGas(2);
    }
    public void Regular()
    {
    	mda_o.SelectGas(1);
    }
     public void StartPump()
    {  
       mda_o.StartPump();
    }
    public void PumpGallon()
    {
    	mda_o.Pump();    	
    }
    public void StopPump()
    {
       mda_o.StopPump();
       mda_o.Receipt();
    }
    
}

