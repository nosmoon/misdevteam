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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4200_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList curbnsitem = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList cursvcmm = new ArrayList();
	public ArrayList curextntype = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_4200_ADataSet(){}
	public SS_SLS_EXTN_4200_ADataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_4200_ATEAMLISTRecord rec = new SS_SLS_EXTN_4200_ATEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_SLS_EXTN_4200_APARTLISTRecord rec = new SS_SLS_EXTN_4200_APARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_SLS_EXTN_4200_AAREALISTRecord rec = new SS_SLS_EXTN_4200_AAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_SLS_EXTN_4200_ARESITYPECDCURRecord rec = new SS_SLS_EXTN_4200_ARESITYPECDCURRecord();
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			this.resitypecdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SS_SLS_EXTN_4200_ACLAMTMTHDCDCURRecord rec = new SS_SLS_EXTN_4200_ACLAMTMTHDCDCURRecord();
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			SS_SLS_EXTN_4200_ACURBNSITEMRecord rec = new SS_SLS_EXTN_4200_ACURBNSITEMRecord();
			rec.bns_itemnm = Util.checkString(rset5.getString("bns_itemnm"));
			this.curbnsitem.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			SS_SLS_EXTN_4200_ACURSVCMMRecord rec = new SS_SLS_EXTN_4200_ACURSVCMMRecord();
			rec.svcmm = Util.checkString(rset6.getString("svcmm"));
			this.cursvcmm.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			SS_SLS_EXTN_4200_ACUREXTNTYPERecord rec = new SS_SLS_EXTN_4200_ACUREXTNTYPERecord();
			rec.extntype = Util.checkString(rset7.getString("extntype"));
			this.curextntype.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_4200_ADataSet ds = (SS_SLS_EXTN_4200_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_SLS_EXTN_4200_ATEAMLISTRecord teamlistRec = (SS_SLS_EXTN_4200_ATEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_SLS_EXTN_4200_APARTLISTRecord partlistRec = (SS_SLS_EXTN_4200_APARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_SLS_EXTN_4200_AAREALISTRecord arealistRec = (SS_SLS_EXTN_4200_AAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SS_SLS_EXTN_4200_ARESITYPECDCURRecord resitypecdcurRec = (SS_SLS_EXTN_4200_ARESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SS_SLS_EXTN_4200_ACLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SS_SLS_EXTN_4200_ACLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curbnsitem.size(); i++){
		SS_SLS_EXTN_4200_ACURBNSITEMRecord curbnsitemRec = (SS_SLS_EXTN_4200_ACURBNSITEMRecord)ds.curbnsitem.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursvcmm.size(); i++){
		SS_SLS_EXTN_4200_ACURSVCMMRecord cursvcmmRec = (SS_SLS_EXTN_4200_ACURSVCMMRecord)ds.cursvcmm.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curextntype.size(); i++){
		SS_SLS_EXTN_4200_ACUREXTNTYPERecord curextntypeRec = (SS_SLS_EXTN_4200_ACUREXTNTYPERecord)ds.curextntype.get(i);%>
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
<%= ds.getResitypecdcur()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getCurbnsitem()%>
<%= ds.getCursvcmm()%>
<%= ds.getCurextntype()%>
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
<%= resitypecdcurRec.cicdnm%>
<%= clamtmthdcdcurRec.cicdnm%>
<%= curbnsitemRec.bns_itemnm%>
<%= cursvcmmRec.svcmm%>
<%= curextntypeRec.extntype%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 06 18:25:03 KST 2016 */