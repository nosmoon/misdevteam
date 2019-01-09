/***************************************************************************************************
* 파일명 : .java
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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2400_LDataSet(){}
	public HD_AFFR_2400_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			HD_AFFR_2400_LCURLISTRecord rec = new HD_AFFR_2400_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.chk_dt = Util.checkString(rset0.getString("chk_dt"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.chk_obj_pers_rshp = Util.checkString(rset0.getString("chk_obj_pers_rshp"));
			rec.chk_pers_nm = Util.checkString(rset0.getString("chk_pers_nm"));
			rec.chk_hosp_nm = Util.checkString(rset0.getString("chk_hosp_nm"));
			rec.real_chk_fee = Util.checkString(rset0.getString("real_chk_fee"));
			rec.sply_chk_fee = Util.checkString(rset0.getString("sply_chk_fee"));
			rec.ocom_subm_yn = Util.checkString(rset0.getString("ocom_subm_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.pay_plac_clsf = Util.checkString(rset0.getString("pay_plac_clsf"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.self_prn = Util.checkString(rset0.getString("self_prn"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			HD_AFFR_2400_LCURLIST1Record rec = new HD_AFFR_2400_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.tmp_dr_amt = Util.checkString(rset1.getString("tmp_dr_amt"));
			rec.tmp_crdt_amt = Util.checkString(rset1.getString("tmp_crdt_amt"));
			rec.titl = Util.checkString(rset1.getString("titl"));
			rec.actu_slip_no = Util.checkString(rset1.getString("actu_slip_no"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.incmg_pers = Util.checkString(rset1.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset1.getString("incmg_pers_ipadd"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			rec.slip_proc_mang_dt = Util.checkString(rset1.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset1.getString("slip_proc_mang_seq"));
			rec.cmpy_welf_fund_clsf = Util.checkString(rset1.getString("cmpy_welf_fund_clsf"));
			rec.titl2 = Util.checkString(rset1.getString("titl2"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2400_LDataSet ds = (HD_AFFR_2400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2400_LCURLISTRecord curlistRec = (HD_AFFR_2400_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_2400_LCURLIST1Record curlist1Rec = (HD_AFFR_2400_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.chk_dt%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.prn%>
<%= curlistRec.chk_obj_pers_rshp%>
<%= curlistRec.chk_pers_nm%>
<%= curlistRec.chk_hosp_nm%>
<%= curlistRec.real_chk_fee%>
<%= curlistRec.sply_chk_fee%>
<%= curlistRec.ocom_subm_yn%>
<%= curlistRec.remk%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.pay_plac_clsf%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.self_prn%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.tmp_dr_amt%>
<%= curlist1Rec.tmp_crdt_amt%>
<%= curlist1Rec.titl%>
<%= curlist1Rec.actu_slip_no%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_pers_ipadd%>
<%= curlist1Rec.proc_stat%>
<%= curlist1Rec.slip_proc_mang_dt%>
<%= curlist1Rec.slip_proc_mang_seq%>
<%= curlist1Rec.cmpy_welf_fund_clsf%>
<%= curlist1Rec.titl2%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 28 16:53:28 KST 2012 */