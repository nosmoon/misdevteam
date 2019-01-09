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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2931_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2931_LDataSet(){}
	public FC_ACCT_2931_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_ACCT_2931_LCURLISTRecord rec = new FC_ACCT_2931_LCURLISTRecord();
			rec.chk = Util.checkString(rset1.getString("chk"));
			rec.aprv_slip_occr_dt = Util.checkString(rset1.getString("aprv_slip_occr_dt"));
			rec.aprv_slip_clsf = Util.checkString(rset1.getString("aprv_slip_clsf"));
			rec.aprv_slip_occr_seqo = Util.checkString(rset1.getString("aprv_slip_occr_seqo"));
			rec.aprv_slip_occr_sub_seq = Util.checkString(rset1.getString("aprv_slip_occr_sub_seq"));
			rec.pch_budg_cdnm = Util.checkString(rset1.getString("pch_budg_cdnm"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.pch_count = Util.checkString(rset1.getString("pch_count"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.rmtt_dwload_dt = Util.checkString(rset1.getString("rmtt_dwload_dt"));
			rec.aprv_slip_no = Util.checkString(rset1.getString("aprv_slip_no"));
			rec.dt_clsf = Util.checkString(rset1.getString("dt_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2931_LDataSet ds = (FC_ACCT_2931_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2931_LCURLISTRecord curlistRec = (FC_ACCT_2931_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk%>
<%= curlistRec.aprv_slip_occr_dt%>
<%= curlistRec.aprv_slip_clsf%>
<%= curlistRec.aprv_slip_occr_seqo%>
<%= curlistRec.aprv_slip_occr_sub_seq%>
<%= curlistRec.pch_budg_cdnm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.pch_count%>
<%= curlistRec.amt%>
<%= curlistRec.rmtt_dwload_dt%>
<%= curlistRec.aprv_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 13:50:37 KST 2009 */