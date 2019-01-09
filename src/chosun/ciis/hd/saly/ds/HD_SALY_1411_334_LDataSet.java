/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
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


public class HD_SALY_1411_334_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1411_334_LDataSet(){}
	public HD_SALY_1411_334_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_SALY_1411_334_LCURLISTRecord rec = new HD_SALY_1411_334_LCURLISTRecord();
			rec.up_dept_cd = Util.checkString(rset0.getString("up_dept_cd"));
			rec.up_dept_nm = Util.checkString(rset0.getString("up_dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.mm_pay_amt = Util.checkString(rset0.getString("mm_pay_amt"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.evngt_saly = Util.checkString(rset0.getString("evngt_saly"));
			rec.non_tax_food_alon = Util.checkString(rset0.getString("non_tax_food_alon"));
			rec.non_tax_jrnst = Util.checkString(rset0.getString("non_tax_jrnst"));
			rec.non_tax_auto_driv_alon = Util.checkString(rset0.getString("non_tax_auto_driv_alon"));
			rec.rgla_saly = Util.checkString(rset0.getString("rgla_saly"));
			rec.week_hody_base_alon = Util.checkString(rset0.getString("week_hody_base_alon"));
			rec.week_hody_cmpn_alon = Util.checkString(rset0.getString("week_hody_cmpn_alon"));
			rec.lgl_hody_base_alon = Util.checkString(rset0.getString("lgl_hody_base_alon"));
			rec.lgl_hody_cmpn_alon = Util.checkString(rset0.getString("lgl_hody_cmpn_alon"));
			rec.nissu_dd_alon = Util.checkString(rset0.getString("nissu_dd_alon"));
			rec.vgl_fee = Util.checkString(rset0.getString("vgl_fee"));
			rec.erl_prsnt_alon = Util.checkString(rset0.getString("erl_prsnt_alon"));
			rec.prvmm_mstk_alon = Util.checkString(rset0.getString("prvmm_mstk_alon"));
			rec.etc_duty_alon = Util.checkString(rset0.getString("etc_duty_alon"));
			rec.non_regu_alon_stot = Util.checkString(rset0.getString("non_regu_alon_stot"));
			rec.prvmm_mstk_saly = Util.checkString(rset0.getString("prvmm_mstk_saly"));
			rec.retr_saly = Util.checkString(rset0.getString("retr_saly"));
			rec.corr_base_stay_fee = Util.checkString(rset0.getString("corr_base_stay_fee"));
			rec.tot_pay_amt = Util.checkString(rset0.getString("tot_pay_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1411_334_LDataSet ds = (HD_SALY_1411_334_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1411_334_LCURLISTRecord curlistRec = (HD_SALY_1411_334_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.up_dept_cd%>
<%= curlistRec.up_dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.mm_pay_amt%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.evngt_saly%>
<%= curlistRec.non_tax_food_alon%>
<%= curlistRec.non_tax_jrnst%>
<%= curlistRec.non_tax_auto_driv_alon%>
<%= curlistRec.rgla_saly%>
<%= curlistRec.week_hody_base_alon%>
<%= curlistRec.week_hody_cmpn_alon%>
<%= curlistRec.lgl_hody_base_alon%>
<%= curlistRec.lgl_hody_cmpn_alon%>
<%= curlistRec.nissu_dd_alon%>
<%= curlistRec.vgl_fee%>
<%= curlistRec.erl_prsnt_alon%>
<%= curlistRec.prvmm_mstk_alon%>
<%= curlistRec.etc_duty_alon%>
<%= curlistRec.non_regu_alon_stot%>
<%= curlistRec.prvmm_mstk_saly%>
<%= curlistRec.retr_saly%>
<%= curlistRec.corr_base_stay_fee%>
<%= curlistRec.tot_pay_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 15:55:25 KST 2015 */