/***************************************************************************************************
* ���ϸ� : SE_SND_1800DAO.java
* ��� : �Ǹ� - �߼۰��� - �뼱��ȸ
* �ۼ����� : 2009.03.12
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_1800_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1810_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1800_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1810_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;



/**
 * 
 */
public class SE_SND_1800DAO {
	
	public SE_SND_1800_MDataSet se_snd_1800_m(SE_SND_1800_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1800_MDataSet ds 	= (SE_SND_1800_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

	public SE_SND_1810_LDataSet se_snd_1810_l(SE_SND_1810_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1810_LDataSet ds 	= (SE_SND_1810_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
