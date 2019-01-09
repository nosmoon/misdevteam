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


public class HD_SALY_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1410_LDataSet(){}
	public HD_SALY_1410_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1410_LCURLISTRecord rec = new HD_SALY_1410_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_cnt = Util.checkString(rset0.getString("emp_cnt"));
			rec.mm_pay_amt = Util.checkString(rset0.getString("mm_pay_amt"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.rgla_saly = Util.checkString(rset0.getString("rgla_saly"));
			rec.week_hody_base_alon = Util.checkString(rset0.getString("week_hody_base_alon"));
			rec.week_hody_cmpn_alon = Util.checkString(rset0.getString("week_hody_cmpn_alon"));
			rec.lgl_hody_base_alon = Util.checkString(rset0.getString("lgl_hody_base_alon"));
			rec.lgl_hody_cmpn_alon = Util.checkString(rset0.getString("lgl_hody_cmpn_alon"));
			rec.nissu_dd_alon = Util.checkString(rset0.getString("nissu_dd_alon"));
			rec.nissu_dd_base_alon = Util.checkString(rset0.getString("nissu_dd_base_alon"));
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
	HD_SALY_1410_LDataSet ds = (HD_SALY_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1410_LCURLISTRecord curlistRec = (HD_SALY_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_cnt%>
<%= curlistRec.mm_pay_amt%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
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


/* 작성시간 : Fri May 01 10:23:15 KST 2009 */