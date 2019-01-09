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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1152_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String excl_pmnt_idx;
	public String excl_pmnt_dtl_idx;

	public TN_LNK_1152_ADataSet(){}
	public TN_LNK_1152_ADataSet(String errcode, String errmsg, String excl_pmnt_idx, String excl_pmnt_dtl_idx){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.excl_pmnt_idx = excl_pmnt_idx;
		this.excl_pmnt_dtl_idx = excl_pmnt_dtl_idx;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setExcl_pmnt_dtl_idx(String excl_pmnt_dtl_idx){
		this.excl_pmnt_dtl_idx = excl_pmnt_dtl_idx;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getExcl_pmnt_dtl_idx(){
		return this.excl_pmnt_dtl_idx;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.excl_pmnt_idx = Util.checkString(cstmt.getString(57));
		this.excl_pmnt_dtl_idx = Util.checkString(cstmt.getString(58));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1152_ADataSet ds = (TN_LNK_1152_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getExcl_pmnt_idx()%>
<%= ds.getExcl_pmnt_dtl_idx()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 17 11:01:28 KST 2016 */