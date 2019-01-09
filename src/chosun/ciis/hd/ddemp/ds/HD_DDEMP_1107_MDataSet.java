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


package chosun.ciis.hd.ddemp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_1107_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_proc_clsf_010;
	public String xx_proc_clsf_020;
	public String xx_proc_clsf_030;
	public String xx_proc_clsf_040;
	public String xx_job_clsf_00;
	public String xx_cd_clsf_010;
	public String xx_cd_clsf_020;
	public String xx_job_clsf_03;
	public String xx_cd_clsf_030;
	public String xx_medi_cd_010;

	public HD_DDEMP_1107_MDataSet(){}
	public HD_DDEMP_1107_MDataSet(String errcode, String errmsg, String xx_proc_clsf_010, String xx_proc_clsf_020, String xx_proc_clsf_030, String xx_proc_clsf_040, String xx_job_clsf_00, String xx_cd_clsf_010, String xx_cd_clsf_020, String xx_job_clsf_03, String xx_cd_clsf_030, String xx_medi_cd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
		this.xx_job_clsf_00 = xx_job_clsf_00;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
		this.xx_job_clsf_03 = xx_job_clsf_03;
		this.xx_cd_clsf_030 = xx_cd_clsf_030;
		this.xx_medi_cd_010 = xx_medi_cd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_proc_clsf_010(String xx_proc_clsf_010){
		this.xx_proc_clsf_010 = xx_proc_clsf_010;
	}

	public void setXx_proc_clsf_020(String xx_proc_clsf_020){
		this.xx_proc_clsf_020 = xx_proc_clsf_020;
	}

	public void setXx_proc_clsf_030(String xx_proc_clsf_030){
		this.xx_proc_clsf_030 = xx_proc_clsf_030;
	}

	public void setXx_proc_clsf_040(String xx_proc_clsf_040){
		this.xx_proc_clsf_040 = xx_proc_clsf_040;
	}

	public void setXx_job_clsf_00(String xx_job_clsf_00){
		this.xx_job_clsf_00 = xx_job_clsf_00;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setXx_cd_clsf_020(String xx_cd_clsf_020){
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
	}

	public void setXx_job_clsf_03(String xx_job_clsf_03){
		this.xx_job_clsf_03 = xx_job_clsf_03;
	}

	public void setXx_cd_clsf_030(String xx_cd_clsf_030){
		this.xx_cd_clsf_030 = xx_cd_clsf_030;
	}

	public void setXx_medi_cd_010(String xx_medi_cd_010){
		this.xx_medi_cd_010 = xx_medi_cd_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_proc_clsf_010(){
		return this.xx_proc_clsf_010;
	}

	public String getXx_proc_clsf_020(){
		return this.xx_proc_clsf_020;
	}

	public String getXx_proc_clsf_030(){
		return this.xx_proc_clsf_030;
	}

	public String getXx_proc_clsf_040(){
		return this.xx_proc_clsf_040;
	}

	public String getXx_job_clsf_00(){
		return this.xx_job_clsf_00;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public String getXx_cd_clsf_020(){
		return this.xx_cd_clsf_020;
	}

	public String getXx_job_clsf_03(){
		return this.xx_job_clsf_03;
	}

	public String getXx_cd_clsf_030(){
		return this.xx_cd_clsf_030;
	}

	public String getXx_medi_cd_010(){
		return this.xx_medi_cd_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_proc_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_proc_clsf_020 = Util.checkString(cstmt.getString(6));
		this.xx_proc_clsf_030 = Util.checkString(cstmt.getString(7));
		this.xx_proc_clsf_040 = Util.checkString(cstmt.getString(8));
		this.xx_job_clsf_00 = Util.checkString(cstmt.getString(9));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(10));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(11));
		this.xx_job_clsf_03 = Util.checkString(cstmt.getString(12));
		this.xx_cd_clsf_030 = Util.checkString(cstmt.getString(13));
		this.xx_medi_cd_010 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DDEMP_1107_MDataSet ds = (HD_DDEMP_1107_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_proc_clsf_010()%>
<%= ds.getXx_proc_clsf_020()%>
<%= ds.getXx_proc_clsf_030()%>
<%= ds.getXx_proc_clsf_040()%>
<%= ds.getXx_job_clsf_00()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_cd_clsf_020()%>
<%= ds.getXx_job_clsf_03()%>
<%= ds.getXx_cd_clsf_030()%>
<%= ds.getXx_medi_cd_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 13 14:31:05 KST 2012 */