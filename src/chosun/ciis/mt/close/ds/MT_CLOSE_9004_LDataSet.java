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


public class MT_CLOSE_9004_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_9004_LDataSet(){}
	public MT_CLOSE_9004_LDataSet(String errcode, String errmsg){
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

		ResultSet rset6 = (ResultSet) cstmt.getObject(4);
		while(rset6.next()){
			MT_CLOSE_9004_LCURLISTRecord rec = new MT_CLOSE_9004_LCURLISTRecord();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.curlist.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(5);
		while(rset7.next()){
			MT_CLOSE_9004_LCURLIST1Record rec = new MT_CLOSE_9004_LCURLIST1Record();
			rec.matr_cd = Util.checkString(rset7.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset7.getString("matr_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(6);
		while(rset8.next()){
			MT_CLOSE_9004_LCURLIST2Record rec = new MT_CLOSE_9004_LCURLIST2Record();
			rec.matr_cd = Util.checkString(rset8.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset8.getString("matr_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(7);
		while(rset9.next()){
			MT_CLOSE_9004_LCURLIST3Record rec = new MT_CLOSE_9004_LCURLIST3Record();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(8);
		while(rset10.next()){
			MT_CLOSE_9004_LCURLIST4Record rec = new MT_CLOSE_9004_LCURLIST4Record();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset10.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset10.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(9);
		while(rset11.next()){
			MT_CLOSE_9004_LCURLIST5Record rec = new MT_CLOSE_9004_LCURLIST5Record();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset11.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset11.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset11.getString("cdabrvnm_cd"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_9004_LDataSet ds = (MT_CLOSE_9004_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_9004_LCURLISTRecord curlistRec = (MT_CLOSE_9004_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_9004_LCURLIST1Record curlist1Rec = (MT_CLOSE_9004_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_9004_LCURLIST2Record curlist2Rec = (MT_CLOSE_9004_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_CLOSE_9004_LCURLIST3Record curlist3Rec = (MT_CLOSE_9004_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_CLOSE_9004_LCURLIST4Record curlist4Rec = (MT_CLOSE_9004_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		MT_CLOSE_9004_LCURLIST5Record curlist5Rec = (MT_CLOSE_9004_LCURLIST5Record)ds.curlist5.get(i);%>
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
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlistRec.cd_abrv_nm%>
<%= curlistRec.cdnm_cd%>
<%= curlistRec.cdabrvnm_cd%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist4Rec.cdnm_cd%>
<%= curlist4Rec.cdabrvnm_cd%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.cd_abrv_nm%>
<%= curlist5Rec.cdnm_cd%>
<%= curlist5Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 31 15:15:39 KST 2009 */