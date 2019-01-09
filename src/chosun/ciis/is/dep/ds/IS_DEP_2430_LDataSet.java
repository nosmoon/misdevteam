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


public class IS_DEP_2430_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_2430_LDataSet(){}
	public IS_DEP_2430_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_DEP_2430_LCURLISTRecord rec = new IS_DEP_2430_LCURLISTRecord();
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.rcpm_slip_clsf_cd = Util.checkString(rset0.getString("rcpm_slip_clsf_cd"));
			rec.rcpm_seq = Util.checkString(rset0.getString("rcpm_seq"));
			rec.rcpm_sub_seq = Util.checkString(rset0.getString("rcpm_sub_seq"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.now_note_stat_nm = Util.checkString(rset0.getString("now_note_stat_nm"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_2430_LDataSet ds = (IS_DEP_2430_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_2430_LCURLISTRecord curlistRec = (IS_DEP_2430_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_dt%>
<%= curlistRec.rcpm_slip_clsf_cd%>
<%= curlistRec.rcpm_seq%>
<%= curlistRec.rcpm_sub_seq%>
<%= curlistRec.bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.now_note_stat_nm%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_amt%>
<%= curlistRec.issu_pers_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 22 13:57:49 KST 2012 */