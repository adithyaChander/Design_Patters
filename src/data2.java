package datastore;

public class data2 extends data {


	static float temp_a;
	static float temp_b;
	static int temp_c;
	static int W;
	static float price;
	static float cash;
	static float total;
	static float G;
	static float reg_price;
	static float sup_price;
	public void setfloata(float a)
	{
		temp_a =a;
	}
	public void setfloatb(float b)
	{
		temp_b=b;
	}
	public float getfloata()
	{
		return temp_a;
	}
	public float getfloatb()
	{
		return temp_b;
	}
	public void setintc(int c)
	{
		 temp_c =c;
	}
	public int getintc()
	{
		return temp_c;
	}
	
	public void settotal(float c)
	{
		 total =c;
	}
	public float gettotal()
	{
		return total;
	}

	public void setprice(float y)
	{
		price=y;
	}
	public float getprice()
	{
	  return price;
	}
	public void setcash(float a)
	{
		cash =a;
	}
	public float getcash()
	{
		return cash;
	}
    public void setG(float y)
	{
	    G=y;
	}
    public float getG()
	{
	    return G;
	}
    public void setsup_price(float y)
	{
		sup_price=y;
	}
    public float getsup_price()
	{
	  return sup_price;
	}
    public void setreg_price(float y)
	{
		reg_price=y;
	}
    public float getreg_price()
	{
	  return reg_price;
	}
    public void setintW(int a)
	{
		W =a;
	}
	public int getintW()
	{
		return W;
	}
}
