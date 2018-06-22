package strategy;
import datastore.data;
public abstract class GasPumpedMsg{
   data dobj;
    public abstract void gasPumpedMsg();
    
    public void setdata(data dt)
    {
    	dobj=dt;
    }
}
