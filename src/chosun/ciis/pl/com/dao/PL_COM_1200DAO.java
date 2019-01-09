/***************************************************************************************************
 * 파일명 : PL_COM_1200DAO.java
 * 기능 : 공통관리-사내판매출고처리
 * 작성일자 : 2009.04.06
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.com.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */
public class PL_COM_1200DAO {
	
    /**
     * 조회
     * @param PL_COM_1210_SDM
     * @return PL_COM_1210_SDataSet
     */
	public PL_COM_1210_SDataSet pl_com_1210_s(PL_COM_1210_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1210_SDataSet ds = (PL_COM_1210_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    /**
     * 저장/삭제
     * @param PL_COM_1220_ADM
     * @return PL_COM_1220_ADataSet
     */
	public PL_COM_1220_ADataSet pl_com_1220_a(PL_COM_1220_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISPLS");
		PL_COM_1220_ADataSet ds = (PL_COM_1220_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
