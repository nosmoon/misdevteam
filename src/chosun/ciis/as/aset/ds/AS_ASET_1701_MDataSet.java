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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1701_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_job_clsf_02;
	public String xx_budg_cd;
	public String xx_budg_nm;
	public String xx_mang_cd_4;
	public String xx_cd_clsf;
	public String xx_occr_slip_clsf;

	public AS_ASET_1701_MDataSet(){}
	public AS_ASET_1701_MDataSet(String errcode, String errmsg, String xx_job_clsf_02, String xx_budg_cd, String xx_budg_nm, String xx_mang_cd_4, String xx_cd_clsf, String xx_occr_slip_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_budg_cd = xx_budg_cd;
		this.xx_budg_nm = xx_budg_nm;
		this.xx_mang_cd_4 = xx_mang_cd_4;
		this.xx_cd_clsf = xx_cd_clsf;
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_budg_cd(String xx_budg_cd){
		this.xx_budg_cd = xx_budg_cd;
	}

	public void setXx_budg_nm(String xx_budg_nm){
		this.xx_budg_nm = xx_budg_nm;
	}

	public void setXx_mang_cd_4(String xx_mang_cd_4){
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public void setXx_cd_clsf(String xx_cd_clsf){
		this.xx_cd_clsf = xx_cd_clsf;
	}

	public void setXx_occr_slip_clsf(String xx_occr_slip_clsf){
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_budg_cd(){
		return this.xx_budg_cd;
	}

	public String getXx_budg_nm(){
		return this.xx_budg_nm;
	}

	public String getXx_mang_cd_4(){
		return this.xx_mang_cd_4;
	}

	public String getXx_cd_clsf(){
		return this.xx_cd_clsf;
	}

	public String getXx_occr_slip_clsf(){
		return this.xx_occr_slip_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_ASET_1701_MCURLIST1Record rec = new AS_ASET_1701_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AS_ASET_1701_MCURLIST2Record rec = new AS_ASET_1701_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset1.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset1.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AS_ASET_1701_MCURLIST3Record rec = new AS_ASET_1701_MCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			AS_ASET_1701_MCURLIST4Record rec = new AS_ASET_1701_MCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			AS_ASET_1701_MCURLIST5Record rec = new AS_ASET_1701_MCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.curlist5.add(rec);
		}
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(10));
		this.xx_budg_cd = Util.checkString(cstmt.getString(11));
		this.xx_budg_nm = Util.checkString(cstmt.getString(12));
		this.xx_mang_cd_4 = Util.checkString(cstmt.getString(13));
		this.xx_cd_clsf = Util.checkString(cstmt.getString(14));
		this.xx_occr_slip_clsf = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1701_MDataSet ds = (AS_ASET_1701_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1701_MCURLIST1Record curlist1Rec = (AS_ASET_1701_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_ASET_1701_MCURLIST2Record curlist2Rec = (AS_ASET_1701_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AS_ASET_1701_MCURLIST3Record curlist3Rec = (AS_ASET_1701_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AS_ASET_1701_MCURLIST4Record curlist4Rec = (AS_ASET_1701_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AS_ASET_1701_MCURLIST5Record curlist5Rec = (AS_ASET_1701_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_budg_cd()%>
<%= ds.getXx_budg_nm()%>
<%= ds.getXx_mang_cd_4()%>
<%= ds.getXx_cd_clsf()%>
<%= ds.getXx_occr_slip_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist3Rec.cdabrvnm_cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist4Rec.cdnm_cd%>
<%= curlist4Rec.cdabrvnm_cd%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.cd_abrv_nm%>
<%= curlist5Rec.cdnm_cd%>
<%= curlist5Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 02 19:25:59 KST 2012 */