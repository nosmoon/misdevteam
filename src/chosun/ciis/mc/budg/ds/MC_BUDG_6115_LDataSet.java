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


public class MC_BUDG_6115_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6115_LDataSet(){}
	public MC_BUDG_6115_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MC_BUDG_6115_LCURLISTRecord rec = new MC_BUDG_6115_LCURLISTRecord();
			rec.seqnm = Util.checkString(rset0.getString("seqnm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.amt_01 = Util.checkString(rset0.getString("amt_01"));
			rec.amt_02 = Util.checkString(rset0.getString("amt_02"));
			rec.amt_03 = Util.checkString(rset0.getString("amt_03"));
			rec.amt_04 = Util.checkString(rset0.getString("amt_04"));
			rec.amt_05 = Util.checkString(rset0.getString("amt_05"));
			rec.amt_06 = Util.checkString(rset0.getString("amt_06"));
			rec.amt_07 = Util.checkString(rset0.getString("amt_07"));
			rec.amt_08 = Util.checkString(rset0.getString("amt_08"));
			rec.amt_09 = Util.checkString(rset0.getString("amt_09"));
			rec.amt_10 = Util.checkString(rset0.getString("amt_10"));
			rec.amt_11 = Util.checkString(rset0.getString("amt_11"));
			rec.amt_12 = Util.checkString(rset0.getString("amt_12"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6115_LDataSet ds = (MC_BUDG_6115_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6115_LCURLISTRecord curlistRec = (MC_BUDG_6115_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seqnm%>
<%= curlistRec.seq%>
<%= curlistRec.amt_01%>
<%= curlistRec.amt_02%>
<%= curlistRec.amt_03%>
<%= curlistRec.amt_04%>
<%= curlistRec.amt_05%>
<%= curlistRec.amt_06%>
<%= curlistRec.amt_07%>
<%= curlistRec.amt_08%>
<%= curlistRec.amt_09%>
<%= curlistRec.amt_10%>
<%= curlistRec.amt_11%>
<%= curlistRec.amt_12%>
<%= curlistRec.tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 15:34:53 KST 2009 */