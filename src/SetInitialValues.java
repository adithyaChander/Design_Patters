package strategy;
import datastore.data;
public abstract class SetInitialValues
{
	data dobj;
    public abstract void setInitialValues();
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
