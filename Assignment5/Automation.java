package week3.day1.assignments;

public class Automation extends MultipleLangauge implements Language,TestTool
{
	public static void main(String[] args) 
	{
	
		Automation autoLang=new Automation();
		autoLang.python();
		autoLang.Java();
		autoLang.Selenium();
		autoLang.ruby();
				
	}

	public void Selenium() {
		
		System.out.println("Selenium is Automation Tool");
		
	}

	public void Java() {

	System.out.println("Java is language and Open Source");	
	}

	@Override
	public void ruby() {

		System.out.println("ruby is Language");
	}

	
		
}
