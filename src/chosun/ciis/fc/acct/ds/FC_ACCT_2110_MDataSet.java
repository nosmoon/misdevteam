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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2110_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deptlist = new ArrayList();
	public ArrayList paylist = new ArrayList();
	public ArrayList sdeptlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2110_MDataSet(){}
	public FC_ACCT_2110_MDataSet(String errcode, String errmsg){
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
			FC_ACCT_2110_MSDEPTLISTRecord rec = new FC_ACCT_2110_MSDEPTLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.sdeptlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_ACCT_2110_MDEPTLISTRecord rec = new FC_ACCT_2110_MDEPTLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.mang_cd = Util.checkString(rset1.getString("mang_cd"));
			this.deptlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			FC_ACCT_2110_MPAYLISTRecord rec = new FC_ACCT_2110_MPAYLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.paylist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2110_MDataSet ds = (FC_ACCT_2110_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.sdeptlist.size(); i++){
		FC_ACCT_2110_MSDEPTLISTRecord sdeptlistRec = (FC_ACCT_2110_MSDEPTLISTRecord)ds.sdeptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		FC_ACCT_2110_MDEPTLISTRecord deptlistRec = (FC_ACCT_2110_MDEPTLISTRecord)ds.deptlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paylist.size(); i++){
		FC_ACCT_2110_MPAYLISTRecord paylistRec = (FC_ACCT_2110_MPAYLISTRecord)ds.paylist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSdeptlist()%>
<%= ds.getDeptlist()%>
<%= ds.getPaylist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= sdeptlistRec.cd%>
<%= sdeptlistRec.cdnm%>
<%= deptlistRec.cd%>
<%= deptlistRec.cdnm%>
<%= deptlistRec.mang_cd%>
<%= paylistRec.cd%>
<%= paylistRec.cdnm%>
<%= paylistRec.cd_abrv_nm%>
<%= paylistRec.cdnm_cd%>
<%= paylistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 21 11:48:51 KST 2013 */