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


public class SP_SAL_2710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_2710_LDataSet(){}
	public SP_SAL_2710_LDataSet(String errcode, String errmsg){
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
			SP_SAL_2710_LCURLISTRecord rec = new SP_SAL_2710_LCURLISTRecord();
			rec.sp_comp_chrg_pers_emp_nm = Util.checkString(rset0.getString("sp_comp_chrg_pers_emp_nm"));
			rec.sp_comp_chrg_pers_emp_no = Util.checkString(rset0.getString("sp_comp_chrg_pers_emp_no"));
			rec.m01 = Util.checkString(rset0.getString("m01"));
			rec.m02 = Util.checkString(rset0.getString("m02"));
			rec.m03 = Util.checkString(rset0.getString("m03"));
			rec.m04 = Util.checkString(rset0.getString("m04"));
			rec.m05 = Util.checkString(rset0.getString("m05"));
			rec.m06 = Util.checkString(rset0.getString("m06"));
			rec.m07 = Util.checkString(rset0.getString("m07"));
			rec.m08 = Util.checkString(rset0.getString("m08"));
			rec.m09 = Util.checkString(rset0.getString("m09"));
			rec.m10 = Util.checkString(rset0.getString("m10"));
			rec.m11 = Util.checkString(rset0.getString("m11"));
			rec.m12 = Util.checkString(rset0.getString("m12"));
			rec.m13 = Util.checkString(rset0.getString("m13"));
			rec.m14 = Util.checkString(rset0.getString("m14"));
			rec.m15 = Util.checkString(rset0.getString("m15"));
			rec.m16 = Util.checkString(rset0.getString("m16"));
			rec.tot = Util.checkString(rset0.getString("tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_2710_LDataSet ds = (SP_SAL_2710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SP_SAL_2710_LCURLISTRecord curlistRec = (SP_SAL_2710_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sp_comp_chrg_pers_emp_nm%>
<%= curlistRec.sp_comp_chrg_pers_emp_no%>
<%= curlistRec.m01%>
<%= curlistRec.m02%>
<%= curlistRec.m03%>
<%= curlistRec.m04%>
<%= curlistRec.m05%>
<%= curlistRec.m06%>
<%= curlistRec.m07%>
<%= curlistRec.m08%>
<%= curlistRec.m09%>
<%= curlistRec.m10%>
<%= curlistRec.m11%>
<%= curlistRec.m12%>
<%= curlistRec.m13%>
<%= curlistRec.m14%>
<%= curlistRec.m15%>
<%= curlistRec.m16%>
<%= curlistRec.tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 20:50:05 KST 2012 */