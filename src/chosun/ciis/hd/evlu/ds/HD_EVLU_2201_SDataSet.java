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

public class HD_EVLU_2201_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String evlu_excl_dd;
	public String evlu_excl_daycnt;

	public HD_EVLU_2201_SDataSet(){}
	public HD_EVLU_2201_SDataSet(String errcode, String errmsg, String evlu_excl_dd, String evlu_excl_daycnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.evlu_excl_dd = evlu_excl_dd;
		this.evlu_excl_daycnt = evlu_excl_daycnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setEvlu_excl_dd(String evlu_excl_dd){
		this.evlu_excl_dd = evlu_excl_dd;
	}

	public void setEvlu_excl_daycnt(String evlu_excl_daycnt){
		this.evlu_excl_daycnt = evlu_excl_daycnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getEvlu_excl_dd(){
		return this.evlu_excl_dd;
	}

	public String getEvlu_excl_daycnt(){
		return this.evlu_excl_daycnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.evlu_excl_dd = Util.checkString(cstmt.getString(6));
		this.evlu_excl_daycnt = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2201_SDataSet ds = (HD_EVLU_2201_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getEvlu_excl_dd()%>
<%= ds.getEvlu_excl_daycnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 11:19:16 KST 2009 */