/***************************************************************************************************
* 파일명 : SSReader1300DAO.java
* 기능 : 독자현황-VacationStop-마감을 위한 DAO
* 작성일자 : 2004-02-25
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;


import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 독자현황-VacationStop-마감을 위한 DAO
 */

public class SSReader1300DAO {
    /**
     * 독자현황-VacationStop-마감-목록
     * @param dm SS_L_VSCLOSDM
     * @return SS_L_VSCLOSDataSet
     * @throws AppException
     */
    public SS_L_VSCLOSDataSet selectVsclosList(SS_L_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_VSCLOSDataSet ds = (SS_L_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop-마감-상세
     * @param dm  SS_S_VSCLOSDM
     * @return  SS_S_VSCLOSDataSet
     * @throws AppException
     */
    public SS_S_VSCLOSDataSet selectVsclosDetail(SS_S_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_VSCLOSDataSet ds = (SS_S_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop-마감-저장(등록)
     * @param dm SS_A_VSCLOSDM
     * @return SS_A_VSCLOSDataSet
     * @throws AppException
     */
    public SS_A_VSCLOSDataSet insertVsclos(SS_A_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOSDataSet ds = (SS_A_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop-마감-저장(수정)
     * @param dm  SS_A_VSCLOSDM
     * @return  SS_A_VSCLOSDataSet
     * @throws AppException
     */
    public SS_A_VSCLOSDataSet updateVsclos(SS_A_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOSDataSet ds = (SS_A_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop-마감-삭제
     * @param dm SS_A_VSCLOSDM
     * @return SS_A_VSCLOSDataSet
     * @throws AppException
     */
    public SS_A_VSCLOSDataSet deleteVsclos(SS_A_VSCLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOSDataSet ds = (SS_A_VSCLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop-마감-마감
     * @param dm SS_A_VSCLOS_CLOSEDM
     * @return SS_A_VSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_VSCLOS_CLOSEDataSet closeVsclos(SS_A_VSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOS_CLOSEDataSet ds = (SS_A_VSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 독자현황-VacationStop-마감-마감취소
     * @param dm SS_A_VSCLOS_CLOSEDM
     * @return SS_A_VSCLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_VSCLOS_CLOSEDataSet closeCancelVsclos(SS_A_VSCLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_VSCLOS_CLOSEDataSet ds = (SS_A_VSCLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}