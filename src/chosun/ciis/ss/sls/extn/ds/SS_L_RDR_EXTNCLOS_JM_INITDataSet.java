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


public class SS_L_RDR_EXTNCLOS_JM_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList curextntypecd = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList cursubscnfmstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTNCLOS_JM_INITDataSet(){}
	public SS_L_RDR_EXTNCLOS_JM_INITDataSet(String errcode, String errmsg){
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
			SS_L_RDR_EXTNCLOS_JM_INITTEAMLISTRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_L_RDR_EXTNCLOS_JM_INITPARTLISTRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_L_RDR_EXTNCLOS_JM_INITAREALISTRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_L_RDR_EXTNCLOS_JM_INITCUREXTNTYPECDRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITCUREXTNTYPECDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.curextntypecd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_L_RDR_EXTNCLOS_JM_INITCURMEDICDRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_L_RDR_EXTNCLOS_JM_INITCURSUBSCNFMSTATCDRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITCURSUBSCNFMSTATCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.cursubscnfmstatcd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			SS_L_RDR_EXTNCLOS_JM_INITCURAPLCPATHCDRecord rec = new SS_L_RDR_EXTNCLOS_JM_INITCURAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.curaplcpathcd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_EXTNCLOS_JM_INITDataSet ds = (SS_L_RDR_EXTNCLOS_JM_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITTEAMLISTRecord teamlistRec = (SS_L_RDR_EXTNCLOS_JM_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITPARTLISTRecord partlistRec = (SS_L_RDR_EXTNCLOS_JM_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITAREALISTRecord arealistRec = (SS_L_RDR_EXTNCLOS_JM_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curextntypecd.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITCUREXTNTYPECDRecord curextntypecdRec = (SS_L_RDR_EXTNCLOS_JM_INITCUREXTNTYPECDRecord)ds.curextntypecd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITCURMEDICDRecord curmedicdRec = (SS_L_RDR_EXTNCLOS_JM_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursubscnfmstatcd.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITCURSUBSCNFMSTATCDRecord cursubscnfmstatcdRec = (SS_L_RDR_EXTNCLOS_JM_INITCURSUBSCNFMSTATCDRecord)ds.cursubscnfmstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaplcpathcd.size(); i++){
		SS_L_RDR_EXTNCLOS_JM_INITCURAPLCPATHCDRecord curaplcpathcdRec = (SS_L_RDR_EXTNCLOS_JM_INITCURAPLCPATHCDRecord)ds.curaplcpathcd.get(i);%>
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
<%= ds.getCurextntypecd()%>
<%= ds.getCurmedicd()%>
<%= ds.getCursubscnfmstatcd()%>
<%= ds.getCuraplcpathcd()%>
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
<%= curextntypecdRec.cicodeval%>
<%= curextntypecdRec.cicdnm%>
<%= curextntypecdRec.ciymgbcd%>
<%= curextntypecdRec.cicdgb%>
<%= curextntypecdRec.cicdynm%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
<%= cursubscnfmstatcdRec.cicodeval%>
<%= cursubscnfmstatcdRec.cicdnm%>
<%= cursubscnfmstatcdRec.ciymgbcd%>
<%= cursubscnfmstatcdRec.cicdgb%>
<%= cursubscnfmstatcdRec.cicdynm%>
<%= curaplcpathcdRec.cicodeval%>
<%= curaplcpathcdRec.cicdnm%>
<%= curaplcpathcdRec.ciymgbcd%>
<%= curaplcpathcdRec.cicdgb%>
<%= curaplcpathcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Mar 01 15:19:32 KST 2015 */