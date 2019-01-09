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


public class FC_ACCT_2410_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList chnl_clsf_cd_curlist = new ArrayList();
	public ArrayList medi_cd = new ArrayList();
	public ArrayList slip_clsf_cd = new ArrayList();
	public ArrayList mang_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_srch_dlco_clsf_cd;
	public String xx_job_clsf_02;
	public String xx_cd_clsf_030;
	public String xx_g_tag;
	public String xx_g_tag2;
	public String xx_srch_acct_cd;

	public FC_ACCT_2410_MDataSet(){}
	public FC_ACCT_2410_MDataSet(String errcode, String errmsg, String xx_srch_dlco_clsf_cd, String xx_job_clsf_02, String xx_cd_clsf_030, String xx_g_tag, String xx_g_tag2, String xx_srch_acct_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_srch_dlco_clsf_cd = xx_srch_dlco_clsf_cd;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_cd_clsf_030 = xx_cd_clsf_030;
		this.xx_g_tag = xx_g_tag;
		this.xx_g_tag2 = xx_g_tag2;
		this.xx_srch_acct_cd = xx_srch_acct_cd;
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

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_cd_clsf_030(String xx_cd_clsf_030){
		this.xx_cd_clsf_030 = xx_cd_clsf_030;
	}

	public void setXx_g_tag(String xx_g_tag){
		this.xx_g_tag = xx_g_tag;
	}

	public void setXx_g_tag2(String xx_g_tag2){
		this.xx_g_tag2 = xx_g_tag2;
	}

	public void setXx_srch_acct_cd(String xx_srch_acct_cd){
		this.xx_srch_acct_cd = xx_srch_acct_cd;
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

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_cd_clsf_030(){
		return this.xx_cd_clsf_030;
	}

	public String getXx_g_tag(){
		return this.xx_g_tag;
	}

	public String getXx_g_tag2(){
		return this.xx_g_tag2;
	}

	public String getXx_srch_acct_cd(){
		return this.xx_srch_acct_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_ACCT_2410_MSLIP_CLSF_CDRecord rec = new FC_ACCT_2410_MSLIP_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.slip_clsf_cd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_ACCT_2410_MMEDI_CDRecord rec = new FC_ACCT_2410_MMEDI_CDRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.medi_cd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			FC_ACCT_2410_MMANG_CLSF_CDRecord rec = new FC_ACCT_2410_MMANG_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			this.mang_clsf_cd.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			FC_ACCT_2410_MCHNL_CLSF_CD_CURLISTRecord rec = new FC_ACCT_2410_MCHNL_CLSF_CD_CURLISTRecord();
			rec.cd_nm = Util.checkString(rset3.getString("cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			this.chnl_clsf_cd_curlist.add(rec);
		}
		this.xx_srch_dlco_clsf_cd = Util.checkString(cstmt.getString(9));
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(10));
		this.xx_cd_clsf_030 = Util.checkString(cstmt.getString(11));
		this.xx_g_tag = Util.checkString(cstmt.getString(12));
		this.xx_g_tag2 = Util.checkString(cstmt.getString(13));
		this.xx_srch_acct_cd = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2410_MDataSet ds = (FC_ACCT_2410_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.slip_clsf_cd.size(); i++){
		FC_ACCT_2410_MSLIP_CLSF_CDRecord slip_clsf_cdRec = (FC_ACCT_2410_MSLIP_CLSF_CDRecord)ds.slip_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medi_cd.size(); i++){
		FC_ACCT_2410_MMEDI_CDRecord medi_cdRec = (FC_ACCT_2410_MMEDI_CDRecord)ds.medi_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.mang_clsf_cd.size(); i++){
		FC_ACCT_2410_MMANG_CLSF_CDRecord mang_clsf_cdRec = (FC_ACCT_2410_MMANG_CLSF_CDRecord)ds.mang_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chnl_clsf_cd_curlist.size(); i++){
		FC_ACCT_2410_MCHNL_CLSF_CD_CURLISTRecord chnl_clsf_cd_curlistRec = (FC_ACCT_2410_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSlip_clsf_cd()%>
<%= ds.getMedi_cd()%>
<%= ds.getMang_clsf_cd()%>
<%= ds.getChnl_clsf_cd_curlist()%>
<%= ds.getXx_srch_dlco_clsf_cd()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_cd_clsf_030()%>
<%= ds.getXx_g_tag()%>
<%= ds.getXx_g_tag2()%>
<%= ds.getXx_srch_acct_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= slip_clsf_cdRec.cd_nm%>
<%= slip_clsf_cdRec.cd%>
<%= medi_cdRec.cd_nm%>
<%= medi_cdRec.cd%>
<%= mang_clsf_cdRec.cd_nm%>
<%= mang_clsf_cdRec.cd%>
<%= chnl_clsf_cd_curlistRec.cd_nm%>
<%= chnl_clsf_cd_curlistRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 23 16:44:11 KST 2014 */