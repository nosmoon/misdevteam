/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 제작비
* 작성일자 : 2010-05-18
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


public class MT_CLOSE_6010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pre_year;
	public String pre_month;
	public String cur_month;

	public MT_CLOSE_6010_LDataSet(){}
	public MT_CLOSE_6010_LDataSet(String errcode, String errmsg, String pre_year, String pre_month, String cur_month){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pre_year = pre_year;
		this.pre_month = pre_month;
		this.cur_month = cur_month;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPre_year(String pre_year){
		this.pre_year = pre_year;
	}

	public void setPre_month(String pre_month){
		this.pre_month = pre_month;
	}

	public void setCur_month(String cur_month){
		this.cur_month = cur_month;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPre_year(){
		return this.pre_year;
	}

	public String getPre_month(){
		return this.pre_month;
	}

	public String getCur_month(){
		return this.cur_month;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_CLOSE_6010_LCURLISTRecord rec = new MT_CLOSE_6010_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.title = Util.checkString(rset0.getString("title"));
			rec.pre_year = Util.checkString(rset0.getString("pre_year"));
			rec.pre_month = Util.checkString(rset0.getString("pre_month"));
			rec.cur_month = Util.checkString(rset0.getString("cur_month"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.base_yymm = Util.checkString(rset0.getString("base_yymm"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MT_CLOSE_6010_LCURLIST2Record rec = new MT_CLOSE_6010_LCURLIST2Record();
			rec.gubun = Util.checkString(rset1.getString("gubun"));
			rec.title = Util.checkString(rset1.getString("title"));
			rec.pre_year = Util.checkString(rset1.getString("pre_year"));
			rec.pre_month = Util.checkString(rset1.getString("pre_month"));
			rec.cur_month = Util.checkString(rset1.getString("cur_month"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.base_yymm = Util.checkString(rset1.getString("base_yymm"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist2.add(rec);
		}
		this.pre_year = Util.checkString(cstmt.getString(7));
		this.pre_month = Util.checkString(cstmt.getString(8));
		this.cur_month = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_6010_LDataSet ds = (MT_CLOSE_6010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_6010_LCURLISTRecord curlistRec = (MT_CLOSE_6010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_6010_LCURLIST2Record curlist2Rec = (MT_CLOSE_6010_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getPre_year()%>
<%= ds.getPre_month()%>
<%= ds.getCur_month()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.gubun%>
<%= curlistRec.title%>
<%= curlistRec.pre_year%>
<%= curlistRec.pre_month%>
<%= curlistRec.cur_month%>
<%= curlistRec.remk%>
<%= curlistRec.base_yymm%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.seq%>
<%= curlist2Rec.gubun%>
<%= curlist2Rec.title%>
<%= curlist2Rec.pre_year%>
<%= curlist2Rec.pre_month%>
<%= curlist2Rec.cur_month%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.base_yymm%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 18 09:49:05 KST 2010 */