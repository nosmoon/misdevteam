/***************************************************************************************************
 * ���ϸ� : AdRes1500DAO.java
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
import chosun.ciis.ad.res.dm.AD_RES_1500_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1510_LDM;
import chosun.ciis.ad.res.ds.AD_RES_1500_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1510_LDataSet;
/**
 * 
 */
public class AdRes1500DAO {
	
    public AD_RES_1500_MDataSet ad_res_1500_m(AD_RES_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1500_MDataSet ds = (AD_RES_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_1510_LDataSet ad_res_1510_l(AD_RES_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1510_LDataSet ds = (AD_RES_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
