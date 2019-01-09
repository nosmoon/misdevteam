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


public class MC_BUDG_4130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4130_LDataSet(){}
	public MC_BUDG_4130_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_BUDG_4130_LCURLISTRecord rec = new MC_BUDG_4130_LCURLISTRecord();
			rec.kind = Util.checkString(rset0.getString("kind"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.chg_prv_dept_cd = Util.checkString(rset0.getString("chg_prv_dept_cd"));
			rec.chg_aft_dept_cd = Util.checkString(rset0.getString("chg_aft_dept_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.chg_ratio = Util.checkString(rset0.getString("chg_ratio"));
			rec.budg_req_amt = Util.checkString(rset0.getString("budg_req_amt"));
			rec.fix_asin_amt = Util.checkString(rset0.getString("fix_asin_amt"));
			rec.last_asin_amt = Util.checkString(rset0.getString("last_asin_amt"));
			rec.budg_ask_amt = Util.checkString(rset0.getString("budg_ask_amt"));
			rec.budg_cndt_amt = Util.checkString(rset0.getString("budg_cndt_amt"));
			rec.budg_req_amt_1 = Util.checkString(rset0.getString("budg_req_amt_1"));
			rec.fix_asin_amt_1 = Util.checkString(rset0.getString("fix_asin_amt_1"));
			rec.last_asin_amt_1 = Util.checkString(rset0.getString("last_asin_amt_1"));
			rec.budg_ask_amt_1 = Util.checkString(rset0.getString("budg_ask_amt_1"));
			rec.budg_cndt_amt_1 = Util.checkString(rset0.getString("budg_cndt_amt_1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4130_LDataSet ds = (MC_BUDG_4130_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4130_LCURLISTRecord curlistRec = (MC_BUDG_4130_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.kind%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.chg_prv_dept_cd%>
<%= curlistRec.chg_aft_dept_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.chg_ratio%>
<%= curlistRec.budg_req_amt%>
<%= curlistRec.fix_asin_amt%>
<%= curlistRec.last_asin_amt%>
<%= curlistRec.budg_ask_amt%>
<%= curlistRec.budg_cndt_amt%>
<%= curlistRec.budg_req_amt_1%>
<%= curlistRec.fix_asin_amt_1%>
<%= curlistRec.last_asin_amt_1%>
<%= curlistRec.budg_ask_amt_1%>
<%= curlistRec.budg_cndt_amt_1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 21:12:12 KST 2009 */