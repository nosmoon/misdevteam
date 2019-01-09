/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사-급여관리-총보상 생성 및 조회(TV조선용)
* 작성일자 : 2014-10-15
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */
 

public class HD_SALY_1700_500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1700_500_LDataSet(){}
	public HD_SALY_1700_500_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1700_500_LCURLISTRecord rec = new HD_SALY_1700_500_LCURLISTRecord();
			rec.saly_yy = Util.checkString(rset0.getString("saly_yy"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.mm_saly = Util.checkString(rset0.getString("mm_saly"));
			rec.rslt_pay = Util.checkString(rset0.getString("rslt_pay"));
			rec.year_alon = Util.checkString(rset0.getString("year_alon"));
			rec.hody_alon = Util.checkString(rset0.getString("hody_alon"));
			rec.vgl_fee = Util.checkString(rset0.getString("vgl_fee"));
			rec.dd_subj_sel_fee = Util.checkString(rset0.getString("dd_subj_sel_fee"));
			rec.cnfr_fee = Util.checkString(rset0.getString("cnfr_fee"));
			rec.real_subj_sel_fee = Util.checkString(rset0.getString("real_subj_sel_fee"));
			rec.erl_prsnt_alon = Util.checkString(rset0.getString("erl_prsnt_alon"));
			rec.dspch_dd_fee = Util.checkString(rset0.getString("dspch_dd_fee"));
			rec.cmpy_burd_np_amt = Util.checkString(rset0.getString("cmpy_burd_np_amt"));
			rec.cmpy_burd_hlth_insr_fee = Util.checkString(rset0.getString("cmpy_burd_hlth_insr_fee"));
			rec.cmpy_burd_emp_insr_fee = Util.checkString(rset0.getString("cmpy_burd_emp_insr_fee"));
			rec.cmpy_burd_dist_insr_fee = Util.checkString(rset0.getString("cmpy_burd_dist_insr_fee"));
			rec.corp_card_use_amt = Util.checkString(rset0.getString("corp_card_use_amt"));
			rec.subj_sel_oli_deal_amt = Util.checkString(rset0.getString("subj_sel_oli_deal_amt"));
			rec.make_proc_deal_amt = Util.checkString(rset0.getString("make_proc_deal_amt"));			
			rec.olcard_use_amt = Util.checkString(rset0.getString("olcard_use_amt"));
			rec.hlth_chk_sply_amt = Util.checkString(rset0.getString("hlth_chk_sply_amt"));
			rec.hospz_med_exam_fee = Util.checkString(rset0.getString("hospz_med_exam_fee"));
			rec.child_scl_exps = Util.checkString(rset0.getString("child_scl_exps"));
			rec.congr_condl_fee = Util.checkString(rset0.getString("congr_condl_fee"));
			rec.paty_insr_fee = Util.checkString(rset0.getString("paty_insr_fee"));
			rec.condo_use_cmpy_sply_amt = Util.checkString(rset0.getString("condo_use_cmpy_sply_amt"));
			rec.posk_edu_fee = Util.checkString(rset0.getString("posk_edu_fee"));
			rec.sclgg_course_edu_fee = Util.checkString(rset0.getString("sclgg_course_edu_fee"));
			rec.cmpy_sply_stdy_fee = Util.checkString(rset0.getString("cmpy_sply_stdy_fee"));
			rec.etc_alon_prize_amt = Util.checkString(rset0.getString("etc_alon_prize_amt"));
			rec.etc_alon_show_amt = Util.checkString(rset0.getString("etc_alon_show_amt"));
			rec.etc_bns_amt = Util.checkString(rset0.getString("etc_bns_amt"));
			rec.etc_evlu_amt = Util.checkString(rset0.getString("etc_evlu_amt"));
			rec.etc_etc_amt = Util.checkString(rset0.getString("etc_etc_amt"));
			rec.etc_spos_hlth_amt = Util.checkString(rset0.getString("etc_spos_hlth_amt"));
			rec.etc_ptph_amt = Util.checkString(rset0.getString("etc_ptph_amt"));
			rec.etc_med_exam_amt = Util.checkString(rset0.getString("etc_med_exam_amt"));
			rec.etc_child_birth_amt = Util.checkString(rset0.getString("etc_child_birth_amt"));
			rec.etc_scl_exps_amt = Util.checkString(rset0.getString("etc_scl_exps_amt"));
			rec.etc_drvr_trff_amt = Util.checkString(rset0.getString("etc_drvr_trff_amt"));
			rec.etc_cast_amt = Util.checkString(rset0.getString("etc_cast_amt"));
			rec.etc_edu_amt = Util.checkString(rset0.getString("etc_edu_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1700_500_LDataSet ds = (HD_SALY_1700_500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1700_500_LCURLISTRecord curlistRec = (HD_SALY_1700_500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.saly_yy%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.mm_saly%>
<%= curlistRec.rslt_pay%>
<%= curlistRec.year_alon%>
<%= curlistRec.hody_alon%>
<%= curlistRec.vgl_fee%>
<%= curlistRec.dd_subj_sel_fee%>
<%= curlistRec.cnfr_fee%>
<%= curlistRec.real_subj_sel_fee%>
<%= curlistRec.erl_prsnt_alon%>
<%= curlistRec.dspch_dd_fee%>
<%= curlistRec.cmpy_burd_np_amt%>
<%= curlistRec.cmpy_burd_hlth_insr_fee%>
<%= curlistRec.cmpy_burd_emp_insr_fee%>
<%= curlistRec.cmpy_burd_dist_insr_fee%>
<%= curlistRec.corp_card_use_amt%>
<%= curlistRec.olcard_use_amt%>
<%= curlistRec.hlth_chk_sply_amt%>
<%= curlistRec.hospz_med_exam_fee%>
<%= curlistRec.child_scl_exps%>
<%= curlistRec.congr_condl_fee%>
<%= curlistRec.paty_insr_fee%>
<%= curlistRec.condo_use_cmpy_sply_amt%>
<%= curlistRec.posk_edu_fee%>
<%= curlistRec.sclgg_course_edu_fee%>
<%= curlistRec.cmpy_sply_stdy_fee%>
<%= curlistRec.etc_alon_prize_amt%>
<%= curlistRec.etc_alon_show_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 15 17:43:14 KST 2014 */