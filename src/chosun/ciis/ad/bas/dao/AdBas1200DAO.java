/***************************************************************************************************
 * 파일명 : AdBas1000DAO.java
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

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_1210_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1220_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1230_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1210_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1220_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1230_ADataSet;

/**
 * 
 */
public class AdBas1200DAO {
	
    public AD_BAS_1210_LDataSet ad_bas_1210_l(AD_BAS_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1210_LDataSet ds = (AD_BAS_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    
//    
    public AD_BAS_1220_SDataSet ad_bas_1220_s(AD_BAS_1220_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1220_SDataSet ds = (AD_BAS_1220_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
//    
    public AD_BAS_1230_ADataSet ad_bas_1230_a(AD_BAS_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1230_ADataSet ds = (AD_BAS_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }        
}
