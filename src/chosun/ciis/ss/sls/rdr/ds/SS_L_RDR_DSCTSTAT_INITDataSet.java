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


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_RDR_DSCTSTAT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList acpnpathcd = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList dscttypecd = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList medicd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_DSCTSTAT_INITDataSet(){}
	public SS_L_RDR_DSCTSTAT_INITDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_RDR_DSCTSTAT_INITTEAMLISTRecord rec = new SS_L_RDR_DSCTSTAT_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_RDR_DSCTSTAT_INITPARTLISTRecord rec = new SS_L_RDR_DSCTSTAT_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_RDR_DSCTSTAT_INITAREALISTRecord rec = new SS_L_RDR_DSCTSTAT_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_RDR_DSCTSTAT_INITDSCTTYPECDRecord rec = new SS_L_RDR_DSCTSTAT_INITDSCTTYPECDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.dscttypecd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_RDR_DSCTSTAT_INITACPNPATHCDRecord rec = new SS_L_RDR_DSCTSTAT_INITACPNPATHCDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.acpnpathcd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_RDR_DSCTSTAT_INITMEDICDRecord rec = new SS_L_RDR_DSCTSTAT_INITMEDICDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.medicd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_DSCTSTAT_INITDataSet ds = (SS_L_RDR_DSCTSTAT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_RDR_DSCTSTAT_INITTEAMLISTRecord teamlistRec = (SS_L_RDR_DSCTSTAT_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_RDR_DSCTSTAT_INITPARTLISTRecord partlistRec = (SS_L_RDR_DSCTSTAT_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_RDR_DSCTSTAT_INITAREALISTRecord arealistRec = (SS_L_RDR_DSCTSTAT_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dscttypecd.size(); i++){
		SS_L_RDR_DSCTSTAT_INITDSCTTYPECDRecord dscttypecdRec = (SS_L_RDR_DSCTSTAT_INITDSCTTYPECDRecord)ds.dscttypecd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.acpnpathcd.size(); i++){
		SS_L_RDR_DSCTSTAT_INITACPNPATHCDRecord acpnpathcdRec = (SS_L_RDR_DSCTSTAT_INITACPNPATHCDRecord)ds.acpnpathcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicd.size(); i++){
		SS_L_RDR_DSCTSTAT_INITMEDICDRecord medicdRec = (SS_L_RDR_DSCTSTAT_INITMEDICDRecord)ds.medicd.get(i);%>
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
<%= ds.getDscttypecd()%>
<%= ds.getAcpnpathcd()%>
<%= ds.getMedicd()%>
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
<%= dscttypecdRec.cicodeval%>
<%= dscttypecdRec.cicdnm%>
<%= dscttypecdRec.ciymgbcd%>
<%= dscttypecdRec.cicdgb%>
<%= dscttypecdRec.cicdynm%>
<%= acpnpathcdRec.cicodeval%>
<%= acpnpathcdRec.cicdnm%>
<%= acpnpathcdRec.ciymgbcd%>
<%= acpnpathcdRec.cicdgb%>
<%= acpnpathcdRec.cicdynm%>
<%= medicdRec.cicodeval%>
<%= medicdRec.cicdnm%>
<%= medicdRec.ciymgbcd%>
<%= medicdRec.cicdgb%>
<%= medicdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 12 11:50:30 KST 2015 */