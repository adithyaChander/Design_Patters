package strategy;
import datastore.data;
public abstract class StopMsg
{
    data dobj;
    public abstract void stopMsg();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}