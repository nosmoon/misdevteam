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


public class HD_INFO_1027_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_scl_clsf_010;
	public String xx_scl_clsf_020;
	public String xx_scl_clsf_030;
	public String xx_scl_clsf_040;
	public String xx_scl_clsf_050;
	public String xx_scl_clsf_060;
	public String xx_job_clsf_01;
	public String xx_cd_clsf_010;
	public String xx_cd_clsf_020;

	public HD_INFO_1027_MDataSet(){}
	public HD_INFO_1027_MDataSet(String errcode, String errmsg, String xx_scl_clsf_010, String xx_scl_clsf_020, String xx_scl_clsf_030, String xx_scl_clsf_040, String xx_scl_clsf_050, String xx_scl_clsf_060, String xx_job_clsf_01, String xx_cd_clsf_010, String xx_cd_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_scl_clsf_010 = xx_scl_clsf_010;
		this.xx_scl_clsf_020 = xx_scl_clsf_020;
		this.xx_scl_clsf_030 = xx_scl_clsf_030;
		this.xx_scl_clsf_040 = xx_scl_clsf_040;
		this.xx_scl_clsf_050 = xx_scl_clsf_050;
		this.xx_scl_clsf_060 = xx_scl_clsf_060;
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

	public void setXx_scl_clsf_010(String xx_scl_clsf_010){
		this.xx_scl_clsf_010 = xx_scl_clsf_010;
	}

	public void setXx_scl_clsf_020(String xx_scl_clsf_020){
		this.xx_scl_clsf_020 = xx_scl_clsf_020;
	}

	public void setXx_scl_clsf_030(String xx_scl_clsf_030){
		this.xx_scl_clsf_030 = xx_scl_clsf_030;
	}

	public void setXx_scl_clsf_040(String xx_scl_clsf_040){
		this.xx_scl_clsf_040 = xx_scl_clsf_040;
	}

	public void setXx_scl_clsf_050(String xx_scl_clsf_050){
		this.xx_scl_clsf_050 = xx_scl_clsf_050;
	}

	public void setXx_scl_clsf_060(String xx_scl_clsf_060){
		this.xx_scl_clsf_060 = xx_scl_clsf_060;
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

	public String getXx_scl_clsf_010(){
		return this.xx_scl_clsf_010;
	}

	public String getXx_scl_clsf_020(){
		return this.xx_scl_clsf_020;
	}

	public String getXx_scl_clsf_030(){
		return this.xx_scl_clsf_030;
	}

	public String getXx_scl_clsf_040(){
		return this.xx_scl_clsf_040;
	}

	public String getXx_scl_clsf_050(){
		return this.xx_scl_clsf_050;
	}

	public String getXx_scl_clsf_060(){
		return this.xx_scl_clsf_060;
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

		this.xx_scl_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_scl_clsf_020 = Util.checkString(cstmt.getString(6));
		this.xx_scl_clsf_030 = Util.checkString(cstmt.getString(7));
		this.xx_scl_clsf_040 = Util.checkString(cstmt.getString(8));
		this.xx_scl_clsf_050 = Util.checkString(cstmt.getString(9));
		this.xx_scl_clsf_060 = Util.checkString(cstmt.getString(10));
		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(11));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(12));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1027_MDataSet ds = (HD_INFO_1027_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_scl_clsf_010()%>
<%= ds.getXx_scl_clsf_020()%>
<%= ds.getXx_scl_clsf_030()%>
<%= ds.getXx_scl_clsf_040()%>
<%= ds.getXx_scl_clsf_050()%>
<%= ds.getXx_scl_clsf_060()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_cd_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 19 13:58:09 KST 2012 */