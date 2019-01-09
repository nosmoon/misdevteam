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


public class FC_ACCT_2920_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlcoclsfcdlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String ss_deptcd;

	public FC_ACCT_2920_MDataSet(){}
	public FC_ACCT_2920_MDataSet(String errcode, String errmsg, String ss_deptcd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ss_deptcd = ss_deptcd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSs_deptcd(String ss_deptcd){
		this.ss_deptcd = ss_deptcd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSs_deptcd(){
		return this.ss_deptcd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2920_MDLCOCLSFCDLISTRecord rec = new FC_ACCT_2920_MDLCOCLSFCDLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.dlcoclsfcdlist.add(rec);
		}
		this.ss_deptcd = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2920_MDataSet ds = (FC_ACCT_2920_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlcoclsfcdlist.size(); i++){
		FC_ACCT_2920_MDLCOCLSFCDLISTRecord dlcoclsfcdlistRec = (FC_ACCT_2920_MDLCOCLSFCDLISTRecord)ds.dlcoclsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlcoclsfcdlist()%>
<%= ds.getSs_deptcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlcoclsfcdlistRec.cd%>
<%= dlcoclsfcdlistRec.cdnm%>
<%= dlcoclsfcdlistRec.cd_abrv_nm%>
<%= dlcoclsfcdlistRec.cdnm_cd%>
<%= dlcoclsfcdlistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 04 11:15:11 KST 2012 */