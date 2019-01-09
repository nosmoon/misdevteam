/***************************************************************************************************
 * 파일명 : AdEis1000DAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ad.eis.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.eis.dm.AD_EIS_1010_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1020_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1010_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1020_LDataSet;

/**
 * 
 */
public class AdEis1000DAO {
	
    public AD_EIS_1010_LDataSet ad_eis_1010_l(AD_EIS_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1010_LDataSet ds = (AD_EIS_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

    public AD_EIS_1020_LDataSet ad_eis_1020_l(AD_EIS_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1020_LDataSet ds = (AD_EIS_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

}
