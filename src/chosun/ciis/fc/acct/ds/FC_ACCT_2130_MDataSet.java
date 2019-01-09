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


public class FC_ACCT_2130_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedi_cd = new ArrayList();
	public ArrayList curslip_clsf = new ArrayList();
	public ArrayList curprof_cd = new ArrayList();
	public ArrayList curerpalced_cd = new ArrayList();
	public ArrayList curdlco_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_slip_clsf_cd;
	public String xx_prof_type_cd_010;
	public String xx_prof_type_cd_020;
	public String xx_prof_type_cd_030;
	public String xx_prof_type_cd_040;
	public String xx_prof_type_cd_050;
	public String xx_prof_type_cd_060;
	public String xx_budg_cd_010;
	public String xx_budg_cd_020;
	public String xx_budg_cd_030;
	public String xx_budg_cd_040;
	public String xx_budg_cd_050;

	public FC_ACCT_2130_MDataSet(){}
	public FC_ACCT_2130_MDataSet(String errcode, String errmsg, String xx_slip_clsf_cd, String xx_prof_type_cd_010, String xx_prof_type_cd_020, String xx_prof_type_cd_030, String xx_prof_type_cd_040, String xx_prof_type_cd_050, String xx_prof_type_cd_060, String xx_budg_cd_010, String xx_budg_cd_020, String xx_budg_cd_030, String xx_budg_cd_040, String xx_budg_cd_050){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
		this.xx_prof_type_cd_010 = xx_prof_type_cd_010;
		this.xx_prof_type_cd_020 = xx_prof_type_cd_020;
		this.xx_prof_type_cd_030 = xx_prof_type_cd_030;
		this.xx_prof_type_cd_040 = xx_prof_type_cd_040;
		this.xx_prof_type_cd_050 = xx_prof_type_cd_050;
		this.xx_prof_type_cd_060 = xx_prof_type_cd_060;
		this.xx_budg_cd_010 = xx_budg_cd_010;
		this.xx_budg_cd_020 = xx_budg_cd_020;
		this.xx_budg_cd_030 = xx_budg_cd_030;
		this.xx_budg_cd_040 = xx_budg_cd_040;
		this.xx_budg_cd_050 = xx_budg_cd_050;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_clsf_cd(String xx_slip_clsf_cd){
		this.xx_slip_clsf_cd = xx_slip_clsf_cd;
	}

	public void setXx_prof_type_cd_010(String xx_prof_type_cd_010){
		this.xx_prof_type_cd_010 = xx_prof_type_cd_010;
	}

	public void setXx_prof_type_cd_020(String xx_prof_type_cd_020){
		this.xx_prof_type_cd_020 = xx_prof_type_cd_020;
	}

	public void setXx_prof_type_cd_030(String xx_prof_type_cd_030){
		this.xx_prof_type_cd_030 = xx_prof_type_cd_030;
	}

	public void setXx_prof_type_cd_040(String xx_prof_type_cd_040){
		this.xx_prof_type_cd_040 = xx_prof_type_cd_040;
	}

	public void setXx_prof_type_cd_050(String xx_prof_type_cd_050){
		this.xx_prof_type_cd_050 = xx_prof_type_cd_050;
	}

	public void setXx_prof_type_cd_060(String xx_prof_type_cd_060){
		this.xx_prof_type_cd_060 = xx_prof_type_cd_060;
	}

	public void setXx_budg_cd_010(String xx_budg_cd_010){
		this.xx_budg_cd_010 = xx_budg_cd_010;
	}

	public void setXx_budg_cd_020(String xx_budg_cd_020){
		this.xx_budg_cd_020 = xx_budg_cd_020;
	}

	public void setXx_budg_cd_030(String xx_budg_cd_030){
		this.xx_budg_cd_030 = xx_budg_cd_030;
	}

	public void setXx_budg_cd_040(String xx_budg_cd_040){
		this.xx_budg_cd_040 = xx_budg_cd_040;
	}

	public void setXx_budg_cd_050(String xx_budg_cd_050){
		this.xx_budg_cd_050 = xx_budg_cd_050;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_clsf_cd(){
		return this.xx_slip_clsf_cd;
	}

	public String getXx_prof_type_cd_010(){
		return this.xx_prof_type_cd_010;
	}

	public String getXx_prof_type_cd_020(){
		return this.xx_prof_type_cd_020;
	}

	public String getXx_prof_type_cd_030(){
		return this.xx_prof_type_cd_030;
	}

	public String getXx_prof_type_cd_040(){
		return this.xx_prof_type_cd_040;
	}

	public String getXx_prof_type_cd_050(){
		return this.xx_prof_type_cd_050;
	}

	public String getXx_prof_type_cd_060(){
		return this.xx_prof_type_cd_060;
	}

	public String getXx_budg_cd_010(){
		return this.xx_budg_cd_010;
	}

	public String getXx_budg_cd_020(){
		return this.xx_budg_cd_020;
	}

	public String getXx_budg_cd_030(){
		return this.xx_budg_cd_030;
	}

	public String getXx_budg_cd_040(){
		return this.xx_budg_cd_040;
	}

	public String getXx_budg_cd_050(){
		return this.xx_budg_cd_050;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2130_MCURSLIP_CLSFRecord rec = new FC_ACCT_2130_MCURSLIP_CLSFRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curslip_clsf.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2130_MCURMEDI_CDRecord rec = new FC_ACCT_2130_MCURMEDI_CDRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curmedi_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2130_MCURPROF_CDRecord rec = new FC_ACCT_2130_MCURPROF_CDRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curprof_cd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2130_MCURERPALCED_CDRecord rec = new FC_ACCT_2130_MCURERPALCED_CDRecord();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curerpalced_cd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			FC_ACCT_2130_MCURDLCO_CLSF_CDRecord rec = new FC_ACCT_2130_MCURDLCO_CLSF_CDRecord();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.curdlco_clsf_cd.add(rec);
		}
		this.xx_slip_clsf_cd = Util.checkString(cstmt.getString(10));
		this.xx_prof_type_cd_010 = Util.checkString(cstmt.getString(11));
		this.xx_prof_type_cd_020 = Util.checkString(cstmt.getString(12));
		this.xx_prof_type_cd_030 = Util.checkString(cstmt.getString(13));
		this.xx_prof_type_cd_040 = Util.checkString(cstmt.getString(14));
		this.xx_prof_type_cd_050 = Util.checkString(cstmt.getString(15));
		this.xx_prof_type_cd_060 = Util.checkString(cstmt.getString(16));
		this.xx_budg_cd_010 = Util.checkString(cstmt.getString(17));
		this.xx_budg_cd_020 = Util.checkString(cstmt.getString(18));
		this.xx_budg_cd_030 = Util.checkString(cstmt.getString(19));
		this.xx_budg_cd_040 = Util.checkString(cstmt.getString(20));
		this.xx_budg_cd_050 = Util.checkString(cstmt.getString(21));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2130_MDataSet ds = (FC_ACCT_2130_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curslip_clsf.size(); i++){
		FC_ACCT_2130_MCURSLIP_CLSFRecord curslip_clsfRec = (FC_ACCT_2130_MCURSLIP_CLSFRecord)ds.curslip_clsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedi_cd.size(); i++){
		FC_ACCT_2130_MCURMEDI_CDRecord curmedi_cdRec = (FC_ACCT_2130_MCURMEDI_CDRecord)ds.curmedi_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curprof_cd.size(); i++){
		FC_ACCT_2130_MCURPROF_CDRecord curprof_cdRec = (FC_ACCT_2130_MCURPROF_CDRecord)ds.curprof_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curerpalced_cd.size(); i++){
		FC_ACCT_2130_MCURERPALCED_CDRecord curerpalced_cdRec = (FC_ACCT_2130_MCURERPALCED_CDRecord)ds.curerpalced_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdlco_clsf_cd.size(); i++){
		FC_ACCT_2130_MCURDLCO_CLSF_CDRecord curdlco_clsf_cdRec = (FC_ACCT_2130_MCURDLCO_CLSF_CDRecord)ds.curdlco_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurslip_clsf()%>
<%= ds.getCurmedi_cd()%>
<%= ds.getCurprof_cd()%>
<%= ds.getCurerpalced_cd()%>
<%= ds.getCurdlco_clsf_cd()%>
<%= ds.getXx_slip_clsf_cd()%>
<%= ds.getXx_prof_type_cd_010()%>
<%= ds.getXx_prof_type_cd_020()%>
<%= ds.getXx_prof_type_cd_030()%>
<%= ds.getXx_prof_type_cd_040()%>
<%= ds.getXx_prof_type_cd_050()%>
<%= ds.getXx_prof_type_cd_060()%>
<%= ds.getXx_budg_cd_010()%>
<%= ds.getXx_budg_cd_020()%>
<%= ds.getXx_budg_cd_030()%>
<%= ds.getXx_budg_cd_040()%>
<%= ds.getXx_budg_cd_050()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curslip_clsfRec.cd%>
<%= curslip_clsfRec.cdnm%>
<%= curslip_clsfRec.cd_abrv_nm%>
<%= curslip_clsfRec.cdnm_cd%>
<%= curslip_clsfRec.cdabrvnm_cd%>
<%= curmedi_cdRec.cd%>
<%= curmedi_cdRec.cdnm%>
<%= curmedi_cdRec.cd_abrv_nm%>
<%= curmedi_cdRec.cdnm_cd%>
<%= curmedi_cdRec.cdabrvnm_cd%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 10 16:42:40 KST 2012 */