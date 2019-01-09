/***************************************************************************************************
* 파일명 : SS_MO_L_LOGINHISTDataSet.java
* 기능 : CIIS-판매-기준정보관리-모바일로그인관리-로그인이력을 위한 DataSet
* 작성일자 : 2017-07-10
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *  CIIS-판매-기준정보관리-모바일로그인관리-로그인이력을 위한 DataSet
 */


public class SS_MO_L_LOGINHISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList histlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_MO_L_LOGINHISTDataSet(){}
	public SS_MO_L_LOGINHISTDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_MO_L_LOGINHISTHISTLISTRecord rec = new SS_MO_L_LOGINHISTHISTLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.sso_id = Util.checkString(rset0.getString("sso_id"));
			rec.sso_nm = Util.checkString(rset0.getString("sso_nm"));
			rec.log_dt = Util.checkString(rset0.getString("log_dt"));
			this.histlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_MO_L_LOGINHISTDataSet ds = (SS_MO_L_LOGINHISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.histlist.size(); i++){
		SS_MO_L_LOGINHISTHISTLISTRecord histlistRec = (SS_MO_L_LOGINHISTHISTLISTRecord)ds.histlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getHistlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= histlistRec.bocd%>
<%= histlistRec.bonm%>
<%= histlistRec.sso_id%>
<%= histlistRec.sso_nm%>
<%= histlistRec.log_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 10 17:17:49 KST 2017 */