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


public class IS_AGR_1940_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_1940_LDataSet(){}
	public IS_AGR_1940_LDataSet(String errcode, String errmsg){
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
			IS_AGR_1940_LCURLISTRecord rec = new IS_AGR_1940_LCURLISTRecord();
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			rec.spc_sale_clsf_nm = Util.checkString(rset0.getString("spc_sale_clsf_nm"));
			rec.scat_year = Util.checkString(rset0.getString("scat_year"));
			rec.mm01 = Util.checkString(rset0.getString("mm01"));
			rec.mm02 = Util.checkString(rset0.getString("mm02"));
			rec.mm03 = Util.checkString(rset0.getString("mm03"));
			rec.mm04 = Util.checkString(rset0.getString("mm04"));
			rec.mm05 = Util.checkString(rset0.getString("mm05"));
			rec.mm06 = Util.checkString(rset0.getString("mm06"));
			rec.mm07 = Util.checkString(rset0.getString("mm07"));
			rec.mm08 = Util.checkString(rset0.getString("mm08"));
			rec.mm09 = Util.checkString(rset0.getString("mm09"));
			rec.mm10 = Util.checkString(rset0.getString("mm10"));
			rec.mm11 = Util.checkString(rset0.getString("mm11"));
			rec.mm12 = Util.checkString(rset0.getString("mm12"));
			rec.amt_tot = Util.checkString(rset0.getString("amt_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_1940_LDataSet ds = (IS_AGR_1940_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_1940_LCURLISTRecord curlistRec = (IS_AGR_1940_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.spc_sale_clsf_nm%>
<%= curlistRec.scat_year%>
<%= curlistRec.mm01%>
<%= curlistRec.mm02%>
<%= curlistRec.mm03%>
<%= curlistRec.mm04%>
<%= curlistRec.mm05%>
<%= curlistRec.mm06%>
<%= curlistRec.mm07%>
<%= curlistRec.mm08%>
<%= curlistRec.mm09%>
<%= curlistRec.mm10%>
<%= curlistRec.mm11%>
<%= curlistRec.mm12%>
<%= curlistRec.amt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 16:45:34 KST 2012 */