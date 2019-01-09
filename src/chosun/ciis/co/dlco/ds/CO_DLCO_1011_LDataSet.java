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


package chosun.ciis.co.dlco.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_DLCO_1011_LDataSet(){}
	public CO_DLCO_1011_LDataSet(String errcode, String errmsg){
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
			CO_DLCO_1011_LCURLISTRecord rec = new CO_DLCO_1011_LCURLISTRecord();
			rec.acct_stat = Util.checkString(rset0.getString("acct_stat"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.setl_bank = Util.checkString(rset0.getString("setl_bank"));
			rec.setl_bank_nm = Util.checkString(rset0.getString("setl_bank_nm"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.rcpm_main_nm = Util.checkString(rset0.getString("rcpm_main_nm"));
			rec.lst_use_dt = Util.checkString(rset0.getString("lst_use_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_DLCO_1011_LDataSet ds = (CO_DLCO_1011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_DLCO_1011_LCURLISTRecord curlistRec = (CO_DLCO_1011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_stat%>
<%= curlistRec.dlco_no%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_abrv_nm%>
<%= curlistRec.setl_bank%>
<%= curlistRec.setl_bank_nm%>
<%= curlistRec.acct_no%>
<%= curlistRec.rcpm_main_nm%>
<%= curlistRec.lst_use_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 15 15:42:42 KST 2013 */