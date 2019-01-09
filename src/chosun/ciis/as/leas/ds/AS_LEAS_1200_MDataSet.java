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


public class AS_LEAS_1200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_slip_clsf_cd_001;
	public String xx_bldg_cd_001;

	public AS_LEAS_1200_MDataSet(){}
	public AS_LEAS_1200_MDataSet(String errcode, String errmsg, String xx_slip_clsf_cd_001, String xx_bldg_cd_001){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_slip_clsf_cd_001 = xx_slip_clsf_cd_001;
		this.xx_bldg_cd_001 = xx_bldg_cd_001;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_slip_clsf_cd_001(String xx_slip_clsf_cd_001){
		this.xx_slip_clsf_cd_001 = xx_slip_clsf_cd_001;
	}

	public void setXx_bldg_cd_001(String xx_bldg_cd_001){
		this.xx_bldg_cd_001 = xx_bldg_cd_001;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_slip_clsf_cd_001(){
		return this.xx_slip_clsf_cd_001;
	}

	public String getXx_bldg_cd_001(){
		return this.xx_bldg_cd_001;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_slip_clsf_cd_001 = Util.checkString(cstmt.getString(5));
		this.xx_bldg_cd_001 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1200_MDataSet ds = (AS_LEAS_1200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_slip_clsf_cd_001()%>
<%= ds.getXx_bldg_cd_001()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 02 10:15:28 KST 2012 */