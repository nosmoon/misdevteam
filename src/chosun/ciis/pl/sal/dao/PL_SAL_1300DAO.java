/***************************************************************************************************
 * 파일명 : PL_SAL_1300DAO.java
 * 기능 : 배본관리-매체별배본
 * 작성일자 : 2009.03.27
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.sal.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.ds.*;

/**
 * 
 */
public class PL_SAL_1300DAO {
	
    /**
     * 메인
     * @param PL_SAL_1300_MDM
     * @return PL_SAL_1300_MDataSet
     */
    public PL_SAL_1300_MDataSet pl_sal_1300_m(PL_SAL_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1300_MDataSet ds = (PL_SAL_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_SAL_1310_LDM
     * @return PL_SAL_1310_LDataSet
     */
    public PL_SAL_1310_LDataSet pl_sal_1310_l(PL_SAL_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1310_LDataSet ds = (PL_SAL_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_SAL_1320_LDM
     * @return PL_SAL_1320_LDataSet
     */
    public PL_SAL_1320_LDataSet pl_sal_1320_l(PL_SAL_1320_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1320_LDataSet ds = (PL_SAL_1320_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 저장/삭제
     * @param PL_SAL_1330_ADM
     * @return PL_SAL_1330_ADataSet
     */
    public PL_SAL_1330_ADataSet pl_sal_1330_a(PL_SAL_1330_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1330_ADataSet ds = (PL_SAL_1330_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
