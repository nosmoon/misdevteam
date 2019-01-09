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


public class FC_FUNC_3061_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_3061_LDataSet(){}
	public FC_FUNC_3061_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_3061_LCURLISTRecord rec = new FC_FUNC_3061_LCURLISTRecord();
			rec.rcpm_dd = Util.checkString(rset0.getString("rcpm_dd"));
			rec.newspap_cash = Util.checkString(rset0.getString("newspap_cash"));
			rec.newspap_bill_90 = Util.checkString(rset0.getString("newspap_bill_90"));
			rec.newspap_bill_120 = Util.checkString(rset0.getString("newspap_bill_120"));
			rec.newspap_bill_125 = Util.checkString(rset0.getString("newspap_bill_125"));
			rec.publis_cash = Util.checkString(rset0.getString("publis_cash"));
			rec.publis_bill_90 = Util.checkString(rset0.getString("publis_bill_90"));
			rec.publis_bill_120 = Util.checkString(rset0.getString("publis_bill_120"));
			rec.publis_bill_125 = Util.checkString(rset0.getString("publis_bill_125"));
			rec.newspap_sale = Util.checkString(rset0.getString("newspap_sale"));
			rec.publis_sale = Util.checkString(rset0.getString("publis_sale"));
			rec.lent_amt = Util.checkString(rset0.getString("lent_amt"));
			rec.etc_amt = Util.checkString(rset0.getString("etc_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_3061_LDataSet ds = (FC_FUNC_3061_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_3061_LCURLISTRecord curlistRec = (FC_FUNC_3061_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rcpm_dd%>
<%= curlistRec.newspap_cash%>
<%= curlistRec.newspap_bill_90%>
<%= curlistRec.newspap_bill_120%>
<%= curlistRec.newspap_bill_125%>
<%= curlistRec.publis_cash%>
<%= curlistRec.publis_bill_90%>
<%= curlistRec.publis_bill_120%>
<%= curlistRec.publis_bill_125%>
<%= curlistRec.newspap_sale%>
<%= curlistRec.publis_sale%>
<%= curlistRec.lent_amt%>
<%= curlistRec.etc_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 16:32:04 KST 2009 */