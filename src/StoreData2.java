package strategy;
public class StoreData2 extends StoreData
{
	
	@Override
    public void storeData()
    {
      float a, b;
      a=dobj.getfloata();
      dobj.setreg_price(a);
      b=dobj.getfloatb();
      dobj.setsup_price(b);
     }
    
}

