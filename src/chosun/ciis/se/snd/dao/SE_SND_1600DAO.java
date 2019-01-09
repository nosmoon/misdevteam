/***************************************************************************************************
* ���ϸ� : SE_SND_1600DAO.java
* ��� : �Ǹ� - �߼۰��� - �����Ǻ��߼۳��� ��ȸ
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


import chosun.ciis.se.snd.dm.SE_SND_1600_MDM;
import chosun.ciis.se.snd.dm.SE_SND_1610_LDM;
import chosun.ciis.se.snd.ds.SE_SND_1600_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_1610_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;



/**
 * 
 */
public class SE_SND_1600DAO {
	
	public SE_SND_1600_MDataSet se_snd_1600_m(SE_SND_1600_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1600_MDataSet ds 	= (SE_SND_1600_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_1610_LDataSet se_snd_1610_l(SE_SND_1610_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_1610_LDataSet ds 	= (SE_SND_1610_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
