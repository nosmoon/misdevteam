/***************************************************************************************************
 * ���ϸ� : AdEis1200DAO.java
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
import chosun.ciis.ad.eis.dm.AD_EIS_1200_MDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1210_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1200_MDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1210_LDataSet;

/**
 * 
 */
public class AdEis1200DAO {
	
    public AD_EIS_1200_MDataSet ad_eis_1200_m(AD_EIS_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1200_MDataSet ds = (AD_EIS_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_EIS_1210_LDataSet ad_eis_1210_l(AD_EIS_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1210_LDataSet ds = (AD_EIS_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
}
