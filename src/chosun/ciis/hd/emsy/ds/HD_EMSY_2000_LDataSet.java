

package chosun.ciis.hd.emsy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String msg;
	public String strsql1;
	public String strsql2;
	public String strsql3;
	public String strsql4;
	public String strsql5;
	public String strsql6;

	public HD_EMSY_2000_LDataSet(){}
	public HD_EMSY_2000_LDataSet(String errcode, String errmsg, String msg, String strsql1, String strsql2, String strsql3, String strsql4, String strsql5, String strsql6){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.msg = msg;
		this.strsql1 = strsql1;
		this.strsql2 = strsql2;
		this.strsql3 = strsql3;
		this.strsql4 = strsql4;
		this.strsql5 = strsql5;
		this.strsql6 = strsql6;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public void setStrsql1(String strsql1){
		this.strsql1 = strsql1;
	}

	public void setStrsql2(String strsql2){
		this.strsql2 = strsql2;
	}

	public void setStrsql3(String strsql3){
		this.strsql3 = strsql3;
	}

	public void setStrsql4(String strsql4){
		this.strsql4 = strsql4;
	}

	public void setStrsql5(String strsql5){
		this.strsql5 = strsql5;
	}

	public void setStrsql6(String strsql6){
		this.strsql6 = strsql6;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMsg(){
		return this.msg;
	}

	public String getStrsql1(){
		return this.strsql1;
	}

	public String getStrsql2(){
		return this.strsql2;
	}

	public String getStrsql3(){
		return this.strsql3;
	}

	public String getStrsql4(){
		return this.strsql4;
	}

	public String getStrsql5(){
		return this.strsql5;
	}

	public String getStrsql6(){
		return this.strsql6;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.msg = Util.checkString(cstmt.getString(3));
		this.strsql1 = Util.checkString(cstmt.getString(9));
		this.strsql2 = Util.checkString(cstmt.getString(10));
		this.strsql3 = Util.checkString(cstmt.getString(11));
		this.strsql4 = Util.checkString(cstmt.getString(12));
		this.strsql5 = Util.checkString(cstmt.getString(13));
		this.strsql6 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EMSY_2000_LDataSet ds = (HD_EMSY_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMsg()%>
<%= ds.getStrsql1()%>
<%= ds.getStrsql2()%>
<%= ds.getStrsql3()%>
<%= ds.getStrsql4()%>
<%= ds.getStrsql5()%>
<%= ds.getStrsql6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 07 16:00:14 KST 2010 */