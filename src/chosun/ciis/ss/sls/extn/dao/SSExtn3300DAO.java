/***************************************************************************************************
 * 파일명 : SSExtn3300DAO.java
 * 기능 : 문자점검독자관리 DAO
 * 작성일자 : 2015.11.11
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
 * 문자점검독자관리 DAO
 */
public class SSExtn3300DAO {

    /**
     * 문자점검독자관리-설문등록리스트
     * @param  SS_L_MO_SVYDM
     * @return SS_L_MO_SVYDataSet
     * @throws AppException
     */
    public SS_L_MO_SVYDataSet selectMoSvyList(SS_L_MO_SVYDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MO_SVYDataSet ds = (SS_L_MO_SVYDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    
    
    /**
     * 문자점검독자관리-설문상세
     * @param  SS_S_MO_SVYDM
     * @return SS_S_MO_SVYDataSet
     * @throws AppException
     */
    public SS_S_MO_SVYDataSet selectMoSvyDetail(SS_S_MO_SVYDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_S_MO_SVYDataSet ds = (SS_S_MO_SVYDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }
    
    

    /**
     * 문자점검독자관리-설문 추가, 수정, 삭제
     * @param  SS_A_MO_SVYDM
     * @return SS_A_MO_SVYDataSet
     * @throws AppException
     */
    public SS_A_MO_SVYDataSet MoSvyUpdate(SS_A_MO_SVYDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_A_MO_SVYDataSet ds = (SS_A_MO_SVYDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }
    
    public SS_U_MO_SVY_DELDataSet MoDelete(SS_U_MO_SVY_DELDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_U_MO_SVY_DELDataSet ds = (SS_U_MO_SVY_DELDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }
    
    
    
    
}
