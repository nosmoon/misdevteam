/***************************************************************************************************
 * 파일명 : PSShare1601DAO.java
 * 기능 : 정보공유 일정 달력처리를 위한 DAO
 * 작성일자 : 2004-03-08
 * 작성자 : 전현표
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ps.pbs.share.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

import java.sql.*;
import java.io.*;

import oracle.jdbc.driver.*;
import oracle.sql.*;
import oracle.jdbc.*;

import weblogic.jdbc.vendor.oracle.*;

/**
 * 정보공유-달력 위한 DAO
 */
public class PSShare1601DAO {

    /**
     * 정보공유 게시판 판매국 리스트 조회
     * @param SS_L_INFOEXG_INITDM 객체
     * @return SS_L_INFOEXG_INITDataSet 객체
     * @author CRM 출판국팀
     * @since 2003.10.30    ver : 1.0
     */

    public PS_L_MONTH_SCHEDataSet selectMonthScheList(PS_L_MONTH_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_MONTH_SCHEDataSet ds = (PS_L_MONTH_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * 정보공유 일정-달력-상세조회
     * @param PS_L_INFOEXG_SRCHDM 객체
     * @return PS_L_INFOEXG_SRCHDataSet 객체
     * @author CRM 출판국팀
     * @since 2003.10.30    ver : 1.0
     */

    public PS_L_DAY_SCHEDataSet selectDayScheDetail(PS_L_DAY_SCHEDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_L_DAY_SCHEDataSet ds = (PS_L_DAY_SCHEDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}