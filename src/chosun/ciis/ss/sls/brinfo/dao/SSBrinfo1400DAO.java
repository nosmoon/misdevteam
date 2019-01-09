/***************************************************************************************************
 * ���ϸ� : SSBrinfo1400DAO.java
 * ��� : ����Info-������ǰ��Ȳ-��Ȳ�� ���� DAO
 * �ۼ����� : 2004-01-27
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
 * ����Info-������ǰ��Ȳ-��Ȳ�� ���� DAO
 */
public class SSBrinfo1400DAO {

    /**
     * ����Info-������ǰ��Ȳ-��Ȳ �ʱ�ȭ
     * @param dm SS_L_ASET_INITDM ��ü
     * @return SS_L_ASET_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_ASET_INITDataSet selectInitList(SS_L_ASET_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASET_INITDataSet ds = (SS_L_ASET_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Info-������ǰ��Ȳ-��Ȳ ��ȸ
     * @param dm SS_L_ASETDM ��ü
     * @return SS_L_ASETDataSet ��ü
     * @throws AppException
     */
    public SS_L_ASETDataSet selectAsetList(SS_L_ASETDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASETDataSet ds = (SS_L_ASETDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ����Info-������ǰ��Ȳ-�� ��ȸ
     * @param dm SS_L_ASET_DTLDM ��ü
     * @return SS_L_ASET_DTLDataSet ��ü
     * @throws AppException
     */
    public SS_L_ASET_DTLDataSet selectAsetDetailList(SS_L_ASET_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ASET_DTLDataSet ds = (SS_L_ASET_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    /**
     * ����Info-������ǰ��Ȳ-�� ��
     * @param dm SS_S_ASET_DTLDM ��ü
     * @return SS_S_ASET_DTLDataSet ��ü
     * @throws AppException
     */
    public SS_S_ASET_DTLDataSet selectAsetDetail(SS_S_ASET_DTLDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_ASET_DTLDataSet ds = (SS_S_ASET_DTLDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}