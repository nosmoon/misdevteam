/***************************************************************************************************
* 파일명 : SSAdmin1500EJB.java
* 기능 : 관리자-지국월마감을 위한 DAO
* 작성일자 : 2005-01-28
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dao;

import java.io.*;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * 관리자-지국월마감을 위한 DAO
 */

public class SSAdmin1500DAO {
    /**
     * 관리자-지국월마감-초기화면
     * @param dm SS_L_BOCLOS_INITDM
     * @return SS_L_BOCLOS_INITDataSet
     * @throws AppException
     */
    public SS_L_BOCLOS_INITDataSet initBoclos(SS_L_BOCLOS_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOCLOS_INITDataSet ds = (SS_L_BOCLOS_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-지국월마감-목록
     * @param dm SS_L_BOCLOSDM
     * @return SS_L_BOCLOSDataSet
     * @throws AppException
     */
    public SS_L_BOCLOSDataSet selectBoclosList(SS_L_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_BOCLOSDataSet ds = (SS_L_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-지국월마감-상세
     * @param dm SS_S_BOCLOSDM
     * @return SS_S_BOCLOSDataSet
     * @throws AppException
     */
    public SS_S_BOCLOSDataSet selectBoclosDetail(SS_S_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_BOCLOSDataSet ds = (SS_S_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-지국월마감-마감
     * @param dm SS_A_BOCLOSDM
     * @return SS_A_BOCLOSDataSet
     * @throws AppException
     */
    public SS_A_BOCLOSDataSet closeBoclos(SS_A_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_BOCLOSDataSet ds = (SS_A_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 관리자-지국월마감-마감취소
     * @param dm SS_A_BOCLOSDM
     * @return SS_A_BOCLOSDataSet
     * @throws AppException
     */
    public SS_A_BOCLOSDataSet closeCancelBoclos(SS_A_BOCLOSDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_BOCLOSDataSet ds = (SS_A_BOCLOSDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
