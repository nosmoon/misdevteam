/***************************************************************************************************
 * ���ϸ� : AdRes1400DAO.java
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
import chosun.ciis.ad.res.dm.AD_RES_2010_LDM;
import chosun.ciis.ad.res.dm.AD_RES_2020_UDM;
import chosun.ciis.ad.res.ds.AD_RES_2010_LDataSet;
import chosun.ciis.ad.res.ds.AD_RES_2020_UDataSet;
/**
 * 
 */
public class AdRes2000DAO {
	

    public AD_RES_2010_LDataSet ad_res_2010_l(AD_RES_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2010_LDataSet ds = (AD_RES_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    public AD_RES_2020_UDataSet ad_res_2020_u(AD_RES_2020_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_RES_2020_UDataSet ds = (AD_RES_2020_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    

    
}
