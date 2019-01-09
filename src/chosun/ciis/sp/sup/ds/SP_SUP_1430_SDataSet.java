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


public class SP_SUP_1430_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String adms_dstc_cd;
	public String adms_dstc_cd_nm;
	public String ptph_no;
	public String chrg_pers_nm;
	public String tel_no;

	public SP_SUP_1430_SDataSet(){}
	public SP_SUP_1430_SDataSet(String errcode, String errmsg, String adms_dstc_cd, String adms_dstc_cd_nm, String ptph_no, String chrg_pers_nm, String tel_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.adms_dstc_cd = adms_dstc_cd;
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
		this.ptph_no = ptph_no;
		this.chrg_pers_nm = chrg_pers_nm;
		this.tel_no = tel_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
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

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
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

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.adms_dstc_cd = Util.checkString(cstmt.getString(5));
		this.adms_dstc_cd_nm = Util.checkString(cstmt.getString(6));
		this.ptph_no = Util.checkString(cstmt.getString(7));
		this.chrg_pers_nm = Util.checkString(cstmt.getString(8));
		this.tel_no = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1430_SDataSet ds = (SP_SUP_1430_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAdms_dstc_cd()%>
<%= ds.getAdms_dstc_cd_nm()%>
<%= ds.getPtph_no()%>
<%= ds.getChrg_pers_nm()%>
<%= ds.getTel_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 04 15:46:26 KST 2012 */