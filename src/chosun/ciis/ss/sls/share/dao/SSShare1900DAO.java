/***************************************************************************************************
 * ���ϸ� : SSShare1900DAO.java
 * ��� : �������� ���庸�� ó���� ���� DAO
 * �ۼ����� : 2003-12-20
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
 * ��������-���庸�� ���� DAO
 */
public class SSShare1900DAO {

	/**
	 * �������� ���庸�� ����Ʈ ��ȸ
	 * @param SS_L_OUTRPT_INITDM ��ü
	 * @return SS_L_OUTRPT_INITDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_OUTRPT_INITDataSet selectInitList(SS_L_OUTRPT_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OUTRPT_INITDataSet ds = (SS_L_OUTRPT_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	 * �������� ���庸�� �˻�����Ʈ ��ȸ
	 * @param SS_L_OUTRPT_SRCHDM ��ü
	 * @return SS_L_OUTRPT_SRCHDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_OUTRPT_SRCHDataSet selectSrchList(SS_L_OUTRPT_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OUTRPT_SRCHDataSet ds = (SS_L_OUTRPT_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� ���庸�� ���
	 * @param SS_I_OUTRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertOutrpt(SS_I_OUTRPTDM dm) throws AppException{
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
                   cstmt.setString(8, dm.outplacfrdt);
                   cstmt.setString(9, dm.outplactodt);
                   cstmt.setString(10, dm.outplacarea);
                   cstmt.setString(11, dm.reptcont);
                   cstmt.setString(12, dm.etc);
                   cstmt.setString(13, dm.filenm);
                   cstmt.setString(14, dm.filesize);
                   cstmt.setBytes(15,"1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(16, dm.incmgpers);
                   cstmt.setTimestamp(17, dm.incmgdt);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_I_OUTRPTDataSet ds = (SS_I_OUTRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �ۼ�����,�ۼ���ID ���� ��´�.
                   tempMakedt = dm.makedt;
                   tempMakepersid = dm.makepersid;
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_OUTRPT WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
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
               SS_I_OUTRPTDataSet ds = (SS_I_OUTRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}

	/**
	 * �������� ���庸�� ����
	 * @param SS_U_OUTRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean updateOutrpt(SS_U_OUTRPTDM dm) throws AppException{
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
                   cstmt.setString(5, dm.outplacfrdt);
                   cstmt.setString(6, dm.outplactodt);
                   cstmt.setString(7, dm.outplacarea);
                   cstmt.setString(8, dm.reptcont);
                   cstmt.setString(9, dm.etc);
                   cstmt.setString(10, dm.filenm);
                   cstmt.setString(11, dm.filesize);
                   cstmt.setBytes(12, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(13, dm.chgpers);
                   cstmt.setTimestamp(14, dm.chgdt);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_U_OUTRPTDataSet ds = (SS_U_OUTRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �ۼ�����,�ۼ���ID ���� ��´�.
                   tempMakedt = dm.makedt;
                   tempMakepersid = dm.makepersid;
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_OUTRPT WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
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
               SS_U_OUTRPTDataSet ds = (SS_U_OUTRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}
	/**
	 * �������� ���庸�� ����
	 * @param SS_D_OUTRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean deleteOutrpt(SS_D_OUTRPTDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_OUTRPTDataSet ds = (SS_D_OUTRPTDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	 * �������� ���庸�� ������ ��ȸ
	 * @param SS_S_OUTRPTDM
	 * @return �������� ���庸�� ������ DataSet
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_S_OUTRPTDataSet selectOutrptDetail(SS_S_OUTRPTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_OUTRPTDataSet ds = (SS_S_OUTRPTDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� ���庸�� �ٿ�ε�
	* @param SS_S_OUTRPT_DWLOADDM
	* @return �������� ���庸�� �ٿ�ε� DataSet
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_OUTRPT_DWLOADDataSet dwloadOutrpt(SS_S_OUTRPT_DWLOADDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_OUTRPT_DWLOADDataSet ds = (SS_S_OUTRPT_DWLOADDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
}
