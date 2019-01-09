/***************************************************************************************************
 * 파일명 : AdBrn1100DAO.java
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

package chosun.ciis.ad.brn.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.brn.dm.AD_BRN_1110_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1120_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1130_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1110_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1120_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1130_LDataSet;

/**
 * 
 */
public class AdBrn1100DAO {
	
    public AD_BRN_1110_LDataSet ad_brn_1110_l(AD_BRN_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1110_LDataSet ds = (AD_BRN_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_BRN_1120_LDataSet ad_brn_1120_l(AD_BRN_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1120_LDataSet ds = (AD_BRN_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public AD_BRN_1130_LDataSet ad_brn_1130_l(AD_BRN_1130_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1130_LDataSet ds = (AD_BRN_1130_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
