package strategy;
import datastore.data;
public abstract class CancelMsg
{
    data dobj;
    public abstract void cancelMsg();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
