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


package chosun.ciis.sp.sup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1420_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String acpn_no;
	public String acpn_pers;
	public String acpn_pers_nm;
	public String acpn_dt;
	public String acpn_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String adms_dstc_cd_nm;
	public String ptph_no;
	public String chrg_pers_nm;
	public String tel_no;
	public String rdr_nm;
	public String cns_ptcr;
	public String cns_cont_clsf_1;
	public String cns_cont_clsf_2;
	public String cns_cont_clsf_3;

	public SP_SUP_1420_SDataSet(){}
	public SP_SUP_1420_SDataSet(String errcode, String errmsg, String acpn_no, String acpn_pers, String acpn_pers_nm, String acpn_dt, String acpn_clsf, String dlco_no, String dlco_nm, String adms_dstc_cd_nm, String ptph_no, String chrg_pers_nm, String tel_no, String rdr_nm, String cns_ptcr, String cns_cont_clsf_1, String cns_cont_clsf_2, String cns_cont_clsf_3){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.acpn_no = acpn_no;
		this.acpn_pers = acpn_pers;
		this.acpn_pers_nm = acpn_pers_nm;
		this.acpn_dt = acpn_dt;
		this.acpn_clsf = acpn_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
		this.ptph_no = ptph_no;
		this.chrg_pers_nm = chrg_pers_nm;
		this.tel_no = tel_no;
		this.rdr_nm = rdr_nm;
		this.cns_ptcr = cns_ptcr;
		this.cns_cont_clsf_1 = cns_cont_clsf_1;
		this.cns_cont_clsf_2 = cns_cont_clsf_2;
		this.cns_cont_clsf_3 = cns_cont_clsf_3;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAcpn_no(String acpn_no){
		this.acpn_no = acpn_no;
	}

	public void setAcpn_pers(String acpn_pers){
		this.acpn_pers = acpn_pers;
	}

	public void setAcpn_pers_nm(String acpn_pers_nm){
		this.acpn_pers_nm = acpn_pers_nm;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setAcpn_clsf(String acpn_clsf){
		this.acpn_clsf = acpn_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdms_dstc_cd_nm(String adms_dstc_cd_nm){
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setCns_ptcr(String cns_ptcr){
		this.cns_ptcr = cns_ptcr;
	}

	public void setCns_cont_clsf_1(String cns_cont_clsf_1){
		this.cns_cont_clsf_1 = cns_cont_clsf_1;
	}

	public void setCns_cont_clsf_2(String cns_cont_clsf_2){
		this.cns_cont_clsf_2 = cns_cont_clsf_2;
	}

	public void setCns_cont_clsf_3(String cns_cont_clsf_3){
		this.cns_cont_clsf_3 = cns_cont_clsf_3;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAcpn_no(){
		return this.acpn_no;
	}

	public String getAcpn_pers(){
		return this.acpn_pers;
	}

	public String getAcpn_pers_nm(){
		return this.acpn_pers_nm;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getAcpn_clsf(){
		return this.acpn_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdms_dstc_cd_nm(){
		return this.adms_dstc_cd_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getCns_ptcr(){
		return this.cns_ptcr;
	}

	public String getCns_cont_clsf_1(){
		return this.cns_cont_clsf_1;
	}

	public String getCns_cont_clsf_2(){
		return this.cns_cont_clsf_2;
	}

	public String getCns_cont_clsf_3(){
		return this.cns_cont_clsf_3;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.acpn_no = Util.checkString(cstmt.getString(8));
		this.acpn_pers = Util.checkString(cstmt.getString(9));
		this.acpn_pers_nm = Util.checkString(cstmt.getString(10));
		this.acpn_dt = Util.checkString(cstmt.getString(11));
		this.acpn_clsf = Util.checkString(cstmt.getString(12));
		this.dlco_no = Util.checkString(cstmt.getString(13));
		this.dlco_nm = Util.checkString(cstmt.getString(14));
		this.adms_dstc_cd_nm = Util.checkString(cstmt.getString(15));
		this.ptph_no = Util.checkString(cstmt.getString(16));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(17));
		this.tel_no = Util.checkString(cstmt.getString(18));
		this.rdr_nm = Util.checkString(cstmt.getString(19));
		this.cns_ptcr = Util.checkString(cstmt.getString(20));
		this.cns_cont_clsf_1 = Util.checkString(cstmt.getString(21));
		this.cns_cont_clsf_2 = Util.checkString(cstmt.getString(22));
		this.cns_cont_clsf_3 = Util.checkString(cstmt.getString(23));
		ResultSet rset0 = (ResultSet) cstmt.getObject(24);
		while(rset0.next()){
			SP_SUP_1420_SCURLIST1Record rec = new SP_SUP_1420_SCURLIST1Record();
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.rdr_nm = Util.checkString(rset0.getString("rdr_nm"));
			rec.cns_ptcr = Util.checkString(rset0.getString("cns_ptcr"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(25);
		while(rset1.next()){
			SP_SUP_1420_SCURLIST2Record rec = new SP_SUP_1420_SCURLIST2Record();
			rec.acpn_dt = Util.checkString(rset1.getString("acpn_dt"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.rdr_nm = Util.checkString(rset1.getString("rdr_nm"));
			rec.cns_clsf_nm = Util.checkString(rset1.getString("cns_clsf_nm"));
			rec.cns_ptcr = Util.checkString(rset1.getString("cns_ptcr"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1420_SDataSet ds = (SP_SUP_1420_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SUP_1420_SCURLIST1Record curlist1Rec = (SP_SUP_1420_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		SP_SUP_1420_SCURLIST2Record curlist2Rec = (SP_SUP_1420_SCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAcpn_no()%>
<%= ds.getAcpn_pers()%>
<%= ds.getAcpn_pers_nm()%>
<%= ds.getAcpn_dt()%>
<%= ds.getAcpn_clsf()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getAdms_dstc_cd_nm()%>
<%= ds.getPtph_no()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getTel_no()%>
<%= ds.getRdr_nm()%>
<%= ds.getCns_ptcr()%>
<%= ds.getCns_cont_clsf_1()%>
<%= ds.getCns_cont_clsf_2()%>
<%= ds.getCns_cont_clsf_3()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.acpn_dt%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.rdr_nm%>
<%= curlist1Rec.cns_ptcr%>
<%= curlist2Rec.acpn_dt%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.rdr_nm%>
<%= curlist2Rec.cns_clsf_nm%>
<%= curlist2Rec.cns_ptcr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 23:06:01 KST 2012 */