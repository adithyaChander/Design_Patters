package strategy;
import datastore.data;
public abstract class SetW
{
    data dobj;
    public abstract void setW(int w);
    public void setdata(data dt)
    {
        dobj=dt;
    }
}