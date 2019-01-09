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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_6030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_6030_LDataSet(){}
	public PR_PAPMAKE_6030_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_6030_LCURLIST1Record rec = new PR_PAPMAKE_6030_LCURLIST1Record();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.sub_rumn = Util.checkString(rset0.getString("sub_rumn"));
			rec.prt = Util.checkString(rset0.getString("prt"));
			rec.prt_total = Util.checkString(rset0.getString("prt_total"));
			rec.make = Util.checkString(rset0.getString("make"));
			rec.make_total = Util.checkString(rset0.getString("make_total"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.slip_proc_occr_dt = Util.checkString(rset0.getString("slip_proc_occr_dt"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.tax_stmt_dt = Util.checkString(rset0.getString("tax_stmt_dt"));
			rec.tax_stmt_seq = Util.checkString(rset0.getString("tax_stmt_seq"));
			rec.total = Util.checkString(rset0.getString("total"));
			rec.vat_total = Util.checkString(rset0.getString("vat_total"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_6030_LDataSet ds = (PR_PAPMAKE_6030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PAPMAKE_6030_LCURLIST1Record curlist1Rec = (PR_PAPMAKE_6030_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.gubun%>
<%= curlist1Rec.sub_rumn%>
<%= curlist1Rec.prt%>
<%= curlist1Rec.prt_total%>
<%= curlist1Rec.make%>
<%= curlist1Rec.make_total%>
<%= curlist1Rec.yymm%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.slip_proc_occr_dt%>
<%= curlist1Rec.slip_proc_seq%>
<%= curlist1Rec.tax_stmt_dt%>
<%= curlist1Rec.tax_stmt_seq%>
<%= curlist1Rec.total%>
<%= curlist1Rec.vat_total%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun May 31 18:28:57 KST 2009 */