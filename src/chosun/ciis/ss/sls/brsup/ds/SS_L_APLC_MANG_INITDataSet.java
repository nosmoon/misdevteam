/***************************************************************************************************
* 파일명 : SS_L_APLC_MANG_INITDataSet.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-초기화면
* 작성일자 : 2004-03-25
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 매체코드리스트 추가
* 수정자 : 장선희
* 수정일자 : 2017-10-30
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-초기화면
 *
 */


public class SS_L_APLC_MANG_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList shftclsf = new ArrayList();
	public ArrayList medicur = new ArrayList();
	public ArrayList jycur = new ArrayList();
	public ArrayList aplcprocstat = new ArrayList();
	public ArrayList aplcclsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_APLC_MANG_INITDataSet(){}
	public SS_L_APLC_MANG_INITDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_APLC_MANG_INITSHFTCLSFRecord rec = new SS_L_APLC_MANG_INITSHFTCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.shftclsf.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_APLC_MANG_INITAPLCCLSFRecord rec = new SS_L_APLC_MANG_INITAPLCCLSFRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.aplcclsf.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_APLC_MANG_INITAPLCPROCSTATRecord rec = new SS_L_APLC_MANG_INITAPLCPROCSTATRecord();
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.aplcprocstat.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			SS_L_APLC_MANG_INITJYCURRecord rec = new SS_L_APLC_MANG_INITJYCURRecord();
			rec.areacd = Util.checkString(rset3.getString("areacd"));
			rec.areanm = Util.checkString(rset3.getString("areanm"));
			this.jycur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			SS_L_APLC_MANG_INITMEDICURRecord rec = new SS_L_APLC_MANG_INITMEDICURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.medicur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_APLC_MANG_INITDataSet ds = (SS_L_APLC_MANG_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.shftclsf.size(); i++){
		SS_L_APLC_MANG_INITSHFTCLSFRecord shftclsfRec = (SS_L_APLC_MANG_INITSHFTCLSFRecord)ds.shftclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcclsf.size(); i++){
		SS_L_APLC_MANG_INITAPLCCLSFRecord aplcclsfRec = (SS_L_APLC_MANG_INITAPLCCLSFRecord)ds.aplcclsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcprocstat.size(); i++){
		SS_L_APLC_MANG_INITAPLCPROCSTATRecord aplcprocstatRec = (SS_L_APLC_MANG_INITAPLCPROCSTATRecord)ds.aplcprocstat.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.jycur.size(); i++){
		SS_L_APLC_MANG_INITJYCURRecord jycurRec = (SS_L_APLC_MANG_INITJYCURRecord)ds.jycur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SS_L_APLC_MANG_INITMEDICURRecord medicurRec = (SS_L_APLC_MANG_INITMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getShftclsf()%>
<%= ds.getAplcclsf()%>
<%= ds.getAplcprocstat()%>
<%= ds.getJycur()%>
<%= ds.getMedicur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= shftclsfRec.ciymgbcd%>
<%= shftclsfRec.cicdgb%>
<%= shftclsfRec.cicodeval%>
<%= shftclsfRec.cicdnm%>
<%= shftclsfRec.cicdynm%>
<%= aplcclsfRec.ciymgbcd%>
<%= aplcclsfRec.cicdgb%>
<%= aplcclsfRec.cicodeval%>
<%= aplcclsfRec.cicdnm%>
<%= aplcclsfRec.cicdynm%>
<%= aplcprocstatRec.ciymgbcd%>
<%= aplcprocstatRec.cicdgb%>
<%= aplcprocstatRec.cicodeval%>
<%= aplcprocstatRec.cicdnm%>
<%= aplcprocstatRec.cicdynm%>
<%= jycurRec.areacd%>
<%= jycurRec.areanm%>
<%= medicurRec.cicodeval%>
<%= medicurRec.cicdnm%>
<%= medicurRec.ciymgbcd%>
<%= medicurRec.cicdgb%>
<%= medicurRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 30 10:25:25 KST 2017 */