package strategy;
import datastore.data;
public abstract class PumpGasUnit
{
   data dobj;
    public abstract void pumpGasUnit();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
