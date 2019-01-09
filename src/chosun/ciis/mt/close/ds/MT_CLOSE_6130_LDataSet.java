/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 위탁인쇄현황
* 작성일자 : 2010-07-27
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_6130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_6130_LDataSet(){}
	public MT_CLOSE_6130_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MT_CLOSE_6130_LCURLISTRecord rec = new MT_CLOSE_6130_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.fac_nm = Util.checkString(rset0.getString("fac_nm"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.prt_fee = Util.checkString(rset0.getString("prt_fee"));
			rec.psplat_use_amt = Util.checkString(rset0.getString("psplat_use_amt"));
			rec.gnaw_fee = Util.checkString(rset0.getString("gnaw_fee"));
			rec.film_make_fee = Util.checkString(rset0.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset0.getString("pack_fee"));
			rec.paper_portage = Util.checkString(rset0.getString("paper_portage"));
			rec.gita_amt = Util.checkString(rset0.getString("gita_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_6130_LDataSet ds = (MT_CLOSE_6130_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_6130_LCURLISTRecord curlistRec = (MT_CLOSE_6130_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.fac_nm%>
<%= curlistRec.medi_nm%>
<%= curlistRec.prt_fee%>
<%= curlistRec.psplat_use_amt%>
<%= curlistRec.gnaw_fee%>
<%= curlistRec.film_make_fee%>
<%= curlistRec.pack_fee%>
<%= curlistRec.paper_portage%>
<%= curlistRec.gita_amt%>
<%= curlistRec.tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 27 11:39:53 KST 2010 */