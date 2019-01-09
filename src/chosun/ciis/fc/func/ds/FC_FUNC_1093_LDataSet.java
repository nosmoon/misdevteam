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


public class FC_FUNC_1093_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1093_LDataSet(){}
	public FC_FUNC_1093_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1093_LCURLISTRecord rec = new FC_FUNC_1093_LCURLISTRecord();
			rec.a_nbn_no = Util.checkString(rset0.getString("a_nbn_no"));
			rec.a_note_clsf_cd = Util.checkString(rset0.getString("a_note_clsf_cd"));
			rec.a_note_amt = Util.checkString(rset0.getString("a_note_amt"));
			rec.a_comp_dt = Util.checkString(rset0.getString("a_comp_dt"));
			rec.a_mtry_dt = Util.checkString(rset0.getString("a_mtry_dt"));
			rec.a_issu_cmpy_clsf_cd = Util.checkString(rset0.getString("a_issu_cmpy_clsf_cd"));
			rec.a_issu_pers_nm = Util.checkString(rset0.getString("a_issu_pers_nm"));
			rec.a_bank_cd_nm = Util.checkString(rset0.getString("a_bank_cd_nm"));
			rec.a_note_no = Util.checkString(rset0.getString("a_note_no"));
			rec.a_note_seq = Util.checkString(rset0.getString("a_note_seq"));
			rec.a_bank_cd = Util.checkString(rset0.getString("a_bank_cd"));
			rec.a_rcpm_acct = Util.checkString(rset0.getString("a_rcpm_acct"));
			rec.a_sale_aprv_no = Util.checkString(rset0.getString("a_sale_aprv_no"));
			rec.a_note_clsf_cd2 = Util.checkString(rset0.getString("a_note_clsf_cd2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1093_LDataSet ds = (FC_FUNC_1093_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1093_LCURLISTRecord curlistRec = (FC_FUNC_1093_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.a_nbn_no%>
<%= curlistRec.a_note_clsf_cd%>
<%= curlistRec.a_note_amt%>
<%= curlistRec.a_comp_dt%>
<%= curlistRec.a_mtry_dt%>
<%= curlistRec.a_issu_cmpy_clsf_cd%>
<%= curlistRec.a_issu_pers_nm%>
<%= curlistRec.a_bank_cd_nm%>
<%= curlistRec.a_note_no%>
<%= curlistRec.a_note_seq%>
<%= curlistRec.a_bank_cd%>
<%= curlistRec.a_rcpm_acct%>
<%= curlistRec.a_sale_aprv_no%>
<%= curlistRec.a_note_clsf_cd2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 26 15:02:47 KST 2018 */