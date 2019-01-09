/***************************************************************************************************
 * ���ϸ� : AdBas3500DAO.java
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

package chosun.ciis.ad.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.bas.dm.AD_BAS_3500_MDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3510_LDM;
import chosun.ciis.ad.bas.dm.AD_BAS_3520_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_3500_MDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3510_LDataSet;
import chosun.ciis.ad.bas.ds.AD_BAS_3520_ADataSet;

/**
 * �������-�����ڷ����
 */
 
public class AdBas3500DAO {
	
    public AD_BAS_3500_MDataSet ad_bas_3500_m(AD_BAS_3500_MDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_3500_MDataSet ds = (AD_BAS_3500_MDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    
    public AD_BAS_3510_LDataSet ad_bas_3510_l(AD_BAS_3510_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_3510_LDataSet ds = (AD_BAS_3510_LDataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    
    public AD_BAS_3520_ADataSet ad_bas_3520_a(AD_BAS_3520_ADM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");        
        AD_BAS_3520_ADataSet ds = (AD_BAS_3520_ADataSet) manager.executeCall(dm);        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;  
    }    

}
