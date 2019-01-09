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


public class MC_BUDG_6273_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6273_LDataSet(){}
	public MC_BUDG_6273_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			MC_BUDG_6273_LCURLISTRecord rec = new MC_BUDG_6273_LCURLISTRecord();
			rec.t1_yscd = Util.checkString(rset2.getString("t1_yscd"));
			rec.t1_ysnm = Util.checkString(rset2.getString("t1_ysnm"));
			rec.t1_buseocd = Util.checkString(rset2.getString("t1_buseocd"));
			rec.t1_buseocdnm = Util.checkString(rset2.getString("t1_buseocdnm"));
			rec.t1_yscym = Util.checkString(rset2.getString("t1_yscym"));
			rec.t1_ht1 = Util.checkString(rset2.getString("t1_ht1"));
			rec.t1_ht2 = Util.checkString(rset2.getString("t1_ht2"));
			rec.biyul = Util.checkString(rset2.getString("biyul"));
			rec.t1_ht3 = Util.checkString(rset2.getString("t1_ht3"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6273_LDataSet ds = (MC_BUDG_6273_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6273_LCURLISTRecord curlistRec = (MC_BUDG_6273_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.t1_yscd%>
<%= curlistRec.t1_ysnm%>
<%= curlistRec.t1_buseocd%>
<%= curlistRec.t1_buseocdnm%>
<%= curlistRec.t1_yscym%>
<%= curlistRec.t1_ht1%>
<%= curlistRec.t1_ht2%>
<%= curlistRec.biyul%>
<%= curlistRec.t1_ht3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 13 12:09:14 KST 2009 */