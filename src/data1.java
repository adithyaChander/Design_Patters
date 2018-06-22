package datastore;

public class data1 extends data
{

	static int temp_a;
	static int temp_c;
	static int W;
	static float price;
	static float cash;
	static float total;
	static float G;


	public void setinta(int a)
	{
		temp_a =a;
	}

	public int getinta()
	{
		return temp_a;
	}

	public void setprice(float a)
	{
		price=a;
	}
	public float getprice()
	{
		return price;
	}

	public void setintc(int a)
	{
	 	temp_c =a;
	}

	public int getintc()
	{
	return temp_c;
	}
	public void setG(float a)
	{
		G=a;
	}
	public float getG()
	{
		return G;
	}
	public void setintW(int a)
	{
		W =a;
	}
	public int getintW()
	{
		return W;
	}
	public void settotal(float a)
	{
		total =a;
	}
	public float gettotal()
	{
		return total;
	}
	public void setcash(float a)
	{
		cash =a;
	}
	public float getcash()
	{
		return cash;
	}

}