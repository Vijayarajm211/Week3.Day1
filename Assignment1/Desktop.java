package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		String size="1366*768";
		System.out.println("Desktop Size is :" +size);
	}
	public static void main(String[] args) 
	{
		Desktop compobj=new Desktop();
		compobj.computerModel();
		compobj.btHeadset();
		compobj.desktopSize();
		
	}
}
