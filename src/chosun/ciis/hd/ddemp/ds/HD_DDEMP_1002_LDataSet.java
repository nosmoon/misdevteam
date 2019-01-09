/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.ddemp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DDEMP_1002_LDataSet(){}
	public HD_DDEMP_1002_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_DDEMP_1002_LCURLISTRecord rec = new HD_DDEMP_1002_LCURLISTRecord();
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.studt_wk_yn = Util.checkString(rset0.getString("studt_wk_yn"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.emp_insr_dduc_yn = Util.checkString(rset0.getString("emp_insr_dduc_yn"));
			rec.octgr_cd = Util.checkString(rset0.getString("octgr_cd"));
			rec.lve_job_resn_cd = Util.checkString(rset0.getString("lve_job_resn_cd"));
			rec.avg_duty_tm = Util.checkString(rset0.getString("avg_duty_tm"));
			rec.day01 = Util.checkString(rset0.getString("day01"));
			rec.day02 = Util.checkString(rset0.getString("day02"));
			rec.day03 = Util.checkString(rset0.getString("day03"));
			rec.day04 = Util.checkString(rset0.getString("day04"));
			rec.day05 = Util.checkString(rset0.getString("day05"));
			rec.day06 = Util.checkString(rset0.getString("day06"));
			rec.day07 = Util.checkString(rset0.getString("day07"));
			rec.day08 = Util.checkString(rset0.getString("day08"));
			rec.day09 = Util.checkString(rset0.getString("day09"));
			rec.day10 = Util.checkString(rset0.getString("day10"));
			rec.day11 = Util.checkString(rset0.getString("day11"));
			rec.day12 = Util.checkString(rset0.getString("day12"));
			rec.day13 = Util.checkString(rset0.getString("day13"));
			rec.day14 = Util.checkString(rset0.getString("day14"));
			rec.day15 = Util.checkString(rset0.getString("day15"));
			rec.day16 = Util.checkString(rset0.getString("day16"));
			rec.day17 = Util.checkString(rset0.getString("day17"));
			rec.day18 = Util.checkString(rset0.getString("day18"));
			rec.day19 = Util.checkString(rset0.getString("day19"));
			rec.day20 = Util.checkString(rset0.getString("day20"));
			rec.day21 = Util.checkString(rset0.getString("day21"));
			rec.day22 = Util.checkString(rset0.getString("day22"));
			rec.day23 = Util.checkString(rset0.getString("day23"));
			rec.day24 = Util.checkString(rset0.getString("day24"));
			rec.day25 = Util.checkString(rset0.getString("day25"));
			rec.day26 = Util.checkString(rset0.getString("day26"));
			rec.day27 = Util.checkString(rset0.getString("day27"));
			rec.day28 = Util.checkString(rset0.getString("day28"));
			rec.day29 = Util.checkString(rset0.getString("day29"));
			rec.day30 = Util.checkString(rset0.getString("day30"));
			rec.day31 = Util.checkString(rset0.getString("day31"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.np_fee = Util.checkString(rset0.getString("np_fee"));
			rec.dd_amt = Util.checkString(rset0.getString("dd_amt"));
			rec.time_amt = Util.checkString(rset0.getString("time_amt"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.rcpt_clsf_nm = Util.checkString(rset0.getString("rcpt_clsf_nm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.dtls_medi_nm = Util.checkString(rset0.getString("dtls_medi_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.hd_decid_pers = Util.checkString(rset0.getString("hd_decid_pers"));
			rec.hd_decid_dt_tm = Util.checkString(rset0.getString("hd_decid_dt_tm"));
			rec.duty_dds = Util.checkString(rset0.getString("duty_dds"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.clos_dt = Util.checkString(rset0.getString("clos_dt"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.rcpt_clsf = Util.checkString(rset0.getString("rcpt_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.duty_yymm = Util.checkString(rset0.getString("duty_yymm"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			rec.all_insr_dduc_yn = Util.checkString(rset0.getString("all_insr_dduc_yn"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset0.getString("hlth_insr_med_care_insr_fee"));
			rec.cntr_amt = Util.checkString(rset0.getString("cntr_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DDEMP_1002_LDataSet ds = (HD_DDEMP_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DDEMP_1002_LCURLISTRecord curlistRec = (HD_DDEMP_1002_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.prn%>
<%= curlistRec.flnm%>
<%= curlistRec.studt_wk_yn%>
<%= curlistRec.ptph_no%>
<%= curlistRec.emp_insr_dduc_yn%>
<%= curlistRec.octgr_cd%>
<%= curlistRec.lve_job_resn_cd%>
<%= curlistRec.avg_duty_tm%>
<%= curlistRec.day01%>
<%= curlistRec.day02%>
<%= curlistRec.day03%>
<%= curlistRec.day04%>
<%= curlistRec.day05%>
<%= curlistRec.day06%>
<%= curlistRec.day07%>
<%= curlistRec.day08%>
<%= curlistRec.day09%>
<%= curlistRec.day10%>
<%= curlistRec.day11%>
<%= curlistRec.day12%>
<%= curlistRec.day13%>
<%= curlistRec.day14%>
<%= curlistRec.day15%>
<%= curlistRec.day16%>
<%= curlistRec.day17%>
<%= curlistRec.day18%>
<%= curlistRec.day19%>
<%= curlistRec.day20%>
<%= curlistRec.day21%>
<%= curlistRec.day22%>
<%= curlistRec.day23%>
<%= curlistRec.day24%>
<%= curlistRec.day25%>
<%= curlistRec.day26%>
<%= curlistRec.day27%>
<%= curlistRec.day28%>
<%= curlistRec.day29%>
<%= curlistRec.day30%>
<%= curlistRec.day31%>
<%= curlistRec.pay_amt%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.np_fee%>
<%= curlistRec.dd_amt%>
<%= curlistRec.time_amt%>
<%= curlistRec.budg_nm%>
<%= curlistRec.rcpt_clsf_nm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.dtls_medi_nm%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.hd_decid_pers%>
<%= curlistRec.hd_decid_dt_tm%>
<%= curlistRec.duty_dds%>
<%= curlistRec.clos_yn%>
<%= curlistRec.clos_dt%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.budg_cd%>
<%= curlistRec.rcpt_clsf%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.duty_yymm%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.proc_clsf%>
<%= curlistRec.all_insr_dduc_yn%>
<%= curlistRec.hlth_insr_med_care_insr_fee%>
<%= curlistRec.cntr_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 27 10:47:05 KST 2017 */