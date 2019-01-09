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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3416_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_3416_LDataSet(){}
	public MT_PRNPAP_3416_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PRNPAP_3416_LCURLISTRecord rec = new MT_PRNPAP_3416_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.title = Util.checkString(rset0.getString("title"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.hdqt_paper_clsf = Util.checkString(rset0.getString("hdqt_paper_clsf"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cnt = Util.checkString(rset0.getString("cnt"));
			rec.wgt = Util.checkString(rset0.getString("wgt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PRNPAP_3416_LCURLIST1Record rec = new MT_PRNPAP_3416_LCURLIST1Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_PRNPAP_3416_LCURLIST2Record rec = new MT_PRNPAP_3416_LCURLIST2Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.hdqt_paper_clsf = Util.checkString(rset2.getString("hdqt_paper_clsf"));
			rec.title = Util.checkString(rset2.getString("title"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3416_LDataSet ds = (MT_PRNPAP_3416_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3416_LCURLISTRecord curlistRec = (MT_PRNPAP_3416_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_3416_LCURLIST1Record curlist1Rec = (MT_PRNPAP_3416_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PRNPAP_3416_LCURLIST2Record curlist2Rec = (MT_PRNPAP_3416_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.gubun%>
<%= curlistRec.title%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.issu_dt%>
<%= curlistRec.prt_dt%>
<%= curlistRec.hdqt_paper_clsf%>
<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cnt%>
<%= curlistRec.wgt%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.hdqt_paper_clsf%>
<%= curlist2Rec.title%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 09:52:16 KST 2009 */