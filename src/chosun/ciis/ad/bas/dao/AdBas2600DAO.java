/***************************************************************************************************
 * 파일명 : AdBas2600DAO.java
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
import chosun.ciis.ad.bas.dm.AD_BAS_2600_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2610_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2615_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2620_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2630_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2640_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_2650_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_2600_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2610_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2615_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2620_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2630_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2640_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_2650_ADataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas2600DAO {
	
    /**
     * 목표관리 초기
     * @param  AD_BAS_2600_MDM
     * @return AD_BAS_2600_MDataSet
     */
    public AD_BAS_2600_MDataSet ad_bas_2600_m(AD_BAS_2600_MDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_2600_MDataSet ds = (AD_BAS_2600_MDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    

    /**
     * 목표관리 조회(매체별)
     * @param  AD_BAS_2610_LDM
     * @return AD_BAS_2610_LDataSet
     */
    public AD_BAS_2610_LDataSet ad_bas_2610_l(AD_BAS_2610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2610_LDataSet ds = (AD_BAS_2610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

    /**
     * 목표관리 조회(매체별)
     * @param  AD_BAS_2615_LDM
     * @return AD_BAS_2615_LDataSet
     */
    public AD_BAS_2615_LDataSet ad_bas_2615_l(AD_BAS_2615_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_2615_LDataSet ds = (AD_BAS_2615_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    /**
     * 목표관리 조회(영업팀별)
     * @param  AD_BAS_2620_LDM
     * @return AD_BAS_2620_LDataSet
     */
	public AD_BAS_2620_LDataSet ad_bas_2620_l(AD_BAS_2620_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
        AD_BAS_2620_LDataSet ds = (AD_BAS_2620_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 목표관리 조회(담당별)
     * @param  AD_BAS_2630_LDM
     * @return AD_BAS_2630_LDataSet
     */
	public AD_BAS_2630_LDataSet ad_bas_2630_l(AD_BAS_2630_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_2630_LDataSet ds = (AD_BAS_2630_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 목표관리 조회(광고지사별)
     * @param  AD_BAS_2640_LDM
     * @return AD_BAS_2640_LDataSet
     */
	public AD_BAS_2640_LDataSet ad_bas_2640_l(AD_BAS_2640_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");
		AD_BAS_2640_LDataSet ds = (AD_BAS_2640_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * 목표관리 목표액 저장
     * @param  AD_BAS_2650_ADM
     * @return AD_BAS_2650_ADataSet
     */
	public AD_BAS_2650_ADataSet ad_bas_2650_a(AD_BAS_2650_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISADV");	
		AD_BAS_2650_ADataSet ds = (AD_BAS_2650_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
}
