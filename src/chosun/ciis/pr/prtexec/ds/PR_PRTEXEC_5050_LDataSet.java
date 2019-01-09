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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_5050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String uprc_yn;

	public PR_PRTEXEC_5050_LDataSet(){}
	public PR_PRTEXEC_5050_LDataSet(String errcode, String errmsg, String uprc_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.uprc_yn = uprc_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setUprc_yn(String uprc_yn){
		this.uprc_yn = uprc_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getUprc_yn(){
		return this.uprc_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			PR_PRTEXEC_5050_LCURLIST1Record rec = new PR_PRTEXEC_5050_LCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_PRTEXEC_5050_LCURLIST2Record rec = new PR_PRTEXEC_5050_LCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			PR_PRTEXEC_5050_LCURLIST3Record rec = new PR_PRTEXEC_5050_LCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			PR_PRTEXEC_5050_LCURLIST4Record rec = new PR_PRTEXEC_5050_LCURLIST4Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.mang_cd_3 = Util.checkString(rset3.getString("mang_cd_3"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			PR_PRTEXEC_5050_LCURLIST5Record rec = new PR_PRTEXEC_5050_LCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			PR_PRTEXEC_5050_LCURLIST6Record rec = new PR_PRTEXEC_5050_LCURLIST6Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			this.curlist6.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			PR_PRTEXEC_5050_LCURLIST7Record rec = new PR_PRTEXEC_5050_LCURLIST7Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.curlist7.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(13);
		while(rset7.next()){
			PR_PRTEXEC_5050_LCURLIST8Record rec = new PR_PRTEXEC_5050_LCURLIST8Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.curlist8.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(14);
		while(rset8.next()){
			PR_PRTEXEC_5050_LCURLIST9Record rec = new PR_PRTEXEC_5050_LCURLIST9Record();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset8.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset8.getString("cdabrvnm_cd"));
			this.curlist9.add(rec);
		}
		this.uprc_yn = Util.checkString(cstmt.getString(15));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_5050_LDataSet ds = (PR_PRTEXEC_5050_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PRTEXEC_5050_LCURLIST1Record curlist1Rec = (PR_PRTEXEC_5050_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PRTEXEC_5050_LCURLIST2Record curlist2Rec = (PR_PRTEXEC_5050_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_PRTEXEC_5050_LCURLIST3Record curlist3Rec = (PR_PRTEXEC_5050_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		PR_PRTEXEC_5050_LCURLIST4Record curlist4Rec = (PR_PRTEXEC_5050_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		PR_PRTEXEC_5050_LCURLIST5Record curlist5Rec = (PR_PRTEXEC_5050_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		PR_PRTEXEC_5050_LCURLIST6Record curlist6Rec = (PR_PRTEXEC_5050_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		PR_PRTEXEC_5050_LCURLIST7Record curlist7Rec = (PR_PRTEXEC_5050_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		PR_PRTEXEC_5050_LCURLIST8Record curlist8Rec = (PR_PRTEXEC_5050_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		PR_PRTEXEC_5050_LCURLIST9Record curlist9Rec = (PR_PRTEXEC_5050_LCURLIST9Record)ds.curlist9.get(i);%>
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
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
<%= ds.getUprc_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist4Rec.cd%>
<%= curlist4Rec.cdnm%>
<%= curlist4Rec.mang_cd_3%>
<%= curlist4Rec.cd_abrv_nm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.cdnm%>
<%= curlist5Rec.cdnm_cd%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist6Rec.cdnm_cd%>
<%= curlist7Rec.cd%>
<%= curlist7Rec.cdnm%>
<%= curlist7Rec.cd_abrv_nm%>
<%= curlist7Rec.cdnm_cd%>
<%= curlist7Rec.cdabrvnm_cd%>
<%= curlist8Rec.cd%>
<%= curlist8Rec.cdnm%>
<%= curlist8Rec.cd_abrv_nm%>
<%= curlist8Rec.cdnm_cd%>
<%= curlist8Rec.cdabrvnm_cd%>
<%= curlist9Rec.cd%>
<%= curlist9Rec.cdnm%>
<%= curlist9Rec.cd_abrv_nm%>
<%= curlist9Rec.cdnm_cd%>
<%= curlist9Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 03 11:57:28 KST 2009 */