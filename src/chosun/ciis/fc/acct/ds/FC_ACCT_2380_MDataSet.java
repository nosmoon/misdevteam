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


public class FC_ACCT_2380_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList incom_clsf = new ArrayList();
	public ArrayList mang_clsf = new ArrayList();
	public ArrayList medi = new ArrayList();
	public ArrayList biz_cd = new ArrayList();
	public ArrayList dlco_clsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2380_MDataSet(){}
	public FC_ACCT_2380_MDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			FC_ACCT_2380_MDLCO_CLSFRecord rec = new FC_ACCT_2380_MDLCO_CLSFRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.dlco_clsf.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			FC_ACCT_2380_MMANG_CLSFRecord rec = new FC_ACCT_2380_MMANG_CLSFRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.mang_clsf.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(6);
		while(rset3.next()){
			FC_ACCT_2380_MINCOM_CLSFRecord rec = new FC_ACCT_2380_MINCOM_CLSFRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.incom_clsf.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(7);
		while(rset4.next()){
			FC_ACCT_2380_MBIZ_CDRecord rec = new FC_ACCT_2380_MBIZ_CDRecord();
			rec.cd_nm = Util.checkString(rset4.getString("cd_nm"));
			rec.cd = Util.checkString(rset4.getString("cd"));
			this.biz_cd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(8);
		while(rset5.next()){
			FC_ACCT_2380_MMEDIRecord rec = new FC_ACCT_2380_MMEDIRecord();
			rec.cd_nm = Util.checkString(rset5.getString("cd_nm"));
			rec.cd = Util.checkString(rset5.getString("cd"));
			this.medi.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2380_MDataSet ds = (FC_ACCT_2380_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.dlco_clsf.size(); i++){
		FC_ACCT_2380_MDLCO_CLSFRecord dlco_clsfRec = (FC_ACCT_2380_MDLCO_CLSFRecord)ds.dlco_clsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mang_clsf.size(); i++){
		FC_ACCT_2380_MMANG_CLSFRecord mang_clsfRec = (FC_ACCT_2380_MMANG_CLSFRecord)ds.mang_clsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.incom_clsf.size(); i++){
		FC_ACCT_2380_MINCOM_CLSFRecord incom_clsfRec = (FC_ACCT_2380_MINCOM_CLSFRecord)ds.incom_clsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.biz_cd.size(); i++){
		FC_ACCT_2380_MBIZ_CDRecord biz_cdRec = (FC_ACCT_2380_MBIZ_CDRecord)ds.biz_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi.size(); i++){
		FC_ACCT_2380_MMEDIRecord mediRec = (FC_ACCT_2380_MMEDIRecord)ds.medi.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsf()%>
<%= ds.getMang_clsf()%>
<%= ds.getIncom_clsf()%>
<%= ds.getBiz_cd()%>
<%= ds.getMedi()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= dlco_clsfRec.cd_nm%>
<%= dlco_clsfRec.cd%>
<%= mang_clsfRec.cd_nm%>
<%= mang_clsfRec.cd%>
<%= incom_clsfRec.cd_nm%>
<%= incom_clsfRec.cd%>
<%= biz_cdRec.cd_nm%>
<%= biz_cdRec.cd%>
<%= mediRec.cd_nm%>
<%= mediRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 11:34:01 KST 2009 */