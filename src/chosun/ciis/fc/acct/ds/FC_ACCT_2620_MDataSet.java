/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-확정대상연결 초기화면
* 작성일자 : 2014.12.16
* 작성자 : 이혁
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


public class FC_ACCT_2620_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_slip_clsf_list = new ArrayList();
	public ArrayList cur_dlco_list = new ArrayList();
	public ArrayList cur_clsf_list = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2620_MDataSet(){}
	public FC_ACCT_2620_MDataSet(String errcode, String errmsg){
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
			FC_ACCT_2620_MCUR_DLCO_LISTRecord rec = new FC_ACCT_2620_MCUR_DLCO_LISTRecord();
			rec.dlco_cmpy_cd = Util.checkString(rset0.getString("dlco_cmpy_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			this.cur_dlco_list.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_ACCT_2620_MCUR_CLSF_LISTRecord rec = new FC_ACCT_2620_MCUR_CLSF_LISTRecord();
			rec.dlco_clsf_cd = Util.checkString(rset1.getString("dlco_clsf_cd"));
			rec.dlco_clsf_nm = Util.checkString(rset1.getString("dlco_clsf_nm"));
			this.cur_clsf_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_ACCT_2620_MCUR_SLIP_CLSF_LISTRecord rec = new FC_ACCT_2620_MCUR_SLIP_CLSF_LISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.cur_slip_clsf_list.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2620_MDataSet ds = (FC_ACCT_2620_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.cur_dlco_list.size(); i++){
		FC_ACCT_2620_MCUR_DLCO_LISTRecord cur_dlco_listRec = (FC_ACCT_2620_MCUR_DLCO_LISTRecord)ds.cur_dlco_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_clsf_list.size(); i++){
		FC_ACCT_2620_MCUR_CLSF_LISTRecord cur_clsf_listRec = (FC_ACCT_2620_MCUR_CLSF_LISTRecord)ds.cur_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cur_slip_clsf_list.size(); i++){
		FC_ACCT_2620_MCUR_SLIP_CLSF_LISTRecord cur_slip_clsf_listRec = (FC_ACCT_2620_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_dlco_list()%>
<%= ds.getCur_clsf_list()%>
<%= ds.getCur_slip_clsf_list()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= cur_dlco_listRec.dlco_cmpy_cd%>
<%= cur_dlco_listRec.dlco_nm%>
<%= cur_clsf_listRec.dlco_clsf_cd%>
<%= cur_clsf_listRec.dlco_clsf_nm%>
<%= cur_slip_clsf_listRec.cd%>
<%= cur_slip_clsf_listRec.cdnm%>
<%= cur_slip_clsf_listRec.cd_abrv_nm%>
<%= cur_slip_clsf_listRec.cdnm_cd%>
<%= cur_slip_clsf_listRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 16 11:50:31 KST 2014 */