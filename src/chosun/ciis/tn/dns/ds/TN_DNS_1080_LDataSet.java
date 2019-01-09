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


package chosun.ciis.tn.dns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1080_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String chk_regno;
	public String membercode;
	public String name;

	public TN_DNS_1080_LDataSet(){}
	public TN_DNS_1080_LDataSet(String errcode, String errmsg, String chk_regno, String membercode, String name){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.chk_regno = chk_regno;
		this.membercode = membercode;
		this.name = name;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setChk_regno(String chk_regno){
		this.chk_regno = chk_regno;
	}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getChk_regno(){
		return this.chk_regno;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getName(){
		return this.name;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.chk_regno = Util.checkString(cstmt.getString(5));
		this.membercode = Util.checkString(cstmt.getString(6));
		this.name = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_DNS_1080_LDataSet ds = (TN_DNS_1080_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getChk_regno()%>
<%= ds.getMembercode()%>
<%= ds.getName()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 02 19:14:42 KST 2016 */