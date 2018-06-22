package inputpro;
import abstractfactory.af;
import datastore.data;
import mdaefsm.mda;
public class GP1
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
	public void Activate(int a)
	{
		d_o.setinta(a);
		mda_o.Activate();
                
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
	public void PayCash(int c)
	{
		d_o.setintc(c);
		if(c>0)
		{
    
			mda_o.PayCash();
		}

	}
	public void Approved()
	{
		mda_o.Approved();
 
	}
	public void StartPump()
	{
		mda_o.SelectGas(1);
		mda_o.StartPump();
	}
	public void PumpGallon()
	{
		int w =d_o.getintW();
		float G = d_o.getG();
		float cash = d_o.getcash();
		float price =d_o.getprice();
		if ( w== 1)
		{
			mda_o.Pump();
		}
		else if(w == 0)
		{
			if(cash < (G+1)*price)
			{
				mda_o.StopPump();
				mda_o.Receipt();
			}
			else
			{
				mda_o.Pump();
			}
		}
	
	}
	public void StopPump()
	{
		mda_o.StopPump();
		mda_o.Receipt();
	}

}






	 