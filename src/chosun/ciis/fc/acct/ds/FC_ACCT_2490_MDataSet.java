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


public class FC_ACCT_2490_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medi_cd = new ArrayList();
	public ArrayList dept_budg_cd = new ArrayList();
	public ArrayList dlco_clsf_cd = new ArrayList();
	public ArrayList slip_clsf_cd = new ArrayList();
	public ArrayList dept_cd = new ArrayList();
	public ArrayList mang_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_srch_dlco_clsf_cd;
	public String xx_g_tag;

	public FC_ACCT_2490_MDataSet(){}
	public FC_ACCT_2490_MDataSet(String errcode, String errmsg, String xx_srch_dlco_clsf_cd, String xx_g_tag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_srch_dlco_clsf_cd = xx_srch_dlco_clsf_cd;
		this.xx_g_tag = xx_g_tag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_srch_dlco_clsf_cd(String xx_srch_dlco_clsf_cd){
		this.xx_srch_dlco_clsf_cd = xx_srch_dlco_clsf_cd;
	}

	public void setXx_g_tag(String xx_g_tag){
		this.xx_g_tag = xx_g_tag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_srch_dlco_clsf_cd(){
		return this.xx_srch_dlco_clsf_cd;
	}

	public String getXx_g_tag(){
		return this.xx_g_tag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_2490_MSLIP_CLSF_CDRecord rec = new FC_ACCT_2490_MSLIP_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.slip_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			FC_ACCT_2490_MMEDI_CDRecord rec = new FC_ACCT_2490_MMEDI_CDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.medi_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			FC_ACCT_2490_MDLCO_CLSF_CDRecord rec = new FC_ACCT_2490_MDLCO_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.dlco_clsf_cd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			FC_ACCT_2490_MMANG_CLSF_CDRecord rec = new FC_ACCT_2490_MMANG_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.mang_clsf_cd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			FC_ACCT_2490_MDEPT_BUDG_CDRecord rec = new FC_ACCT_2490_MDEPT_BUDG_CDRecord();
			rec.cd_nm = Util.checkString(rset4.getString("cd_nm"));
			rec.cd = Util.checkString(rset4.getString("cd"));
			this.dept_budg_cd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			FC_ACCT_2490_MDEPT_CDRecord rec = new FC_ACCT_2490_MDEPT_CDRecord();
			rec.cd_nm = Util.checkString(rset5.getString("cd_nm"));
			rec.cd = Util.checkString(rset5.getString("cd"));
			this.dept_cd.add(rec);
		}
		this.xx_srch_dlco_clsf_cd = Util.checkString(cstmt.getString(14));
		this.xx_g_tag = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2490_MDataSet ds = (FC_ACCT_2490_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.slip_clsf_cd.size(); i++){
		FC_ACCT_2490_MSLIP_CLSF_CDRecord slip_clsf_cdRec = (FC_ACCT_2490_MSLIP_CLSF_CDRecord)ds.slip_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cd.size(); i++){
		FC_ACCT_2490_MMEDI_CDRecord medi_cdRec = (FC_ACCT_2490_MMEDI_CDRecord)ds.medi_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlco_clsf_cd.size(); i++){
		FC_ACCT_2490_MDLCO_CLSF_CDRecord dlco_clsf_cdRec = (FC_ACCT_2490_MDLCO_CLSF_CDRecord)ds.dlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mang_clsf_cd.size(); i++){
		FC_ACCT_2490_MMANG_CLSF_CDRecord mang_clsf_cdRec = (FC_ACCT_2490_MMANG_CLSF_CDRecord)ds.mang_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dept_budg_cd.size(); i++){
		FC_ACCT_2490_MDEPT_BUDG_CDRecord dept_budg_cdRec = (FC_ACCT_2490_MDEPT_BUDG_CDRecord)ds.dept_budg_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dept_cd.size(); i++){
		FC_ACCT_2490_MDEPT_CDRecord dept_cdRec = (FC_ACCT_2490_MDEPT_CDRecord)ds.dept_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_clsf_cd()%>
<%= ds.getMedi_cd()%>
<%= ds.getDlco_clsf_cd()%>
<%= ds.getMang_clsf_cd()%>
<%= ds.getDept_budg_cd()%>
<%= ds.getDept_cd()%>
<%= ds.getXx_srch_dlco_clsf_cd()%>
<%= ds.getXx_g_tag()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= slip_clsf_cdRec.cd_nm%>
<%= slip_clsf_cdRec.cd%>
<%= medi_cdRec.cd_nm%>
<%= medi_cdRec.cd%>
<%= dlco_clsf_cdRec.cd_nm%>
<%= dlco_clsf_cdRec.cd%>
<%= mang_clsf_cdRec.cd_nm%>
<%= mang_clsf_cdRec.cd%>
<%= dept_budg_cdRec.cd_nm%>
<%= dept_budg_cdRec.cd%>
<%= dept_cdRec.cd_nm%>
<%= dept_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 03 11:28:33 KST 2012 */