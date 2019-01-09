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


public class FC_ACCT_5311_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_5311_LDataSet(){}
	public FC_ACCT_5311_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			FC_ACCT_5311_LCURLISTRecord rec = new FC_ACCT_5311_LCURLISTRecord();
			rec.fisc_dt = Util.checkString(rset2.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset2.getString("slip_no"));
			rec.acct_cd = Util.checkString(rset2.getString("acct_cd"));
			rec.acacctynm = Util.checkString(rset2.getString("acacctynm"));
			rec.budg_cd = Util.checkString(rset2.getString("budg_cd"));
			rec.ycyscdnm = Util.checkString(rset2.getString("ycyscdnm"));
			rec.dtls_medi_cd = Util.checkString(rset2.getString("dtls_medi_cd"));
			rec.dr_amt = Util.checkString(rset2.getString("dr_amt"));
			rec.rmks1 = Util.checkString(rset2.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset2.getString("rmks2"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset2.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			rec.clam_dept_cd = Util.checkString(rset2.getString("clam_dept_cd"));
			rec.use_dept_cd = Util.checkString(rset2.getString("use_dept_cd"));
			rec.boks_dlco_nm = Util.checkString(rset2.getString("boks_dlco_nm"));
			rec.slip_occr_dt = Util.checkString(rset2.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset2.getString("slip_seq"));
			rec.slip_sub_seq = Util.checkString(rset2.getString("slip_sub_seq"));
			rec.slip_arow_no = Util.checkString(rset2.getString("slip_arow_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_5311_LDataSet ds = (FC_ACCT_5311_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_5311_LCURLISTRecord curlistRec = (FC_ACCT_5311_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fisc_dt%>
<%= curlistRec.slip_no%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acacctynm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.ycyscdnm%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.dr_amt%>
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.clam_dept_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.boks_dlco_nm%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_sub_seq%>
<%= curlistRec.slip_arow_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 16:15:52 KST 2009 */