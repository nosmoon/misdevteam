/***************************************************************************************************
 * ���ϸ� : SSShare2100DAO.java
 * ��� : �������� Ÿ�絿�⺸�� ó���� ���� DAO
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
 * ��������-Ÿ�絿�⺸�� ���� DAO
 */
public class SSShare2100DAO {

	/**
	 * �������� Ÿ�絿�⺸�� ����Ʈ ��ȸ
	 * @param SS_L_OTHRPT_INITDM ��ü
	 * @return SS_L_OTHRPT_INITDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_OTHRPT_INITDataSet selectInitList(SS_L_OTHRPT_INITDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OTHRPT_INITDataSet ds = (SS_L_OTHRPT_INITDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	 * �������� Ÿ�絿�⺸�� �˻�����Ʈ ��ȸ
	 * @param SS_L_OTHRPT_SRCHDM ��ü
	 * @return SS_L_OTHRPT_SRCHDataSet ��ü
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_L_OTHRPT_SRCHDataSet selectSrchList(SS_L_OTHRPT_SRCHDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_OTHRPT_SRCHDataSet ds = (SS_L_OTHRPT_SRCHDataSet)manager.executeCall(dm);

		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	 * �������� Ÿ�絿�⺸�� ���
	 * @param SS_I_OTHRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean insertOthrpt(SS_I_OTHRPTDM dm) throws AppException{
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempSeq;          // �ӽ� ����
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
                   cstmt.setString(8, dm.jungpoly);
                   cstmt.setString(9, dm.jungmovmt);
                   cstmt.setString(10, dm.jungetc);
                   cstmt.setString(11, dm.dongpoly);
                   cstmt.setString(12, dm.dongmovmt);
                   cstmt.setString(13, dm.dongetc);
                   cstmt.setString(14, dm.etcpoly);
                   cstmt.setString(15, dm.etcmovmt);
                   cstmt.setString(16, dm.etcetc);
                   cstmt.setString(17, dm.filenm);
                   cstmt.setString(18, dm.filesize);
                   cstmt.setBytes(19, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(20, dm.incmgpers);
                   cstmt.setTimestamp(21, dm.incmgdt);
                   cstmt.registerOutParameter(22, Types.VARCHAR);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_I_OTHRPTDataSet ds = (SS_I_OTHRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� ���� ���� ��´�.
                   tempSeq = ds.getSeq();

                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_OTHRPT WHERE SEQ = '"+tempSeq+"' FOR UPDATE";
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
               SS_I_OTHRPTDataSet ds = (SS_I_OTHRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
     }
	/**
	 * �������� Ÿ�絿�⺸�� ����
	 * @param SS_U_OTHRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean updateOthrpt(SS_U_OTHRPTDM dm) throws AppException{
        boolean ret = false;
           // ÷�������� ������ ��� ÷�������� ������ �ӽ÷� �����Ѵ�.
           if (dm.filecont != null && dm.filecont.length != 0) {
               String tempSeq;          // �ӽ� ����
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
                   cstmt.setLong(3, dm.seq);
                   cstmt.setString(4, dm.makedt);
                   cstmt.setString(5, dm.jungpoly);
                   cstmt.setString(6, dm.jungmovmt);
                   cstmt.setString(7, dm.jungetc);
                   cstmt.setString(8, dm.dongpoly);
                   cstmt.setString(9, dm.dongmovmt);
                   cstmt.setString(10, dm.dongetc);
                   cstmt.setString(11, dm.etcpoly);
                   cstmt.setString(12, dm.etcmovmt);
                   cstmt.setString(13, dm.etcetc);
                   cstmt.setString(14, dm.filenm);
                   cstmt.setString(15, dm.filesize);
                   cstmt.setBytes(16, "1010".getBytes());  // �ӽ� ����Ʈ �迭
                   cstmt.setString(17, dm.chgpers);
                   cstmt.setTimestamp(18, dm.chgdt);

                   // ����
                   cstmt.execute();
                   // ���
                   SS_U_OTHRPTDataSet ds = (SS_U_OTHRPTDataSet)dm.createDataSetObject();
                   ds.getValues(cstmt);

                   if(!"".equals(ds.errcode)){
                       throw new AppException(ds.errcode, ds.errmsg);
                   }
                   // ÷������ ������ ������ �����͸� ����ϰ� ������ ��´�.
                   tempSeq = ""+dm.seq;
                   // BLOB ���ϱ�
                   Statement stmt = manager.m_conn.createStatement();
                   String blobQuery = "SELECT FILECONT FROM TASLM_OTHRPT WHERE MAKEDT = '"+tempSeq+"' FOR UPDATE";
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
               SS_U_OTHRPTDataSet ds = (SS_U_OTHRPTDataSet) manager.executeCall(dm);
               if(!"".equals(ds.errcode)){
                   throw new AppException(ds.errcode, ds.errmsg);
               }else{
                   ret = true;
              }
           }
           return ret;
	}
	/**
	 * �������� Ÿ�絿�⺸�� ����
	 * @param SS_D_OTHRPTDM
	 * @return boolean
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public boolean deleteOthrpt(SS_D_OTHRPTDM dm) throws AppException{
		DBManager manager = new DBManager("Oracle");
		SS_D_OTHRPTDataSet ds = (SS_D_OTHRPTDataSet) manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}else{
			return true;
		}
	}

	/**
	 * �������� Ÿ�絿�⺸�� ������ ��ȸ
	 * @param SS_S_OTHRPTDM
	 * @return �������� Ÿ�絿�⺸�� ������ DataSet
	 * @author CRM ���Ǳ���
	 * @since 2003.10.30       ver : 1.0
	 */

	public SS_S_OTHRPTDataSet selectOthrptDetail(SS_S_OTHRPTDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_OTHRPTDataSet ds = (SS_S_OTHRPTDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			 throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
	/**
	* �������� Ÿ�絿�⺸�� �ٿ�ε�
	* @param SS_S_OTHRPT_DWLOADDM
	* @return �������� Ÿ�絿�⺸�� �ٿ�ε� DataSet
	* @author CRM ���Ǳ���
	* @since 2003.10.30    ver : 1.0
	*/

	public SS_S_OTHRPT_DWLOADDataSet dwloadOthrpt(SS_S_OTHRPT_DWLOADDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_OTHRPT_DWLOADDataSet ds = (SS_S_OTHRPT_DWLOADDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}
}
