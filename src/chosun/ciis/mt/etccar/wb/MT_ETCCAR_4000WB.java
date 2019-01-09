/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.etccar.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
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
import chosun.ciis.mt.etccar.dm.*;                    
import chosun.ciis.mt.etccar.ds.*;    
 
/**
 *  
 */

public class MT_ETCCAR_4000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";
    
    // 차량소모품 관리 콤보
    public void mt_etccar_4101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4101_MDataSet ds = null;
		
		MT_ETCCAR_4101_MDM dm = new MT_ETCCAR_4101_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_4101_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 차량소모품 관리 조회 
    public void mt_etccar_4100_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4100_LDataSet ds = null;
		
		MT_ETCCAR_4100_LDM dm = new MT_ETCCAR_4100_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
		dm.clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
		dm.print();

		ds = (MT_ETCCAR_4100_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 차량소모품 관리 등록/수정/삭제
    public void mt_etccar_4102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4102_ADataSet ds = null;

		MT_ETCCAR_4102_ADM dm = new MT_ETCCAR_4102_ADM();		
		String multiUpData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpData);
		
		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		
		String gubun             = converted[0]; // 구분                              
		String clam_dt           = converted[2]; // 청구일자                              
		String use_dt            = converted[3]; // 사용일자
		
		String car_no            = converted[5]; // 차량번호                              
		String clam_item_kind    = converted[6]; // 청구물품종류                    
		String item_nm           = converted[7]; // 물품명                              
		String oil_clsf          = converted[8]; // 유류구분                              
		String clam_amt          = converted[9]; // 청구금액                              
		String qunt              = converted[10]; // 수량                              
		String dlco              = converted[12]; // 거래처
		String dlco_nm           = converted[13]; // 거래처
		String remk              = converted[14]; // 비고                              
		String occr_dt           = converted[15]; // 발생일자                              
		String seq               = converted[16]; // 일련번호                              
		String clos_dt           = converted[17]; // 마감일자 
	       
        String multiUpdateData 		= Util.checkString(req.getParameter("multiUpData"));
        Hashtable hash				= new Hashtable();
		hash 						= getHashMultiUpdateData(multiUpdateData);
		
		dm.cmpy_cd = cmpy_cd;
		dm.occr_dt = Util.checkString((String) hash.get("occr_dt"));
		dm.clam_dt = Util.checkString((String) hash.get("clam_dt"));
		dm.seq = Util.checkString((String) hash.get("seq"));
		dm.clam_item_kind = Util.checkString((String) hash.get("clam_item_kind"));
		dm.oil_clsf = Util.checkString((String) hash.get("oil_clsf"));
		dm.use_dt = Util.checkString((String) hash.get("use_dt"));
		dm.car_no = Util.checkString((String) hash.get("car_no"));
		dm.item_nm = Util.checkString((String) hash.get("item_nm"));
		dm.unit_prc = Util.checkString((String) hash.get("unit_prc"));
		dm.qunt = Util.checkString((String) hash.get("qunt"));
		dm.clam_amt = Util.checkString((String) hash.get("clam_amt"));
		dm.dlco = Util.checkString((String) hash.get("dlco"));
		dm.dlco_nm = Util.checkString((String) hash.get("dlco_nm"));
		dm.remk = Util.checkString((String) hash.get("remk"));
		dm.clos_dt = Util.checkString((String) hash.get("clos_dt"));
		dm.incmg_pers_ipaddr = incmg_pers_ipaddr;
		dm.incmg_pers = incmg_pers;
		dm.gubun = Util.checkString((String) hash.get("m")).toUpperCase();
		
		/*
		dm.cmpy_cd = cmpy_cd;
		dm.occr_dt = occr_dt;
		dm.clam_dt = clam_dt;
		dm.seq = seq;
		dm.clam_item_kind = clam_item_kind;
		dm.oil_clsf = oil_clsf;
		dm.use_dt = use_dt;
		dm.car_no = car_no;
		dm.item_nm = item_nm;
		dm.qunt = qunt;
		dm.clam_amt = clam_amt;
		dm.dlco = dlco;
		dm.dlco_nm = dlco_nm;
		dm.remk = remk;
		dm.clos_dt = clos_dt;
		dm.incmg_pers_ipaddr = incmg_pers_ipaddr;
		dm.incmg_pers = incmg_pers;
		dm.gubun = gubun.toUpperCase();
		
		*/
		dm.print();

		ds = (MT_ETCCAR_4102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 차량소모품 관리 콤보
    public void mt_etccar_4103_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4103_MDataSet ds = null;
		
		MT_ETCCAR_4103_MDM dm = new MT_ETCCAR_4103_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_4103_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

    public void mt_etccar_4104_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4104_MDataSet ds = null;
		
		MT_ETCCAR_4104_MDM dm = new MT_ETCCAR_4104_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.clam_dt = Util.checkString(req.getParameter("clam_dt_fr"));
		dm.per_id = Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.print();

		ds = (MT_ETCCAR_4104_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // 차량소모품 관리 조회
    public void mt_etccar_4200_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_4200_LDataSet ds = null;
		
		MT_ETCCAR_4200_LDM dm = new MT_ETCCAR_4200_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.use_dt_fr = Util.checkString(req.getParameter("use_dt_fr"));
		dm.use_dt_to = Util.checkString(req.getParameter("use_dt_to"));
		dm.clam_item_kind = Util.checkString(req.getParameter("clam_item_kind"));
		dm.print();

		ds = (MT_ETCCAR_4200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
