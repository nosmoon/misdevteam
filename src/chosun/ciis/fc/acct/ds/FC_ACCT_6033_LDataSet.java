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


public class FC_ACCT_6033_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6033_LDataSet(){}
	public FC_ACCT_6033_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			FC_ACCT_6033_LCURLISTRecord rec = new FC_ACCT_6033_LCURLISTRecord();
			rec.erplace_cd = Util.checkString(rset2.getString("erplace_cd"));
			rec.ernm = Util.checkString(rset2.getString("ernm"));
			rec.ern = Util.checkString(rset2.getString("ern"));
			rec.presi_nm = Util.checkString(rset2.getString("presi_nm"));
			rec.erplace_addr = Util.checkString(rset2.getString("erplace_addr"));
			rec.erplace_bizcond = Util.checkString(rset2.getString("erplace_bizcond"));
			rec.erplace_item = Util.checkString(rset2.getString("erplace_item"));
			rec.taxoff = Util.checkString(rset2.getString("taxoff"));
			rec.corp_reg_no = Util.checkString(rset2.getString("corp_reg_no"));
			rec.intg_dlco_cd = Util.checkString(rset2.getString("intg_dlco_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6033_LDataSet ds = (FC_ACCT_6033_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6033_LCURLISTRecord curlistRec = (FC_ACCT_6033_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.erplace_cd%>
<%= curlistRec.ernm%>
<%= curlistRec.ern%>
<%= curlistRec.presi_nm%>
<%= curlistRec.erplace_addr%>
<%= curlistRec.erplace_bizcond%>
<%= curlistRec.erplace_item%>
<%= curlistRec.taxoff%>
<%= curlistRec.corp_reg_no%>
<%= curlistRec.intg_dlco_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 10:39:44 KST 2009 */