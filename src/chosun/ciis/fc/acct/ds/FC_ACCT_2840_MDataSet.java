/***************************************************************************************************
* 파일명 : .java
* 기능 : 회계관리
* 작성일자 : 2009-02-19
* 작성자 : 노상현
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
 * 회계관리
 */


public class FC_ACCT_2840_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rcpmclsflist = new ArrayList();
	public ArrayList rcpmshetclsflist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2840_MDataSet(){}
	public FC_ACCT_2840_MDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(4);
		while(rset2.next()){
			FC_ACCT_2840_MRCPMSHETCLSFLISTRecord rec = new FC_ACCT_2840_MRCPMSHETCLSFLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.rcpmshetclsflist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(5);
		while(rset3.next()){
			FC_ACCT_2840_MRCPMCLSFLISTRecord rec = new FC_ACCT_2840_MRCPMCLSFLISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.rcpmclsflist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2840_MDataSet ds = (FC_ACCT_2840_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rcpmshetclsflist.size(); i++){
		FC_ACCT_2840_MRCPMSHETCLSFLISTRecord rcpmshetclsflistRec = (FC_ACCT_2840_MRCPMSHETCLSFLISTRecord)ds.rcpmshetclsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpmclsflist.size(); i++){
		FC_ACCT_2840_MRCPMCLSFLISTRecord rcpmclsflistRec = (FC_ACCT_2840_MRCPMCLSFLISTRecord)ds.rcpmclsflist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpmshetclsflist()%>
<%= ds.getRcpmclsflist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rcpmshetclsflistRec.cd%>
<%= rcpmshetclsflistRec.cdnm%>
<%= rcpmshetclsflistRec.cd_abrv_nm%>
<%= rcpmshetclsflistRec.cdnm_cd%>
<%= rcpmshetclsflistRec.cdabrvnm_cd%>
<%= rcpmclsflistRec.cd%>
<%= rcpmclsflistRec.cdnm%>
<%= rcpmclsflistRec.cd_abrv_nm%>
<%= rcpmclsflistRec.cdnm_cd%>
<%= rcpmclsflistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 20:38:33 KST 2009 */