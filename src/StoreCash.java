package strategy;
import datastore.data;
public abstract class StoreCash
{
    data dobj;
    public abstract void storeCash();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
