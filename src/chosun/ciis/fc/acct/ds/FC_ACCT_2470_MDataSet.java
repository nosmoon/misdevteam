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


public class FC_ACCT_2470_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList slip_clsf_cd2 = new ArrayList();
	public ArrayList slip_clsf_cd1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2470_MDataSet(){}
	public FC_ACCT_2470_MDataSet(String errcode, String errmsg){
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
			FC_ACCT_2470_MSLIP_CLSF_CD1Record rec = new FC_ACCT_2470_MSLIP_CLSF_CD1Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.slip_clsf_cd1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_ACCT_2470_MSLIP_CLSF_CD2Record rec = new FC_ACCT_2470_MSLIP_CLSF_CD2Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.slip_clsf_cd2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2470_MDataSet ds = (FC_ACCT_2470_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.slip_clsf_cd1.size(); i++){
		FC_ACCT_2470_MSLIP_CLSF_CD1Record slip_clsf_cd1Rec = (FC_ACCT_2470_MSLIP_CLSF_CD1Record)ds.slip_clsf_cd1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.slip_clsf_cd2.size(); i++){
		FC_ACCT_2470_MSLIP_CLSF_CD2Record slip_clsf_cd2Rec = (FC_ACCT_2470_MSLIP_CLSF_CD2Record)ds.slip_clsf_cd2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_clsf_cd1()%>
<%= ds.getSlip_clsf_cd2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= slip_clsf_cd1Rec.cd_nm%>
<%= slip_clsf_cd1Rec.cd%>
<%= slip_clsf_cd2Rec.cd_nm%>
<%= slip_clsf_cd2Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 23 19:58:24 KST 2009 */