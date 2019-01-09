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


public class HD_SALY_5002_2006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_5002_2006_LDataSet(){}
	public HD_SALY_5002_2006_LDataSet(String errcode, String errmsg){
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
			HD_SALY_5002_2006_LCURLISTRecord rec = new HD_SALY_5002_2006_LCURLISTRecord();
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.shft_bank_nm = Util.checkString(rset0.getString("shft_bank_nm"));
			rec.shft_acct_no = Util.checkString(rset0.getString("shft_acct_no"));
			rec.saly_pay_dt = Util.checkString(rset0.getString("saly_pay_dt"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.evngt_saly = Util.checkString(rset0.getString("evngt_saly"));
			rec.supl_saly = Util.checkString(rset0.getString("supl_saly"));
			rec.trff_alon = Util.checkString(rset0.getString("trff_alon"));
			rec.treat_add_amt = Util.checkString(rset0.getString("treat_add_amt"));
			rec.month_amt = Util.checkString(rset0.getString("month_amt"));
			rec.year_amt = Util.checkString(rset0.getString("year_amt"));
			rec.week_hody_base_alon = Util.checkString(rset0.getString("week_hody_base_alon"));
			rec.week_hody_cmpn_alon = Util.checkString(rset0.getString("week_hody_cmpn_alon"));
			rec.lgl_hody_alon = Util.checkString(rset0.getString("lgl_hody_alon"));
			rec.nissu_dd_alon = Util.checkString(rset0.getString("nissu_dd_alon"));
			rec.vgl_fee = Util.checkString(rset0.getString("vgl_fee"));
			rec.ovt_alon = Util.checkString(rset0.getString("ovt_alon"));
			rec.corr_base_stay_fee = Util.checkString(rset0.getString("corr_base_stay_fee"));
			rec.prvmm_mstk_saly = Util.checkString(rset0.getString("prvmm_mstk_saly"));
			rec.prvmm_mstk_dduc = Util.checkString(rset0.getString("prvmm_mstk_dduc"));
			rec.yymm_alon = Util.checkString(rset0.getString("yymm_alon"));
			rec.retr_saly = Util.checkString(rset0.getString("retr_saly"));
			rec.tot_pay_saly = Util.checkString(rset0.getString("tot_pay_saly"));
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.np_slf_ctrb_amt = Util.checkString(rset0.getString("np_slf_ctrb_amt"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.jnl_lon = Util.checkString(rset0.getString("jnl_lon"));
			rec.welf_lon = Util.checkString(rset0.getString("welf_lon"));
			rec.vgl_fee_tm = Util.checkString(rset0.getString("vgl_fee_tm"));
			rec.ovt_alon_tm = Util.checkString(rset0.getString("ovt_alon_tm"));
			rec.corr_base_stay_fee_tm = Util.checkString(rset0.getString("corr_base_stay_fee_tm"));
			rec.paty_crc_dduc_amt = Util.checkString(rset0.getString("paty_crc_dduc_amt"));
			rec.fitness_amt = Util.checkString(rset0.getString("fitness_amt"));
			rec.labor_dduc_amt = Util.checkString(rset0.getString("labor_dduc_amt"));
			rec.park_fee_dduc = Util.checkString(rset0.getString("park_fee_dduc"));
			rec.adv_dduc = Util.checkString(rset0.getString("adv_dduc"));
			rec.seiz_dduc_amt = Util.checkString(rset0.getString("seiz_dduc_amt"));
			rec.etc_dduc_amt = Util.checkString(rset0.getString("etc_dduc_amt"));
			rec.adjm_dedu_incm_tax = Util.checkString(rset0.getString("adjm_dedu_incm_tax"));
			rec.adjm_dedu_res_tax = Util.checkString(rset0.getString("adjm_dedu_res_tax"));
			rec.adjm_dedu_farm_spc_tax = Util.checkString(rset0.getString("adjm_dedu_farm_spc_tax"));
			rec.saly_dduc_stot = Util.checkString(rset0.getString("saly_dduc_stot"));
			rec.cal_pay_amt = Util.checkString(rset0.getString("cal_pay_amt"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.etcsaly_spc = Util.checkString(rset0.getString("etcsaly_spc"));
			rec.prsn_pens_dduc = Util.checkString(rset0.getString("prsn_pens_dduc"));
			rec.etc_dduc_remk = Util.checkString(rset0.getString("etc_dduc_remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_5002_2006_LDataSet ds = (HD_SALY_5002_2006_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_5002_2006_LCURLISTRecord curlistRec = (HD_SALY_5002_2006_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.flnm%>
<%= curlistRec.emp_no%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.shft_bank_nm%>
<%= curlistRec.shft_acct_no%>
<%= curlistRec.saly_pay_dt%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.evngt_saly%>
<%= curlistRec.supl_saly%>
<%= curlistRec.trff_alon%>
<%= curlistRec.treat_add_amt%>
<%= curlistRec.month_amt%>
<%= curlistRec.year_amt%>
<%= curlistRec.week_hody_base_alon%>
<%= curlistRec.week_hody_cmpn_alon%>
<%= curlistRec.lgl_hody_alon%>
<%= curlistRec.nissu_dd_alon%>
<%= curlistRec.vgl_fee%>
<%= curlistRec.ovt_alon%>
<%= curlistRec.corr_base_stay_fee%>
<%= curlistRec.prvmm_mstk_saly%>
<%= curlistRec.prvmm_mstk_dduc%>
<%= curlistRec.yymm_alon%>
<%= curlistRec.retr_saly%>
<%= curlistRec.tot_pay_saly%>
<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.np_slf_ctrb_amt%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.jnl_lon%>
<%= curlistRec.welf_lon%>
<%= curlistRec.vgl_fee_tm%>
<%= curlistRec.ovt_alon_tm%>
<%= curlistRec.corr_base_stay_fee_tm%>
<%= curlistRec.paty_crc_dduc_amt%>
<%= curlistRec.fitness_amt%>
<%= curlistRec.labor_dduc_amt%>
<%= curlistRec.park_fee_dduc%>
<%= curlistRec.adv_dduc%>
<%= curlistRec.seiz_dduc_amt%>
<%= curlistRec.etc_dduc_amt%>
<%= curlistRec.adjm_dedu_incm_tax%>
<%= curlistRec.adjm_dedu_res_tax%>
<%= curlistRec.adjm_dedu_farm_spc_tax%>
<%= curlistRec.saly_dduc_stot%>
<%= curlistRec.cal_pay_amt%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.etcsaly_spc%>
<%= curlistRec.prsn_pens_dduc%>
<%= curlistRec.etc_dduc_remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 08 18:05:19 KST 2013 */