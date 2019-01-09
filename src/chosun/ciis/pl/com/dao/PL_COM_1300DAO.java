/***************************************************************************************************
 * 파일명 : PL_COM_1300DAO.java
 * 기능 : 공통관리-사내판매입금처리
 * 작성일자 : 2009.04.22
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
public class PL_COM_1300DAO {
	
    /**
     * 메인
     * @param PL_COM_1300_MDM
     * @return PL_COM_1300_MDataSet
     */
    public PL_COM_1300_MDataSet pl_com_1300_m(PL_COM_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1300_MDataSet ds = (PL_COM_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_COM_1310_LDM
     * @return PL_COM_1310_LDataSet
     */
    public PL_COM_1310_LDataSet pl_com_1310_l(PL_COM_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1310_LDataSet ds = (PL_COM_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_COM_1320_ADM
     * @return PL_COM_1320_ADataSet
     */
    public PL_COM_1320_ADataSet pl_com_1320_a(PL_COM_1320_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_COM_1320_ADataSet ds = (PL_COM_1320_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
