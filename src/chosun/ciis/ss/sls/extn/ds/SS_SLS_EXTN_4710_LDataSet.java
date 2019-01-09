/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_4710_LDataSet(){}
	public SS_SLS_EXTN_4710_LDataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_4710_LCURCOMMLISTRecord rec = new SS_SLS_EXTN_4710_LCURCOMMLISTRecord();
			rec.dncomp = Util.checkString(rset0.getString("dncomp"));
			rec.dncompnm = Util.checkString(rset0.getString("dncompnm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.sum_amt = Util.checkString(rset0.getString("sum_amt"));
			rec.prx_amt = Util.checkString(rset0.getString("prx_amt"));
			rec.net_inc_amt = Util.checkString(rset0.getString("net_inc_amt"));
			rec.exp_slip_no = Util.checkString(rset0.getString("exp_slip_no"));
			rec.tax_no = Util.checkString(rset0.getString("tax_no"));
			rec.ask_dept_cd = Util.checkString(rset0.getString("ask_dept_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.trans_yn = Util.checkString(rset0.getString("trans_yn"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.exp_slip_clsf_cd = Util.checkString(rset0.getString("exp_slip_clsf_cd"));
			rec.exp_slip_occr_dt = Util.checkString(rset0.getString("exp_slip_occr_dt"));
			rec.exp_slip_seq = Util.checkString(rset0.getString("exp_slip_seq"));
			rec.aprv = Util.checkString(rset0.getString("aprv"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_4710_LDataSet ds = (SS_SLS_EXTN_4710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_EXTN_4710_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_EXTN_4710_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.dncomp%>
<%= curcommlistRec.dncompnm%>
<%= curcommlistRec.ern%>
<%= curcommlistRec.dlco_nm%>
<%= curcommlistRec.make_dt%>
<%= curcommlistRec.suply_amt%>
<%= curcommlistRec.vat_amt%>
<%= curcommlistRec.sum_amt%>
<%= curcommlistRec.prx_amt%>
<%= curcommlistRec.net_inc_amt%>
<%= curcommlistRec.exp_slip_no%>
<%= curcommlistRec.tax_no%>
<%= curcommlistRec.ask_dept_cd%>
<%= curcommlistRec.budg_cd%>
<%= curcommlistRec.budg_nm%>
<%= curcommlistRec.prof_type_cd%>
<%= curcommlistRec.trans_yn%>
<%= curcommlistRec.email%>
<%= curcommlistRec.semuro_no%>
<%= curcommlistRec.rcpm_amt%>
<%= curcommlistRec.misu_amt%>
<%= curcommlistRec.slip_clsf_cd%>
<%= curcommlistRec.slip_occr_dt%>
<%= curcommlistRec.slip_seq%>
<%= curcommlistRec.exp_slip_clsf_cd%>
<%= curcommlistRec.exp_slip_occr_dt%>
<%= curcommlistRec.exp_slip_seq%>
<%= curcommlistRec.aprv%>
<%= curcommlistRec.boks_dlco_nm%>
<%= curcommlistRec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 23 17:01:46 KST 2016 */