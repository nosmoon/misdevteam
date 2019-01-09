package somo.framework.log;

import java.io.*;
import java.util.*;
import java.text.*;

import somo.framework.prop.*;
import somo.framework.expt.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  �α��� ����� �Ǵ� �⺻ �׸����� ��¥ �� �ð�, �ڵ�, �޼���, �󼼸޼����� ������.
 *
 */
public class LogData implements Serializable{
  /**
   * �α� ��¥ �� �ð�
   */
  public String date;
  /**
   * �α� �׸� �ڵ�
   */
  public String code;
  /**
   * �α� �׸� ���� �޼���
   */
  public String message;
  /**
   * �α� �׸� ���� �� ó���� ���� �� �޼���
   */
  public String detail;

  /**
   * default ������
   */
  public LogData(){
    init();
  }

  /**
   * �޼����� �Ű������� �޴� ������
   * @param message �α� �׸� ���� �޼���
   */
  public LogData(String message){
    init();
    this.message = message;
  }

  /**
   * �ڵ�, �޼����� �Ű������� �޴� ������
   * @param code �α� �׸� �ڵ�
   * @param message �α� �׸� ���� �޼���
   */
  public LogData(String code, String message){
    init();
    this.code = code;
    this.message = message;
  }

  /**
   * �ڵ�, �޼���, �󼼸޼����� �Ű������� �޴� ������
   * @param code �α� �׸� �ڵ�
   * @param message �α� �׸� ���� �޼���
   * @param detail �α� �׸� ���� �� ó���� ���� �� �޼���
   */
  public LogData(String code, String message, String detail){
    init();
    this.code = code;
    this.message = message;
    this.detail = detail;
  }

  /**
   * AppException ��ü�� �Ű������� �޴� ������<BR>
   * AppException�� ��������� �ڵ�, �޼���, �󼼸޼����� ��������� �����Ѵ�.
   * @param e
   */
  public LogData(AppException e){
    init();
    this.code = e.getErrorCode();
    this.message = e.getErrorMessage();
    this.detail = e.getErrorDetail();
  }

  /**
   * SysException ��ü�� �Ű������� �޴� ������<BR>
   * SysException�κ��� �ڵ�, �޼���, �󼼸޼����� �����Ѵ�.
   * @param e
   */
  public LogData(SysException e){
    init();
    this.code = (String)PropertyManager.getInstance().get("LOG.SYSEXCEPTION");
    this.message = e.getException().toString();
    // ���� �߻��� ���� stack ������ String���� ��ȯ
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    this.detail = sw.getBuffer().toString();
  }

  /**
   * �ʱ�ȭ �޼ҵ�μ� Property ���������� ���� ������ �°� ��¥ �� �ð� ������ ��´�.
   */
  private void init(){
    String dateFormat = (String)PropertyManager.getInstance().get("LOG.DATEFORMAT");
    this.date = new SimpleDateFormat(dateFormat).format(new Date());
  }
}