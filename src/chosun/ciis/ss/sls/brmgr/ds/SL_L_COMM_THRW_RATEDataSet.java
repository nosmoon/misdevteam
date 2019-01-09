/***************************************************************************************************
 * 파일명   : SP_SL_L_COMM_THRW_RATE.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  투입율조사-현황등록
**/

public class SL_L_COMM_THRW_RATEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String c_cnt;
	public String c_rate;
	public String j_cnt;
	public String j_rate;
	public String d_cnt;
	public String d_rate;
	public String o_cnt;
	public String o_rate;

	public SL_L_COMM_THRW_RATEDataSet(){}
	public SL_L_COMM_THRW_RATEDataSet(String errcode, String errmsg, String c_cnt, String c_rate, String j_cnt, String j_rate, String d_cnt, String d_rate, String o_cnt, String o_rate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.c_cnt = c_cnt;
		this.c_rate = c_rate;
		this.j_cnt = j_cnt;
		this.j_rate = j_rate;
		this.d_cnt = d_cnt;
		this.d_rate = d_rate;
		this.o_cnt = o_cnt;
		this.o_rate = o_rate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setC_cnt(String c_cnt){
		this.c_cnt = c_cnt;
	}

	public void setC_rate(String c_rate){
		this.c_rate = c_rate;
	}

	public void setJ_cnt(String j_cnt){
		this.j_cnt = j_cnt;
	}

	public void setJ_rate(String j_rate){
		this.j_rate = j_rate;
	}

	public void setD_cnt(String d_cnt){
		this.d_cnt = d_cnt;
	}

	public void setD_rate(String d_rate){
		this.d_rate = d_rate;
	}

	public void setO_cnt(String o_cnt){
		this.o_cnt = o_cnt;
	}

	public void setO_rate(String o_rate){
		this.o_rate = o_rate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getC_cnt(){
		return this.c_cnt;
	}

	public String getC_rate(){
		return this.c_rate;
	}

	public String getJ_cnt(){
		return this.j_cnt;
	}

	public String getJ_rate(){
		return this.j_rate;
	}

	public String getD_cnt(){
		return this.d_cnt;
	}

	public String getD_rate(){
		return this.d_rate;
	}

	public String getO_cnt(){
		return this.o_cnt;
	}

	public String getO_rate(){
		return this.o_rate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.c_cnt = Util.checkString(cstmt.getString(5));
		this.c_rate = Util.checkString(cstmt.getString(6));
		this.j_cnt = Util.checkString(cstmt.getString(7));
		this.j_rate = Util.checkString(cstmt.getString(8));
		this.d_cnt = Util.checkString(cstmt.getString(9));
		this.d_rate = Util.checkString(cstmt.getString(10));
		this.o_cnt = Util.checkString(cstmt.getString(11));
		this.o_rate = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_COMM_THRW_RATEDataSet ds = (SL_L_COMM_THRW_RATEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getC_cnt()%>
<%= ds.getC_rate()%>
<%= ds.getJ_cnt()%>
<%= ds.getJ_rate()%>
<%= ds.getD_cnt()%>
<%= ds.getD_rate()%>
<%= ds.getO_cnt()%>
<%= ds.getO_rate()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 11 13:15:24 KST 2006 */