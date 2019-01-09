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


package chosun.ciis.se.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_RCP_2210_LDataSet(){}
	public SE_RCP_2210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			SE_RCP_2210_LCURLISTRecord rec = new SE_RCP_2210_LCURLISTRecord();
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.cyov_bal = Util.checkString(rset0.getString("cyov_bal"));
			rec.net_sale_amt = Util.checkString(rset0.getString("net_sale_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.aigamt = Util.checkString(rset0.getString("aigamt"));
			rec.jamt = Util.checkString(rset0.getString("jamt"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.fpymt_dt = Util.checkString(rset0.getString("fpymt_dt"));
			rec.clos_amt = Util.checkString(rset0.getString("clos_amt"));
			rec.fpymt_encur_amt = Util.checkString(rset0.getString("fpymt_encur_amt"));
			rec.ajggiw = Util.checkString(rset0.getString("ajggiw"));
			rec.ajrgiw = Util.checkString(rset0.getString("ajrgiw"));
			rec.pdlv_altn_amt = Util.checkString(rset0.getString("pdlv_altn_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_RCP_2210_LDataSet ds = (SE_RCP_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_RCP_2210_LCURLISTRecord curlistRec = (SE_RCP_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.cyov_bal%>
<%= curlistRec.net_sale_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.aigamt%>
<%= curlistRec.jamt%>
<%= curlistRec.rcpm_rate%>
<%= curlistRec.fpymt_dt%>
<%= curlistRec.clos_amt%>
<%= curlistRec.fpymt_encur_amt%>
<%= curlistRec.ajggiw%>
<%= curlistRec.ajrgiw%>
<%= curlistRec.pdlv_altn_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 29 11:55:01 KST 2012 */