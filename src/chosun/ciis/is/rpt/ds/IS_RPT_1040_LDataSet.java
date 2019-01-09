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


package chosun.ciis.is.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1040_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_1040_LDataSet(){}
	public IS_RPT_1040_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_RPT_1040_LCURLIST1Record rec = new IS_RPT_1040_LCURLIST1Record();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.m_rd_amt = Util.checkString(rset0.getString("m_rd_amt"));
			rec.m_cd_amt = Util.checkString(rset0.getString("m_cd_amt"));
			rec.m_tm_amt = Util.checkString(rset0.getString("m_tm_amt"));
			rec.m_rm_amt = Util.checkString(rset0.getString("m_rm_amt"));
			rec.s_rd_amt = Util.checkString(rset0.getString("s_rd_amt"));
			rec.s_cd_amt = Util.checkString(rset0.getString("s_cd_amt"));
			rec.s_tm_amt = Util.checkString(rset0.getString("s_tm_amt"));
			rec.s_rm_amt = Util.checkString(rset0.getString("s_rm_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_RPT_1040_LDataSet ds = (IS_RPT_1040_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_1040_LCURLIST1Record curlist1Rec = (IS_RPT_1040_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.sub_dept_cd%>
<%= curlist1Rec.dept_cd_nm%>
<%= curlist1Rec.sub_dept_cd_nm%>
<%= curlist1Rec.m_rd_amt%>
<%= curlist1Rec.m_cd_amt%>
<%= curlist1Rec.m_tm_amt%>
<%= curlist1Rec.m_rm_amt%>
<%= curlist1Rec.s_rd_amt%>
<%= curlist1Rec.s_cd_amt%>
<%= curlist1Rec.s_tm_amt%>
<%= curlist1Rec.s_rm_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 14:25:41 KST 2012 */