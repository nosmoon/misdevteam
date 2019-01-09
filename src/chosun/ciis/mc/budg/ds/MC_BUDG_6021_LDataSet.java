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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6021_LDataSet(){}
	public MC_BUDG_6021_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			MC_BUDG_6021_LCURLISTRecord rec = new MC_BUDG_6021_LCURLISTRecord();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.a_ini_plan_qunt = Util.checkString(rset0.getString("a_ini_plan_qunt"));
			rec.asin_qunt = Util.checkString(rset0.getString("asin_qunt"));
			rec.asin_qunt2 = Util.checkString(rset0.getString("asin_qunt2"));
			rec.a_form_dept_cd = Util.checkString(rset0.getString("a_form_dept_cd"));
			rec.a_form_dept_nm = Util.checkString(rset0.getString("a_form_dept_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6021_LDataSet ds = (MC_BUDG_6021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6021_LCURLISTRecord curlistRec = (MC_BUDG_6021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk%>
<%= curlistRec.yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.a_ini_plan_qunt%>
<%= curlistRec.asin_qunt%>
<%= curlistRec.asin_qunt2%>
<%= curlistRec.a_form_dept_cd%>
<%= curlistRec.a_form_dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 10:53:56 KST 2009 */