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


public class IS_AGR_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2010_LDataSet(){}
	public IS_AGR_2010_LDataSet(String errcode, String errmsg){
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
			IS_AGR_2010_LCURLISTRecord rec = new IS_AGR_2010_LCURLISTRecord();
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.amt_01 = Util.checkString(rset0.getString("amt_01"));
			rec.amt_02 = Util.checkString(rset0.getString("amt_02"));
			rec.amt_03 = Util.checkString(rset0.getString("amt_03"));
			rec.amt_04 = Util.checkString(rset0.getString("amt_04"));
			rec.amt_05 = Util.checkString(rset0.getString("amt_05"));
			rec.amt_06 = Util.checkString(rset0.getString("amt_06"));
			rec.amt_07 = Util.checkString(rset0.getString("amt_07"));
			rec.amt_08 = Util.checkString(rset0.getString("amt_08"));
			rec.amt_09 = Util.checkString(rset0.getString("amt_09"));
			rec.amt_10 = Util.checkString(rset0.getString("amt_10"));
			rec.amt_11 = Util.checkString(rset0.getString("amt_11"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2010_LDataSet ds = (IS_AGR_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2010_LCURLISTRecord curlistRec = (IS_AGR_2010_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dept_cd%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.amt_01%>
<%= curlistRec.amt_02%>
<%= curlistRec.amt_03%>
<%= curlistRec.amt_04%>
<%= curlistRec.amt_05%>
<%= curlistRec.amt_06%>
<%= curlistRec.amt_07%>
<%= curlistRec.amt_08%>
<%= curlistRec.amt_09%>
<%= curlistRec.amt_10%>
<%= curlistRec.amt_11%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 04 11:49:57 KST 2012 */