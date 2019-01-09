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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2610_LDataSet(){}
	public IS_AGR_2610_LDataSet(String errcode, String errmsg){
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
			IS_AGR_2610_LCURLISTRecord rec = new IS_AGR_2610_LCURLISTRecord();
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.spc_sale_clsf = Util.checkString(rset0.getString("spc_sale_clsf"));
			rec.sale_clsf_nm = Util.checkString(rset0.getString("sale_clsf_nm"));
			rec.spc_sale_clsf_nm = Util.checkString(rset0.getString("spc_sale_clsf_nm"));
			rec.suply_amt_cur = Util.checkString(rset0.getString("suply_amt_cur"));
			rec.purc_amt_cur = Util.checkString(rset0.getString("purc_amt_cur"));
			rec.suply_amt_bef = Util.checkString(rset0.getString("suply_amt_bef"));
			rec.purc_amt_bef = Util.checkString(rset0.getString("purc_amt_bef"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2610_LDataSet ds = (IS_AGR_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2610_LCURLISTRecord curlistRec = (IS_AGR_2610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.t_no%>
<%= curlistRec.sale_clsf%>
<%= curlistRec.spc_sale_clsf%>
<%= curlistRec.sale_clsf_nm%>
<%= curlistRec.spc_sale_clsf_nm%>
<%= curlistRec.suply_amt_cur%>
<%= curlistRec.purc_amt_cur%>
<%= curlistRec.suply_amt_bef%>
<%= curlistRec.purc_amt_bef%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 11:54:14 KST 2012 */