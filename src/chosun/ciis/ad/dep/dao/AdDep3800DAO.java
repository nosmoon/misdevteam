/***************************************************************************************************
 * ���ϸ� : AdDep3800DAO.java
 * ��� : 
 * �ۼ����� : 
 * �ۼ��� : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ad.dep.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.dep.dm.AD_DEP_3800_MDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3810_LDM;
import chosun.ciis.ad.dep.dm.AD_DEP_3820_ADM;
import chosun.ciis.ad.dep.ds.AD_DEP_3800_MDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3810_LDataSet;
import chosun.ciis.ad.dep.ds.AD_DEP_3820_ADataSet;
/**
 * 
 */
public class AdDep3800DAO {
	
    public AD_DEP_3800_MDataSet ad_dep_3800_m(AD_DEP_3800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3800_MDataSet ds = (AD_DEP_3800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    public AD_DEP_3810_LDataSet ad_dep_3810_l(AD_DEP_3810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3810_LDataSet ds = (AD_DEP_3810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
    public AD_DEP_3820_ADataSet ad_dep_3820_a(AD_DEP_3820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_DEP_3820_ADataSet ds = (AD_DEP_3820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds; 
    }   
}
