/***************************************************************************************************
* 파일명 : SSCa1000DAO.java
* 기능 : 사이버센터-사이버지국장
* 작성일자 : 2005-04-18
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.ca.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.dm.*;

public class SSCa1000DAO {
    /**
     * 사이버센터-사이버지국장-초기화면
     * @param dm SS_L_CA_HEAD_INITDM
     * @return SS_L_CA_HEAD_INITDataSet
     * @throws AppException
     */
    public SS_L_CA_HEAD_INITDataSet initCaHead(SS_L_CA_HEAD_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CA_HEAD_INITDataSet ds = (SS_L_CA_HEAD_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 사이버센터-사이버지국장-목록
     * @param dm SS_L_CA_HEADDM
     * @return SS_L_CA_HEADDataSet
     * @throws AppException
     */
    public SS_L_CA_HEADDataSet selectCaHeadList(SS_L_CA_HEADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CA_HEADDataSet ds = (SS_L_CA_HEADDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 사이버센터-사이버지국장-상세
     * @param dm  SS_S_CA_HEADDM
     * @return  SS_S_CA_HEADDataSet
     * @throws AppException
     */
    public SS_S_CA_HEADDataSet selectCaHeadDetail(SS_S_CA_HEADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_CA_HEADDataSet ds = (SS_S_CA_HEADDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 사이버센터-사이버지국장-등록,수정,삭제
     * @param dm SS_A_CA_HEADDM
     * @return SS_A_CA_HEADDataSet
     * @throws AppException
     */
    public SS_A_CA_HEADDataSet accessCaHead(SS_A_CA_HEADDM dm ) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_CA_HEADDataSet ds = (SS_A_CA_HEADDataSet) manager.executeCall(dm );
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}