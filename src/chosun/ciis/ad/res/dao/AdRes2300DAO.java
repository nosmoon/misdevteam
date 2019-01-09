/***************************************************************************************************
 * ���ϸ� : AdRes2200DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : ��ȣ��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.res.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.res.dm.AD_RES_2300_MDM;
import chosun.ciis.ad.res.dm.AD_RES_2310_LDM;
import chosun.ciis.ad.res.dm.AD_RES_2320_ADM;
import chosun.ciis.ad.res.ds.AD_RES_2300_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2310_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2320_ADataSet;
/**
 * 
 */
public class AdRes2300DAO {
	
    public AD_RES_2300_MDataSet ad_res_2300_m(AD_RES_2300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2300_MDataSet ds = (AD_RES_2300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_2310_LDataSet ad_res_2310_l(AD_RES_2310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2310_LDataSet ds = (AD_RES_2310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public AD_RES_2320_ADataSet ad_res_2320_a(AD_RES_2320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2320_ADataSet ds = (AD_RES_2320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
