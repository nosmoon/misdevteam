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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_5103_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_5103_LDataSet(){}
	public MT_PAPINOUT_5103_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_5103_LCURLISTRecord rec = new MT_PAPINOUT_5103_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rcpm_nm = Util.checkString(rset0.getString("rcpm_nm"));
			rec.cnsm_frdt = Util.checkString(rset0.getString("cnsm_frdt"));
			rec.cnsm_todt = Util.checkString(rset0.getString("cnsm_todt"));
			rec.tax_stmt_dt = Util.checkString(rset0.getString("tax_stmt_dt"));
			rec.tax_stmt_seq = Util.checkString(rset0.getString("tax_stmt_seq"));
			rec.slip_proc_occr_dt = Util.checkString(rset0.getString("slip_proc_occr_dt"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_5103_LDataSet ds = (MT_PAPINOUT_5103_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_5103_LCURLISTRecord curlistRec = (MT_PAPINOUT_5103_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.bank_cd%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_nm%>
<%= curlistRec.cnsm_frdt%>
<%= curlistRec.cnsm_todt%>
<%= curlistRec.tax_stmt_dt%>
<%= curlistRec.tax_stmt_seq%>
<%= curlistRec.slip_proc_occr_dt%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 18 12:20:57 KST 2009 */