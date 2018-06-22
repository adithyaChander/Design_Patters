package strategy;
public class StoreData1 extends StoreData
{
    @Override
    public void storeData()
    {
      int a;
      a=dobj.getinta();
      float b =(float)a;
      dobj.setprice(b);
    }
    
}
