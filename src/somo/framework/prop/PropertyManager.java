package somo.framework.prop;

import java.util.*;
import java.io.*;

import somo.framework.expt.*;
import somo.framework.log.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * Property�� ���� ������ �����Ѵ�.<BR>
 * Property �������Ͽ� ����� ���� ���������� �а� �����Ѵ�.<BR>
 *
 */
public class PropertyManager extends Properties{
  /**
   * Singleton ���� ���� �������
   */
  protected static PropertyManager m_instance;

  /**
   * default ������
   */
  private PropertyManager(){
  }

  /**
   * PropertyManager ��ü�� Singleton �������� �����Ѵ�.
   * @return PropertyManager ��ü
   */
  public static PropertyManager getInstance(){
    if(m_instance == null){
      m_instance = new PropertyManager();
    }
    return m_instance;
  }

  /**
   * PropertyManager �ʱ�ȭ �޼ҵ�<BR>
   * Server�� Startup Ŭ�������� ȣ���Ѵ�.<BR>
   * Property ���������� �Ű������� �޾Ƽ� �ش������� �پ��� ���������� �޸𸮿� �ε��Ѵ�.
   * @param ConfigeFileFullName Property �������ϸ�(Full Path)
   */
  public static void init(String ConfigeFileFullName){
    if(m_instance == null){
      m_instance = new PropertyManager();

      try{
        //default ȯ�溯��������  default.conf file loading
        FileInputStream fin = new FileInputStream(ConfigeFileFullName);
        m_instance.load(fin);
        fin.close();
      } catch(IOException e){
        FWLogManager.getInstance().log("PropertyManager.java", "FileInputStream(), load()", e, "����Ӽ� ���Ϸκ��� �Ӽ��� �ε����� ���߽��ϴ�.", "����Ӽ� ���� default.conf�� ��ġ �� ������ Ȯ���Ͻʽÿ�.", true);
        throw new SysException(e);
      }
    }
  }
}