/***************************************************************************************************
 * ���ϸ� : AdEis1300DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.eis.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.eis.dm.AD_EIS_1310_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1320_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1310_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1320_LDataSet;

/**
 * 
 */
public class AdEis1300DAO {

    public AD_EIS_1310_LDataSet ad_eis_1310_l(AD_EIS_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1310_LDataSet ds = (AD_EIS_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
   
    public AD_EIS_1320_LDataSet ad_eis_1320_l(AD_EIS_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1320_LDataSet ds = (AD_EIS_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }
    
}
