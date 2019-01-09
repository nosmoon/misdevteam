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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2310_LDataSet(){}
	public SP_SAL_2310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SP_SAL_2310_LCURLIST1Record rec = new SP_SAL_2310_LCURLIST1Record();
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.deps_pers = Util.checkString(rset0.getString("deps_pers"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_nm_1 = Util.checkString(rset0.getString("bo_nm_1"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.shft_noit = Util.checkString(rset0.getString("shft_noit"));
			rec.payo_amt = Util.checkString(rset0.getString("payo_amt"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_2310_LDataSet ds = (SP_SAL_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_2310_LCURLIST1Record curlist1Rec = (SP_SAL_2310_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.bank_nm%>
<%= curlist1Rec.bank_cd%>
<%= curlist1Rec.acct_no%>
<%= curlist1Rec.amt%>
<%= curlist1Rec.deps_pers%>
<%= curlist1Rec.bo_nm%>
<%= curlist1Rec.bo_nm_1%>
<%= curlist1Rec.bo_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.area_nm%>
<%= curlist1Rec.shft_noit%>
<%= curlist1Rec.payo_amt%>
<%= curlist1Rec.coms%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 18 10:11:44 KST 2012 */