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
import chosun.ciis.ad.bas.dm.AD_BAS_1100_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1110_SDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1120_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1130_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1150_ADM;
import chosun.ciis.ad.bas.dm.AD_BAS_1160_UDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1170_UDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1180_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_1190_IDM;
import chosun.ciis.ad.bas.ds.AD_BAS_1100_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1110_SDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1120_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1130_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1150_ADataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1160_UDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1170_UDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1180_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_1190_IDataSet;

/**
 * 
 */
public class AdBas1100DAO {
	
    public AD_BAS_1100_MDataSet ad_bas_1100_m(AD_BAS_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1100_MDataSet ds = (AD_BAS_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
//    
    
    public AD_BAS_1110_SDataSet ad_bas_1110_s(AD_BAS_1110_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1110_SDataSet ds = (AD_BAS_1110_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_BAS_1120_LDataSet ad_bas_1120_l(AD_BAS_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1120_LDataSet ds = (AD_BAS_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_BAS_1150_ADataSet ad_bas_1150_a(AD_BAS_1150_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1150_ADataSet ds = (AD_BAS_1150_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  

    public AD_BAS_1160_UDataSet ad_bas_1160_u(AD_BAS_1160_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1160_UDataSet ds = (AD_BAS_1160_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_BAS_1170_UDataSet ad_bas_1170_u(AD_BAS_1170_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1170_UDataSet ds = (AD_BAS_1170_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }        
    public AD_BAS_1180_LDataSet ad_bas_1180_l(AD_BAS_1180_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1180_LDataSet ds = (AD_BAS_1180_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }          
    public AD_BAS_1190_IDataSet ad_bas_1190_i(AD_BAS_1190_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1190_IDataSet ds = (AD_BAS_1190_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_BAS_1130_ADataSet ad_bas_1130_a(AD_BAS_1130_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_BAS_1130_ADataSet ds = (AD_BAS_1130_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
}
