/***************************************************************************************************
* 파일명 : SSAdmin1000DAO.java
* 기능 : 관리자-마일리지를 위한 DAO
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-마일리지를 위한 DAO
 */

public class SSAdmin1300DAO {
    /**
     * 관리자-마일리지-지급기준-초기화면
     * @param dm SS_L_MIGLBASI_INITDM
     * @return SS_L_MIGLBASI_INITDataSet
     * @throws AppException
     */
    public SS_L_MIGLBASI_INITDataSet initPayBasi(SS_L_MIGLBASI_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLBASI_INITDataSet ds = (SS_L_MIGLBASI_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-지급기준-목록
     * @param dm SS_L_MIGLBASIDM
     * @return SS_L_MIGLBASIDataSet
     * @throws AppException
     */
    public SS_L_MIGLBASIDataSet selectPayBasiList(SS_L_MIGLBASIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLBASIDataSet ds = (SS_L_MIGLBASIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-지급기준-상세
     * @param dm SS_S_MIGLBASIDM
     * @return SS_S_MIGLBASIDataSet
     * @throws AppException
     */
    public SS_S_MIGLBASIDataSet selectPayBasiDetail(SS_S_MIGLBASIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MIGLBASIDataSet ds = (SS_S_MIGLBASIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-지급기준-등록
     * @param dm SS_A_MIGLBASIDM
     * @return SS_A_MIGLBASIDataSet
     * @throws AppException
     */
    public SS_A_MIGLBASIDataSet insertPayBasi(SS_A_MIGLBASIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLBASIDataSet ds = (SS_A_MIGLBASIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-지급기준-수정
     * @param dm SS_A_MIGLBASIDM
     * @return SS_A_MIGLBASIDataSet
     * @throws AppException
     */
    public SS_A_MIGLBASIDataSet updatePayBasi(SS_A_MIGLBASIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLBASIDataSet ds = (SS_A_MIGLBASIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-지급기준-삭제
     * @param dm SS_A_MIGLBASIDM
     * @return SS_A_MIGLBASIDataSet
     * @throws AppException
     */
    public SS_A_MIGLBASIDataSet deletePayBasi(SS_A_MIGLBASIDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLBASIDataSet ds = (SS_A_MIGLBASIDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-목록
     * @param dm SS_L_MIGLLMMT_CLOSDM
     * @return SS_L_MIGLLMMT_CLOSDataSet
     * @throws AppException
     */
    public SS_L_MIGLLMMT_CLOSDataSet selectMigClosList(SS_L_MIGLLMMT_CLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MIGLLMMT_CLOSDataSet ds = (SS_L_MIGLLMMT_CLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-상세
     * @param dm  SS_S_MIGLLMMT_CLOSDM
     * @return  SS_S_MIGLLMMT_CLOSDataSet
     * @throws AppException
     */
    public SS_S_MIGLLMMT_CLOSDataSet selectMigClosDetail(SS_S_MIGLLMMT_CLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MIGLLMMT_CLOSDataSet ds = (SS_S_MIGLLMMT_CLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-저장(등록)
     * @param dm SS_A_MIGLLMMT_CLOSDM
     * @return SS_A_MIGLLMMT_CLOSDataSet
     * @throws AppException
     */
    public SS_A_MIGLLMMT_CLOSDataSet insertMigClos(SS_A_MIGLLMMT_CLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLLMMT_CLOSDataSet ds = (SS_A_MIGLLMMT_CLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-저장(수정)
     * @param dm  SS_A_MIGLLMMT_CLOSDM
     * @return  SS_A_MIGLLMMT_CLOSDataSet
     * @throws AppException
     */
    public SS_A_MIGLLMMT_CLOSDataSet updateMigClos(SS_A_MIGLLMMT_CLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLLMMT_CLOSDataSet ds = (SS_A_MIGLLMMT_CLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-삭제
     * @param dm SS_A_MIGLLMMT_CLOSDM
     * @return SS_A_MIGLLMMT_CLOSDataSet
     * @throws AppException
     */
    public SS_A_MIGLLMMT_CLOSDataSet deleteMigClos(SS_A_MIGLLMMT_CLOSDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLLMMT_CLOSDataSet ds = (SS_A_MIGLLMMT_CLOSDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-마감
     * @param dm SS_A_MIGLLMMT_CLOS_CLOSEDM
     * @return SS_A_MIGLLMMT_CLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_MIGLLMMT_CLOS_CLOSEDataSet closeMigClos(SS_A_MIGLLMMT_CLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLLMMT_CLOS_CLOSEDataSet ds = (SS_A_MIGLLMMT_CLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-마일리지-마감-마감취소
     * @param dm SS_A_MIGLLMMT_CLOS_CLOSEDM
     * @return SS_A_MIGLLMMT_CLOS_CLOSEDataSet
     * @throws AppException
     */
    public SS_A_MIGLLMMT_CLOS_CLOSEDataSet closeCancelMigClos(SS_A_MIGLLMMT_CLOS_CLOSEDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MIGLLMMT_CLOS_CLOSEDataSet ds = (SS_A_MIGLLMMT_CLOS_CLOSEDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}