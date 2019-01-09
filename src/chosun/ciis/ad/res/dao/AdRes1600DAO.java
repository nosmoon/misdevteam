/***************************************************************************************************
 * ���ϸ� : AdRes1600DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : ��ȣ��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.res.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.res.dm.AD_RES_1600_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1610_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1620_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1621_ADM;
import chosun.ciis.ad.res.ds.AD_RES_1600_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1610_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1620_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1621_ADataSet;
/**
 *  
 */
public class AdRes1600DAO {
	
    public AD_RES_1600_MDataSet ad_res_1600_m(AD_RES_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1600_MDataSet ds = (AD_RES_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1610_LDataSet ad_res_1610_l(AD_RES_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1610_LDataSet ds = (AD_RES_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_RES_1620_LDataSet ad_res_1620_l(AD_RES_1620_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1620_LDataSet ds = (AD_RES_1620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_RES_1621_ADataSet ad_res_1621_a(AD_RES_1621_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1621_ADataSet ds = (AD_RES_1621_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
}
