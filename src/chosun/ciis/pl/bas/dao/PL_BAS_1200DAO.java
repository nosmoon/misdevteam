/***************************************************************************************************
 * 파일명 : PL_BAS_1200DAO.java
 * 기능 : 기초관리-거래처관리
 * 작성일자 : 2009.03.04
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.bas.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */
public class PL_BAS_1200DAO {
	
    /**
     * 메인
     * @param PL_BAS_1200_MDM
     * @return PL_BAS_1200_MDataSet
     */
    public PL_BAS_1200_MDataSet pl_bas_1200_m(PL_BAS_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1200_MDataSet ds = (PL_BAS_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 조회
     * @param PL_BAS_1210_LDM
     * @return PL_BAS_1210_LDataSet
     */
    public PL_BAS_1210_LDataSet pl_bas_1210_l(PL_BAS_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1210_LDataSet ds = (PL_BAS_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 상세조회
     * @param PL_BAS_1220_LDM
     * @return PL_BAS_1220_LDataSet
     */
    public PL_BAS_1220_LDataSet pl_bas_1220_l(PL_BAS_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1220_LDataSet ds = (PL_BAS_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 등록/수정/삭제
     * @param PL_BAS_1230_ADM
     * @return PL_BAS_1230_ADataSet
     */
    public PL_BAS_1230_ADataSet pl_bas_1230_a(PL_BAS_1230_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1230_ADataSet ds = (PL_BAS_1230_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 취급매체
     * @param PL_BAS_1240_ADM
     * @return PL_BAS_1240_ADataSet
     */
    public PL_BAS_1240_ADataSet pl_bas_1240_a(PL_BAS_1240_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1240_ADataSet ds = (PL_BAS_1240_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 발송처
     * @param PL_BAS_1250_ADM
     * @return PL_BAS_1250_ADataSet
     */
    public PL_BAS_1250_ADataSet pl_bas_1250_a(PL_BAS_1250_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1250_ADataSet ds = (PL_BAS_1250_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 담보내역
     * @param PL_BAS_1260_ADM
     * @return PL_BAS_1260_ADataSet
     */
    public PL_BAS_1260_ADataSet pl_bas_1260_a(PL_BAS_1260_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1260_ADataSet ds = (PL_BAS_1260_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 보증인
     * @param PL_BAS_1270_ADM
     * @return PL_BAS_1270_ADataSet
     */
    public PL_BAS_1270_ADataSet pl_bas_1270_a(PL_BAS_1270_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_BAS_1270_ADataSet ds = (PL_BAS_1270_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
