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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8014_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_cntr_clsf_cd_010;
	public String xx_leas_clsf_cd;

	public FC_FUNC_8014_MDataSet(){}
	public FC_FUNC_8014_MDataSet(String errcode, String errmsg, String xx_cntr_clsf_cd_010, String xx_leas_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cntr_clsf_cd_010 = xx_cntr_clsf_cd_010;
		this.xx_leas_clsf_cd = xx_leas_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cntr_clsf_cd_010(String xx_cntr_clsf_cd_010){
		this.xx_cntr_clsf_cd_010 = xx_cntr_clsf_cd_010;
	}

	public void setXx_leas_clsf_cd(String xx_leas_clsf_cd){
		this.xx_leas_clsf_cd = xx_leas_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cntr_clsf_cd_010(){
		return this.xx_cntr_clsf_cd_010;
	}

	public String getXx_leas_clsf_cd(){
		return this.xx_leas_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_cntr_clsf_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_leas_clsf_cd = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8014_MDataSet ds = (FC_FUNC_8014_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_cntr_clsf_cd_010()%>
<%= ds.getXx_leas_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 09 19:43:05 KST 2012 */