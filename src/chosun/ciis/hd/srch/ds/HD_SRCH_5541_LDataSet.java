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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5541_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_5541_LDataSet(){}
	public HD_SRCH_5541_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5541_LCURLIST1Record rec = new HD_SRCH_5541_LCURLIST1Record();
			rec.guk_nm = Util.checkString(rset0.getString("guk_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.emp_clsf1 = Util.checkString(rset0.getString("emp_clsf1"));
			rec.emp_clsf2 = Util.checkString(rset0.getString("emp_clsf2"));
			rec.emp_clsf3 = Util.checkString(rset0.getString("emp_clsf3"));
			rec.emp_clsf4 = Util.checkString(rset0.getString("emp_clsf4"));
			rec.emp_clsf5 = Util.checkString(rset0.getString("emp_clsf5"));
			rec.emp_clsf6 = Util.checkString(rset0.getString("emp_clsf6"));
			rec.emp_clsf7 = Util.checkString(rset0.getString("emp_clsf7"));
			rec.emp_clsf8 = Util.checkString(rset0.getString("emp_clsf8"));
			rec.emp_clsf9 = Util.checkString(rset0.getString("emp_clsf9"));
			rec.emp_clsf10 = Util.checkString(rset0.getString("emp_clsf10"));
			rec.emp_clsf11 = Util.checkString(rset0.getString("emp_clsf11"));
			rec.tot_sum = Util.checkString(rset0.getString("tot_sum"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5541_LDataSet ds = (HD_SRCH_5541_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_SRCH_5541_LCURLIST1Record curlist1Rec = (HD_SRCH_5541_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.guk_nm%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.emp_clsf1%>
<%= curlist1Rec.emp_clsf2%>
<%= curlist1Rec.emp_clsf3%>
<%= curlist1Rec.emp_clsf4%>
<%= curlist1Rec.emp_clsf5%>
<%= curlist1Rec.emp_clsf6%>
<%= curlist1Rec.emp_clsf7%>
<%= curlist1Rec.emp_clsf8%>
<%= curlist1Rec.emp_clsf9%>
<%= curlist1Rec.emp_clsf10%>
<%= curlist1Rec.emp_clsf11%>
<%= curlist1Rec.tot_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 07 18:58:26 KST 2018 */