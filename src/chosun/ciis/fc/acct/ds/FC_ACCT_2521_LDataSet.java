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


public class FC_ACCT_2521_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2521_LDataSet(){}
	public FC_ACCT_2521_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_2521_LCURLISTRecord rec = new FC_ACCT_2521_LCURLISTRecord();
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.rmks2 = Util.checkString(rset0.getString("rmks2"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dr_amt = Util.checkString(rset0.getString("dr_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.crdt_amt = Util.checkString(rset0.getString("crdt_amt"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.mang_clsf_cd = Util.checkString(rset0.getString("mang_clsf_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.insd_acct_cd1 = Util.checkString(rset0.getString("insd_acct_cd1"));
			rec.obj_acct_cd = Util.checkString(rset0.getString("obj_acct_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2521_LDataSet ds = (FC_ACCT_2521_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2521_LCURLISTRecord curlistRec = (FC_ACCT_2521_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.rmks1%>
<%= curlistRec.rmks2%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dr_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.crdt_amt%>
<%= curlistRec.unit%>
<%= curlistRec.qunt%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.mang_clsf_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.insd_acct_cd%>
<%= curlistRec.insd_acct_cd1%>
<%= curlistRec.obj_acct_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 15:38:11 KST 2009 */