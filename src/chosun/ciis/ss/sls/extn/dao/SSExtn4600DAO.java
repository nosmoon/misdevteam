/***************************************************************************************************
 * ���ϸ� : SSExtn4600DAO.java
 * ��� : ����Ŀ�Ȯ��-��Ϲ���ȸ
 * �ۼ����� : 2016-02-15
 * �ۼ��� : ������
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;



/**
 * DAO
 */
public class SSExtn4600DAO {

    /**
     * �ʱ�ȭ��
     * @param dm 
     * @return 
     * @throws AppException
     */
    public SS_SLS_EXTN_4600_ADataSet initExtn4600(SS_SLS_EXTN_4600_ADM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4600_ADataSet ds = (SS_SLS_EXTN_4600_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4601_LDataSet getUserInfo(SS_SLS_EXTN_4601_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4601_LDataSet ds = (SS_SLS_EXTN_4601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4602_LDataSet getDncompInfo(SS_SLS_EXTN_4602_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4602_LDataSet ds = (SS_SLS_EXTN_4602_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4610_IDataSet uploadExtn4610(SS_SLS_EXTN_4610_IDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4610_IDataSet ds = (SS_SLS_EXTN_4610_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4620_LDataSet selectExtn4620(SS_SLS_EXTN_4620_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4620_LDataSet ds = (SS_SLS_EXTN_4620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4630_UDataSet saveExtn4630(SS_SLS_EXTN_4630_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4630_UDataSet ds = (SS_SLS_EXTN_4630_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4640_UDataSet closExtn4640(SS_SLS_EXTN_4640_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4640_UDataSet ds = (SS_SLS_EXTN_4640_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4650_LDataSet selectExtn4650(SS_SLS_EXTN_4650_LDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4650_LDataSet ds = (SS_SLS_EXTN_4650_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_SLS_EXTN_4660_UDataSet stopExtn4660(SS_SLS_EXTN_4660_UDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_SLS_EXTN_4660_UDataSet ds = (SS_SLS_EXTN_4660_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}    