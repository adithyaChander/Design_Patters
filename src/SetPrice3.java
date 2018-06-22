package strategy;
public class SetPrice3 extends SetPrice
{
	@Override
    public void setPrice(int g)
    {
		float a=dobj.getreg1_price();
        float b=dobj.getpre_price();
        if( g== 1)
        dobj.setprice(a);
        else if (g == 2)
        dobj.setprice(b);
    }
    
}
