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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1609_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_proc_stat_010;
	public String xx_emp_no_010;
	public String xx_pr_job_clsf_23;
	public String xx_annc_clsf;
	public String xx_proc_stat_clsf;
	public String xx_vaca_clsf_010;
	public String xx_vaca_clsf_020;
	public String xx_vaca_clsf_030;
	public String xx_vaca_clsf_040;
	public String xx_vaca_clsf_050;
	public String xx_vaca_clsf_060;
	public String xx_vaca_clsf_070;
	public String xx_vaca_clsf_080;
	public String xx_vaca_clsf_090;
	public String xx_vaca_clsf_100;
	public String xx_vaca_clsf_110;
	public String xx_vaca_clsf_120;
	public String xx_vaca_clsf_130;
	public String xx_vaca_dtls_clsf_010;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_caption_visible_010;
	public String xx_caption_height_010;

	public HD_VACA_1609_MDataSet(){}
	public HD_VACA_1609_MDataSet(String errcode, String errmsg, String xx_proc_stat_010, String xx_emp_no_010, String xx_pr_job_clsf_23, String xx_annc_clsf, String xx_proc_stat_clsf, String xx_vaca_clsf_010, String xx_vaca_clsf_020, String xx_vaca_clsf_030, String xx_vaca_clsf_040, String xx_vaca_clsf_050, String xx_vaca_clsf_060, String xx_vaca_clsf_070, String xx_vaca_clsf_080, String xx_vaca_clsf_090, String xx_vaca_clsf_100, String xx_vaca_clsf_110, String xx_vaca_clsf_120, String xx_vaca_clsf_130, String xx_vaca_dtls_clsf_010, String xx_cd_010, String xx_cd_020, String xx_caption_visible_010, String xx_caption_height_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_pr_job_clsf_23 = xx_pr_job_clsf_23;
		this.xx_annc_clsf = xx_annc_clsf;
		this.xx_proc_stat_clsf = xx_proc_stat_clsf;
		this.xx_vaca_clsf_010 = xx_vaca_clsf_010;
		this.xx_vaca_clsf_020 = xx_vaca_clsf_020;
		this.xx_vaca_clsf_030 = xx_vaca_clsf_030;
		this.xx_vaca_clsf_040 = xx_vaca_clsf_040;
		this.xx_vaca_clsf_050 = xx_vaca_clsf_050;
		this.xx_vaca_clsf_060 = xx_vaca_clsf_060;
		this.xx_vaca_clsf_070 = xx_vaca_clsf_070;
		this.xx_vaca_clsf_080 = xx_vaca_clsf_080;
		this.xx_vaca_clsf_090 = xx_vaca_clsf_090;
		this.xx_vaca_clsf_100 = xx_vaca_clsf_100;
		this.xx_vaca_clsf_110 = xx_vaca_clsf_110;
		this.xx_vaca_clsf_120 = xx_vaca_clsf_120;
		this.xx_vaca_clsf_130 = xx_vaca_clsf_130;
		this.xx_vaca_dtls_clsf_010 = xx_vaca_dtls_clsf_010;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_caption_visible_010 = xx_caption_visible_010;
		this.xx_caption_height_010 = xx_caption_height_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_pr_job_clsf_23(String xx_pr_job_clsf_23){
		this.xx_pr_job_clsf_23 = xx_pr_job_clsf_23;
	}

	public void setXx_annc_clsf(String xx_annc_clsf){
		this.xx_annc_clsf = xx_annc_clsf;
	}

	public void setXx_proc_stat_clsf(String xx_proc_stat_clsf){
		this.xx_proc_stat_clsf = xx_proc_stat_clsf;
	}

	public void setXx_vaca_clsf_010(String xx_vaca_clsf_010){
		this.xx_vaca_clsf_010 = xx_vaca_clsf_010;
	}

	public void setXx_vaca_clsf_020(String xx_vaca_clsf_020){
		this.xx_vaca_clsf_020 = xx_vaca_clsf_020;
	}

	public void setXx_vaca_clsf_030(String xx_vaca_clsf_030){
		this.xx_vaca_clsf_030 = xx_vaca_clsf_030;
	}

	public void setXx_vaca_clsf_040(String xx_vaca_clsf_040){
		this.xx_vaca_clsf_040 = xx_vaca_clsf_040;
	}

	public void setXx_vaca_clsf_050(String xx_vaca_clsf_050){
		this.xx_vaca_clsf_050 = xx_vaca_clsf_050;
	}

	public void setXx_vaca_clsf_060(String xx_vaca_clsf_060){
		this.xx_vaca_clsf_060 = xx_vaca_clsf_060;
	}

	public void setXx_vaca_clsf_070(String xx_vaca_clsf_070){
		this.xx_vaca_clsf_070 = xx_vaca_clsf_070;
	}

	public void setXx_vaca_clsf_080(String xx_vaca_clsf_080){
		this.xx_vaca_clsf_080 = xx_vaca_clsf_080;
	}

	public void setXx_vaca_clsf_090(String xx_vaca_clsf_090){
		this.xx_vaca_clsf_090 = xx_vaca_clsf_090;
	}

	public void setXx_vaca_clsf_100(String xx_vaca_clsf_100){
		this.xx_vaca_clsf_100 = xx_vaca_clsf_100;
	}

	public void setXx_vaca_clsf_110(String xx_vaca_clsf_110){
		this.xx_vaca_clsf_110 = xx_vaca_clsf_110;
	}

	public void setXx_vaca_clsf_120(String xx_vaca_clsf_120){
		this.xx_vaca_clsf_120 = xx_vaca_clsf_120;
	}

	public void setXx_vaca_clsf_130(String xx_vaca_clsf_130){
		this.xx_vaca_clsf_130 = xx_vaca_clsf_130;
	}

	public void setXx_vaca_dtls_clsf_010(String xx_vaca_dtls_clsf_010){
		this.xx_vaca_dtls_clsf_010 = xx_vaca_dtls_clsf_010;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_caption_visible_010(String xx_caption_visible_010){
		this.xx_caption_visible_010 = xx_caption_visible_010;
	}

	public void setXx_caption_height_010(String xx_caption_height_010){
		this.xx_caption_height_010 = xx_caption_height_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_pr_job_clsf_23(){
		return this.xx_pr_job_clsf_23;
	}

	public String getXx_annc_clsf(){
		return this.xx_annc_clsf;
	}

	public String getXx_proc_stat_clsf(){
		return this.xx_proc_stat_clsf;
	}

	public String getXx_vaca_clsf_010(){
		return this.xx_vaca_clsf_010;
	}

	public String getXx_vaca_clsf_020(){
		return this.xx_vaca_clsf_020;
	}

	public String getXx_vaca_clsf_030(){
		return this.xx_vaca_clsf_030;
	}

	public String getXx_vaca_clsf_040(){
		return this.xx_vaca_clsf_040;
	}

	public String getXx_vaca_clsf_050(){
		return this.xx_vaca_clsf_050;
	}

	public String getXx_vaca_clsf_060(){
		return this.xx_vaca_clsf_060;
	}

	public String getXx_vaca_clsf_070(){
		return this.xx_vaca_clsf_070;
	}

	public String getXx_vaca_clsf_080(){
		return this.xx_vaca_clsf_080;
	}

	public String getXx_vaca_clsf_090(){
		return this.xx_vaca_clsf_090;
	}

	public String getXx_vaca_clsf_100(){
		return this.xx_vaca_clsf_100;
	}

	public String getXx_vaca_clsf_110(){
		return this.xx_vaca_clsf_110;
	}

	public String getXx_vaca_clsf_120(){
		return this.xx_vaca_clsf_120;
	}

	public String getXx_vaca_clsf_130(){
		return this.xx_vaca_clsf_130;
	}

	public String getXx_vaca_dtls_clsf_010(){
		return this.xx_vaca_dtls_clsf_010;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_caption_visible_010(){
		return this.xx_caption_visible_010;
	}

	public String getXx_caption_height_010(){
		return this.xx_caption_height_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(5));
		this.xx_emp_no_010 = Util.checkString(cstmt.getString(6));
		this.xx_pr_job_clsf_23 = Util.checkString(cstmt.getString(7));
		this.xx_annc_clsf = Util.checkString(cstmt.getString(8));
		this.xx_proc_stat_clsf = Util.checkString(cstmt.getString(9));
		this.xx_vaca_clsf_010 = Util.checkString(cstmt.getString(10));
		this.xx_vaca_clsf_020 = Util.checkString(cstmt.getString(11));
		this.xx_vaca_clsf_030 = Util.checkString(cstmt.getString(12));
		this.xx_vaca_clsf_040 = Util.checkString(cstmt.getString(13));
		this.xx_vaca_clsf_050 = Util.checkString(cstmt.getString(14));
		this.xx_vaca_clsf_060 = Util.checkString(cstmt.getString(15));
		this.xx_vaca_clsf_070 = Util.checkString(cstmt.getString(16));
		this.xx_vaca_clsf_080 = Util.checkString(cstmt.getString(17));
		this.xx_vaca_clsf_090 = Util.checkString(cstmt.getString(18));
		this.xx_vaca_clsf_100 = Util.checkString(cstmt.getString(19));
		this.xx_vaca_clsf_110 = Util.checkString(cstmt.getString(20));
		this.xx_vaca_clsf_120 = Util.checkString(cstmt.getString(21));
		this.xx_vaca_clsf_130 = Util.checkString(cstmt.getString(22));
		this.xx_vaca_dtls_clsf_010 = Util.checkString(cstmt.getString(23));
		this.xx_cd_010 = Util.checkString(cstmt.getString(24));
		this.xx_cd_020 = Util.checkString(cstmt.getString(25));
		this.xx_caption_visible_010 = Util.checkString(cstmt.getString(26));
		this.xx_caption_height_010 = Util.checkString(cstmt.getString(27));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1609_MDataSet ds = (HD_VACA_1609_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_pr_job_clsf_23()%>
<%= ds.getXx_annc_clsf()%>
<%= ds.getXx_proc_stat_clsf()%>
<%= ds.getXx_vaca_clsf_010()%>
<%= ds.getXx_vaca_clsf_020()%>
<%= ds.getXx_vaca_clsf_030()%>
<%= ds.getXx_vaca_clsf_040()%>
<%= ds.getXx_vaca_clsf_050()%>
<%= ds.getXx_vaca_clsf_060()%>
<%= ds.getXx_vaca_clsf_070()%>
<%= ds.getXx_vaca_clsf_080()%>
<%= ds.getXx_vaca_clsf_090()%>
<%= ds.getXx_vaca_clsf_100()%>
<%= ds.getXx_vaca_clsf_110()%>
<%= ds.getXx_vaca_clsf_120()%>
<%= ds.getXx_vaca_clsf_130()%>
<%= ds.getXx_vaca_dtls_clsf_010()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_caption_visible_010()%>
<%= ds.getXx_caption_height_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 17 16:33:15 KST 2018 */