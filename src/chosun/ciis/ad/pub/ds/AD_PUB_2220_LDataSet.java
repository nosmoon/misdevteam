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
import chosun.ciis.ad.pub.rec.AD_PUB_2220_LCURLIST2Record;
import chosun.ciis.ad.pub.rec.AD_PUB_2220_LCURLIST3Record;
import chosun.ciis.ad.pub.rec.AD_PUB_2220_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_2220_LDataSet(){}
	public AD_PUB_2220_LDataSet(String errcode, String errmsg){
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
			AD_PUB_2220_LCURLISTRecord rec = new AD_PUB_2220_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.damt = Util.checkString(rset0.getString("damt"));
			rec.jamt = Util.checkString(rset0.getString("jamt"));
			rec.jgamt = Util.checkString(rset0.getString("jgamt"));
			rec.mamt = Util.checkString(rset0.getString("mamt"));
			rec.gbamt = Util.checkString(rset0.getString("gbamt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_PUB_2220_LCURLIST2Record rec = new AD_PUB_2220_LCURLIST2Record();
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			rec.damt = Util.checkString(rset1.getString("damt"));
			rec.jamt = Util.checkString(rset1.getString("jamt"));
			rec.jgamt = Util.checkString(rset1.getString("jgamt"));
			rec.mamt = Util.checkString(rset1.getString("mamt"));
			rec.gbamt = Util.checkString(rset1.getString("gbamt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_PUB_2220_LCURLIST3Record rec = new AD_PUB_2220_LCURLIST3Record();
			rec.proc_dt = Util.checkString(rset2.getString("proc_dt"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			rec.cnt = Util.checkString(rset2.getString("cnt"));
			rec.pubc_side = Util.checkString(rset2.getString("pubc_side"));
			rec.dn = Util.checkString(rset2.getString("dn"));
			rec.cm = Util.checkString(rset2.getString("cm"));
			rec.pubc_tot_amt = Util.checkString(rset2.getString("pubc_tot_amt"));
			rec.uprc = Util.checkString(rset2.getString("uprc"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2220_LDataSet ds = (AD_PUB_2220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2220_LCURLISTRecord curlistRec = (AD_PUB_2220_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_PUB_2220_LCURLIST2Record curlist2Rec = (AD_PUB_2220_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_PUB_2220_LCURLIST3Record curlist3Rec = (AD_PUB_2220_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.cnt%>
<%= curlistRec.damt%>
<%= curlistRec.jamt%>
<%= curlistRec.jgamt%>
<%= curlistRec.mamt%>
<%= curlistRec.gbamt%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.medi_nm%>
<%= curlist2Rec.cnt%>
<%= curlist2Rec.damt%>
<%= curlist2Rec.jamt%>
<%= curlist2Rec.jgamt%>
<%= curlist2Rec.mamt%>
<%= curlist2Rec.gbamt%>
<%= curlist3Rec.proc_dt%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.medi_nm%>
<%= curlist3Rec.cnt%>
<%= curlist3Rec.pubc_side%>
<%= curlist3Rec.dn%>
<%= curlist3Rec.cm%>
<%= curlist3Rec.pubc_tot_amt%>
<%= curlist3Rec.uprc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 19:12:00 KST 2009 */