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


public class MT_PAPINOUT_2100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2100_LDataSet(){}
	public MT_PAPINOUT_2100_LDataSet(String errcode, String errmsg){
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
			MT_PAPINOUT_2100_LCURLIST1Record rec = new MT_PAPINOUT_2100_LCURLIST1Record();
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MT_PAPINOUT_2100_LCURLIST2Record rec = new MT_PAPINOUT_2100_LCURLIST2Record();
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.clos_clsf = Util.checkString(rset1.getString("clos_clsf"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			MT_PAPINOUT_2100_LCURLIST3Record rec = new MT_PAPINOUT_2100_LCURLIST3Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.descri = Util.checkString(rset2.getString("descri"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			MT_PAPINOUT_2100_LCURLIST4Record rec = new MT_PAPINOUT_2100_LCURLIST4Record();
			rec.fac_clsf = Util.checkString(rset3.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset3.getString("fac_clsf_nm"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			MT_PAPINOUT_2100_LCURLIST5Record rec = new MT_PAPINOUT_2100_LCURLIST5Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.descri = Util.checkString(rset4.getString("descri"));
			rec.fac_clsf = Util.checkString(rset4.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset4.getString("fac_clsf_nm"));
			rec.clos_yn = Util.checkString(rset4.getString("clos_yn"));
			rec.clos_yn_nm = Util.checkString(rset4.getString("clos_yn_nm"));
			this.curlist5.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2100_LDataSet ds = (MT_PAPINOUT_2100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_2100_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_2100_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_2100_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_2100_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPINOUT_2100_LCURLIST3Record curlist3Rec = (MT_PAPINOUT_2100_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_PAPINOUT_2100_LCURLIST4Record curlist4Rec = (MT_PAPINOUT_2100_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		MT_PAPINOUT_2100_LCURLIST5Record curlist5Rec = (MT_PAPINOUT_2100_LCURLIST5Record)ds.curlist5.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.fac_clsf_nm%>
<%= curlist1Rec.clos_clsf%>
<%= curlist2Rec.fac_clsf_nm%>
<%= curlist2Rec.clos_clsf%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.descri%>
<%= curlist4Rec.fac_clsf%>
<%= curlist4Rec.fac_clsf_nm%>
<%= curlist5Rec.cd%>
<%= curlist5Rec.descri%>
<%= curlist5Rec.fac_clsf%>
<%= curlist5Rec.fac_clsf_nm%>
<%= curlist5Rec.clos_yn%>
<%= curlist5Rec.clos_yn_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 22 19:00:22 KST 2009 */