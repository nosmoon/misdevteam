/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_2210_LCURLIST2Record;
import chosun.ciis.ad.pub.rec.AD_PUB_2210_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_2210_LDataSet(){}
	public AD_PUB_2210_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_PUB_2210_LCURLISTRecord rec = new AD_PUB_2210_LCURLISTRecord();
			rec.yy1 = Util.checkString(rset0.getString("yy1"));
			rec.yy2 = Util.checkString(rset0.getString("yy2"));
			rec.cnt1 = Util.checkString(rset0.getString("cnt1"));
			rec.cnt2 = Util.checkString(rset0.getString("cnt2"));
			rec.pubcamt1 = Util.checkString(rset0.getString("pubcamt1"));
			rec.trgtamt1 = Util.checkString(rset0.getString("trgtamt1"));
			rec.pubcamt2 = Util.checkString(rset0.getString("pubcamt2"));
			rec.trgtamt2 = Util.checkString(rset0.getString("trgtamt2"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_PUB_2210_LCURLIST2Record rec = new AD_PUB_2210_LCURLIST2Record();
			rec.dd = Util.checkString(rset1.getString("dd"));
			rec.yoil1 = Util.checkString(rset1.getString("yoil1"));
			rec.pubc_side1 = Util.checkString(rset1.getString("pubc_side1"));
			rec.dn1 = Util.checkString(rset1.getString("dn1"));
			rec.amt1 = Util.checkString(rset1.getString("amt1"));
			rec.yoil2 = Util.checkString(rset1.getString("yoil2"));
			rec.pubc_side2 = Util.checkString(rset1.getString("pubc_side2"));
			rec.dn2 = Util.checkString(rset1.getString("dn2"));
			rec.amt2 = Util.checkString(rset1.getString("amt2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2210_LDataSet ds = (AD_PUB_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2210_LCURLISTRecord curlistRec = (AD_PUB_2210_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_2210_LCURLIST2Record curlist2Rec = (AD_PUB_2210_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.yy1%>
<%= curlistRec.yy2%>
<%= curlistRec.cnt1%>
<%= curlistRec.cnt2%>
<%= curlistRec.pubcamt1%>
<%= curlistRec.trgtamt1%>
<%= curlistRec.pubcamt2%>
<%= curlistRec.trgtamt2%>
<%= curlist2Rec.dd%>
<%= curlist2Rec.yoil1%>
<%= curlist2Rec.pubc_side1%>
<%= curlist2Rec.dn1%>
<%= curlist2Rec.amt1%>
<%= curlist2Rec.yoil2%>
<%= curlist2Rec.pubc_side2%>
<%= curlist2Rec.dn2%>
<%= curlist2Rec.amt2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 18:24:11 KST 2009 */