package strategy;
import datastore.data;
public abstract class PayMsg
{
    data dobj;
    public abstract void payMsg();
    
    public void setdata(data dt)
    {
    	dobj=dt;
    }
}

