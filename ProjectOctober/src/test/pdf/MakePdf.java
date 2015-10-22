package test.pdf;

public class MakePdf {
	static String savefile;
	static String targethtml;
	public MakePdf(String savefile,String targethtml){
		this.savefile = savefile;
		this.targethtml= targethtml;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processPdf();
	}
	public static boolean processPdf(){
		String strHtml = targethtml;
        String strCmd = "C:\\wkhtmltopdf\\bin\\wkhtmltopdf.exe --no-stop-slow-scripts --javascript-delay 3000 --orientation Landscape";
        strCmd += " " + strHtml;
        strCmd += " " + savefile;
        
        Pdf t = new Pdf();
        System.out.println(  t.runCmd(strCmd)  );
        return true;
	}
}

