/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 *
 */

public class HD_EVLU_3401_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String evlu_pers_meda_opn_2tms;
	public String evlu_pers_deci_grad_2tms;

	public HD_EVLU_3401_SDataSet(){}
	public HD_EVLU_3401_SDataSet(String errcode, String errmsg, String evlu_pers_meda_opn_2tms, String evlu_pers_deci_grad_2tms){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
		this.evlu_pers_deci_grad_2tms = evlu_pers_deci_grad_2tms;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEvlu_pers_meda_opn_2tms(String evlu_pers_meda_opn_2tms){
		this.evlu_pers_meda_opn_2tms = evlu_pers_meda_opn_2tms;
	}

	public void setEvlu_pers_deci_grad_2tms(String evlu_pers_deci_grad_2tms){
		this.evlu_pers_deci_grad_2tms = evlu_pers_deci_grad_2tms;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEvlu_pers_meda_opn_2tms(){
		return this.evlu_pers_meda_opn_2tms;
	}

	public String getEvlu_pers_deci_grad_2tms(){
		return this.evlu_pers_deci_grad_2tms;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.evlu_pers_meda_opn_2tms = Util.checkString(cstmt.getString(7));
		this.evlu_pers_deci_grad_2tms = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3401_SDataSet ds = (HD_EVLU_3401_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_pers_meda_opn_2tms()%>
<%= ds.getEvlu_pers_deci_grad_2tms()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun May 31 10:58:44 KST 2009 */