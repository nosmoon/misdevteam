/***************************************************************************************************
* ���ϸ� : SSShare2200DAO.java
* ��� : �Ǹű����� ó���� ���� DAO
* �ۼ����� : 2004-04-21
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
 * �Ǹű����� ���� DAO
 */
public class SSShare2200DAO {

    /**
     * �Ǹű�����-�ʱ�ȭ��
     * @param dm SS_L_MAIN_INITDM ��ü
     * @return SS_L_MAIN_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_MAIN_INITDataSet selectMainInit(SS_L_MAIN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MAIN_INITDataSet ds = (SS_L_MAIN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �Ǹű�����-�޷�-�������� ��ȸ
     * @param SS_L_MONTH_SCHEDM ��ü
     * @return SS_L_MONTH_SCHEDataSet ��ü
     * @throws AppException
     */
    public SS_L_MONTH_SCHEDataSet selectMonthScheList(SS_L_MONTH_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MONTH_SCHEDataSet ds = (SS_L_MONTH_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �Ǹű�����-�޷�-�Ϻ����� ��ȸ
     * @param SS_L_DAY_SCHEDM ��ü
     * @return SS_L_DAY_SCHEDataSet ��ü
     * @throws AppException
     */
    public SS_L_DAY_SCHEDataSet selectDayScheList(SS_L_DAY_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_DAY_SCHEDataSet ds = (SS_L_DAY_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	/**
	* �Ǹű�����-��������-��
	* @param SS_S_ANNCDM ��ü
	* @return SS_S_ANNCDataSet ��ü
	* @throws AppException
	*/
	public SS_S_ANNCDataSet selectAnncDetail(SS_S_ANNCDM dm) throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_ANNCDataSet ds = (SS_S_ANNCDataSet)manager.executeCall(dm);
		if(!"".equals(ds.errcode)){
			throw new AppException(ds.errcode, ds.errmsg);
		}
		return ds;
	}

	/**
	* �Ǹű�����-��������-�ٿ�ε�
	* @param SS_S_INFOEXG_DWLOADDM ��ü
	* @return SS_S_INFOEXG_DWLOADDataSet ��ü
	* @throws AppException
	*/
	public SS_S_INFOEXG_DWLOADDataSet dwloadAnnc(SS_S_INFOEXG_DWLOADDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_INFOEXG_DWLOADDataSet ds = (SS_S_INFOEXG_DWLOADDataSet)manager.executeCall(dm);
        // ����ũ�⸸ŭ byte[] ����
        ds.filecont = new byte[Integer.parseInt(ds.filesize)];
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }

        try {
            manager = new DBManager("Oracle");
            manager.getConnection();
            manager.m_conn.setAutoCommit(false);
            Statement stmt = manager.m_conn.createStatement();
            String blobQuery = "SELECT FILECONT FROM TACOM_INFOEXG WHERE SEQ = '"+dm.seq+"' FOR UPDATE";
            OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery);
            if (rset.next()) {
                weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
                BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
      	   		//������(ep1)
      	   		//oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
                InputStream is = oracle_blob.getBinaryStream();
                // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
                int b;
                int count = 0;
                while( (b = is.read()) != -1 ) {
                    ds.filecont[count++] = (byte)b;
                }
                is.close();
            }
            stmt.close();
            manager.disConnection();
        } catch (Exception e) {
            manager.disConnection();
            throw new SysException(e);
        }

        return ds;
	}

    /**
     * �Ǹű�����-�ǽð�����-���
     * @param dm SS_L_ANNCSLSDM
     * @return SS_L_ANNCSLSDataSet
    * @throws AppException
    */
    public SS_L_ANNCSLSDataSet selectAnncslsList(SS_L_ANNCSLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ANNCSLSDataSet ds = (SS_L_ANNCSLSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �Ǹű�����-�ǽð�����-��
     * @param dm SS_S_ANNCSLSDM
     * @return SS_S_ANNCSLSDataSet
    * @throws AppException
    */
    public SS_S_ANNCSLSDataSet selectAnncslsDetail(SS_S_ANNCSLSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ANNCSLSDataSet ds = (SS_S_ANNCSLSDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
