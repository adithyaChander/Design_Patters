package outputpro;

import datastore.data;
import abstractfactory.af;
import outputpro.op;
import strategy.StoreData;
import strategy.PayMsg;
import strategy.StoreCash;
import strategy.RejectMsg;
import strategy.SetW;
import strategy.SetPrice;
import strategy.ReadyMsg;
import strategy.SetInitialValues;
import strategy.PumpGasUnit;
import strategy.GasPumpedMsg;
import strategy.StopMsg;
import strategy.CancelMsg;
import strategy.PrintReceipt;
import strategy.DisplayMenu;
import strategy.NoReceipt;
public class op
{
		static af af_obj;
	   data d_o;
	   public void setfactory(af af1)
	    {
	        af_obj=af1;
	    }
	    public void setData(data d1)
	    {
	        d_o=d1;
	    }
	    public static void storeData()
	    {

		   StoreData object;
		   object=af_obj.getStoreData();
		   object.storeData();
	    }
	    public static void displayMenu()
	    {
	    	DisplayMenu object;
	    	object=af_obj.getDisplayMenu();
	    	object.displayMenu();
	    }
	    public static void payMsg() 
	    {
	    	PayMsg object;
	    	object=af_obj.getPayMsg();
	    	object.payMsg();
	    }
	    public static void rejectMsg()
	    {
	    	RejectMsg object;
	    	object=af_obj.getRejectMsg();
	    	object.rejectMsg();
	    }
	    public static void printReceipt()
	    {
	    	PrintReceipt object;
	    	object=af_obj.getPrintReceipt();
	    	object.printReceipt();
	     }    
	    public static void cancelMsg()
	    {
	    	CancelMsg object;
	    	object=af_obj.getCancelMsg();
	    	object.cancelMsg();
	    }
	   public static void storeCash()
	    {
	    	StoreCash object;
	    	object=af_obj.getStoreCash();
	    	object.storeCash();
	        
	    }
	   public static void gasPumpedMsg()
	    {
	    	GasPumpedMsg object;
	    	object=af_obj.getGasPumpedMsg();
	    	object.gasPumpedMsg();
	    }
	     public static void pumpGasUnit()
	    {
	    	    PumpGasUnit object;
		    	object=af_obj.getPumpGasUnit();
		    	object.pumpGasUnit();
	    }

	    public static void readyMsg()
	    {
	    	ReadyMsg object;
	    	object=af_obj.getReadyMsg();
	    	object.readyMsg();
	    }
	    public static void stopMsg()
	    {
	    	StopMsg object;
	    	object=af_obj.getStopMsg();
	    	object.stopMsg();
	    }
	    
	    public static void setPrice(int g)
	    {
	    	SetPrice object;
	    	object=af_obj.getSetPrice();
	    	object.setPrice(g);
	    }
	    public static void setInitialValues()
	    {

	    	SetInitialValues object;
	    	object=af_obj.getSetInitialValues();
	    	object.setInitialValues();
	    }
	    public static void setW(int k)
	    {
	    	SetW object;
	    	object=af_obj.getsetW();
	    	object.setW(k);
	    }
	    public static void NoReceipt()
	    {

	    	NoReceipt object;
	    	object=af_obj.getNoReceipt();
	    	object.noReceipt();
	    }
	    
	

}