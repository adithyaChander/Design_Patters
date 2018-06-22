package mdaefsm;
import state.s;
public class mda
{
    s c_state; //c_state is used to point to the current state object
    s[] ls = new s[8];   
    public void setStates(s a)
    {
    c_state = a;
    }
    public void setStatesList( s a1, s a2, s a3, s a4, s a5, s a6,s a7,s a8)//setting the states
    {
    	ls[0] = a1; //start state
    	ls[1] = a2; //S0 state
    	ls[2] = a3; //S1 state
    	ls[3] = a4; //S2 state 
    	ls[4] = a5; //S3  state
    	ls[5] = a6; //S4 state
    	ls[6] = a7; //S5 state
    	ls[7] = a8; //S6 state
    }
    public void Activate()
    {
    	int cur = c_state.getStateId();
    	System.out.print(cur);
    	switch(cur)
    	{
        	case 0: 
        	{
        	  c_state.Activate();
        	  c_state = ls[1];
        	  break; 
        	}
        	case 1: break; 
        	case 2: break; 
        	case 3: break; 
        	case 4: break; 
        	case 5: break; 
        	case 6: break; 
        	case 7: break; 
    	} 
    }
    public void Start()
    {   
    	int cur = c_state.getStateId();
    	switch(cur)
    	{
        case 0:break; 
        case 1: 
        {
        	c_state.Start();
            c_state = ls[2];
            break; 
        }
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
     
    	}
    }

    public void PayCash()
    { 
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:
        {
        	c_state.PayCash();
            c_state = ls[4];
         }
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7: break; 
    	}
    }
    public void PayCredit()
    { 
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1:  break; 
        case 2: 
        {
            c_state.PayCredit();
            c_state = ls[3];
        }
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
       
    }
}


    public void Approved()
    {
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:
        {
           c_state.Approved();
           c_state = ls[4];
           break;
        }
        case 4: break; 
        case 5: break; 
        case 6: break; 
        case 7: break; 

    }
}

public void Reject()
{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:
        {
            c_state.Reject();
           c_state = ls[1];
           break; 
        }
        case 4:break; 
        case 5:break; 
        case 6:break; 
        case 7:break; 
    }
}

public void SelectGas(int g)
{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3:  break; 
        case 4: 
        { 
        	c_state.SelectGas(g);
            c_state = ls[5];
            break;
        }
        case 5: break; 
        case 6: break; 
        case 7: break; 
    }
}

	public void Cancel()
	{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4: 
        { 
        	 c_state.Cancel();
            c_state = ls[1];
            break;
        }
        case 5:  break; 
        case 6:  break; 
        case 7:  break; 
    }
}

	public void StartPump()
	{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:
        {
        	c_state.StartPump();
            c_state = ls[6];
            break;
        }
        case 6:  break; 
        case 7:  break; 
    }
}

	public void Pump()
	{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2:  break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6: 
        { 
        	System.out.println("\n\n The gas is being pumped");
            c_state.Pump();
            c_state = ls[6];
            break; 
       }
        case 7:  break; 
    }
}

	public void StopPump()
 	{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3: break; 
        case 4:  break; 
        case 5:  break; 
        case 6:
        { 
        	 c_state.StopPump();
            c_state = ls[7];
            break;
        }
        case 7:  break; 
    	}
}
 	public void Receipt()
 	{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0:  break; 
        case 1:  break; 
        case 2: break; 
        case 3:  break; 
        case 4:  break; 
        case 5:  break; 
        case 6: break;
        case 7:
        { 
        	 c_state.Receipt();
            c_state = ls[1];
            break;
       }

    }
}

 	public void NoReceipt()
 	{
    int cur = c_state.getStateId();
    switch(cur)
    {
        case 0: break; 
        case 1: break; 
        case 2: break; 
        case 3: break; 
               
        case 4: break; 
        case 5: break; 
        case 6: break;
        case 7:
        	{ 
        	 c_state.NoReceipt();
            c_state = ls[1];
            break;
        	}

    	}
 	}

}
