/***************************************************************************************************
* ���ϸ� : SE_SAL_2000DAO.java
* ��� : �Ǹ� - ������� - ������� - ��������ܰ�����
* �ۼ����� : 2009-04-08
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.sal.dao;


import chosun.ciis.se.sal.dm.SE_SAL_2000_MDM;
import chosun.ciis.se.sal.dm.SE_SAL_2010_LDM;
import chosun.ciis.se.sal.ds.SE_SAL_2000_MDataSet;
import chosun.ciis.se.sal.ds.SE_SAL_2010_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SAL_2000DAO {
	
	public SE_SAL_2000_MDataSet se_sal_2000_m(SE_SAL_2000_MDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2000_MDataSet ds = (SE_SAL_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
    public SE_SAL_2010_LDataSet se_sal_2010_l(SE_SAL_2010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISSEL");
        SE_SAL_2010_LDataSet ds = (SE_SAL_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    

}
