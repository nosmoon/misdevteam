/***************************************************************************************************
 * 파일명 : AdBas1900DAO.java
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
import chosun.ciis.ad.bas.dm.AD_BAS_1910_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1920_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1930_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1951_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1952_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1953_SDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1910_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1920_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1930_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1951_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1952_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1953_SDataSet;

/**
 * 광고관리-기초자료관리
 */
 
public class AdBas1900DAO {
	
    public AD_BAS_1910_LDataSet ad_bas_1910_l(AD_BAS_1910_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1910_LDataSet ds = (AD_BAS_1910_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
	
    public AD_BAS_1920_SDataSet ad_bas_1920_s(AD_BAS_1920_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1920_SDataSet ds = (AD_BAS_1920_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }   
    public AD_BAS_1930_ADataSet ad_bas_1930_a(AD_BAS_1930_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1930_ADataSet ds = (AD_BAS_1930_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    } 
    
    public AD_BAS_1951_LDataSet ad_bas_1951_l(AD_BAS_1951_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1951_LDataSet ds = (AD_BAS_1951_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }     

    public AD_BAS_1952_LDataSet ad_bas_1952_l(AD_BAS_1952_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1952_LDataSet ds = (AD_BAS_1952_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }     

    public AD_BAS_1953_SDataSet ad_bas_1953_s(AD_BAS_1953_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1953_SDataSet ds = (AD_BAS_1953_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }     

}
