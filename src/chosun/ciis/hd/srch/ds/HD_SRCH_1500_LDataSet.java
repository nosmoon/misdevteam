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


public class HD_SRCH_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SRCH_1500_LDataSet(){}
	public HD_SRCH_1500_LDataSet(String errcode, String errmsg){
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
			HD_SRCH_1500_LCURLISTRecord rec = new HD_SRCH_1500_LCURLISTRecord();
			rec.up_dept_cd = Util.checkString(rset0.getString("up_dept_cd"));
			rec.up_dept_nm = Util.checkString(rset0.getString("up_dept_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.last_upgrd_dt = Util.checkString(rset0.getString("last_upgrd_dt"));
			rec.wowlrdlftn2 = Util.checkString(rset0.getString("wowlrdlftn2"));
			rec.duty_yydd = Util.checkString(rset0.getString("duty_yydd"));
			rec.qlrmsrlrks2 = Util.checkString(rset0.getString("qlrmsrlrks2"));
			rec.rmsthrdlftn2 = Util.checkString(rset0.getString("rmsthrdlftn2"));
			rec.dkstlrdlfwk = Util.checkString(rset0.getString("dkstlrdlfwk"));
			rec.dkstlr = Util.checkString(rset0.getString("dkstlr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_1500_LDataSet ds = (HD_SRCH_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_1500_LCURLISTRecord curlistRec = (HD_SRCH_1500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.up_dept_cd%>
<%= curlistRec.up_dept_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.last_upgrd_dt%>
<%= curlistRec.wowlrdlftn2%>
<%= curlistRec.duty_yydd%>
<%= curlistRec.qlrmsrlrks2%>
<%= curlistRec.rmsthrdlftn2%>
<%= curlistRec.dkstlrdlfwk%>
<%= curlistRec.dkstlr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 17 09:26:22 KST 2009 */