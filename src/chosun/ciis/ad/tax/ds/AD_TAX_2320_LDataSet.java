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


package chosun.ciis.ad.tax.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.rec.*;

/**
 * 
 */


public class AD_TAX_2320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{ 
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_TAX_2320_LDataSet(){}
	public AD_TAX_2320_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			AD_TAX_2320_LCURLISTRecord rec = new AD_TAX_2320_LCURLISTRecord();
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.acct_dlco_no = Util.checkString(rset0.getString("acct_dlco_no"));
			rec.acct_dlco_nm = Util.checkString(rset0.getString("acct_dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_2320_LDataSet ds = (AD_TAX_2320_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_2320_LCURLISTRecord curlistRec = (AD_TAX_2320_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.acct_dlco_no%>
<%= curlistRec.acct_dlco_nm%>
<%= curlistRec.ern%>
<%= curlistRec.fee%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 14 15:55:30 KST 2017 */