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


public class FC_FUNC_5001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_5001_LDataSet(){}
	public FC_FUNC_5001_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_5001_LCURLISTRecord rec = new FC_FUNC_5001_LCURLISTRecord();
			rec.insr_nm = Util.checkString(rset0.getString("insr_nm"));
			rec.insr_amt = Util.checkString(rset0.getString("insr_amt"));
			rec.insr_rate = Util.checkString(rset0.getString("insr_rate"));
			rec.frex_cd = Util.checkString(rset0.getString("frex_cd"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.won_amt = Util.checkString(rset0.getString("won_amt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nnm = Util.checkString(rset0.getString("medi_nnm"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.pymt_rmks = Util.checkString(rset0.getString("pymt_rmks"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.stat_nm = Util.checkString(rset0.getString("stat_nm"));
			rec.fisc_aprv_stat = Util.checkString(rset0.getString("fisc_aprv_stat"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_5001_LDataSet ds = (FC_FUNC_5001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_5001_LCURLISTRecord curlistRec = (FC_FUNC_5001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.insr_nm%>
<%= curlistRec.insr_amt%>
<%= curlistRec.insr_rate%>
<%= curlistRec.frex_cd%>
<%= curlistRec.exrate%>
<%= curlistRec.frcr_amt%>
<%= curlistRec.won_amt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nnm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.pymt_rmks%>
<%= curlistRec.slip_no%>
<%= curlistRec.stat_nm%>
<%= curlistRec.fisc_aprv_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 17:51:11 KST 2009 */