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


public class FC_FUNC_4034_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_4034_LDataSet(){}
	public FC_FUNC_4034_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_4034_LCURLISTRecord rec = new FC_FUNC_4034_LCURLISTRecord();
			rec.mtry_dt = Util.checkString(rset1.getString("mtry_dt"));
			rec.pay_note_no = Util.checkString(rset1.getString("pay_note_no"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.comp_dt = Util.checkString(rset1.getString("comp_dt"));
			rec.yf_ysnm = Util.checkString(rset1.getString("yf_ysnm"));
			rec.hf_compnm = Util.checkString(rset1.getString("hf_compnm"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.rmks1 = Util.checkString(rset1.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset1.getString("rmks2"));
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset1.getString("dlco_cd"));
			rec.patr_budg_cd = Util.checkString(rset1.getString("patr_budg_cd"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset1.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset1.getString("slip_arow_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_4034_LDataSet ds = (FC_FUNC_4034_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_4034_LCURLISTRecord curlistRec = (FC_FUNC_4034_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.mtry_dt%>
<%= curlistRec.pay_note_no%>
<%= curlistRec.note_amt%>
<%= curlistRec.comp_dt%>
<%= curlistRec.yf_ysnm%>
<%= curlistRec.hf_compnm%>
<%= curlistRec.slip_no%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.patr_budg_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 11:40:41 KST 2009 */