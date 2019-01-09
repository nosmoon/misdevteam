/***************************************************************************************************
 * 파일명 : AdBas1600DAO.java
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
import chosun.ciis.ad.bas.dm.AD_BAS_1610_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1611_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1612_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1613_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1615_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1616_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1617_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1618_LDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1610_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1611_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1612_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1613_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1615_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1616_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1617_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1618_LDataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas1600DAO {
	
    /**
     * 중점거래처 채권채무현황 및 관리일지
     * @param  AD_BAS_1510_LDM
     * @return AD_BAS_1510_LDataSet
     */
    public AD_BAS_1610_LDataSet ad_bas_1610_l(AD_BAS_1610_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1610_LDataSet ds = (AD_BAS_1610_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1611_LDataSet ad_bas_1611_l(AD_BAS_1611_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1611_LDataSet ds = (AD_BAS_1611_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1612_LDataSet ad_bas_1612_l(AD_BAS_1612_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1612_LDataSet ds = (AD_BAS_1612_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    
    public AD_BAS_1613_ADataSet ad_bas_1613_a(AD_BAS_1613_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1613_ADataSet ds = (AD_BAS_1613_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1615_SDataSet ad_bas_1615_s(AD_BAS_1615_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1615_SDataSet ds = (AD_BAS_1615_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1616_SDataSet ad_bas_1616_s(AD_BAS_1616_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1616_SDataSet ds = (AD_BAS_1616_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    
    public AD_BAS_1617_LDataSet ad_bas_1617_l(AD_BAS_1617_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1617_LDataSet ds = (AD_BAS_1617_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1618_LDataSet ad_bas_1618_l(AD_BAS_1618_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1618_LDataSet ds = (AD_BAS_1618_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   

}
