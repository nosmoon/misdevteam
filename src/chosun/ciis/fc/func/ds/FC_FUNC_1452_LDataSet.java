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


public class FC_FUNC_1452_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1452_LDataSet(){}
	public FC_FUNC_1452_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_1452_LCURLISTRecord rec = new FC_FUNC_1452_LCURLISTRecord();
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.note_ns = Util.checkString(rset0.getString("note_ns"));
			rec.note_clsf_cd_nm = Util.checkString(rset0.getString("note_clsf_cd_nm"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.bank_cd_nm = Util.checkString(rset0.getString("bank_cd_nm"));
			rec.jpno = Util.checkString(rset0.getString("jpno"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.jgjnm = Util.checkString(rset0.getString("jgjnm"));
			rec.now_note_stat_cd_nm = Util.checkString(rset0.getString("now_note_stat_cd_nm"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1452_LDataSet ds = (FC_FUNC_1452_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1452_LCURLISTRecord curlistRec = (FC_FUNC_1452_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.reg_dt%>
<%= curlistRec.note_ns%>
<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.note_amt%>
<%= curlistRec.bank_cd_nm%>
<%= curlistRec.jpno%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.compnm%>
<%= curlistRec.jgjnm%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.comp_dt%>
<%= curlistRec.note_no%>
<%= curlistRec.note_seq%>
<%= curlistRec.bank_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 14:51:02 KST 2009 */