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


public class FC_ACCT_2510_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_acct_list = new ArrayList();
	public ArrayList cur_mang_clsf_list = new ArrayList();
	public ArrayList cur_slip_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2510_MDataSet(){}
	public FC_ACCT_2510_MDataSet(String errcode, String errmsg){
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
			FC_ACCT_2510_MCUR_MANG_CLSF_LISTRecord rec = new FC_ACCT_2510_MCUR_MANG_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.cur_mang_clsf_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_ACCT_2510_MCUR_SLIP_CLSF_LISTRecord rec = new FC_ACCT_2510_MCUR_SLIP_CLSF_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.cur_slip_clsf_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			FC_ACCT_2510_MCUR_ACCT_LISTRecord rec = new FC_ACCT_2510_MCUR_ACCT_LISTRecord();
			rec.acct_cd = Util.checkString(rset2.getString("acct_cd"));
			rec.acct_abrv_nm = Util.checkString(rset2.getString("acct_abrv_nm"));
			this.cur_acct_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2510_MDataSet ds = (FC_ACCT_2510_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_mang_clsf_list.size(); i++){
		FC_ACCT_2510_MCUR_MANG_CLSF_LISTRecord cur_mang_clsf_listRec = (FC_ACCT_2510_MCUR_MANG_CLSF_LISTRecord)ds.cur_mang_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_slip_clsf_list.size(); i++){
		FC_ACCT_2510_MCUR_SLIP_CLSF_LISTRecord cur_slip_clsf_listRec = (FC_ACCT_2510_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_acct_list.size(); i++){
		FC_ACCT_2510_MCUR_ACCT_LISTRecord cur_acct_listRec = (FC_ACCT_2510_MCUR_ACCT_LISTRecord)ds.cur_acct_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_mang_clsf_list()%>
<%= ds.getCur_slip_clsf_list()%>
<%= ds.getCur_acct_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_mang_clsf_listRec.cd_nm%>
<%= cur_mang_clsf_listRec.cd%>
<%= cur_slip_clsf_listRec.cd_nm%>
<%= cur_slip_clsf_listRec.cd%>
<%= cur_acct_listRec.acct_cd%>
<%= cur_acct_listRec.acct_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 13:31:35 KST 2012 */