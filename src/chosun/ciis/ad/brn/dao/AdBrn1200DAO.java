/***************************************************************************************************
 * 파일명 : AdBrn1200DAO.java
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
import chosun.ciis.ad.brn.dm.AD_BRN_1200_MDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1210_LDM;
import chosun.ciis.ad.brn.ds.AD_BRN_1200_MDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1210_LDataSet;

/**
 * 
 */
public class AdBrn1200DAO {
	
    public AD_BRN_1200_MDataSet ad_brn_1200_m(AD_BRN_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1200_MDataSet ds = (AD_BRN_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_BRN_1210_LDataSet ad_brn_1210_l(AD_BRN_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BRN_1210_LDataSet ds = (AD_BRN_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
