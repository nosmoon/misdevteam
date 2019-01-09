/***************************************************************************************************
* 파일명 : SE_SND_2600DAO.java
* 기능 : 판매-발송관리-수송단가조회
* 작성일자 : 2009-02-23
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_2600_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2610_LDM;
import chosun.ciis.se.snd.dm.SE_SND_2620_LDM;
import chosun.ciis.se.snd.ds.SE_SND_2600_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2610_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2620_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_2600DAO {
	
	public SE_SND_2600_MDataSet se_snd_2600_m(SE_SND_2600_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2600_MDataSet ds 	= (SE_SND_2600_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2610_LDataSet se_snd_2610_l(SE_SND_2610_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2610_LDataSet ds 	= (SE_SND_2610_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2620_LDataSet se_snd_2620_l(SE_SND_2620_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2620_LDataSet ds 	= (SE_SND_2620_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
