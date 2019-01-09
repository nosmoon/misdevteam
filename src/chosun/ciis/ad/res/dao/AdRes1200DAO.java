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
import chosun.ciis.ad.res.dm.AD_RES_1200_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1201_MDM;
import chosun.ciis.ad.res.dm.AD_RES_1202_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1203_UDM;
import chosun.ciis.ad.res.dm.AD_RES_1204_DDM;
import chosun.ciis.ad.res.dm.AD_RES_1210_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1220_ADM;
import chosun.ciis.ad.res.dm.AD_RES_1230_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1250_LDM;
import chosun.ciis.ad.res.dm.AD_RES_1260_SDM;
import chosun.ciis.ad.res.dm.AD_RES_1270_SDM;
import chosun.ciis.ad.res.ds.AD_RES_1200_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1201_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1202_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1203_UDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1204_DDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1210_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1220_ADataSet;
import chosun.ciis.ad.res.ds.AD_RES_1230_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1250_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1260_SDataSet;
import chosun.ciis.ad.res.ds.AD_RES_1270_SDataSet;

/**
 * 
 */
public class AdRes1200DAO {
	
    public AD_RES_1200_MDataSet ad_res_1200_m(AD_RES_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1200_MDataSet ds = (AD_RES_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1210_SDataSet ad_res_1210_s(AD_RES_1210_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1210_SDataSet ds = (AD_RES_1210_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1220_ADataSet ad_res_1220_a(AD_RES_1220_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1220_ADataSet ds = (AD_RES_1220_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1230_SDataSet ad_res_1230_s(AD_RES_1230_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1230_SDataSet ds = (AD_RES_1230_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1250_LDataSet ad_res_1250_l(AD_RES_1250_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1250_LDataSet ds = (AD_RES_1250_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_RES_1260_SDataSet ad_res_1260_s(AD_RES_1260_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1260_SDataSet ds = (AD_RES_1260_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_RES_1270_SDataSet ad_res_1270_s(AD_RES_1270_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1270_SDataSet ds = (AD_RES_1270_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_RES_1201_MDataSet ad_res_1201_m(AD_RES_1201_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1201_MDataSet ds = (AD_RES_1201_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_1202_LDataSet ad_res_1202_l(AD_RES_1202_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1202_LDataSet ds = (AD_RES_1202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   

    public AD_RES_1203_UDataSet ad_res_1203_u(AD_RES_1203_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1203_UDataSet ds = (AD_RES_1203_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public AD_RES_1204_DDataSet ad_res_1204_d(AD_RES_1204_DDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_1204_DDataSet ds = (AD_RES_1204_DDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
}
