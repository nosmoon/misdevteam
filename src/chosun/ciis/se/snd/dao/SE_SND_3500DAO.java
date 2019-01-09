/***************************************************************************************************
* 파일명 : SE_SND_3500DAO.java
* 기능 : 판매 - 발송관리 - 기타인쇄처관리
 * 작성일자 : 2009.03.19
 * 작성자 :   김진경
***************************************************************************************************
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.snd.dao;

import chosun.ciis.se.snd.dm.SE_SND_3500_MDM;
import chosun.ciis.se.snd.dm.SE_SND_3510_LDM;
import chosun.ciis.se.snd.dm.SE_SND_3520_ADM;
import chosun.ciis.se.snd.ds.SE_SND_3500_MDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3510_LDataSet;
import chosun.ciis.se.snd.ds.SE_SND_3520_ADataSet;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;


/**
 * 
 */
public class SE_SND_3500DAO {

	public SE_SND_3500_MDataSet se_snd_3500_m(SE_SND_3500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_SND_3500_MDataSet ds = (SE_SND_3500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public SE_SND_3510_LDataSet se_snd_3510_l(SE_SND_3510_LDM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3510_LDataSet ds 	= (SE_SND_3510_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public SE_SND_3520_ADataSet se_snd_3520_a(SE_SND_3520_ADM dm) throws AppException {

        DBManager manager 			= new DBManager("MISSEL");
        SE_SND_3520_ADataSet ds 	= (SE_SND_3520_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
        	System.out.println("errorCode" + ds.errcode);
        	System.out.println("errorMsg" + ds.errmsg);
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	

}
