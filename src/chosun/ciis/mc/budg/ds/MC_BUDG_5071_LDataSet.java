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


public class MC_BUDG_5071_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_5071_LDataSet(){}
	public MC_BUDG_5071_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_5071_LCURLISTRecord rec = new MC_BUDG_5071_LCURLISTRecord();
			rec.checked = Util.checkString(rset0.getString("checked"));
			rec.brnm1 = Util.checkString(rset0.getString("brnm1"));
			rec.brcd = Util.checkString(rset0.getString("brcd"));
			rec.brnm = Util.checkString(rset0.getString("brnm"));
			rec.blank = Util.checkString(rset0.getString("blank"));
			rec.budg_cndt_amt = Util.checkString(rset0.getString("budg_cndt_amt"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.budg_cndt_amt1 = Util.checkString(rset0.getString("budg_cndt_amt1"));
			rec.insc_amt = Util.checkString(rset0.getString("insc_amt"));
			rec.budg_cndt_incamt = Util.checkString(rset0.getString("budg_cndt_incamt"));
			rec.budg_cndt_rate = Util.checkString(rset0.getString("budg_cndt_rate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_5071_LDataSet ds = (MC_BUDG_5071_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_5071_LCURLISTRecord curlistRec = (MC_BUDG_5071_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.brnm1%>
<%= curlistRec.brcd%>
<%= curlistRec.brnm%>
<%= curlistRec.blank%>
<%= curlistRec.budg_cndt_amt%>
<%= curlistRec.tms%>
<%= curlistRec.budg_cndt_amt1%>
<%= curlistRec.insc_amt%>
<%= curlistRec.budg_cndt_incamt%>
<%= curlistRec.budg_cndt_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 13:41:04 KST 2009 */