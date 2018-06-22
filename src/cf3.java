package abstractfactory;

import datastore.data;
import datastore.data1;
import datastore.data3;
import strategy.StoreData;
import strategy.StoreData3;
import strategy.PayMsg;
import strategy.StoreCash;
import strategy.DisplayMenu;
import strategy.RejectMsg;
import strategy.SetW;
import strategy.SetPrice;
import strategy.ReadyMsg;
import strategy.SetInitialValues;
import strategy.PumpGasUnit;
import strategy.GasPumpedMsg;
import strategy.StopMsg;
import strategy.PrintReceipt;
import strategy.CancelMsg;
import strategy.NoReceipt;
import strategy.NoReceipt1;
import strategy.PayMsg1;
import strategy.StoreCash2;
import strategy.DisplayMenu2;
import strategy.RejectMsg1;
import strategy.SetW1;
import strategy.SetPrice3;
import strategy.ReadyMsg1;
import strategy.SetInitialValues1;
import strategy.PumpGasUnit2;
import strategy.GasPumpedMsg2;
import strategy.StopMsg1;
import strategy.PrintReceipt2;
import strategy.CancelMsg1;

public class cf3 extends af
{
     data3 data3_o= new data3();  //creates data1 object for ATM1
	 public PrintReceipt getPrintReceipt()
    {
		
		 PrintReceipt pr_o =new PrintReceipt2();
		 pr_o.setdata(data3_o);
		       
	        return pr_o;
    }
	 public StoreData getStoreData()
    {
		 StoreData sd_o =new StoreData3();
		 sd_o.setdata(data3_o);
		 return sd_o;
    }
	 public SetInitialValues getSetInitialValues()
    {
		 SetInitialValues siv_o = new SetInitialValues1();
		 siv_o.setdata(data3_o);
        return siv_o;
    }
	 public SetPrice getSetPrice()
    {
		 SetPrice sp_o = new SetPrice3();
		 sp_o.setdata(data3_o);
	        return sp_o;
    }
	 public StoreCash getStoreCash()
     {
		    StoreCash sc_o = new StoreCash2();
		    sc_o.setdata(data3_o);
	        return sc_o;
     }
	 public data getdata()
	 {
	        return data3_o;
	 }

	  public GasPumpedMsg getGasPumpedMsg()
	  {
		  GasPumpedMsg gpm_o = new GasPumpedMsg2();
	        gpm_o.setdata(data3_o);
	        return gpm_o;

	  }
	  public ReadyMsg getReadyMsg()
	  {
		   ReadyMsg rm_o = new ReadyMsg1();
	        rm_o.setdata(data3_o);
	        return rm_o;

	  }
	  public PayMsg getPayMsg()
	  { 
		  PayMsg pm_o = new PayMsg1();
          pm_o.setdata(data3_o);
          return pm_o;

	  }
	  public CancelMsg getCancelMsg()
	  {
		  CancelMsg cm_o = new CancelMsg1();
		  cm_o.setdata(data3_o);
          return cm_o;
	  }
	  public StopMsg getStopMsg()
	  {
		  StopMsg sm_o = new StopMsg1();
		  sm_o.setdata(data3_o);
          return sm_o;
	  }
	  public DisplayMenu getDisplayMenu()
	  {
		  DisplayMenu dm_o = new DisplayMenu2();
		  dm_o.setdata(data3_o);
          return dm_o;
	   }
	    public PumpGasUnit getPumpGasUnit()
	    {
	    	 PumpGasUnit pgu_o = new  PumpGasUnit2();
	    	 pgu_o.setdata(data3_o);
	          return pgu_o;
	    }
	    
	    public RejectMsg getRejectMsg()
	    {
	    	RejectMsg rm_o = new RejectMsg1();
	    	rm_o.setdata(data3_o);
	          return rm_o;
	    }
	    public SetW getsetW()
	    {
	    	  SetW sw_o = new SetW1();
	    	  sw_o.setdata(data3_o);
	          return sw_o;
	    }
	    public NoReceipt getNoReceipt()
	    {
	    	NoReceipt nr_o = new NoReceipt1();
	    	nr_o.setdata(data3_o);
	          return nr_o;
	    }
	    
}
