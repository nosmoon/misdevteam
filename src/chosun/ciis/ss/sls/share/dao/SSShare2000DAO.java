/***************************************************************************************************
 * ���ϸ� : SSShare2000DAO.java
 * ��� : �������� �����ٹ����� ó���� ���� DAO
 * �ۼ����� : 2003-12-29
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.share.dao;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;
import java.io.*;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * ��������-�����ٹ����� ���� DAO
 */
public class SSShare2000DAO {

	/**
	 * �������� �����ٹ����� ����Ʈ ��ȸ
	 * @param SS_L_DAWNRPT_INITDM ��ü
	 * @return SS_L_DAWNRPT_INITDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_DAWNRPT_INITDataSet selectInitList(SS_L_DAWNRPT_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_DAWNRPT_INITDataSet ds = (SS_L_DAWNRPT_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	 * �������� �����ٹ����� �˻�����Ʈ ��ȸ
	 * @param SS_L_DAWNRPT_SRCHDM ��ü
	 * @return SS_L_DAWNRPT_SRCHDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_DAWNRPT_SRCHDataSet selectSrchList(SS_L_DAWNRPT_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_DAWNRPT_SRCHDataSet ds = (SS_L_DAWNRPT_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� �����ٹ����� ���
	 * @param SS_I_DAWNRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertDawnrpt(SS_I_DAWNRPTDM dm) throws AppException{
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempMakedt;      // �ӽ� �ۼ�����
               String tempMakepersid;  // �ӽ� �ۼ���ID
               byte[] tempCont;    // �ӽ� ÷������ ����
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // �Ķ���� ����
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setString(3, dm.makedt);
                   cstmt.setString(4, dm.makepersid);
                   cstmt.setString(5, dm.makepersnm);
                   cstmt.setString(6, dm.deptcd);
                   cstmt.setString(7, dm.deptnm);
                   cstmt.setString(8, dm.dutybgntm);
                   cstmt.setString(9, dm.dutyendtm);
                   cstmt.setString(10, dm.dutybonm);
                   cstmt.setString(11, dm.mainchk);
                   cstmt.setString(12, dm.dutycont);
                   cstmt.setString(13, dm.etc);
                   cstmt.setString(14, dm.filenm);
                   cstmt.setString(15, dm.filesize);
                   cstmt.setBytes(16, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(17, dm.incmgpers);
                   cstmt.setTimestamp(18, dm.incmgdt);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_I_DAWNRPTDataSet ds = (SS_I_DAWNRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �ۼ�����,�ۼ���ID ���� ��´�.
                   tempMakedt = dm.makedt;
                   tempMakepersid = dm.makepersid;
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_DAWNRPT WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//������(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
   e.printStackTrace();
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
        }else{
            DBManager manager = new DBManager("Oracle");
               SS_I_DAWNRPTDataSet ds = (SS_I_DAWNRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;

	}
	/**
	 * �������� �����ٹ����� ����
	 * @param SS_U_DAWNRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean updateDawnrpt(SS_U_DAWNRPTDM dm) throws AppException{
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempMakedt;      // �ӽ� �ۼ�����
               String tempMakepersid;  // �ӽ� �ۼ���ID
               byte[] tempCont;    // �ӽ� ÷������ ����
               tempCont = dm.filecont;
               DBManager manager = null;
               try {
                   manager = new DBManager("Oracle");
                   manager.getConnection();
                   manager.m_conn.setAutoCommit(false);
                   CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
                   // �Ķ���� ����
                   cstmt.registerOutParameter(1, Types.VARCHAR);
                   cstmt.registerOutParameter(2, Types.VARCHAR);
                   cstmt.setString(3, dm.makedt);
                   cstmt.setString(4, dm.makepersid);
                   cstmt.setString(5, dm.dutybgntm);
                   cstmt.setString(6, dm.dutyendtm);
                   cstmt.setString(7, dm.dutybonm);
                   cstmt.setString(8, dm.mainchk);
                   cstmt.setString(9, dm.dutycont);
                   cstmt.setString(10, dm.etc);
                   cstmt.setString(11, dm.filenm);
                   cstmt.setBytes(13, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(12, dm.filesize);
                   cstmt.setString(14, dm.chgpers);
                   cstmt.setTimestamp(15, dm.chgdt);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_U_DAWNRPTDataSet ds = (SS_U_DAWNRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �ۼ�����,�ۼ���ID ���� ��´�.
                   tempMakedt = dm.makedt;
                   tempMakepersid = dm.makepersid;
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_DAWNRPT WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
                   OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);

                   if (rset.next()) {
                       weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                       BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
	          	   		//������(ep1)
	          	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                       OutputStream os = oracle_blob.getBinaryOutputStream();
                       // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                       int b;

                       for(int i=0; i<tempCont.length; i++){
                           os.write(tempCont[i]);
                       }
                       os.close();
                   }

                   stmt.close();
                   manager.disConnection();
               } catch (AppException e){
                   manager.disConnection();
                   throw e;
               } catch (Exception e) {
e.printStackTrace();
                try{
                    manager.m_conn.rollback();
                }catch(SQLException se){
                    throw new SysException(se);
                }
                manager.disConnection();
                throw new SysException(e);
            }
        }else{
                DBManager manager = new DBManager("Oracle");
               SS_U_DAWNRPTDataSet ds = (SS_U_DAWNRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}
	/**
	 * �������� �����ٹ����� ����
	 * @param SS_D_DAWNRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean deleteDawnrpt(SS_D_DAWNRPTDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_DAWNRPTDataSet ds = (SS_D_DAWNRPTDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	 * �������� �����ٹ����� ������ ��ȸ
	 * @param SS_S_DAWNRPTDM
	 * @return �������� �����ٹ����� ������ DataSet
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_S_DAWNRPTDataSet selectDawnrptDetail(SS_S_DAWNRPTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_DAWNRPTDataSet ds = (SS_S_DAWNRPTDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� �����ٹ����� �ٿ�ε�
	* @param SS_S_DAWNRPT_DWLOADDM
	* @return �������� �����ٹ����� �ٿ�ε� DataSet
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_DAWNRPT_DWLOADDataSet dwloadDawnrpt(SS_S_DAWNRPT_DWLOADDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_DAWNRPT_DWLOADDataSet ds = (SS_S_DAWNRPT_DWLOADDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
}
