/***************************************************************************************************
* 파일명 : SSAdmin1600EJB.java
* 기능 : 관리자-담당별 우편번호 변경처리를 위한 DAO
* 작성일자 : 2009-04-28
* 작성자 : 권정윤
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

/**
 * 관리자-담당별 우편번호 변경처리를 위한 DAO
 */

public class SSAdmin1700DAO {

    public SS_L_NEWJUSO_APPRDataSet selectNewjusoAppr(SS_L_NEWJUSO_APPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NEWJUSO_APPRDataSet ds = (SS_L_NEWJUSO_APPRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_NEWJUSO_APPR_REQDataSet updateNewjusoApprReq(SS_U_NEWJUSO_APPR_REQDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_NEWJUSO_APPR_REQDataSet ds = (SS_U_NEWJUSO_APPR_REQDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_U_NEWJUSO_APPRDataSet updateNewjusoAppr(SS_U_NEWJUSO_APPRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_NEWJUSO_APPRDataSet ds = (SS_U_NEWJUSO_APPRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_NEWJUSO_APPR_HISDataSet newjusoApprHistory(SS_L_NEWJUSO_APPR_HISDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NEWJUSO_APPR_HISDataSet ds = (SS_L_NEWJUSO_APPR_HISDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}