package strategy;
import datastore.data;
public abstract class DisplayMenu
{
  data dobj;
  public abstract void displayMenu();
  public void setdata(data dt)
    {
        dobj=dt;
    }
}

