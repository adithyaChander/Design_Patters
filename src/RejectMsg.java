package strategy;
import datastore.data;
public abstract class RejectMsg
{
    data dobj;
    public abstract void rejectMsg();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
