/***************************************************************************************************
* ���ϸ� : SE_SND_3000DAO.java
* ��� : �Ǹ�-�߼۰���-�߼ۺμ�����üũ �� ��ȸ
* �ۼ����� : 2009-05-22
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;


import chosun.ciis.se.snd.dm.SE_SND_3010_LDM;
import chosun.ciis.se.snd.ds.SE_SND_3010_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_3000DAO {
	
	public SE_SND_3010_LDataSet se_snd_3010_l(SE_SND_3010_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3010_LDataSet ds 	= (SE_SND_3010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
