/***************************************************************************************************
* ���ϸ� : SE_ETC_1400DAO.java
* ��� : �Ǹ� - ��Ÿ���� - ����Ʈ
* �ۼ����� : 2009-08-21
* �ۼ��� : ����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.etc.dao;

import chosun.ciis.se.etc.dm.SE_ETC_1400_MDM;
import chosun.ciis.se.etc.ds.SE_ETC_1400_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_ETC_1400DAO {
	
	public SE_ETC_1400_MDataSet se_etc_1400_m(SE_ETC_1400_MDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_ETC_1400_MDataSet ds 	= (SE_ETC_1400_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
}
