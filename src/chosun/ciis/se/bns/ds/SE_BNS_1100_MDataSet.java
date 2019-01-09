/***************************************************************************************************
* 파일명 : SE_BNS_1100_MDataSet.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1100_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList biclascdlist = new ArrayList();
	public ArrayList sendclsflist = new ArrayList();
	public ArrayList stmtissulist = new ArrayList();
	public ArrayList medilist = new ArrayList();
	public ArrayList psclsflist = new ArrayList();
	public ArrayList stmtitemlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_1100_MDataSet(){}
	public SE_BNS_1100_MDataSet(String errcode, String errmsg){
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
			SE_BNS_1100_MMEDILISTRecord rec = new SE_BNS_1100_MMEDILISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.medilist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SE_BNS_1100_MBICLASCDLISTRecord rec = new SE_BNS_1100_MBICLASCDLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.biclascdlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SE_BNS_1100_MSENDCLSFLISTRecord rec = new SE_BNS_1100_MSENDCLSFLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.sendclsflist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			SE_BNS_1100_MSTMTISSULISTRecord rec = new SE_BNS_1100_MSTMTISSULISTRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.stmtissulist.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			SE_BNS_1100_MPSCLSFLISTRecord rec = new SE_BNS_1100_MPSCLSFLISTRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.psclsflist.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			SE_BNS_1100_MSTMTITEMLISTRecord rec = new SE_BNS_1100_MSTMTITEMLISTRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.stmtitemlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_1100_MDataSet ds = (SE_BNS_1100_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medilist.size(); i++){
		SE_BNS_1100_MMEDILISTRecord medilistRec = (SE_BNS_1100_MMEDILISTRecord)ds.medilist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.biclascdlist.size(); i++){
		SE_BNS_1100_MBICLASCDLISTRecord biclascdlistRec = (SE_BNS_1100_MBICLASCDLISTRecord)ds.biclascdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsflist.size(); i++){
		SE_BNS_1100_MSENDCLSFLISTRecord sendclsflistRec = (SE_BNS_1100_MSENDCLSFLISTRecord)ds.sendclsflist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.stmtissulist.size(); i++){
		SE_BNS_1100_MSTMTISSULISTRecord stmtissulistRec = (SE_BNS_1100_MSTMTISSULISTRecord)ds.stmtissulist.get(i);%>
HTML 코드들....
	<%}%>
	
<%
	for(int i=0; i<ds.psclsflist.size(); i++){
		SE_BNS_1100_MPSCLSFLISTRecord psclsflistRec = (SE_BNS_1100_MPSCLSFLISTRecord)ds.psclsflist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedilist()%>
<%= ds.getBiclascdlist()%>
<%= ds.getSendclsflist()%>
<%= ds.getStmtissulist()%>
<%= ds.getPsclsflist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medilistRec.cd%>
<%= medilistRec.cdnm%>
<%= medilistRec.cd_abrv_nm%>
<%= medilistRec.cdnm_cd%>
<%= medilistRec.cdabrvnm_cd%>
<%= biclascdlistRec.cd%>
<%= biclascdlistRec.cdnm%>
<%= biclascdlistRec.cd_abrv_nm%>
<%= biclascdlistRec.cdnm_cd%>
<%= biclascdlistRec.cdabrvnm_cd%>
<%= sendclsflistRec.cd%>
<%= sendclsflistRec.cdnm%>
<%= sendclsflistRec.cd_abrv_nm%>
<%= sendclsflistRec.cdnm_cd%>
<%= sendclsflistRec.cdabrvnm_cd%>
<%= stmtissulistRec.cd%>
<%= stmtissulistRec.cdnm%>
<%= stmtissulistRec.cd_abrv_nm%>
<%= stmtissulistRec.cdnm_cd%>
<%= stmtissulistRec.cdabrvnm_cd%>
<%= psclsflistRec.cd%>
<%= psclsflistRec.cdnm%>
<%= psclsflistRec.cd_abrv_nm%>
<%= psclsflistRec.cdnm_cd%>
<%= psclsflistRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 10:07:49 KST 2009 */