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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_init_a_010;
	public String xx_init_a_020;
	public String xx_init_a_030;
	public String xx_init_b_010;
	public String xx_init_b_020;
	public String xx_mang_cd_4;
	public String xx_job_clsf_02;
	public String xx_cd_clsf;
	public String xx_occr_slip_clsf;
	public String xx_gurt_payo_clsf_010;
	public String xx_gurt_payo_clsf_020;

	public AS_LEAS_1300_MDataSet(){}
	public AS_LEAS_1300_MDataSet(String errcode, String errmsg, String xx_init_a_010, String xx_init_a_020, String xx_init_a_030, String xx_init_b_010, String xx_init_b_020, String xx_mang_cd_4, String xx_job_clsf_02, String xx_cd_clsf, String xx_occr_slip_clsf, String xx_gurt_payo_clsf_010, String xx_gurt_payo_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_init_a_010 = xx_init_a_010;
		this.xx_init_a_020 = xx_init_a_020;
		this.xx_init_a_030 = xx_init_a_030;
		this.xx_init_b_010 = xx_init_b_010;
		this.xx_init_b_020 = xx_init_b_020;
		this.xx_mang_cd_4 = xx_mang_cd_4;
		this.xx_job_clsf_02 = xx_job_clsf_02;
		this.xx_cd_clsf = xx_cd_clsf;
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
		this.xx_gurt_payo_clsf_010 = xx_gurt_payo_clsf_010;
		this.xx_gurt_payo_clsf_020 = xx_gurt_payo_clsf_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_init_a_010(String xx_init_a_010){
		this.xx_init_a_010 = xx_init_a_010;
	}

	public void setXx_init_a_020(String xx_init_a_020){
		this.xx_init_a_020 = xx_init_a_020;
	}

	public void setXx_init_a_030(String xx_init_a_030){
		this.xx_init_a_030 = xx_init_a_030;
	}

	public void setXx_init_b_010(String xx_init_b_010){
		this.xx_init_b_010 = xx_init_b_010;
	}

	public void setXx_init_b_020(String xx_init_b_020){
		this.xx_init_b_020 = xx_init_b_020;
	}

	public void setXx_mang_cd_4(String xx_mang_cd_4){
		this.xx_mang_cd_4 = xx_mang_cd_4;
	}

	public void setXx_job_clsf_02(String xx_job_clsf_02){
		this.xx_job_clsf_02 = xx_job_clsf_02;
	}

	public void setXx_cd_clsf(String xx_cd_clsf){
		this.xx_cd_clsf = xx_cd_clsf;
	}

	public void setXx_occr_slip_clsf(String xx_occr_slip_clsf){
		this.xx_occr_slip_clsf = xx_occr_slip_clsf;
	}

	public void setXx_gurt_payo_clsf_010(String xx_gurt_payo_clsf_010){
		this.xx_gurt_payo_clsf_010 = xx_gurt_payo_clsf_010;
	}

	public void setXx_gurt_payo_clsf_020(String xx_gurt_payo_clsf_020){
		this.xx_gurt_payo_clsf_020 = xx_gurt_payo_clsf_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_init_a_010(){
		return this.xx_init_a_010;
	}

	public String getXx_init_a_020(){
		return this.xx_init_a_020;
	}

	public String getXx_init_a_030(){
		return this.xx_init_a_030;
	}

	public String getXx_init_b_010(){
		return this.xx_init_b_010;
	}

	public String getXx_init_b_020(){
		return this.xx_init_b_020;
	}

	public String getXx_mang_cd_4(){
		return this.xx_mang_cd_4;
	}

	public String getXx_job_clsf_02(){
		return this.xx_job_clsf_02;
	}

	public String getXx_cd_clsf(){
		return this.xx_cd_clsf;
	}

	public String getXx_occr_slip_clsf(){
		return this.xx_occr_slip_clsf;
	}

	public String getXx_gurt_payo_clsf_010(){
		return this.xx_gurt_payo_clsf_010;
	}

	public String getXx_gurt_payo_clsf_020(){
		return this.xx_gurt_payo_clsf_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_LEAS_1300_MXX_COMBO_010Record rec = new AS_LEAS_1300_MXX_COMBO_010Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.xx_combo_010.add(rec);
		}
		this.xx_init_a_010 = Util.checkString(cstmt.getString(6));
		this.xx_init_a_020 = Util.checkString(cstmt.getString(7));
		this.xx_init_a_030 = Util.checkString(cstmt.getString(8));
		this.xx_init_b_010 = Util.checkString(cstmt.getString(9));
		this.xx_init_b_020 = Util.checkString(cstmt.getString(10));
		this.xx_mang_cd_4 = Util.checkString(cstmt.getString(11));
		this.xx_job_clsf_02 = Util.checkString(cstmt.getString(12));
		this.xx_cd_clsf = Util.checkString(cstmt.getString(13));
		this.xx_occr_slip_clsf = Util.checkString(cstmt.getString(14));
		this.xx_gurt_payo_clsf_010 = Util.checkString(cstmt.getString(15));
		this.xx_gurt_payo_clsf_020 = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1300_MDataSet ds = (AS_LEAS_1300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		AS_LEAS_1300_MXX_COMBO_010Record xx_combo_010Rec = (AS_LEAS_1300_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_init_a_010()%>
<%= ds.getXx_init_a_020()%>
<%= ds.getXx_init_a_030()%>
<%= ds.getXx_init_b_010()%>
<%= ds.getXx_init_b_020()%>
<%= ds.getXx_mang_cd_4()%>
<%= ds.getXx_job_clsf_02()%>
<%= ds.getXx_cd_clsf()%>
<%= ds.getXx_occr_slip_clsf()%>
<%= ds.getXx_gurt_payo_clsf_010()%>
<%= ds.getXx_gurt_payo_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_combo_010Rec.cd%>
<%= xx_combo_010Rec.cdnm%>
<%= xx_combo_010Rec.cd_abrv_nm%>
<%= xx_combo_010Rec.cdnm_cd%>
<%= xx_combo_010Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 02 13:25:53 KST 2012 */