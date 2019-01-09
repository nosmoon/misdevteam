package somo.framework.log;

import java.io.*;

import somo.framework.prop.*;
import somo.framework.log.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  �����ӿ�ũ ������ �߻��� ���ܻ����� ������ �α�ó���Ѵ�.
 *
 */
public class FWLogManager{
  /**
   * Singleton ���� ���� �������
   */
  private static FWLogManager m_instance;
  private String fwLogFile;
  private File f;
  private PrintWriter fwFileOut;

  /**
   * default ������<BR>
   * PropertyManager�� �̿��Ͽ� �����ӿ�ũ ���� �α� ��� ���ϸ��� ��´�. �ش� ������ ã�� ���� ��� �ֿܼ� �����޼����� ����Ѵ�.
   */
  private FWLogManager(){
    PropertyManager prop = PropertyManager.getInstance();
    fwLogFile = (String)prop.get("LOG.FILENAME");
System.out.println("11:FWLogManager : FWLogManager() : fwLogFile : "+fwLogFile);
    f = new File(fwLogFile);

    try{
      if(f.exists()){
        // ������ �����ϸ� append mode, autoflush �� PrintWriter�� ����
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile, true), true);
      } else{
        //autoflush
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile), true);
      }
    } catch(IOException e){
      System.out.println("Framework Message : ");
      System.out.println("\tSource : FWLogManager.java");
      System.out.println("\tCall : FWLogManager()");
      System.out.println("\tException : IOException");
      System.out.println("\tDetail : ");
      System.out.println(
          "\t\t�����ӿ�ũ�� ���ܻ�Ȳ�߻��� �α׸� ����ϴ� FWLogManager�� ��������� ã�� ���߽��ϴ�.");
      System.out.println("\t\t�����ӿ�ũ�� ���ܻ�Ȳ�߻��� �α׸� ���Ͽ� ����� �� �����ϴ�.");
      System.out.println("\tCheck : ");
      System.out.println("\t\t�����ӿ�ũ ���������� LOG.FWFILENAME �׸��� Ȯ���Ͻʽÿ�.");
      System.out.println("\tServer Restart : ");
      System.out.println("\t\tSystem�� �����ذ� �� �ٽ� ���۵Ǵ� ���� �����ϴ�.");
      System.out.println("\t\tSystem�� ��� ������ �� �ֽ��ϴ�.");
    } finally{
      if(fwFileOut != null){
        fwFileOut.close();
      }
    }
  }

  /**
   * Singleton ���� ���� ��ü�� �����Ѵ�.
   * @return FWLogManager ��ü
   */
  public static FWLogManager getInstance(){
    if(m_instance == null){
      m_instance = new FWLogManager();
    }
    return m_instance;
  }

  /**
   * ȭ��� ���Ͽ� �α׸� ����Ѵ�.
   * @param src �α׼��� �ڵ�(���ܹ߻� �ڵ�)
   * @param call �α׼��� �ڵ峻 ȣ�� �޼ҵ�
   * @param e �߻��� ����
   * @param detail �߻��� ���� �� ����
   * @param check ���ܹ߻� ���� ��
   * @param restart ���� �簡�� �ʿ伺 ����
   */
  public void log(String src, String call, Exception e, String detail,
                  String check, boolean restart){
    // Log to Console
    System.out.println("Framework Message : ");
    System.out.println("\tSource : " + src);
    System.out.println("\tCall : " + call);
    System.out.println("\tException : " + e);
    System.out.println("\tDetail : ");
    System.out.println("\t\t" + detail);
    System.out.println("\tCheck : ");
    System.out.println("\t\t" + check);
    System.out.println("\tServer Restart : ");
    if(restart){
      System.out.println("\t\tSystem�� �����ذ� �� �ٽ� ���۵Ǿ�� �մϴ�.");
    } else{
      System.out.println("\t\tSystem�� ��� ������ �� �ֽ��ϴ�.");
    }

    // Log to File
    try{
      if(f.exists()){
        // ������ �����ϸ� append mode, autoflush �� PrintWriter�� ����
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile, true), true);
      } else{
        //autoflush
        fwFileOut = new PrintWriter(new FileOutputStream(fwLogFile), true);
      }
      fwFileOut.println("Framework Message : ");
      fwFileOut.println("\tSource : " + src);
      fwFileOut.println("\tCall : " + call);
      fwFileOut.println("\tException : " + e);
      fwFileOut.println("\tDetail : ");
      fwFileOut.println("\t\t" + detail);
      fwFileOut.println("\tCheck : ");
      fwFileOut.println("\t\t" + check);
      fwFileOut.println("\tServer Restart : ");
      if(restart){
        fwFileOut.println("\t\tSystem�� �����ذ� �� �ٽ� ���۵Ǿ�� �մϴ�.");
      } else{
        fwFileOut.println("\t\tSystem�� ��� ������ �� �ֽ��ϴ�.");
      }
    } catch(IOException ioe){
      System.out.println("Framework Message : ");
      System.out.println("\tSource : FWLogManager.java");
      System.out.println("\tCall : FWLogManager()");
      System.out.println("\tException : IOException");
      System.out.println("\tDetail : ");
      System.out.println(
          "\t\t�����ӿ�ũ�� ���ܻ�Ȳ�߻��� �α׸� ����ϴ� FWLogManager�� ��������� ã�� ���߽��ϴ�.");
      System.out.println("\t\t�����ӿ�ũ�� ���ܻ�Ȳ�߻��� �α׸� ���Ͽ� ����� �� �����ϴ�.");
      System.out.println("\tCheck : ");
      System.out.println("\t\t�����ӿ�ũ ���������� LOG.FWFILENAME �׸��� Ȯ���Ͻʽÿ�.");
      System.out.println("\tServer Restart : ");
      System.out.println("\t\tSystem�� �����ذ� �� �ٽ� ���۵Ǵ� ���� �����ϴ�.");
      System.out.println("\t\tSystem�� ��� ������ �� �ֽ��ϴ�.");
    } finally{
      if(fwFileOut != null){
        fwFileOut.close();
      }
    }
  }
}