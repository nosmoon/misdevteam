/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2200_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList clsf1cur = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList clsf3cur = new ArrayList();
	public ArrayList clsf2cur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2200_ADataSet(){}
	public SS_SLS_BRMGR_2200_ADataSet(String errcode, String errmsg){
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
			SS_SLS_BRMGR_2200_ATEAMLISTRecord rec = new SS_SLS_BRMGR_2200_ATEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_SLS_BRMGR_2200_APARTLISTRecord rec = new SS_SLS_BRMGR_2200_APARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_SLS_BRMGR_2200_AAREALISTRecord rec = new SS_SLS_BRMGR_2200_AAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_SLS_BRMGR_2200_ACLSF1CURRecord rec = new SS_SLS_BRMGR_2200_ACLSF1CURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			this.clsf1cur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SS_SLS_BRMGR_2200_ACLSF2CURRecord rec = new SS_SLS_BRMGR_2200_ACLSF2CURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			this.clsf2cur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			SS_SLS_BRMGR_2200_ACLSF3CURRecord rec = new SS_SLS_BRMGR_2200_ACLSF3CURRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			this.clsf3cur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2200_ADataSet ds = (SS_SLS_BRMGR_2200_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_SLS_BRMGR_2200_ATEAMLISTRecord teamlistRec = (SS_SLS_BRMGR_2200_ATEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_SLS_BRMGR_2200_APARTLISTRecord partlistRec = (SS_SLS_BRMGR_2200_APARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_SLS_BRMGR_2200_AAREALISTRecord arealistRec = (SS_SLS_BRMGR_2200_AAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clsf1cur.size(); i++){
		SS_SLS_BRMGR_2200_ACLSF1CURRecord clsf1curRec = (SS_SLS_BRMGR_2200_ACLSF1CURRecord)ds.clsf1cur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clsf2cur.size(); i++){
		SS_SLS_BRMGR_2200_ACLSF2CURRecord clsf2curRec = (SS_SLS_BRMGR_2200_ACLSF2CURRecord)ds.clsf2cur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clsf3cur.size(); i++){
		SS_SLS_BRMGR_2200_ACLSF3CURRecord clsf3curRec = (SS_SLS_BRMGR_2200_ACLSF3CURRecord)ds.clsf3cur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getClsf1cur()%>
<%= ds.getClsf2cur()%>
<%= ds.getClsf3cur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= clsf1curRec.cicodeval%>
<%= clsf1curRec.cicdnm%>
<%= clsf2curRec.cicodeval%>
<%= clsf2curRec.cicdnm%>
<%= clsf3curRec.cicodeval%>
<%= clsf3curRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 30 13:54:10 KST 2016 */