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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdrcr_budg = new ArrayList();
	public ArrayList curdrcr_mang = new ArrayList();
	public ArrayList curdrcr_mang_clsf = new ArrayList();
	public ArrayList curdrcr_dtl = new ArrayList();
	public ArrayList curdrcr_compgb = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_cd_clsf_060;
	public String xx_whco_ndstb_cd;
	public String xx_medi_dstb_cd;
	public String xx_job_clsf_10;
	public String xx_cd_clsf_050;

	public MC_BUDG_1000_MDataSet(){}
	public MC_BUDG_1000_MDataSet(String errcode, String errmsg, String xx_cd_010, String xx_cd_020, String xx_cd_clsf_060, String xx_whco_ndstb_cd, String xx_medi_dstb_cd, String xx_job_clsf_10, String xx_cd_clsf_050){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_cd_clsf_060 = xx_cd_clsf_060;
		this.xx_whco_ndstb_cd = xx_whco_ndstb_cd;
		this.xx_medi_dstb_cd = xx_medi_dstb_cd;
		this.xx_job_clsf_10 = xx_job_clsf_10;
		this.xx_cd_clsf_050 = xx_cd_clsf_050;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_cd_clsf_060(String xx_cd_clsf_060){
		this.xx_cd_clsf_060 = xx_cd_clsf_060;
	}

	public void setXx_whco_ndstb_cd(String xx_whco_ndstb_cd){
		this.xx_whco_ndstb_cd = xx_whco_ndstb_cd;
	}

	public void setXx_medi_dstb_cd(String xx_medi_dstb_cd){
		this.xx_medi_dstb_cd = xx_medi_dstb_cd;
	}

	public void setXx_job_clsf_10(String xx_job_clsf_10){
		this.xx_job_clsf_10 = xx_job_clsf_10;
	}

	public void setXx_cd_clsf_050(String xx_cd_clsf_050){
		this.xx_cd_clsf_050 = xx_cd_clsf_050;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_cd_clsf_060(){
		return this.xx_cd_clsf_060;
	}

	public String getXx_whco_ndstb_cd(){
		return this.xx_whco_ndstb_cd;
	}

	public String getXx_medi_dstb_cd(){
		return this.xx_medi_dstb_cd;
	}

	public String getXx_job_clsf_10(){
		return this.xx_job_clsf_10;
	}

	public String getXx_cd_clsf_050(){
		return this.xx_cd_clsf_050;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_BUDG_1000_MCURDRCR_BUDGRecord rec = new MC_BUDG_1000_MCURDRCR_BUDGRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curdrcr_budg.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MC_BUDG_1000_MCURDRCR_COMPGBRecord rec = new MC_BUDG_1000_MCURDRCR_COMPGBRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curdrcr_compgb.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			MC_BUDG_1000_MCURDRCR_MANGRecord rec = new MC_BUDG_1000_MCURDRCR_MANGRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.curdrcr_mang.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			MC_BUDG_1000_MCURDRCR_DTLRecord rec = new MC_BUDG_1000_MCURDRCR_DTLRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.curdrcr_dtl.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			MC_BUDG_1000_MCURDRCR_MANG_CLSFRecord rec = new MC_BUDG_1000_MCURDRCR_MANG_CLSFRecord();
			rec.cd_nm = Util.checkString(rset4.getString("cd_nm"));
			rec.cd = Util.checkString(rset4.getString("cd"));
			this.curdrcr_mang_clsf.add(rec);
		}
		this.xx_cd_010 = Util.checkString(cstmt.getString(10));
		this.xx_cd_020 = Util.checkString(cstmt.getString(11));
		this.xx_cd_clsf_060 = Util.checkString(cstmt.getString(12));
		this.xx_whco_ndstb_cd = Util.checkString(cstmt.getString(13));
		this.xx_medi_dstb_cd = Util.checkString(cstmt.getString(14));
		this.xx_job_clsf_10 = Util.checkString(cstmt.getString(15));
		this.xx_cd_clsf_050 = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1000_MDataSet ds = (MC_BUDG_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdrcr_budg.size(); i++){
		MC_BUDG_1000_MCURDRCR_BUDGRecord curdrcr_budgRec = (MC_BUDG_1000_MCURDRCR_BUDGRecord)ds.curdrcr_budg.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_compgb.size(); i++){
		MC_BUDG_1000_MCURDRCR_COMPGBRecord curdrcr_compgbRec = (MC_BUDG_1000_MCURDRCR_COMPGBRecord)ds.curdrcr_compgb.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_mang.size(); i++){
		MC_BUDG_1000_MCURDRCR_MANGRecord curdrcr_mangRec = (MC_BUDG_1000_MCURDRCR_MANGRecord)ds.curdrcr_mang.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_dtl.size(); i++){
		MC_BUDG_1000_MCURDRCR_DTLRecord curdrcr_dtlRec = (MC_BUDG_1000_MCURDRCR_DTLRecord)ds.curdrcr_dtl.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curdrcr_mang_clsf.size(); i++){
		MC_BUDG_1000_MCURDRCR_MANG_CLSFRecord curdrcr_mang_clsfRec = (MC_BUDG_1000_MCURDRCR_MANG_CLSFRecord)ds.curdrcr_mang_clsf.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdrcr_budg()%>
<%= ds.getCurdrcr_compgb()%>
<%= ds.getCurdrcr_mang()%>
<%= ds.getCurdrcr_dtl()%>
<%= ds.getCurdrcr_mang_clsf()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_cd_clsf_060()%>
<%= ds.getXx_whco_ndstb_cd()%>
<%= ds.getXx_medi_dstb_cd()%>
<%= ds.getXx_job_clsf_10()%>
<%= ds.getXx_cd_clsf_050()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdrcr_budgRec.cd_nm%>
<%= curdrcr_budgRec.cd%>
<%= curdrcr_compgbRec.cd_nm%>
<%= curdrcr_compgbRec.cd%>
<%= curdrcr_mangRec.cd_nm%>
<%= curdrcr_mangRec.cd%>
<%= curdrcr_dtlRec.cd_nm%>
<%= curdrcr_dtlRec.cd%>
<%= curdrcr_mang_clsfRec.cd_nm%>
<%= curdrcr_mang_clsfRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 17:33:36 KST 2012 */