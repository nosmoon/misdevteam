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


public class IS_AGR_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2110_LDataSet(){}
	public IS_AGR_2110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			IS_AGR_2110_LCURLISTRecord rec = new IS_AGR_2110_LCURLISTRecord();
			rec.t_no = Util.checkString(rset0.getString("t_no"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.rvord_type_amt01 = Util.checkString(rset0.getString("rvord_type_amt01"));
			rec.rvord_type_amt01_rate = Util.checkString(rset0.getString("rvord_type_amt01_rate"));
			rec.rvord_type_amt02 = Util.checkString(rset0.getString("rvord_type_amt02"));
			rec.rvord_type_amt02_rate = Util.checkString(rset0.getString("rvord_type_amt02_rate"));
			rec.rvord_type_amt_subtot = Util.checkString(rset0.getString("rvord_type_amt_subtot"));
			rec.rvord_type_amt03 = Util.checkString(rset0.getString("rvord_type_amt03"));
			rec.rvord_type_amt_tot = Util.checkString(rset0.getString("rvord_type_amt_tot"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2110_LDataSet ds = (IS_AGR_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2110_LCURLISTRecord curlistRec = (IS_AGR_2110_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.rvord_type_amt01%>
<%= curlistRec.rvord_type_amt01_rate%>
<%= curlistRec.rvord_type_amt02%>
<%= curlistRec.rvord_type_amt02_rate%>
<%= curlistRec.rvord_type_amt_subtot%>
<%= curlistRec.rvord_type_amt03%>
<%= curlistRec.rvord_type_amt_tot%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 01 17:34:41 KST 2012 */