package oops;

interface Tvremote
{
	public void poweron();
	public void poweroff();
	public void channelup();
	public void channeldown();
}
interface Smarttvremote extends Tvremote
{
	public void blutooth();
	public void wifi();
	public void quickshare();
	public void Switchtohd();
	
}

class tv implements Smarttvremote
{

	@Override
	public void poweron()
	{
      System.out.println("normal power on");
		
	}

	@Override
	public void poweroff() 
	{
		System.out.println("normal power off");
		
	}

	@Override
	public void channelup() 
	{
		System.out.println("normal channel up");
		
	}

	@Override
	public void channeldown()
	{
	 System.out.println("normal channel down");
		
	}

	@Override
	public void blutooth() 
	{
	System.out.println("smart bluetooth");
		
	}

	@Override
	public void wifi()
	{
	
		System.out.println("smart wifi");
	}

	@Override
	public void quickshare()
	{
	System.out.println("smart quickshare");	
		
	}

	@Override
	public void Switchtohd()
	{
		System.out.println("smart switch to hd");
		
	}
	
}









public class tvremoteinterface 
{

	public static void main(String[] args)
	{
	tv ob=new tv();
	ob.poweron();
	ob.poweroff();
	ob.channelup();
	ob.channeldown();
	ob.blutooth();
	ob.wifi();
	ob.quickshare();
	ob.Switchtohd();
	

	}

}
