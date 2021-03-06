package abstractfactory;
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
import strategy.StoreData;
import strategy.NoReceipt;
public abstract class af 
{
    
    public abstract PrintReceipt getPrintReceipt();
    public abstract StoreData getStoreData();
    public abstract SetInitialValues getSetInitialValues();
    public abstract SetPrice getSetPrice();
    public abstract StoreCash getStoreCash();
    public abstract GasPumpedMsg getGasPumpedMsg();
    public abstract ReadyMsg getReadyMsg();
    public abstract CancelMsg getCancelMsg();
    public abstract PayMsg getPayMsg();
    public abstract DisplayMenu getDisplayMenu();
    public abstract PumpGasUnit getPumpGasUnit();
    public abstract RejectMsg getRejectMsg();
    public abstract SetW getsetW();
    public abstract StopMsg getStopMsg();
    public abstract NoReceipt getNoReceipt();
}