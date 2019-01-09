/***************************************************************************************************
 * 파일명 : SE_BOI_1500DAO.java
 * 기능 : 지국관리 - 지국주소관련발행
 * 작성일자 : 2009-03-27
 * 작성자 : 배창희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.se.boi.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */
public class SE_BOI_1500DAO {
	
	public SE_BOI_1500_MDataSet se_boi_1500_m(SE_BOI_1500_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISSEL");
		SE_BOI_1500_MDataSet ds = (SE_BOI_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
