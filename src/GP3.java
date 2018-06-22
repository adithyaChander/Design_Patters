package inputpro;
import abstractfactory.af;
import datastore.data;
import mdaefsm.mda;
public class GP3 
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
    public void PayCash(float c)
    {
    	if(c>0)
    	{
    		d_o.setfloatc(c);
    
    	mda_o.PayCash();
    	}
    }
    public void Cancel()
    {
        mda_o.Cancel();
    }
    public void Premium()
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
    public void PumpLiter()
    {
    
    	float cash = d_o.getcash();
    	float price =d_o.getprice();
    	float L = d_o.getL();  	
    	if(cash<(L+1)*price)
    	{
    		mda_o.StopPump();
    	}
    	else
    	{
    		mda_o.Pump();
    	}
    }
    public void StopPump()
    {
       mda_o.StopPump();
    }
    public void Receipt()
    {
    	mda_o.Receipt();
    }
    public void NoReceipt()
    {
    	mda_o.NoReceipt();
    }
}
    