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


package chosun.ciis.hd.prz.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1302_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_aplc_clsf_010;
	public String xx_obj_clsf_010;

	public HD_PRZ_1302_MDataSet(){}
	public HD_PRZ_1302_MDataSet(String errcode, String errmsg, String xx_aplc_clsf_010, String xx_obj_clsf_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_aplc_clsf_010 = xx_aplc_clsf_010;
		this.xx_obj_clsf_010 = xx_obj_clsf_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_aplc_clsf_010(String xx_aplc_clsf_010){
		this.xx_aplc_clsf_010 = xx_aplc_clsf_010;
	}

	public void setXx_obj_clsf_010(String xx_obj_clsf_010){
		this.xx_obj_clsf_010 = xx_obj_clsf_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_aplc_clsf_010(){
		return this.xx_aplc_clsf_010;
	}

	public String getXx_obj_clsf_010(){
		return this.xx_obj_clsf_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_aplc_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_obj_clsf_010 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRZ_1302_MDataSet ds = (HD_PRZ_1302_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_aplc_clsf_010()%>
<%= ds.getXx_obj_clsf_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 27 15:19:53 KST 2012 */