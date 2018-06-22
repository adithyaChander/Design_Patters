package strategy;
import datastore.data;
public abstract class SetPrice
{
   data dobj;
    public abstract void setPrice(int g);
    public void setdata(data dt)
    {
       dobj=dt;
    }
}
