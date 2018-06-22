package strategy;
import datastore.data;
public abstract class NoReceipt
{
	data dobj;
    public abstract void noReceipt();
    
    public void setdata(data dt)
    {
    	dobj=dt;
    }
}