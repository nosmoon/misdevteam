/***************************************************************************************************
 * ���ϸ�   : PSReader1501DAO.java
 * ���     : ����-�������ó��
 * �ۼ����� : 2004-03-02
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.reader.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.dao.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-�������ó��
 */
public class PSReader1501DAO {
    public PSReader1501DAO() {
    }

    /**
     * �������ó��-�ʱ� �� �˻�
     * @param PS_L_EXTN_ASIN_SEARCHDM
     * @return PS_L_EXTN_ASIN_SEARCHDataSet
     */
    public PS_L_EXTN_ASIN_SEARCHDataSet selectAsinExtn_search(PS_L_EXTN_ASIN_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_EXTN_ASIN_SEARCHDataSet ds = (PS_L_EXTN_ASIN_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������ó��-�񱳴�󸮽�Ʈ
     * @param PS_L_EXST_RDR_SEARCHDM
     * @return PS_L_EXST_RDR_SEARCHDataSet
     */
    public PS_L_EXST_RDR_SEARCHDataSet selectExstRdrList(PS_L_EXST_RDR_SEARCHDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_EXST_RDR_SEARCHDataSet ds = (PS_L_EXST_RDR_SEARCHDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �������ó��-����
     * @param PS_U_EXTN_BO_ASINDM
     * @return PS_U_EXTN_BO_ASINDataSet
     */
    public PS_U_EXTN_BO_ASINDataSet updateExstRdrList(PS_U_EXTN_BO_ASINDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_U_EXTN_BO_ASINDataSet ds = (PS_U_EXTN_BO_ASINDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
