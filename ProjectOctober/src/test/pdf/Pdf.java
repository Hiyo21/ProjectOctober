package test.pdf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Pdf {

	public boolean runCmd(String strCmd) {
        boolean returnVal = false;
        Runtime run = Runtime.getRuntime();
        Process p = null;
        try {
            p = run.exec(strCmd);
            StreamPrintThread errprint = new StreamPrintThread(p.getErrorStream());
            StreamPrintThread okprint = new StreamPrintThread(p.getInputStream());
            p.getOutputStream().close();
            errprint.start();
            okprint.start();
            int rst = p.waitFor();
            if ( 0 == rst) {
                System.out.println("RunProgram success : " + strCmd);
                returnVal = true;
            }else {
                System.out.println("RunProgram fail (rst:"+ rst +") : " + strCmd);
                returnVal = false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != p) p.destroy();
        }
        return returnVal;
    }
}

class StreamPrintThread extends Thread {
    BufferedReader br = null;
    private StreamPrintThread() {}
    public StreamPrintThread(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
    }
    void close() {
        try {
            if(br != null) br.close();
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void run() {
        try {
            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }finally {
            close();
        }
    }
}

