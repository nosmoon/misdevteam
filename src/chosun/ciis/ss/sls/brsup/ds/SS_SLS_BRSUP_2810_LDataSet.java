/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_SLS_BRSUP_2810_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String caption;

	public SS_SLS_BRSUP_2810_LDataSet(){}
	public SS_SLS_BRSUP_2810_LDataSet(String errcode, String errmsg, String caption){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.caption = caption;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCaption(String caption){
		this.caption = caption;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCaption(){
		return this.caption;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SS_SLS_BRSUP_2810_LCURCOMMLISTRecord rec = new SS_SLS_BRSUP_2810_LCURCOMMLISTRecord();
			rec.jursareanm = Util.checkString(rset0.getString("jursareanm"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ptphno = Util.checkString(rset0.getString("ptphno"));
			rec.qty1 = Util.checkString(rset0.getString("qty1"));
			rec.qty1_1 = Util.checkString(rset0.getString("qty1_1"));
			rec.qty2 = Util.checkString(rset0.getString("qty2"));
			rec.qty2_1 = Util.checkString(rset0.getString("qty2_1"));
			rec.qty3 = Util.checkString(rset0.getString("qty3"));
			rec.qty3_1 = Util.checkString(rset0.getString("qty3_1"));
			rec.qty4 = Util.checkString(rset0.getString("qty4"));
			rec.qty4_1 = Util.checkString(rset0.getString("qty4_1"));
			rec.qty5 = Util.checkString(rset0.getString("qty5"));
			rec.qty5_1 = Util.checkString(rset0.getString("qty5_1"));
			rec.qty6 = Util.checkString(rset0.getString("qty6"));
			rec.qty6_1 = Util.checkString(rset0.getString("qty6_1"));
			rec.qty7 = Util.checkString(rset0.getString("qty7"));
			rec.qty7_1 = Util.checkString(rset0.getString("qty7_1"));
			rec.qty8 = Util.checkString(rset0.getString("qty8"));
			rec.qty8_1 = Util.checkString(rset0.getString("qty8_1"));
			rec.qty9 = Util.checkString(rset0.getString("qty9"));
			rec.qty9_1 = Util.checkString(rset0.getString("qty9_1"));
			rec.qty10 = Util.checkString(rset0.getString("qty10"));
			rec.qty10_1 = Util.checkString(rset0.getString("qty10_1"));
			rec.qty11 = Util.checkString(rset0.getString("qty11"));
			rec.qty11_1 = Util.checkString(rset0.getString("qty11_1"));
			rec.qty12 = Util.checkString(rset0.getString("qty12"));
			rec.qty12_1 = Util.checkString(rset0.getString("qty12_1"));
			rec.qty13 = Util.checkString(rset0.getString("qty13"));
			rec.qty13_1 = Util.checkString(rset0.getString("qty13_1"));
			rec.totqty = Util.checkString(rset0.getString("totqty"));
			rec.totqty_1 = Util.checkString(rset0.getString("totqty_1"));
			this.curcommlist.add(rec);
		}
		this.caption = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRSUP_2810_LDataSet ds = (SS_SLS_BRSUP_2810_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRSUP_2810_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRSUP_2810_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getCaption()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.jursareanm%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.ptphno%>
<%= curcommlistRec.qty1%>
<%= curcommlistRec.qty1_1%>
<%= curcommlistRec.qty2%>
<%= curcommlistRec.qty2_1%>
<%= curcommlistRec.qty3%>
<%= curcommlistRec.qty3_1%>
<%= curcommlistRec.qty4%>
<%= curcommlistRec.qty4_1%>
<%= curcommlistRec.qty5%>
<%= curcommlistRec.qty5_1%>
<%= curcommlistRec.qty6%>
<%= curcommlistRec.qty6_1%>
<%= curcommlistRec.qty7%>
<%= curcommlistRec.qty7_1%>
<%= curcommlistRec.qty8%>
<%= curcommlistRec.qty8_1%>
<%= curcommlistRec.qty9%>
<%= curcommlistRec.qty9_1%>
<%= curcommlistRec.qty10%>
<%= curcommlistRec.qty10_1%>
<%= curcommlistRec.qty11%>
<%= curcommlistRec.qty11_1%>
<%= curcommlistRec.qty12%>
<%= curcommlistRec.qty12_1%>
<%= curcommlistRec.qty13%>
<%= curcommlistRec.qty13_1%>
<%= curcommlistRec.totqty%>
<%= curcommlistRec.totqty_1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 09 10:54:04 KST 2016 */