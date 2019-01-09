/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_COMM_1610_LDataSet(){}
	public SE_COMM_1610_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_COMM_1610_LCURLISTRecord rec = new SE_COMM_1610_LCURLISTRecord();
			rec.occr_slip_clsf = Util.checkString(rset0.getString("occr_slip_clsf"));
			rec.occr_slip = Util.checkString(rset0.getString("occr_slip"));
			rec.occr_dlco_nm = Util.checkString(rset0.getString("occr_dlco_nm"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.proc_clsf = Util.checkString(rset0.getString("proc_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_COMM_1610_LDataSet ds = (SE_COMM_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_COMM_1610_LCURLISTRecord curlistRec = (SE_COMM_1610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.occr_slip_clsf%>
<%= curlistRec.occr_slip%>
<%= curlistRec.occr_dlco_nm%>
<%= curlistRec.occr_amt%>
<%= curlistRec.budg_nm%>
<%= curlistRec.proc_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 15:11:47 KST 2009 */