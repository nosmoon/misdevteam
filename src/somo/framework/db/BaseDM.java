package somo.framework.db;

import java.sql.*;

/**
 *
 * <p>Copyright: Copyright by softonmobile (c) 2003</p>
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 *  ���ν��� �� DataSet ��ü�� ���� ���踦 ���´�. CallableStatement ��ü�� �Ű������� �����ϰ�<BR>
 *  ���ν��� ȣ�� ����� �ݿ��� DataSet Ŭ���������� �����Ѵ�.
 *
 */

public abstract class BaseDM {

  /**
  * ���� DM Ŭ������, �����Ǵ� ���ν����� ȣ���ϱ� ���� CallableStatement�� �ĸ����͸� �����ϵ��� �����Ѵ�.
  * @return CallableStatement�� ���ڿ�
  */
 public abstract String getSQL();
  /**
   * ���� DM Ŭ������, �����Ǵ� ���ν����� ȣ���ϱ� ���� CallableStatement�� �ĸ����͸� �����ϵ��� �����Ѵ�.
   * @param cstmt �Ķ���� ������ �ʿ��� PreparedStatement �Ǵ� CallableStatement ��ü
   */

  /**
   * ���� DM Ŭ������, �����Ǵ� ���ν����� ȣ���ϱ� ���� CallableStatement�� �ĸ����͸� �����ϵ��� �����Ѵ�.
   * @param cstmt �Ķ���� ������ �ʿ��� PreparedStatement �Ǵ� CallableStatement ��ü
   * @param dm ȣ��Ǿ�� �� ���ν������ ȣ������ ���� DataSet Ŭ���������� ���� DM ��ü
   * @throws SQLException
   */
  public abstract void setParams(CallableStatement cstmt, BaseDM dm) throws SQLException;

  /**
   * ���� DM Ŭ������ �����Ǵ� DataSet Ŭ������ �̸��� �����Ѵ�.
   * @return DataSet Ŭ���� �̸�
   */
  public abstract BaseDataSet createDataSetObject();
}