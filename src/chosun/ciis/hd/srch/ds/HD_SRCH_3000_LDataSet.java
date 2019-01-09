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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String title;

	public HD_SRCH_3000_LDataSet(){}
	public HD_SRCH_3000_LDataSet(String errcode, String errmsg, String title){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.title = title;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTitle(){
		return this.title;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_SRCH_3000_LSENDLISTRecord rec = new HD_SRCH_3000_LSENDLISTRecord();
			rec.aprv_in_cmpy = Util.checkString(rset0.getString("aprv_in_cmpy"));
			rec.emp = Util.checkString(rset0.getString("emp"));
			this.sendlist.add(rec);
		}
		this.title = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_3000_LDataSet ds = (HD_SRCH_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.sendlist.size(); i++){
		HD_SRCH_3000_LSENDLISTRecord sendlistRec = (HD_SRCH_3000_LSENDLISTRecord)ds.sendlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSendlist()%>
<%= ds.getTitle()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= sendlistRec.aprv_in_cmpy%>
<%= sendlistRec.emp%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 24 11:00:33 KST 2014 */