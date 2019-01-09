/***************************************************************************************************
* 파일명 : SSAdmin2100DAO.java
* 기능 : 관리자-모바일로그인 담당승인을 위한 DAO_모바일용
* 작성일자 : 2016-09-22
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

public class SSAdmin2100DAO {

	//초기
    public SS_MO_L_LOGINAPLC_INITDataSet initMoAplc(SS_MO_L_LOGINAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINAPLC_INITDataSet ds = (SS_MO_L_LOGINAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    //조회
    public SS_MO_L_LOGINAPLC_APRVDataSet selectMoAplc(SS_MO_L_LOGINAPLC_APRVDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }

    //로그인이력리스트 2017-07-10 장선희 추가
    public SS_MO_L_LOGINHISTDataSet selectLoginHist(SS_MO_L_LOGINHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINHISTDataSet ds = (SS_MO_L_LOGINHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    //기기변경,휴대번호변경이력리스트 2017-07-13 장선희 추가
    public SS_MO_L_MODIHISTDataSet selectModiHist(SS_MO_L_MODIHISTDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_MO_L_MODIHISTDataSet ds = (SS_MO_L_MODIHISTDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }

    //상세
    public SS_MO_S_LOGINAPLC_APRVDataSet detailMoAplc(SS_MO_S_LOGINAPLC_APRVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_S_LOGINAPLC_APRVDataSet ds = (SS_MO_S_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    //담당승인, 수정, 비밀번호초기화
    public SS_MO_A_LOGINAPLC_APRVDataSet updateMoAplc(SS_MO_A_LOGINAPLC_APRVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }





}