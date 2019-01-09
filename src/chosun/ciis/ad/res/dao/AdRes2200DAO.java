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
import chosun.ciis.ad.res.dm.AD_RES_2200_MDM;
import chosun.ciis.ad.res.dm.AD_RES_2210_LDM;
import chosun.ciis.ad.res.dm.AD_RES_2220_UDM;
import chosun.ciis.ad.res.ds.AD_RES_2200_MDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2210_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2220_UDataSet;
/**
 * 
 */
public class AdRes2200DAO {
	
    public AD_RES_2200_MDataSet ad_res_2200_m(AD_RES_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2200_MDataSet ds = (AD_RES_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    
    public AD_RES_2210_LDataSet ad_res_2210_l(AD_RES_2210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2210_LDataSet ds = (AD_RES_2210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public AD_RES_2220_UDataSet ad_res_2220_u(AD_RES_2220_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2220_UDataSet ds = (AD_RES_2220_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
