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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4001_LDataSet(){}
	public MC_BUDG_4001_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			MC_BUDG_4001_LCURLISTRecord rec = new MC_BUDG_4001_LCURLISTRecord();
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.buseonm = Util.checkString(rset0.getString("buseonm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.ysnm = Util.checkString(rset0.getString("ysnm"));
			rec.last_asin_amt = Util.checkString(rset0.getString("last_asin_amt"));
			rec.budg_ask_amt = Util.checkString(rset0.getString("budg_ask_amt"));
			rec.budg_cndt_amt = Util.checkString(rset0.getString("budg_cndt_amt"));
			rec.chamt = Util.checkString(rset0.getString("chamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4001_LDataSet ds = (MC_BUDG_4001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4001_LCURLISTRecord curlistRec = (MC_BUDG_4001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.buseonm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.ysnm%>
<%= curlistRec.last_asin_amt%>
<%= curlistRec.budg_ask_amt%>
<%= curlistRec.budg_cndt_amt%>
<%= curlistRec.chamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 09:47:26 KST 2009 */