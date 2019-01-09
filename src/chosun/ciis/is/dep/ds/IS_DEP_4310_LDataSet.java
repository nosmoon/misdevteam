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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_4310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_4310_LDataSet(){}
	public IS_DEP_4310_LDataSet(String errcode, String errmsg){
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
			IS_DEP_4310_LCURLISTRecord rec = new IS_DEP_4310_LCURLISTRecord();
			rec.reg_yn = Util.checkString(rset0.getString("reg_yn"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.note_clsf_nm = Util.checkString(rset0.getString("note_clsf_nm"));
			rec.issu_cmpy_clsf_cd = Util.checkString(rset0.getString("issu_cmpy_clsf_cd"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.endorser_nm = Util.checkString(rset0.getString("endorser_nm"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.rcpm_acct = Util.checkString(rset0.getString("rcpm_acct"));
			rec.sale_aprv_no = Util.checkString(rset0.getString("sale_aprv_no"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_4310_LDataSet ds = (IS_DEP_4310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_4310_LCURLISTRecord curlistRec = (IS_DEP_4310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.reg_yn%>
<%= curlistRec.occr_dt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.occr_seq%>
<%= curlistRec.bank_nm%>
<%= curlistRec.note_clsf_nm%>
<%= curlistRec.issu_cmpy_clsf_cd%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.endorser_nm%>
<%= curlistRec.note_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.rcpm_acct%>
<%= curlistRec.sale_aprv_no%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.rcpm_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 16 19:49:37 KST 2012 */