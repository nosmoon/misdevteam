/***************************************************************************************************
 * 파일명 : AdBas1800DAO.java
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
import chosun.ciis.ad.bas.dm.AD_BAS_1810_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1820_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1830_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1810_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1820_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1830_ADataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas1800DAO {
	
    public AD_BAS_1810_LDataSet ad_bas_1810_l(AD_BAS_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1810_LDataSet ds = (AD_BAS_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
	
    public AD_BAS_1820_SDataSet ad_bas_1820_s(AD_BAS_1820_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1820_SDataSet ds = (AD_BAS_1820_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1830_ADataSet ad_bas_1830_a(AD_BAS_1830_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1830_ADataSet ds = (AD_BAS_1830_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

}
