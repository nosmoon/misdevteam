/***************************************************************************************************
 * 파일명 : AdBas2000DAO.java
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
import chosun.ciis.ad.bas.dm.AD_BAS_2010_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_2010_LDataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas2000DAO {
	
    public AD_BAS_2010_LDataSet ad_bas_2010_l(AD_BAS_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2010_LDataSet ds = (AD_BAS_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
	
}
