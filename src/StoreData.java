package strategy;
import datastore.data;
public abstract class StoreData
{
    data dobj;
    public abstract void storeData();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
