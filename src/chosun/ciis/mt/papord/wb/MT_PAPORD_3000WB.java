/***************************************************************************************************
* 파일명 : MT_PRNPAP_3000WB
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-04-08 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.papord.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;     
 
public class MT_PAPORD_3000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * 제지사별 공장별 용지 차량적재량 저장, 수정, 삭제 
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_3001_ADataSet ds = null;
		
		MT_PAPORD_3001_ADM dm = new MT_PAPORD_3001_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode         = converted[0];		//구분
		String aply_dt      = converted[2];		//적용일자
		String papcmpy_cd   = converted[3];		//제지사코드
		String fac_clsf     = converted[4];		//공장코드
		String matr_cd      = converted[5];		//자재코드
		String roll_wgt     = converted[7];		//롤중량
		String roll_cnt     = converted[8];		//롤수
		String amss_wgt     = converted[9];		//중량
		String occr_dt      = converted[11];	//발생일자
		String seq          = converted[12];	//일련번호
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setAply_dt(aply_dt);
		dm.setPapcmpy_cd(papcmpy_cd);
		dm.setFac_clsf(fac_clsf);
		dm.setMatr_cd(matr_cd);
		dm.setRoll_wgt(roll_wgt);
		dm.setRoll_cnt(roll_cnt);
		dm.setAmss_wgt(amss_wgt);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.print();

		ds = (MT_PAPORD_3001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * 제지사별 공장별 용지 차량적재량 조회 
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_3003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_3003_LDataSet ds = null;
		
		MT_PAPORD_3003_LDM dm = new MT_PAPORD_3003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt_fr_s = Util.checkString(req.getParameter("aply_dt_fr_s"));
		dm.aply_dt_to_s = Util.checkString(req.getParameter("aply_dt_to_s"));
		dm.fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.papcmpy_cd_s = Util.checkString(req.getParameter("papcmpy_cd_s"));
		dm.print();

		ds = (MT_PAPORD_3003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
