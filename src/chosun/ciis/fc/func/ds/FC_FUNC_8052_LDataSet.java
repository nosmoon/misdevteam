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


public class FC_FUNC_8052_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8052_LDataSet(){}
	public FC_FUNC_8052_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_8052_LCURLIST1Record rec = new FC_FUNC_8052_LCURLIST1Record();
			rec.comp_dt1 = Util.checkString(rset0.getString("comp_dt1"));
			rec.mtry_dt1 = Util.checkString(rset0.getString("mtry_dt1"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.insr_nm = Util.checkString(rset0.getString("insr_nm"));
			rec.insr_amt = Util.checkString(rset0.getString("insr_amt"));
			rec.insr_rate = Util.checkString(rset0.getString("insr_rate"));
			rec.frex_cd = Util.checkString(rset0.getString("frex_cd"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.won_amt1 = Util.checkString(rset0.getString("won_amt1"));
			rec.comp_dt2 = Util.checkString(rset0.getString("comp_dt2"));
			rec.mtry_dt2 = Util.checkString(rset0.getString("mtry_dt2"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.mcnm = Util.checkString(rset0.getString("mcnm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.buseonm = Util.checkString(rset0.getString("buseonm"));
			rec.pymt_rmks = Util.checkString(rset0.getString("pymt_rmks"));
			rec.jpno = Util.checkString(rset0.getString("jpno"));
			rec.insr_stat_cdnm = Util.checkString(rset0.getString("insr_stat_cdnm"));
			rec.pymt_dt = Util.checkString(rset0.getString("pymt_dt"));
			rec.leas_nm = Util.checkString(rset0.getString("leas_nm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.pymt_slip_occr_dt = Util.checkString(rset0.getString("pymt_slip_occr_dt"));
			rec.pymt_slip_clsf_cd = Util.checkString(rset0.getString("pymt_slip_clsf_cd"));
			rec.pymt_slip_seq = Util.checkString(rset0.getString("pymt_slip_seq"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8052_LDataSet ds = (FC_FUNC_8052_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8052_LCURLIST1Record curlist1Rec = (FC_FUNC_8052_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.comp_dt1%>
<%= curlist1Rec.mtry_dt1%>
<%= curlist1Rec.won_amt%>
<%= curlist1Rec.insr_nm%>
<%= curlist1Rec.insr_amt%>
<%= curlist1Rec.insr_rate%>
<%= curlist1Rec.frex_cd%>
<%= curlist1Rec.exrate%>
<%= curlist1Rec.frcr_amt%>
<%= curlist1Rec.won_amt1%>
<%= curlist1Rec.comp_dt2%>
<%= curlist1Rec.mtry_dt2%>
<%= curlist1Rec.dlco_clsf_cd%>
<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.compnm%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.mcnm%>
<%= curlist1Rec.dtls_medi_cd%>
<%= curlist1Rec.use_dept_cd%>
<%= curlist1Rec.buseonm%>
<%= curlist1Rec.pymt_rmks%>
<%= curlist1Rec.jpno%>
<%= curlist1Rec.insr_stat_cdnm%>
<%= curlist1Rec.pymt_dt%>
<%= curlist1Rec.leas_nm%>
<%= curlist1Rec.comp_dt%>
<%= curlist1Rec.mtry_dt%>
<%= curlist1Rec.pymt_slip_occr_dt%>
<%= curlist1Rec.pymt_slip_clsf_cd%>
<%= curlist1Rec.pymt_slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 20:18:51 KST 2009 */