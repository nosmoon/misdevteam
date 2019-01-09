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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1031_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String reg_point_unrcp_pass_dds;
	public String reg_point_unrcp_amt;

	public IS_AGR_1031_SDataSet(){}
	public IS_AGR_1031_SDataSet(String errcode, String errmsg, String reg_point_unrcp_pass_dds, String reg_point_unrcp_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.reg_point_unrcp_pass_dds = reg_point_unrcp_pass_dds;
		this.reg_point_unrcp_amt = reg_point_unrcp_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setReg_point_unrcp_pass_dds(String reg_point_unrcp_pass_dds){
		this.reg_point_unrcp_pass_dds = reg_point_unrcp_pass_dds;
	}

	public void setReg_point_unrcp_amt(String reg_point_unrcp_amt){
		this.reg_point_unrcp_amt = reg_point_unrcp_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getReg_point_unrcp_pass_dds(){
		return this.reg_point_unrcp_pass_dds;
	}

	public String getReg_point_unrcp_amt(){
		return this.reg_point_unrcp_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.reg_point_unrcp_pass_dds = Util.checkString(cstmt.getString(5));
		this.reg_point_unrcp_amt = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_1031_SDataSet ds = (IS_AGR_1031_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getReg_point_unrcp_pass_dds()%>
<%= ds.getReg_point_unrcp_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 04 10:11:49 KST 2012 */