/***************************************************************************************************
 * 파일명 : AdRes1200DAO.java
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

package chosun.ciis.ad.res.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.res.dm.AD_RES_2100_MDM;
import chosun.ciis.ad.res.dm.AD_RES_2110_SDM;
import chosun.ciis.ad.res.dm.AD_RES_2111_SDM;
import chosun.ciis.ad.res.dm.AD_RES_2120_ADM;
import chosun.ciis.ad.res.ds.AD_RES_2100_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2110_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2111_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2120_ADataSet;

/**
 * 
 */
public class AdRes2100DAO {
	
    public AD_RES_2100_MDataSet ad_res_2100_m(AD_RES_2100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2100_MDataSet ds = (AD_RES_2100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_2110_SDataSet ad_res_2110_s(AD_RES_2110_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2110_SDataSet ds = (AD_RES_2110_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_2111_SDataSet ad_res_2111_s(AD_RES_2111_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2111_SDataSet ds = (AD_RES_2111_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public AD_RES_2120_ADataSet ad_res_2120_a(AD_RES_2120_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2120_ADataSet ds = (AD_RES_2120_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

//    public AD_RES_1230_SDataSet ad_res_1230_s(AD_RES_1230_SDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1230_SDataSet ds = (AD_RES_1230_SDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }    
//
//    public AD_RES_1240_SDataSet ad_res_1240_s(AD_RES_1240_SDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1240_SDataSet ds = (AD_RES_1240_SDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }    
//
//    public AD_RES_1250_LDataSet ad_res_1250_l(AD_RES_1250_LDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1250_LDataSet ds = (AD_RES_1250_LDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }    
//    public AD_RES_1260_SDataSet ad_res_1260_s(AD_RES_1260_SDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1260_SDataSet ds = (AD_RES_1260_SDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }    
//
//    public AD_RES_1201_MDataSet ad_res_1201_m(AD_RES_1201_MDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1201_MDataSet ds = (AD_RES_1201_MDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }    
//
//    public AD_RES_1202_LDataSet ad_res_1202_l(AD_RES_1202_LDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1202_LDataSet ds = (AD_RES_1202_LDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }   
//
//    public AD_RES_1203_UDataSet ad_res_1203_u(AD_RES_1203_UDM dm) throws AppException {
//        DBManager manager = new DBManager("MISADV");
//        AD_RES_1203_UDataSet ds = (AD_RES_1203_UDataSet) manager.executeCall(dm);
//        if (!"".equals(ds.errcode)) {
//            throw new AppException(ds.errcode, ds.errmsg);
//        }
//        return ds;
//    }   
}
