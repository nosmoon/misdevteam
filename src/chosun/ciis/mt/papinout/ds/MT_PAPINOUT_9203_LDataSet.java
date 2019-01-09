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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_9203_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_9203_LDataSet(){}
	public MT_PAPINOUT_9203_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_PAPINOUT_9203_LCURLIST1Record rec = new MT_PAPINOUT_9203_LCURLIST1Record();
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.ewh_wgt = Util.checkString(rset0.getString("ewh_wgt"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_PAPINOUT_9203_LCURLIST2Record rec = new MT_PAPINOUT_9203_LCURLIST2Record();
			rec.ewh_dt = Util.checkString(rset1.getString("ewh_dt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			MT_PAPINOUT_9203_LCURLIST3Record rec = new MT_PAPINOUT_9203_LCURLIST3Record();
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_9203_LDataSet ds = (MT_PAPINOUT_9203_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_9203_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_9203_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_9203_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_9203_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPINOUT_9203_LCURLIST3Record curlist3Rec = (MT_PAPINOUT_9203_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.ewh_dt%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.ewh_wgt%>
<%= curlist1Rec.ewh_amt%>
<%= curlist2Rec.ewh_dt%>
<%= curlist3Rec.matr_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 08:58:24 KST 2009 */