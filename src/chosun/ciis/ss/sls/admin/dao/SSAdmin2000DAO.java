/***************************************************************************************************
* 파일명 : SSAdmin1900DAO.java
* 기능 : 주소코드 관리
* 작성일자 : 2014-07-28
* 작성자 :  심정보
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

public class SSAdmin2000DAO {

    public SS_L_NEWJUSO_BOCHGDataSet selectNewjusoChg(SS_L_NEWJUSO_BOCHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NEWJUSO_BOCHGDataSet ds = (SS_L_NEWJUSO_BOCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    
    public SS_U_NEWJUSO_BOCHGDataSet updateNewjusoChg(SS_U_NEWJUSO_BOCHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_NEWJUSO_BOCHGDataSet ds = (SS_U_NEWJUSO_BOCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}