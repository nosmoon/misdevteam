/***************************************************************************************************
 * 파일명 : AdBas3400DAO.java
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
import chosun.ciis.ad.bas.dm.AD_BAS_3400_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3410_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3420_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3430_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3400_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3410_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3420_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3430_ADataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas3400DAO {
	
    /**
     * 목표관리(출판) 초기
     * @param  AD_BAS_3400_MDM
     * @return AD_BAS_3400_MDataSet
     */
    public AD_BAS_3400_MDataSet ad_bas_3400_m(AD_BAS_3400_MDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_3400_MDataSet ds = (AD_BAS_3400_MDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    

    /**
     * 목표관리(출판) 조회(매체별)
     * @param  AD_BAS_3410_LDM
     * @return AD_BAS_3410_LDataSet
     */
    public AD_BAS_3410_LDataSet ad_bas_3410_l(AD_BAS_3410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_3410_LDataSet ds = (AD_BAS_3410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

    /**
     * 목표관리(출판) 조회(담당별)
     * @param  AD_BAS_3420_LDM
     * @return AD_BAS_3420_LDataSet
     */
	public AD_BAS_3420_LDataSet ad_bas_3420_l(AD_BAS_3420_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
        AD_BAS_3420_LDataSet ds = (AD_BAS_3420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
        
    /**
     * 목표관리(출판) 목표액 저장
     * @param  AD_BAS_3430_ADM
     * @return AD_BAS_3430_ADataSet
     */
	public AD_BAS_3430_ADataSet ad_bas_3430_a(AD_BAS_3430_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");	
		AD_BAS_3430_ADataSet ds = (AD_BAS_3430_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
