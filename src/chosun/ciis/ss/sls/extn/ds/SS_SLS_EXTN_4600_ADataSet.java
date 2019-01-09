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


public class SS_SLS_EXTN_4600_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList teamlist = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curextn_gb = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curdncomp = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList cursubscnfmstatcd = new ArrayList();
	public ArrayList curextntypecd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_4600_ADataSet(){}
	public SS_SLS_EXTN_4600_ADataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_4600_ATEAMLISTRecord rec = new SS_SLS_EXTN_4600_ATEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			SS_SLS_EXTN_4600_APARTLISTRecord rec = new SS_SLS_EXTN_4600_APARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			SS_SLS_EXTN_4600_AAREALISTRecord rec = new SS_SLS_EXTN_4600_AAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			SS_SLS_EXTN_4600_ACUREXTNTYPECDRecord rec = new SS_SLS_EXTN_4600_ACUREXTNTYPECDRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			this.curextntypecd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			SS_SLS_EXTN_4600_ACURMEDICDRecord rec = new SS_SLS_EXTN_4600_ACURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			SS_SLS_EXTN_4600_ACURSUBSCNFMSTATCDRecord rec = new SS_SLS_EXTN_4600_ACURSUBSCNFMSTATCDRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.cursubscnfmstatcd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			SS_SLS_EXTN_4600_ACURAPLCPATHCDRecord rec = new SS_SLS_EXTN_4600_ACURAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			this.curaplcpathcd.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			SS_SLS_EXTN_4600_ACURDNCOMPRecord rec = new SS_SLS_EXTN_4600_ACURDNCOMPRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			this.curdncomp.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(15);
		while(rset8.next()){
			SS_SLS_EXTN_4600_ACUREXTN_GBRecord rec = new SS_SLS_EXTN_4600_ACUREXTN_GBRecord();
			rec.cicodeval = Util.checkString(rset8.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset8.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset8.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset8.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset8.getString("cicdynm"));
			this.curextn_gb.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_4600_ADataSet ds = (SS_SLS_EXTN_4600_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_SLS_EXTN_4600_ATEAMLISTRecord teamlistRec = (SS_SLS_EXTN_4600_ATEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_SLS_EXTN_4600_APARTLISTRecord partlistRec = (SS_SLS_EXTN_4600_APARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_SLS_EXTN_4600_AAREALISTRecord arealistRec = (SS_SLS_EXTN_4600_AAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curextntypecd.size(); i++){
		SS_SLS_EXTN_4600_ACUREXTNTYPECDRecord curextntypecdRec = (SS_SLS_EXTN_4600_ACUREXTNTYPECDRecord)ds.curextntypecd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_SLS_EXTN_4600_ACURMEDICDRecord curmedicdRec = (SS_SLS_EXTN_4600_ACURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cursubscnfmstatcd.size(); i++){
		SS_SLS_EXTN_4600_ACURSUBSCNFMSTATCDRecord cursubscnfmstatcdRec = (SS_SLS_EXTN_4600_ACURSUBSCNFMSTATCDRecord)ds.cursubscnfmstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curaplcpathcd.size(); i++){
		SS_SLS_EXTN_4600_ACURAPLCPATHCDRecord curaplcpathcdRec = (SS_SLS_EXTN_4600_ACURAPLCPATHCDRecord)ds.curaplcpathcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdncomp.size(); i++){
		SS_SLS_EXTN_4600_ACURDNCOMPRecord curdncompRec = (SS_SLS_EXTN_4600_ACURDNCOMPRecord)ds.curdncomp.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curextn_gb.size(); i++){
		SS_SLS_EXTN_4600_ACUREXTN_GBRecord curextn_gbRec = (SS_SLS_EXTN_4600_ACUREXTN_GBRecord)ds.curextn_gb.get(i);%>
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
<%= ds.getCurdncomp()%>
<%= ds.getCurextn_gb()%>
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
<%= curdncompRec.cicodeval%>
<%= curdncompRec.cicdnm%>
<%= curdncompRec.ciymgbcd%>
<%= curdncompRec.cicdgb%>
<%= curdncompRec.cicdynm%>
<%= curextn_gbRec.cicodeval%>
<%= curextn_gbRec.cicdnm%>
<%= curextn_gbRec.ciymgbcd%>
<%= curextn_gbRec.cicdgb%>
<%= curextn_gbRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 10 10:44:41 KST 2017 */