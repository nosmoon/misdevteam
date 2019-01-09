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


public class MC_BUDG_4031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4031_LDataSet(){}
	public MC_BUDG_4031_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_4031_LCURLISTRecord rec = new MC_BUDG_4031_LCURLISTRecord();
			rec.irssgbnm = Util.checkString(rset0.getString("irssgbnm"));
			rec.a_irbuseocd = Util.checkString(rset0.getString("a_irbuseocd"));
			rec.a_iryscd = Util.checkString(rset0.getString("a_iryscd"));
			rec.a_iryscym = Util.checkString(rset0.getString("a_iryscym"));
			rec.a_iramt = Util.checkString(rset0.getString("a_iramt"));
			rec.t1_irbuseocd = Util.checkString(rset0.getString("t1_irbuseocd"));
			rec.t1_iryscd = Util.checkString(rset0.getString("t1_iryscd"));
			rec.t1_iryscym = Util.checkString(rset0.getString("t1_iryscym"));
			rec.t1_iramt = Util.checkString(rset0.getString("t1_iramt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4031_LDataSet ds = (MC_BUDG_4031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4031_LCURLISTRecord curlistRec = (MC_BUDG_4031_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.irssgbnm%>
<%= curlistRec.a_irbuseocd%>
<%= curlistRec.a_iryscd%>
<%= curlistRec.a_iryscym%>
<%= curlistRec.a_iramt%>
<%= curlistRec.t1_irbuseocd%>
<%= curlistRec.t1_iryscd%>
<%= curlistRec.t1_iryscym%>
<%= curlistRec.t1_iramt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 12:07:34 KST 2009 */