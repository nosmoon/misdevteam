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


package chosun.ciis.co.semuro.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.rec.*;

/**
 * 
 */


public class CO_SEMURO_1700_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SEMURO_1700_LDataSet(){}
	public CO_SEMURO_1700_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			CO_SEMURO_1700_LCURLISTRecord rec = new CO_SEMURO_1700_LCURLISTRecord();
			rec.tmsg_type = Util.checkString(rset0.getString("tmsg_type"));
			rec.tax_stmt_clsf = Util.checkString(rset0.getString("tax_stmt_clsf"));
			rec.rmsg_pers_clsf = Util.checkString(rset0.getString("rmsg_pers_clsf"));
			rec.flag_1 = Util.checkString(rset0.getString("flag_1"));
			rec.flag_2 = Util.checkString(rset0.getString("flag_2"));
			rec.flag_3 = Util.checkString(rset0.getString("flag_3"));
			rec.flag_4 = Util.checkString(rset0.getString("flag_4"));
			rec.flag_5 = Util.checkString(rset0.getString("flag_5"));
			rec.flag_6 = Util.checkString(rset0.getString("flag_6"));
			rec.flag_7 = Util.checkString(rset0.getString("flag_7"));
			rec.flag_8 = Util.checkString(rset0.getString("flag_8"));
			rec.flag_9 = Util.checkString(rset0.getString("flag_9"));
			rec.flag_10 = Util.checkString(rset0.getString("flag_10"));
			rec.flag_11 = Util.checkString(rset0.getString("flag_11"));
			rec.flag_12 = Util.checkString(rset0.getString("flag_12"));
			rec.flag_29 = Util.checkString(rset0.getString("flag_29"));
			rec.head_30 = Util.checkString(rset0.getString("head_30"));
			rec.tail_30 = Util.checkString(rset0.getString("tail_30"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(12);
		while(rset1.next()){
			CO_SEMURO_1700_LCURLIST2Record rec = new CO_SEMURO_1700_LCURLIST2Record();
			rec.item_nm = Util.checkString(rset1.getString("item_nm"));
			rec.uprc = Util.checkString(rset1.getString("uprc"));
			rec.qunt = Util.checkString(rset1.getString("qunt"));
			rec.item_dt = Util.checkString(rset1.getString("item_dt"));
			rec.std = Util.checkString(rset1.getString("std"));
			rec.item_suply_amt = Util.checkString(rset1.getString("item_suply_amt"));
			rec.item_tax_amt = Util.checkString(rset1.getString("item_tax_amt"));
			rec.item_remk = Util.checkString(rset1.getString("item_remk"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SEMURO_1700_LDataSet ds = (CO_SEMURO_1700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_SEMURO_1700_LCURLISTRecord curlistRec = (CO_SEMURO_1700_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		CO_SEMURO_1700_LCURLIST2Record curlist2Rec = (CO_SEMURO_1700_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.tmsg_type%>
<%= curlistRec.tax_stmt_clsf%>
<%= curlistRec.rmsg_pers_clsf%>
<%= curlistRec.flag_1%>
<%= curlistRec.flag_2%>
<%= curlistRec.flag_3%>
<%= curlistRec.flag_4%>
<%= curlistRec.flag_5%>
<%= curlistRec.flag_6%>
<%= curlistRec.flag_7%>
<%= curlistRec.flag_8%>
<%= curlistRec.flag_9%>
<%= curlistRec.flag_10%>
<%= curlistRec.flag_11%>
<%= curlistRec.flag_12%>
<%= curlistRec.flag_29%>
<%= curlistRec.head_30%>
<%= curlistRec.tail_30%>
<%= curlist2Rec.item_nm%>
<%= curlist2Rec.uprc%>
<%= curlist2Rec.qunt%>
<%= curlist2Rec.item_dt%>
<%= curlist2Rec.std%>
<%= curlist2Rec.item_suply_amt%>
<%= curlist2Rec.item_tax_amt%>
<%= curlist2Rec.item_remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 18:23:24 KST 2009 */