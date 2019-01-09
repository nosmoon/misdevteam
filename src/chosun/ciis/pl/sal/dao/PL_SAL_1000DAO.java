/***************************************************************************************************
 * 파일명 : PL_SAL_1000DAO.java
 * 기능 : 배본관리-정간물배정표배본
 * 작성일자 : 2009.03.18
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
public class PL_SAL_1000DAO {
	
    /**
     * 메인
     * @param PL_SAL_1000_MDM
     * @return PL_SAL_1000_MDataSet
     */
    public PL_SAL_1000_MDataSet pl_sal_1000_m(PL_SAL_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1000_MDataSet ds = (PL_SAL_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 배정조회
     * @param PL_SAL_1010_LDM
     * @return PL_SAL_1010_LDataSet
     */
    public PL_SAL_1010_LDataSet pl_sal_1010_l(PL_SAL_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1010_LDataSet ds = (PL_SAL_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 배본조회
     * @param PL_SAL_1020_LDM
     * @return PL_SAL_1020_LDataSet
     */
    public PL_SAL_1020_LDataSet pl_sal_1020_l(PL_SAL_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1020_LDataSet ds = (PL_SAL_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 등록/수정/삭제
     * @param PL_SAL_1030_ADM
     * @return PL_SAL_1030_ADataSet
     */
    public PL_SAL_1030_ADataSet pl_sal_1030_a(PL_SAL_1030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_SAL_1030_ADataSet ds = (PL_SAL_1030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
