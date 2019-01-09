/***************************************************************************************************
* ���ϸ� : SE_SND_1300DAO.java
* ��� : �Ǹ� - �߼۰��� - �뼱���μ�ó����
* �ۼ����� : 2009.01.30
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_1300_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1310_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1320_ADM;
import chosun.ciis.se.snd.ds.SE_SND_1300_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1310_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1320_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_1300DAO {
	
	public SE_SND_1300_MDataSet se_snd_1300_m(SE_SND_1300_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1300_MDataSet ds 	= (SE_SND_1300_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1310_LDataSet se_snd_1310_l(SE_SND_1310_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1310_LDataSet ds 	= (SE_SND_1310_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1320_ADataSet se_snd_1320_a(SE_SND_1320_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1320_ADataSet ds 	= (SE_SND_1320_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
