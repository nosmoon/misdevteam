/***************************************************************************************************
 * 파일명 : AdEis1100DAO.java
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
import chosun.ciis.ad.eis.dm.AD_EIS_1110_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1120_ADM;
import chosun.ciis.ad.eis.ds.AD_EIS_1110_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1120_ADataSet;

/**
 * 
 */
public class AdEis1100DAO {
	
    public AD_EIS_1110_LDataSet ad_eis_1110_l(AD_EIS_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1110_LDataSet ds = (AD_EIS_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_EIS_1120_ADataSet ad_eis_1120_a(AD_EIS_1120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1120_ADataSet ds = (AD_EIS_1120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    

}
