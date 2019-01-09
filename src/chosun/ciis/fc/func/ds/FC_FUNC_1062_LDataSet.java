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


public class FC_FUNC_1062_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_1062_LDataSet(){}
	public FC_FUNC_1062_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_1062_LCURLISTRecord rec = new FC_FUNC_1062_LCURLISTRecord();
			rec.note_clsf_cd_nm = Util.checkString(rset0.getString("note_clsf_cd_nm"));
			rec.note_no = Util.checkString(rset0.getString("note_no"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.issu_pers_nm = Util.checkString(rset0.getString("issu_pers_nm"));
			rec.slipno = Util.checkString(rset0.getString("slipno"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.pch_compnm = Util.checkString(rset0.getString("pch_compnm"));
			rec.pay_plac_cd_nm = Util.checkString(rset0.getString("pay_plac_cd_nm"));
			rec.now_note_stat_cd_nm = Util.checkString(rset0.getString("now_note_stat_cd_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.pch_compnm2 = Util.checkString(rset0.getString("pch_compnm2"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.note_seq = Util.checkString(rset0.getString("note_seq"));
			rec.pay_plac_cd = Util.checkString(rset0.getString("pay_plac_cd"));
			rec.now_note_stat_cd = Util.checkString(rset0.getString("now_note_stat_cd"));
			rec.note_clsf_cd = Util.checkString(rset0.getString("note_clsf_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1062_LDataSet ds = (FC_FUNC_1062_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_1062_LCURLISTRecord curlistRec = (FC_FUNC_1062_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.note_amt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.issu_pers_nm%>
<%= curlistRec.slipno%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.pch_compnm%>
<%= curlistRec.pay_plac_cd_nm%>
<%= curlistRec.now_note_stat_cd_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.pch_compnm2%>
<%= curlistRec.bank_cd%>
<%= curlistRec.note_seq%>
<%= curlistRec.pay_plac_cd%>
<%= curlistRec.now_note_stat_cd%>
<%= curlistRec.note_clsf_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 14:54:59 KST 2009 */