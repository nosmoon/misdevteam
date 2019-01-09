/***************************************************************************************************
* 파일명 : SE_SND_3400DAO.java
* 기능 : 판매 - 발송관리 - 대표노선, 노선 설정
* 작성일자 : 2009-05-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_3400_MDM;
import chosun.ciis.se.snd.dm.SE_SND_3410_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3420_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3430_ADM;
import chosun.ciis.se.snd.ds.SE_SND_3400_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3410_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3420_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3430_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_3400DAO {
	
	public SE_SND_3400_MDataSet se_snd_3400_m(SE_SND_3400_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3400_MDataSet ds 	= (SE_SND_3400_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_3410_LDataSet se_snd_3410_l(SE_SND_3410_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3410_LDataSet ds 	= (SE_SND_3410_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_3420_LDataSet se_snd_3420_l(SE_SND_3420_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3420_LDataSet ds 	= (SE_SND_3420_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_3430_ADataSet se_snd_3430_a(SE_SND_3430_ADM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3430_ADataSet ds 	= (SE_SND_3430_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
