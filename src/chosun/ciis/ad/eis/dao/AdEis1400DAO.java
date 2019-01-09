/***************************************************************************************************
 * 파일명 : AdEis1400DAO.java
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

package chosun.ciis.ad.eis.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.eis.dm.AD_EIS_1400_MDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1410_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1420_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1425_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1430_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1440_LDM;
import chosun.ciis.ad.eis.dm.AD_EIS_1450_LDM;
import chosun.ciis.ad.eis.ds.AD_EIS_1400_MDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1410_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1420_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1425_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1430_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1440_LDataSet;
import chosun.ciis.ad.eis.ds.AD_EIS_1450_LDataSet;

/**
 * 
 */
public class AdEis1400DAO {

    public AD_EIS_1400_MDataSet ad_eis_1400_m(AD_EIS_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1400_MDataSet ds = (AD_EIS_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_EIS_1410_LDataSet ad_eis_1410_l(AD_EIS_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1410_LDataSet ds = (AD_EIS_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_EIS_1420_LDataSet ad_eis_1420_l(AD_EIS_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1420_LDataSet ds = (AD_EIS_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }     
    public AD_EIS_1425_LDataSet ad_eis_1425_l(AD_EIS_1425_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1425_LDataSet ds = (AD_EIS_1425_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
    public AD_EIS_1430_LDataSet ad_eis_1430_l(AD_EIS_1430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1430_LDataSet ds = (AD_EIS_1430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_EIS_1440_LDataSet ad_eis_1440_l(AD_EIS_1440_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1440_LDataSet ds = (AD_EIS_1440_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }      
    public AD_EIS_1450_LDataSet ad_eis_1450_l(AD_EIS_1450_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_EIS_1450_LDataSet ds = (AD_EIS_1450_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }    
}
