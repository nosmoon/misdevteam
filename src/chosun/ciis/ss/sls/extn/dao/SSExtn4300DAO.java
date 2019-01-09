/***************************************************************************************************
 * 파일명 : SSExtn300DAO.java
 * 기능 : 문자점검독자관리 - 설문응답 DAO
 * 작성일자 : 2015.12.03
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * 문자점검독자관리 - 설문응답 DAO
 */
public class SSExtn4300DAO {

    /**
     * 문자점검독자관리-설문응답-초기화면
     * @param  SS_L_MO_SVY_INITDM
     * @return SS_L_MO_SVY_INITDataSet
     * @throws AppException
     */
    public SS_L_MO_SVY_INITDataSet svyRdrInit(SS_L_MO_SVY_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MO_SVY_INITDataSet ds = (SS_L_MO_SVY_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * 문자점검독자관리-설문해당독자리스트
     * @param  SS_L_MO_SVY_RDRDM
     * @return SS_L_MO_SVY_RDRDataSet
     * @throws AppException
     */
    public SS_L_MO_SVY_RDRDataSet svyRdrList(SS_L_MO_SVY_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MO_SVY_RDRDataSet ds = (SS_L_MO_SVY_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * 문자점검독자관리-설문해당독자상세 및 응답리스트
     * @param  SS_S_MO_SVY_RDRDM
     * @return SS_S_MO_SVY_RDRDataSet
     * @throws AppException
     */
    public SS_S_MO_SVY_RDRDataSet svyRdrDetail(SS_S_MO_SVY_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MO_SVY_RDRDataSet ds = (SS_S_MO_SVY_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * 문자점검독자관리-설문응답-센터전달, 부실확정, 전체마감
     * @param SS_A_MO_SVY_BSCOMPDM
     * @return SS_A_MO_SVY_BSCOMPDataSet
     * @throws AppException
     */
    public SS_A_MO_SVY_BSCOMPDataSet svyBsComp(SS_A_MO_SVY_BSCOMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MO_SVY_BSCOMPDataSet ds = (SS_A_MO_SVY_BSCOMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * 문자점검독자관리-설문응답-마감년월,캠페인유형으로 설문명리스트
     * @param SS_L_MO_SVYLISTDM
     * @return SS_L_MO_SVYLISTDataSet
     * @throws AppException
     */
    public SS_L_MO_SVYLISTDataSet svyList(SS_L_MO_SVYLISTDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_MO_SVYLISTDataSet ds = (SS_L_MO_SVYLISTDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }

}
