package somo.framework.db;

import java.sql.*;
import java.util.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  DB Access �� ����Ʈ Ÿ���� ��ü�� �����Ͽ� ArrayList�� �����Ѵ�.
 *
 */
public abstract class BaseDataSet {
  /**
   * CallableStatement ��ü�κ��� �����ڵ�,�����޼����� ��´�. ResultSet���κ��� �ݺ������� ��ü�� �� list ��������� �����Ѵ�.
   * @param cstmt list ����� ��� ���� �ʿ��� DB Access�� �����ϴ� CallableStatement ��ü
   * @throws SQLException
   */
  public abstract void getValues(CallableStatement cstmt) throws SQLException;
  public abstract String getErrcode();
  public abstract void setErrcode(String errmsg);
  public abstract String getErrmsg();
  public abstract void setErrmsg(String errmsg); 
}