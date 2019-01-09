/***************************************************************************************************
* ���ϸ� : SSShare1800DAO.java
* ��� : �������� ���Ͼ������� ó���� ���� DAO
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
* ��������-���Ͼ������� ���� DAO
*/
public class SSShare1800DAO {

	/**
	* �������� ���Ͼ������� ����Ʈ ��ȸ
	* @param SS_L_JOBREC_INITDM ��ü
	* @return SS_L_JOBREC_INITDataSet ��ü
	*/

	public SS_L_JOBREC_INITDataSet selectInitList(SS_L_JOBREC_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_JOBREC_INITDataSet ds = (SS_L_JOBREC_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� ���Ͼ������� �˻�����Ʈ ��ȸ
	* @param SS_L_JOBREC_SRCHDM ��ü
	* @return SS_L_JOBREC_SRCHDataSet ��ü
	*/

	public SS_L_JOBREC_SRCHDataSet selectSrchList(SS_L_JOBREC_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_JOBREC_SRCHDataSet ds = (SS_L_JOBREC_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	* �������� ���Ͼ������� ���
	* @param SS_I_JOBRECDM
	* @return boolean
	*/
	public boolean insertJobrec(SS_I_JOBRECDM dm) throws AppException{

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
                cstmt.setString(8, dm.curddplan);
                cstmt.setString(9, dm.prvddproc);
                cstmt.setString(10, dm.etc);
                cstmt.setString(11, dm.filenm);
                cstmt.setString(12, dm.filesize);
                cstmt.setBytes(13, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                cstmt.setString(14, dm.incmgpers);
                cstmt.setTimestamp(15, dm.incmgdt);

                // ����
                cstmt.execute();
                // ���
                SS_I_JOBRECDataSet ds = (SS_I_JOBRECDataSet)dm.createDataSetObject();
                ds.getValues(cstmt);

                if(!"".equals(ds.errcode)){
                    throw new AppException(ds.errcode, ds.errmsg);
                }
                // ÷������ ������ ������ �����͸� ����ϰ� �ۼ�����,�ۼ���ID ���� ��´�.
                tempMakedt = dm.makedt;
                tempMakepersid = dm.makepersid;
                // BLOB ���ϱ�
                Statement stmt = manager.m_conn.createStatement();
                String blobQuery = "SELECT FILECONT FROM TASLM_JOBREC WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
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
            SS_I_JOBRECDataSet ds = (SS_I_JOBRECDataSet) manager.executeCall(dm);
            if(!"".equals(ds.errcode)){
                throw new AppException(ds.errcode, ds.errmsg);
            }else{
                ret = true;
           }
        }
        return ret;

	}
	/**
	* �������� ���Ͼ������� ����
	* @param SS_U_JOBRECDM
	* @return boolean
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/
	public boolean updateJobrec(SS_U_JOBRECDM dm) throws AppException{
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
                   cstmt.setString(5, dm.curddplan);
                   cstmt.setString(6, dm.prvddproc);
                   cstmt.setString(7, dm.etc);
                   cstmt.setString(8, dm.filenm);
                   cstmt.setString(9, dm.filesize);
                   cstmt.setBytes(10, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(11, dm.chgpers);
                   cstmt.setTimestamp(12, dm.chgdt);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_U_JOBRECDataSet ds = (SS_U_JOBRECDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� �ۼ�����,�ۼ���ID ���� ��´�.
                   tempMakedt = dm.makedt;
                   tempMakepersid = dm.makepersid;
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_JOBREC WHERE MAKEDT = '"+tempMakedt+"' AND MAKEPERSID ='"+tempMakepersid+"' FOR UPDATE";
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
               SS_U_JOBRECDataSet ds = (SS_U_JOBRECDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}
	/**
	* �������� ���Ͼ������� ����
	* @param SS_D_JOBRECDM
	* @return boolean
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/

	public boolean deleteJobrec(SS_D_JOBRECDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_JOBRECDataSet ds = (SS_D_JOBRECDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	* �������� ���Ͼ������� ������ ��ȸ
	* @param SS_S_JOBRECDM
	* @return �������� ���Ͼ������� ������ DataSet
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_JOBRECDataSet selectJobrecDetail(SS_S_JOBRECDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_JOBRECDataSet ds = (SS_S_JOBRECDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� ���Ͼ������� �ٿ�ε�
	* @param SS_S_JOBREC_DWLOADDM
	* @return �������� ���Ͼ������� �ٿ�ε� DataSet
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_JOBREC_DWLOADDataSet dwloadJobrec(SS_S_JOBREC_DWLOADDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_JOBREC_DWLOADDataSet ds = (SS_S_JOBREC_DWLOADDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

}
