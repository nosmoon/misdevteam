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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_7200_LDataSet(){}
	public HD_INFO_7200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_INFO_7200_LCURLISTRecord rec = new HD_INFO_7200_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.frlc_no = Util.checkString(rset0.getString("frlc_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.pay_mm = Util.checkString(rset0.getString("pay_mm"));
			rec.chrg_posk_cd = Util.checkString(rset0.getString("chrg_posk_cd"));
			rec.chrg_posk_nm = Util.checkString(rset0.getString("chrg_posk_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.thrw_pgm = Util.checkString(rset0.getString("thrw_pgm"));
			rec.thrw_pgm_nm = Util.checkString(rset0.getString("thrw_pgm_nm"));
			rec.cntr_dt = Util.checkString(rset0.getString("cntr_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.duty_dds = Util.checkString(rset0.getString("duty_dds"));
			rec.pay_cycl = Util.checkString(rset0.getString("pay_cycl"));
			rec.pay_cycl_nm = Util.checkString(rset0.getString("pay_cycl_nm"));
			rec.servcost = Util.checkString(rset0.getString("servcost"));
			rec.duty_tms = Util.checkString(rset0.getString("duty_tms"));
			rec.base_amt = Util.checkString(rset0.getString("base_amt"));
			rec.etc_amt = Util.checkString(rset0.getString("etc_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.incm_clsf_nm = Util.checkString(rset0.getString("incm_clsf_nm"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.incm_tax = Util.checkString(rset0.getString("incm_tax"));
			rec.res_tax = Util.checkString(rset0.getString("res_tax"));
			rec.draft_no = Util.checkString(rset0.getString("draft_no"));
			rec.draft_dept_cd = Util.checkString(rset0.getString("draft_dept_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			HD_INFO_7200_LCURLIST1Record rec = new HD_INFO_7200_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.mang_no = Util.checkString(rset1.getString("mang_no"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			rec.tmp_crdt_amt = Util.checkString(rset1.getString("tmp_crdt_amt"));
			rec.titl = Util.checkString(rset1.getString("titl"));
			rec.actu_slip_no = Util.checkString(rset1.getString("actu_slip_no"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.incmg_pers = Util.checkString(rset1.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset1.getString("incmg_pers_ipadd"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_7200_LDataSet ds = (HD_INFO_7200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_7200_LCURLISTRecord curlistRec = (HD_INFO_7200_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_7200_LCURLIST1Record curlist1Rec = (HD_INFO_7200_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.frlc_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.mang_no%>
<%= curlistRec.pay_mm%>
<%= curlistRec.chrg_posk_cd%>
<%= curlistRec.chrg_posk_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.thrw_pgm%>
<%= curlistRec.thrw_pgm_nm%>
<%= curlistRec.cntr_dt%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.duty_dds%>
<%= curlistRec.pay_cycl%>
<%= curlistRec.pay_cycl_nm%>
<%= curlistRec.servcost%>
<%= curlistRec.duty_tms%>
<%= curlistRec.base_amt%>
<%= curlistRec.etc_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.incm_clsf_nm%>
<%= curlistRec.pay_amt%>
<%= curlistRec.incm_tax%>
<%= curlistRec.res_tax%>
<%= curlistRec.draft_no%>
<%= curlistRec.draft_dept_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.bank_cd%>
<%= curlistRec.acct_no%>
<%= curlistRec.remk%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.mang_no%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.tot_amt%>
<%= curlist1Rec.tmp_crdt_amt%>
<%= curlist1Rec.titl%>
<%= curlist1Rec.actu_slip_no%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_pers_ipadd%>
<%= curlist1Rec.proc_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 25 14:54:40 KST 2013 */