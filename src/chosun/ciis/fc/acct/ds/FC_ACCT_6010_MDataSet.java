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


public class FC_ACCT_6010_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curslip_clsf3 = new ArrayList();
	public ArrayList curslip_clsf2 = new ArrayList();
	public ArrayList curslip_clsf1 = new ArrayList();
	public ArrayList curprof_cd = new ArrayList();
	public ArrayList elec_tax_comp_cd = new ArrayList();
	public ArrayList curerpalced_cd = new ArrayList();
	public ArrayList re_issu_resn_cd = new ArrayList();
	public ArrayList curdlco_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_ss_emp_yn;
	public String xx_prof_type_cd;

	public FC_ACCT_6010_MDataSet(){}
	public FC_ACCT_6010_MDataSet(String errcode, String errmsg, String xx_ss_emp_yn, String xx_prof_type_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_ss_emp_yn = xx_ss_emp_yn;
		this.xx_prof_type_cd = xx_prof_type_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_ss_emp_yn(String xx_ss_emp_yn){
		this.xx_ss_emp_yn = xx_ss_emp_yn;
	}

	public void setXx_prof_type_cd(String xx_prof_type_cd){
		this.xx_prof_type_cd = xx_prof_type_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_ss_emp_yn(){
		return this.xx_ss_emp_yn;
	}

	public String getXx_prof_type_cd(){
		return this.xx_prof_type_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_6010_MCURSLIP_CLSF1Record rec = new FC_ACCT_6010_MCURSLIP_CLSF1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curslip_clsf1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_6010_MCURSLIP_CLSF2Record rec = new FC_ACCT_6010_MCURSLIP_CLSF2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curslip_clsf2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_6010_MCURSLIP_CLSF3Record rec = new FC_ACCT_6010_MCURSLIP_CLSF3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curslip_clsf3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_6010_MCURPROF_CDRecord rec = new FC_ACCT_6010_MCURPROF_CDRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curprof_cd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_6010_MCURERPALCED_CDRecord rec = new FC_ACCT_6010_MCURERPALCED_CDRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.curerpalced_cd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			FC_ACCT_6010_MCURDLCO_CLSF_CDRecord rec = new FC_ACCT_6010_MCURDLCO_CLSF_CDRecord();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.curdlco_clsf_cd.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			FC_ACCT_6010_MELEC_TAX_COMP_CDRecord rec = new FC_ACCT_6010_MELEC_TAX_COMP_CDRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.elec_tax_comp_cd.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			FC_ACCT_6010_MRE_ISSU_RESN_CDRecord rec = new FC_ACCT_6010_MRE_ISSU_RESN_CDRecord();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.re_issu_resn_cd.add(rec);
		}
		this.xx_ss_emp_yn = Util.checkString(cstmt.getString(13));
		this.xx_prof_type_cd = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6010_MDataSet ds = (FC_ACCT_6010_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curslip_clsf1.size(); i++){
		FC_ACCT_6010_MCURSLIP_CLSF1Record curslip_clsf1Rec = (FC_ACCT_6010_MCURSLIP_CLSF1Record)ds.curslip_clsf1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curslip_clsf2.size(); i++){
		FC_ACCT_6010_MCURSLIP_CLSF2Record curslip_clsf2Rec = (FC_ACCT_6010_MCURSLIP_CLSF2Record)ds.curslip_clsf2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curslip_clsf3.size(); i++){
		FC_ACCT_6010_MCURSLIP_CLSF3Record curslip_clsf3Rec = (FC_ACCT_6010_MCURSLIP_CLSF3Record)ds.curslip_clsf3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curprof_cd.size(); i++){
		FC_ACCT_6010_MCURPROF_CDRecord curprof_cdRec = (FC_ACCT_6010_MCURPROF_CDRecord)ds.curprof_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curerpalced_cd.size(); i++){
		FC_ACCT_6010_MCURERPALCED_CDRecord curerpalced_cdRec = (FC_ACCT_6010_MCURERPALCED_CDRecord)ds.curerpalced_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdlco_clsf_cd.size(); i++){
		FC_ACCT_6010_MCURDLCO_CLSF_CDRecord curdlco_clsf_cdRec = (FC_ACCT_6010_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.elec_tax_comp_cd.size(); i++){
		FC_ACCT_6010_MELEC_TAX_COMP_CDRecord elec_tax_comp_cdRec = (FC_ACCT_6010_MELEC_TAX_COMP_CDRecord)ds.elec_tax_comp_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.re_issu_resn_cd.size(); i++){
		FC_ACCT_6010_MRE_ISSU_RESN_CDRecord re_issu_resn_cdRec = (FC_ACCT_6010_MRE_ISSU_RESN_CDRecord)ds.re_issu_resn_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurslip_clsf1()%>
<%= ds.getCurslip_clsf2()%>
<%= ds.getCurslip_clsf3()%>
<%= ds.getCurprof_cd()%>
<%= ds.getCurerpalced_cd()%>
<%= ds.getCurdlco_clsf_cd()%>
<%= ds.getElec_tax_comp_cd()%>
<%= ds.getRe_issu_resn_cd()%>
<%= ds.getXx_ss_emp_yn()%>
<%= ds.getXx_prof_type_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curslip_clsf1Rec.cd%>
<%= curslip_clsf1Rec.cdnm%>
<%= curslip_clsf1Rec.cd_abrv_nm%>
<%= curslip_clsf1Rec.cdnm_cd%>
<%= curslip_clsf1Rec.cdabrvnm_cd%>
<%= curslip_clsf2Rec.cd%>
<%= curslip_clsf2Rec.cdnm%>
<%= curslip_clsf2Rec.cd_abrv_nm%>
<%= curslip_clsf2Rec.cdnm_cd%>
<%= curslip_clsf2Rec.cdabrvnm_cd%>
<%= curslip_clsf3Rec.cd%>
<%= curslip_clsf3Rec.cdnm%>
<%= curslip_clsf3Rec.cd_abrv_nm%>
<%= curslip_clsf3Rec.cdnm_cd%>
<%= curslip_clsf3Rec.cdabrvnm_cd%>
<%= curprof_cdRec.cd%>
<%= curprof_cdRec.cdnm%>
<%= curprof_cdRec.cd_abrv_nm%>
<%= curprof_cdRec.cdnm_cd%>
<%= curprof_cdRec.cdabrvnm_cd%>
<%= curerpalced_cdRec.cd%>
<%= curerpalced_cdRec.cdnm%>
<%= curerpalced_cdRec.cd_abrv_nm%>
<%= curerpalced_cdRec.cdnm_cd%>
<%= curerpalced_cdRec.cdabrvnm_cd%>
<%= curdlco_clsf_cdRec.cd%>
<%= curdlco_clsf_cdRec.cdnm%>
<%= curdlco_clsf_cdRec.cd_abrv_nm%>
<%= curdlco_clsf_cdRec.cdnm_cd%>
<%= curdlco_clsf_cdRec.cdabrvnm_cd%>
<%= elec_tax_comp_cdRec.cd%>
<%= elec_tax_comp_cdRec.cdnm%>
<%= elec_tax_comp_cdRec.cd_abrv_nm%>
<%= elec_tax_comp_cdRec.cdnm_cd%>
<%= elec_tax_comp_cdRec.cdabrvnm_cd%>
<%= re_issu_resn_cdRec.cd%>
<%= re_issu_resn_cdRec.cdnm%>
<%= re_issu_resn_cdRec.cd_abrv_nm%>
<%= re_issu_resn_cdRec.cdnm_cd%>
<%= re_issu_resn_cdRec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 03 13:56:39 KST 2018 */