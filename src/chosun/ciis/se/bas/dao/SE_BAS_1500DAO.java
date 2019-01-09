/***************************************************************************************************
* ���ϸ� : SE_BAS_1500DAO.java
* ��� :  �Ǹ� - �������� - ��������ó����Ȳ
* �ۼ����� : 2009.08.25
* �ۼ��� :   ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.bas.dm.SE_BAS_1500_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1510_LDM;
import chosun.ciis.se.bas.ds.SE_BAS_1500_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1510_LDataSet;

/**
 * 
 */
public class SE_BAS_1500DAO {
	
    public SE_BAS_1500_MDataSet se_bas_1500_m(SE_BAS_1500_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1500_MDataSet ds 	= (SE_BAS_1500_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SE_BAS_1510_LDataSet se_bas_1510_l(SE_BAS_1510_LDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1510_LDataSet ds 	= (SE_BAS_1510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
