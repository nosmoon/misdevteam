/***************************************************************************************************
 * 파일명   : PSprint1101DAO.java
 * 기능     : 출력-출력화면의 코드값을 조회
 * 작성일자 : 2006-02-01
 * 작성자   : 전현표
 **************************************************************************************************/
/**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/

package chosun.ciis.ps.pbs.print.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.dao.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * 출력-출력초기매뉴
 */
public class PSPrint1101DAO {
    public PSPrint1101DAO() {
    }

    /**
     * 출력-출력초기매뉴
     * @param PS_S_PRINT_INITDM
     * @return PS_S_PRINT_INITDataSet
     */
    public PS_S_PRINT_INITDataSet selectCodeList(PS_S_PRINT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        PS_S_PRINT_INITDataSet ds = (PS_S_PRINT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
