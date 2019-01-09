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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8001_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8001_SDataSet(){}
	public FC_FUNC_8001_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_8001_SCURLIST1Record rec = new FC_FUNC_8001_SCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cntr_clsf_cd = Util.checkString(rset0.getString("cntr_clsf_cd"));
			rec.leas_clsf_cd = Util.checkString(rset0.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset0.getString("leas_no"));
			rec.leas_sub_seq = Util.checkString(rset0.getString("leas_sub_seq"));
			rec.leas_hire_clsf_cd = Util.checkString(rset0.getString("leas_hire_clsf_cd"));
			rec.leas_nm = Util.checkString(rset0.getString("leas_nm"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.libo_int_rate = Util.checkString(rset0.getString("libo_int_rate"));
			rec.dedu_int_rate = Util.checkString(rset0.getString("dedu_int_rate"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.re_leas_yn = Util.checkString(rset0.getString("re_leas_yn"));
			rec.frex_cd = Util.checkString(rset0.getString("frex_cd"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.pymt_cycl = Util.checkString(rset0.getString("pymt_cycl"));
			rec.pay_plan_tms = Util.checkString(rset0.getString("pay_plan_tms"));
			rec.libo_yn = Util.checkString(rset0.getString("libo_yn"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.loca = Util.checkString(rset0.getString("loca"));
			rec.fst_leas_clsf_cd = Util.checkString(rset0.getString("fst_leas_clsf_cd"));
			rec.fst_leas_no = Util.checkString(rset0.getString("fst_leas_no"));
			rec.int_calc_cd = Util.checkString(rset0.getString("int_calc_cd"));
			rec.good_curc = Util.checkString(rset0.getString("good_curc"));
			rec.good_amt = Util.checkString(rset0.getString("good_amt"));
			rec.end_aftr = Util.checkString(rset0.getString("end_aftr"));
			rec.leas_stat_cd = Util.checkString(rset0.getString("leas_stat_cd"));
			rec.leas_stat_nm = Util.checkString(rset0.getString("leas_stat_nm"));
			rec.end_dt = Util.checkString(rset0.getString("end_dt"));
			rec.prelae_pay_clsf_cd = Util.checkString(rset0.getString("prelae_pay_clsf_cd"));
			rec.basi_int = Util.checkString(rset0.getString("basi_int"));
			rec.leas_int_rate = Util.checkString(rset0.getString("leas_int_rate"));
			rec.prd_int_rate = Util.checkString(rset0.getString("prd_int_rate"));
			rec.tms_leas_amt = Util.checkString(rset0.getString("tms_leas_amt"));
			rec.tot_leas_fee = Util.checkString(rset0.getString("tot_leas_fee"));
			rec.decid_amt = Util.checkString(rset0.getString("decid_amt"));
			rec.prd_int = Util.checkString(rset0.getString("prd_int"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_FUNC_8001_SCURLIST2Record rec = new FC_FUNC_8001_SCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.leas_clsf_cd = Util.checkString(rset1.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset1.getString("leas_no"));
			rec.note_no = Util.checkString(rset1.getString("note_no"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.expt_widr_dt = Util.checkString(rset1.getString("expt_widr_dt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			FC_FUNC_8001_SCURLIST3Record rec = new FC_FUNC_8001_SCURLIST3Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.leas_clsf_cd = Util.checkString(rset2.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset2.getString("leas_no"));
			rec.loss_dt = Util.checkString(rset2.getString("loss_dt"));
			rec.expt_loss_amt = Util.checkString(rset2.getString("expt_loss_amt"));
			rec.fix_loss_amt = Util.checkString(rset2.getString("fix_loss_amt"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8001_SDataSet ds = (FC_FUNC_8001_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8001_SCURLIST1Record curlist1Rec = (FC_FUNC_8001_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_8001_SCURLIST2Record curlist2Rec = (FC_FUNC_8001_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		FC_FUNC_8001_SCURLIST3Record curlist3Rec = (FC_FUNC_8001_SCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.cntr_clsf_cd%>
<%= curlist1Rec.leas_clsf_cd%>
<%= curlist1Rec.leas_no%>
<%= curlist1Rec.leas_sub_seq%>
<%= curlist1Rec.leas_hire_clsf_cd%>
<%= curlist1Rec.leas_nm%>
<%= curlist1Rec.cntr_no%>
<%= curlist1Rec.frcr_amt%>
<%= curlist1Rec.won_amt%>
<%= curlist1Rec.libo_int_rate%>
<%= curlist1Rec.dedu_int_rate%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.use_dept_cd%>
<%= curlist1Rec.use_dept_nm%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.dtls_medi_cd%>
<%= curlist1Rec.re_leas_yn%>
<%= curlist1Rec.frex_cd%>
<%= curlist1Rec.exrate%>
<%= curlist1Rec.rmks%>
<%= curlist1Rec.pymt_cycl%>
<%= curlist1Rec.pay_plan_tms%>
<%= curlist1Rec.libo_yn%>
<%= curlist1Rec.usag%>
<%= curlist1Rec.loca%>
<%= curlist1Rec.fst_leas_clsf_cd%>
<%= curlist1Rec.fst_leas_no%>
<%= curlist1Rec.int_calc_cd%>
<%= curlist1Rec.good_curc%>
<%= curlist1Rec.good_amt%>
<%= curlist1Rec.end_aftr%>
<%= curlist1Rec.leas_stat_cd%>
<%= curlist1Rec.leas_stat_nm%>
<%= curlist1Rec.end_dt%>
<%= curlist1Rec.prelae_pay_clsf_cd%>
<%= curlist1Rec.basi_int%>
<%= curlist1Rec.leas_int_rate%>
<%= curlist1Rec.prd_int_rate%>
<%= curlist1Rec.tms_leas_amt%>
<%= curlist1Rec.tot_leas_fee%>
<%= curlist1Rec.decid_amt%>
<%= curlist1Rec.prd_int%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.leas_clsf_cd%>
<%= curlist2Rec.leas_no%>
<%= curlist2Rec.note_no%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.expt_widr_dt%>
<%= curlist3Rec.cmpy_cd%>
<%= curlist3Rec.leas_clsf_cd%>
<%= curlist3Rec.leas_no%>
<%= curlist3Rec.loss_dt%>
<%= curlist3Rec.expt_loss_amt%>
<%= curlist3Rec.fix_loss_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 13:06:50 KST 2009 */