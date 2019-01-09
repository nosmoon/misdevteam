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


public class MC_BUDG_6001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6001_LDataSet(){}
	public MC_BUDG_6001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			MC_BUDG_6001_LCURLISTRecord rec = new MC_BUDG_6001_LCURLISTRecord();
			rec.checked = Util.checkString(rset0.getString("checked"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.req_amt = Util.checkString(rset0.getString("req_amt"));
			rec.temp1 = Util.checkString(rset0.getString("temp1"));
			rec.asin_amt = Util.checkString(rset0.getString("asin_amt"));
			rec.asin_amt2 = Util.checkString(rset0.getString("asin_amt2"));
			rec.req_qunt = Util.checkString(rset0.getString("req_qunt"));
			rec.temp2 = Util.checkString(rset0.getString("temp2"));
			rec.asin_qunt = Util.checkString(rset0.getString("asin_qunt"));
			rec.asin_qunt2 = Util.checkString(rset0.getString("asin_qunt2"));
			rec.req_uprc = Util.checkString(rset0.getString("req_uprc"));
			rec.temp3 = Util.checkString(rset0.getString("temp3"));
			rec.asin_uprc = Util.checkString(rset0.getString("asin_uprc"));
			rec.asin_uprc2 = Util.checkString(rset0.getString("asin_uprc2"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.work_no = Util.checkString(rset0.getString("work_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6001_LDataSet ds = (MC_BUDG_6001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6001_LCURLISTRecord curlistRec = (MC_BUDG_6001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.checked%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.req_amt%>
<%= curlistRec.temp1%>
<%= curlistRec.asin_amt%>
<%= curlistRec.asin_amt2%>
<%= curlistRec.req_qunt%>
<%= curlistRec.temp2%>
<%= curlistRec.asin_qunt%>
<%= curlistRec.asin_qunt2%>
<%= curlistRec.req_uprc%>
<%= curlistRec.temp3%>
<%= curlistRec.asin_uprc%>
<%= curlistRec.asin_uprc2%>
<%= curlistRec.rmks%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.work_no%>
<%= curlistRec.seq%>
<%= curlistRec.evnt_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 19:17:19 KST 2009 */