/***************************************************************************************************
* 파일명 : SE_SND_2700DAO.java
* 기능 : 판매-발송관리-기간별수송비 조회
* 작성일자 : 2009-03-02
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_2700_MDM;
import chosun.ciis.se.snd.dm.SE_SND_2710_LDM;
import chosun.ciis.se.snd.ds.SE_SND_2700_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_2710_LDataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_2700DAO {
	
	public SE_SND_2700_MDataSet se_snd_2700_m(SE_SND_2700_MDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2700_MDataSet ds 	= (SE_SND_2700_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_2710_LDataSet se_snd_2710_l(SE_SND_2710_LDM dm) throws AppException {

        System.out.println("2222222222222::::::::::");
        
        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_2710_LDataSet ds 	= (SE_SND_2710_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
