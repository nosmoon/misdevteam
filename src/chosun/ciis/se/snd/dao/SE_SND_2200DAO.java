/***************************************************************************************************
* ���ϸ� : SE_SND_2200DAO.java
* ��� : �Ǹ�-�߼۰���-�߼۸���Ʈ
* �ۼ����� : 2009-05-12
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_2200_MDM;
import chosun.ciis.se.snd.ds.SE_SND_2200_MDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;



/**
 * 
 */
public class SE_SND_2200DAO {
	
	public SE_SND_2200_MDataSet se_snd_2200_m(SE_SND_2200_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2200_MDataSet ds 	= (SE_SND_2200_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	
}
