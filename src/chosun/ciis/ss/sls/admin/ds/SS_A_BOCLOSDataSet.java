/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-지국월마감-마감/마감취소
* 작성일자 : 2005-02-02
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-지국월마감-마감/마감취소
 */


public class SS_A_BOCLOSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String closdt;
	public String closyn;
	public String ext4;
	public String ext5;
	public String ext6;

	public SS_A_BOCLOSDataSet(){}
	public SS_A_BOCLOSDataSet(String errcode, String errmsg, String closdt, String closyn, String ext4, String ext5, String ext6){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.closdt = closdt;
		this.closyn = closyn;
		this.ext4 = ext4;
		this.ext5 = ext5;
		this.ext6 = ext6;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setExt4(String ext4){
		this.ext4 = ext4;
	}

	public void setExt5(String ext5){
		this.ext5 = ext5;
	}

	public void setExt6(String ext6){
		this.ext6 = ext6;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public String getExt4(){
		return this.ext4;
	}

	public String getExt5(){
		return this.ext5;
	}

	public String getExt6(){
		return this.ext6;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.closdt = Util.checkString(cstmt.getString(15));
		this.closyn = Util.checkString(cstmt.getString(16));
		this.ext4 = Util.checkString(cstmt.getString(17));
		this.ext5 = Util.checkString(cstmt.getString(18));
		this.ext6 = Util.checkString(cstmt.getString(19));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_A_BOCLOSDataSet ds = (SS_A_BOCLOSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosdt()%>
<%= ds.getClosyn()%>
<%= ds.getExt4()%>
<%= ds.getExt5()%>
<%= ds.getExt6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 02 14:48:47 KST 2005 */