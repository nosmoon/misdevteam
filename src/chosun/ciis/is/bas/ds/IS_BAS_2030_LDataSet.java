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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_2030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_2030_LDataSet(){}
	public IS_BAS_2030_LDataSet(String errcode, String errmsg){
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
			IS_BAS_2030_LCURLISTRecord rec = new IS_BAS_2030_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.sub_dept_nm = Util.checkString(rset0.getString("sub_dept_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.trgt_clamt_01 = Util.checkString(rset0.getString("trgt_clamt_01"));
			rec.trgt_clamt_02 = Util.checkString(rset0.getString("trgt_clamt_02"));
			rec.trgt_clamt_03 = Util.checkString(rset0.getString("trgt_clamt_03"));
			rec.trgt_clamt_04 = Util.checkString(rset0.getString("trgt_clamt_04"));
			rec.trgt_clamt_05 = Util.checkString(rset0.getString("trgt_clamt_05"));
			rec.trgt_clamt_06 = Util.checkString(rset0.getString("trgt_clamt_06"));
			rec.trgt_clamt_07 = Util.checkString(rset0.getString("trgt_clamt_07"));
			rec.trgt_clamt_08 = Util.checkString(rset0.getString("trgt_clamt_08"));
			rec.trgt_clamt_09 = Util.checkString(rset0.getString("trgt_clamt_09"));
			rec.trgt_clamt_10 = Util.checkString(rset0.getString("trgt_clamt_10"));
			rec.trgt_clamt_11 = Util.checkString(rset0.getString("trgt_clamt_11"));
			rec.trgt_clamt_12 = Util.checkString(rset0.getString("trgt_clamt_12"));
			rec.trgt_clamt = Util.checkString(rset0.getString("trgt_clamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_2030_LDataSet ds = (IS_BAS_2030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_2030_LCURLISTRecord curlistRec = (IS_BAS_2030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.sub_dept_nm%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.trgt_clamt_01%>
<%= curlistRec.trgt_clamt_02%>
<%= curlistRec.trgt_clamt_03%>
<%= curlistRec.trgt_clamt_04%>
<%= curlistRec.trgt_clamt_05%>
<%= curlistRec.trgt_clamt_06%>
<%= curlistRec.trgt_clamt_07%>
<%= curlistRec.trgt_clamt_08%>
<%= curlistRec.trgt_clamt_09%>
<%= curlistRec.trgt_clamt_10%>
<%= curlistRec.trgt_clamt_11%>
<%= curlistRec.trgt_clamt_12%>
<%= curlistRec.trgt_clamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 25 11:18:02 KST 2012 */