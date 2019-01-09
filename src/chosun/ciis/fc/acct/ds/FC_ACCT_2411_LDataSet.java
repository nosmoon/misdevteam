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


public class FC_ACCT_2411_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList curamt = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2411_LDataSet(){}
	public FC_ACCT_2411_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			FC_ACCT_2411_LCURLISTRecord rec = new FC_ACCT_2411_LCURLISTRecord();
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.boks_dlco_nm = Util.checkString(rset0.getString("boks_dlco_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.clam_dept_cd = Util.checkString(rset0.getString("clam_dept_cd"));
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.obj_acct_cd = Util.checkString(rset0.getString("obj_acct_cd"));
			rec.obj_amt = Util.checkString(rset0.getString("obj_amt"));
			rec.dtls_medi_cd = Util.checkString(rset0.getString("dtls_medi_cd"));
			rec.chnl_clsf_cd = Util.checkString(rset0.getString("chnl_clsf_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(24);
		while(rset1.next()){
			FC_ACCT_2411_LCURAMTRecord rec = new FC_ACCT_2411_LCURAMTRecord();
			rec.fajcbamt = Util.checkString(rset1.getString("fajcbamt"));
			rec.fajdbamt = Util.checkString(rset1.getString("fajdbamt"));
			rec.fdajcbamt = Util.checkString(rset1.getString("fdajcbamt"));
			rec.fdajdbamt = Util.checkString(rset1.getString("fdajdbamt"));
			rec.fcbjan = Util.checkString(rset1.getString("fcbjan"));
			rec.fdbjan = Util.checkString(rset1.getString("fdbjan"));
			rec.bal_clsf = Util.checkString(rset1.getString("bal_clsf"));
			this.curamt.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2411_LDataSet ds = (FC_ACCT_2411_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2411_LCURLISTRecord curlistRec = (FC_ACCT_2411_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curamt.size(); i++){
		FC_ACCT_2411_LCURAMTRecord curamtRec = (FC_ACCT_2411_LCURAMTRecord)ds.curamt.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCuramt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.rmks%>
<%= curlistRec.dr_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.insd_acct_cd%>
<%= curlistRec.obj_acct_cd%>
<%= curlistRec.obj_amt%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.chnl_clsf_cd%>
<%= curamtRec.fajcbamt%>
<%= curamtRec.fajdbamt%>
<%= curamtRec.fdajcbamt%>
<%= curamtRec.fdajdbamt%>
<%= curamtRec.fcbjan%>
<%= curamtRec.fdbjan%>
<%= curamtRec.bal_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 16 17:40:22 KST 2018 */