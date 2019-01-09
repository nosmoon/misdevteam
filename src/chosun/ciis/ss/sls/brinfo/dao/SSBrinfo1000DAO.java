/***************************************************************************************************
 * ���ϸ� : SSBrinfo1000DAO.java
 * ��� : ����Info-����ã�⸦ ���� DAO
 * �ۼ����� : 2004-02-27
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-����ã�⸦ ���� DAO
 */
public class SSBrinfo1000DAO {

    /**
     * ����Info-����ã��-�ʱ�ȭ��
     * @param dm SS_L_BO_SRCH_INITDM ��ü
     * @return SS_L_BO_SRCH_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_BO_SRCH_INITDataSet selectInitList(SS_L_BO_SRCH_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_SRCH_INITDataSet ds = (SS_L_BO_SRCH_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-����ã��-���
     * @param dm SS_L_BO_SRCH2DM ��ü
     * @return SS_L_BO_SRCH2DataSet ��ü
     * @throws AppException
     */
    public SS_L_BO_SRCH2DataSet selectBoSrchList(SS_L_BO_SRCH2DM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BO_SRCH2DataSet ds = (SS_L_BO_SRCH2DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-���������ȣ-�ʱ�ȭ��
     * @param dm SS_L_NWBUSEOCDDM
     * @return SS_L_NWBUSEOCDDataSet
     * @throws AppException
     */
    public SS_L_JUSO_BO_INITDataSet initBoZip(SS_L_JUSO_BO_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_JUSO_BO_INITDataSet ds = (SS_L_JUSO_BO_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ����Info-���������ȣ-���
     * @param dm SS_L_JUSO_BODM
     * @return SS_L_JUSO_BODataSet
     * @throws AppException
     */
    public SS_L_JUSO_BODataSet selectBoZipList(SS_L_JUSO_BODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_JUSO_BODataSet ds = (SS_L_JUSO_BODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}