/***************************************************************************************************
* 파일명 : SSAdmin12100DAO.java_모바일용
* 기능 : 관리자-모바일로그인 담당승인을 위한 DAO_모바일용
* 작성일자 : 2017-01-23
* 작성자 :  장선희
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
 *  관리자-모바일로그인 담당승인을 위한 DAO_모바일용
 */

public class SSAdmin12100DAO {

	//초기
    public SS_MO_L_LOGINAPLC_INITDataSet mo_initMoAplc(SS_MO_L_LOGINAPLC_INITDM dm) throws AppException { //모바일용
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINAPLC_INITDataSet ds = (SS_MO_L_LOGINAPLC_INITDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //조회
    public SS_MO_L_LOGINAPLC_APRVDataSet mo_selectMoAplc(SS_MO_L_LOGINAPLC_APRVDM dm) throws AppException { //모바일용
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //상세
    public SS_MO_S_LOGINAPLC_APRVDataSet mo_detailMoAplc(SS_MO_S_LOGINAPLC_APRVDM dm) throws AppException { //모바일용
        DBManager manager = new DBManager("Oracle");
        SS_MO_S_LOGINAPLC_APRVDataSet ds = (SS_MO_S_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }


    //담당승인, 수정, 비밀번호초기화
    public SS_MO_A_LOGINAPLC_APRVDataSet mo_updateMoAplc(SS_MO_A_LOGINAPLC_APRVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*      if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }





}