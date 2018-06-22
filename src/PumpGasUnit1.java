package strategy;

public class PumpGasUnit1 extends PumpGasUnit
{
	@Override
    public void pumpGasUnit()
    {
      
       float g=dobj.getG();
       g=g+1;
       float total;
       float price = dobj.getprice();
       total =price *g;
       dobj.setG(g);
       dobj.settotal(total);  
      }
}
