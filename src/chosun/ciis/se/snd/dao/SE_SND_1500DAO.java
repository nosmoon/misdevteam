/***************************************************************************************************
* ���ϸ� : SE_SND_1500DAO.java
* ��� : �Ǹ� - �߼۰��� - ���庰�μ�
* �ۼ����� : 2009.02.03
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.se.snd.dm.SE_SND_1500_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1510_LDM;
import chosun.ciis.se.snd.dm.SE_SND_1520_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1500_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1510_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1520_LDataSet;



/**
 * 
 */
public class SE_SND_1500DAO {
	
	public SE_SND_1500_MDataSet se_snd_1500_m(SE_SND_1500_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1500_MDataSet ds 	= (SE_SND_1500_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1510_LDataSet se_snd_1510_l(SE_SND_1510_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1510_LDataSet ds 	= (SE_SND_1510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1520_LDataSet se_snd_1520_l(SE_SND_1520_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1520_LDataSet ds 	= (SE_SND_1520_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
}
