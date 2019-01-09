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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_6100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_yggbcd = new ArrayList();
	public ArrayList curdrcr_compgbcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6100_MDataSet(){}
	public FC_FUNC_6100_MDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_FUNC_6100_MCURDRCR_YGGBCDRecord rec = new FC_FUNC_6100_MCURDRCR_YGGBCDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdrcr_yggbcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_FUNC_6100_MCURDRCR_COMPGBCDRecord rec = new FC_FUNC_6100_MCURDRCR_COMPGBCDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curdrcr_compgbcd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6100_MDataSet ds = (FC_FUNC_6100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdrcr_yggbcd.size(); i++){
		FC_FUNC_6100_MCURDRCR_YGGBCDRecord curdrcr_yggbcdRec = (FC_FUNC_6100_MCURDRCR_YGGBCDRecord)ds.curdrcr_yggbcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_compgbcd.size(); i++){
		FC_FUNC_6100_MCURDRCR_COMPGBCDRecord curdrcr_compgbcdRec = (FC_FUNC_6100_MCURDRCR_COMPGBCDRecord)ds.curdrcr_compgbcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_yggbcd()%>
<%= ds.getCurdrcr_compgbcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdrcr_yggbcdRec.cd_nm%>
<%= curdrcr_yggbcdRec.cd%>
<%= curdrcr_compgbcdRec.cd_nm%>
<%= curdrcr_compgbcdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 19:02:50 KST 2009 */