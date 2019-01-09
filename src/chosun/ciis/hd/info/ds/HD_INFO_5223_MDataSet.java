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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5223_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_cd_030;
	public String xx_cd_040;
	public String xx_cd_050;
	public String xx_cd_060;
	public String xx_cd_070;
	public String xx_cd_080;
	public String xx_cd_090;
	public String xx_proc_stat_010;
	public String xx_proc_stat_020;
	public String xx_proc_stat_030;
	public String xx_job_clsf_01;
	public String xx_cd_clsf_010;
	public String xx_cd_clsf_020;

	public HD_INFO_5223_MDataSet(){}
	public HD_INFO_5223_MDataSet(String errcode, String errmsg, String xx_cd_010, String xx_cd_020, String xx_cd_030, String xx_cd_040, String xx_cd_050, String xx_cd_060, String xx_cd_070, String xx_cd_080, String xx_cd_090, String xx_proc_stat_010, String xx_proc_stat_020, String xx_proc_stat_030, String xx_job_clsf_01, String xx_cd_clsf_010, String xx_cd_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_cd_030 = xx_cd_030;
		this.xx_cd_040 = xx_cd_040;
		this.xx_cd_050 = xx_cd_050;
		this.xx_cd_060 = xx_cd_060;
		this.xx_cd_070 = xx_cd_070;
		this.xx_cd_080 = xx_cd_080;
		this.xx_cd_090 = xx_cd_090;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_proc_stat_030 = xx_proc_stat_030;
		this.xx_job_clsf_01 = xx_job_clsf_01;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
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

	public void setXx_cd_030(String xx_cd_030){
		this.xx_cd_030 = xx_cd_030;
	}

	public void setXx_cd_040(String xx_cd_040){
		this.xx_cd_040 = xx_cd_040;
	}

	public void setXx_cd_050(String xx_cd_050){
		this.xx_cd_050 = xx_cd_050;
	}

	public void setXx_cd_060(String xx_cd_060){
		this.xx_cd_060 = xx_cd_060;
	}

	public void setXx_cd_070(String xx_cd_070){
		this.xx_cd_070 = xx_cd_070;
	}

	public void setXx_cd_080(String xx_cd_080){
		this.xx_cd_080 = xx_cd_080;
	}

	public void setXx_cd_090(String xx_cd_090){
		this.xx_cd_090 = xx_cd_090;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_proc_stat_020(String xx_proc_stat_020){
		this.xx_proc_stat_020 = xx_proc_stat_020;
	}

	public void setXx_proc_stat_030(String xx_proc_stat_030){
		this.xx_proc_stat_030 = xx_proc_stat_030;
	}

	public void setXx_job_clsf_01(String xx_job_clsf_01){
		this.xx_job_clsf_01 = xx_job_clsf_01;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setXx_cd_clsf_020(String xx_cd_clsf_020){
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
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

	public String getXx_cd_030(){
		return this.xx_cd_030;
	}

	public String getXx_cd_040(){
		return this.xx_cd_040;
	}

	public String getXx_cd_050(){
		return this.xx_cd_050;
	}

	public String getXx_cd_060(){
		return this.xx_cd_060;
	}

	public String getXx_cd_070(){
		return this.xx_cd_070;
	}

	public String getXx_cd_080(){
		return this.xx_cd_080;
	}

	public String getXx_cd_090(){
		return this.xx_cd_090;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_proc_stat_020(){
		return this.xx_proc_stat_020;
	}

	public String getXx_proc_stat_030(){
		return this.xx_proc_stat_030;
	}

	public String getXx_job_clsf_01(){
		return this.xx_job_clsf_01;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public String getXx_cd_clsf_020(){
		return this.xx_cd_clsf_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INFO_5223_MXX_COMBO_010Record rec = new HD_INFO_5223_MXX_COMBO_010Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_combo_010.add(rec);
		}
		this.xx_cd_010 = Util.checkString(cstmt.getString(6));
		this.xx_cd_020 = Util.checkString(cstmt.getString(7));
		this.xx_cd_030 = Util.checkString(cstmt.getString(8));
		this.xx_cd_040 = Util.checkString(cstmt.getString(9));
		this.xx_cd_050 = Util.checkString(cstmt.getString(10));
		this.xx_cd_060 = Util.checkString(cstmt.getString(11));
		this.xx_cd_070 = Util.checkString(cstmt.getString(12));
		this.xx_cd_080 = Util.checkString(cstmt.getString(13));
		this.xx_cd_090 = Util.checkString(cstmt.getString(14));
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(15));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(16));
		this.xx_proc_stat_030 = Util.checkString(cstmt.getString(17));
		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(18));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(19));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_5223_MDataSet ds = (HD_INFO_5223_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		HD_INFO_5223_MXX_COMBO_010Record xx_combo_010Rec = (HD_INFO_5223_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_cd_030()%>
<%= ds.getXx_cd_040()%>
<%= ds.getXx_cd_050()%>
<%= ds.getXx_cd_060()%>
<%= ds.getXx_cd_070()%>
<%= ds.getXx_cd_080()%>
<%= ds.getXx_cd_090()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_proc_stat_030()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_cd_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_010Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 25 15:52:27 KST 2012 */