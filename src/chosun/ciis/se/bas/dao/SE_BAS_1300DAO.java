/***************************************************************************************************
* ���ϸ� : SE_BAS_1300DAO.java
* ��� :  �Ǹ� - �������� - ��ü�ܰ�����
 * �ۼ����� : 2009.02.21
 * �ۼ��� :   �̹�ȿ
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

import chosun.ciis.se.bas.dm.SE_BAS_1300_MDM;
import chosun.ciis.se.bas.dm.SE_BAS_1310_LDM;
import chosun.ciis.se.bas.ds.SE_BAS_1300_MDataSet;
import chosun.ciis.se.bas.ds.SE_BAS_1310_LDataSet;

/**
 * 
 */
public class SE_BAS_1300DAO {
	
	public SE_BAS_1300_MDataSet se_bas_1300_m(SE_BAS_1300_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1300_MDataSet ds 	= (SE_BAS_1300_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_BAS_1310_LDataSet se_bas_1310_l(SE_BAS_1310_LDM dm) throws AppException {

        
        DBManager manager 			= new DBManager("MISSEL");
        SE_BAS_1310_LDataSet ds 	= (SE_BAS_1310_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /*
    public SE_BAS_1002DataSet getCodeList(SE_BAS_1002DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1002DataSet ds = (SE_BAS_1002DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1010DataSet insUpdDel(SE_BAS_1010DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1010DataSet ds = (SE_BAS_1010DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public SE_BAS_1020DataSet multiUpdate(SE_BAS_1020DM dm) throws AppException {
        DBManager manager = new DBManager("MISSEL");
        SE_BAS_1020DataSet ds = (SE_BAS_1020DataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    */
    
}
