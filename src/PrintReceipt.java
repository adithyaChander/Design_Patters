package strategy;
import datastore.data;
public abstract class PrintReceipt {
    data dobj;
    public abstract void printReceipt();
    
    public void setdata(data dt)
    {
        dobj=dt;
    }
}
