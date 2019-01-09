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


public class FC_FUNC_1051_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1051_LDataSet(){}
	public FC_FUNC_1051_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_FUNC_1051_LCURLISTRecord rec = new FC_FUNC_1051_LCURLISTRecord();
			rec.note_clsf_cd_nm = Util.checkString(rset0.getString("note_clsf_cd_nm"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.frex_amt = Util.checkString(rset0.getString("frex_amt"));
			rec.note_amt2 = Util.checkString(rset0.getString("note_amt2"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.eeik_amt = Util.checkString(rset0.getString("eeik_amt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			rec.note_clehous_cd_nm = Util.checkString(rset0.getString("note_clehous_cd_nm"));
			rec.now_note_stat_cd_nm = Util.checkString(rset0.getString("now_note_stat_cd_nm"));
			rec.compnm2 = Util.checkString(rset0.getString("compnm2"));
			rec.comp_dt = Util.checkString(rset0.getString("comp_dt"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			rec.note_clehous_cd = Util.checkString(rset0.getString("note_clehous_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_clsf_cd1 = Util.checkString(rset0.getString("dlco_clsf_cd1"));
			rec.dlco_cd1 = Util.checkString(rset0.getString("dlco_cd1"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1051_LDataSet ds = (FC_FUNC_1051_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1051_LCURLISTRecord curlistRec = (FC_FUNC_1051_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.note_clsf_cd_nm%>
<%= curlistRec.note_no%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.note_amt%>
<%= curlistRec.frex_amt%>
<%= curlistRec.note_amt2%>
<%= curlistRec.coms%>
<%= curlistRec.eeik_amt%>
<%= curlistRec.slip_no%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.compnm%>
<%= curlistRec.note_clehous_cd_nm%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.compnm2%>
<%= curlistRec.comp_dt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.note_clsf_cd%>
<%= curlistRec.note_clehous_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_clsf_cd1%>
<%= curlistRec.dlco_cd1%>
<%= curlistRec.note_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 17 20:41:31 KST 2009 */