package strategy;
import datastore.data;
public abstract class ReadyMsg
{
    data dobj;
    public abstract void readyMsg();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
