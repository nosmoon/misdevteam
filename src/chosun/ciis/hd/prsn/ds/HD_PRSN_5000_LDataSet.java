

package chosun.ciis.hd.prsn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_5000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_PRSN_5000_LDataSet(){}
	public HD_PRSN_5000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_PRSN_5000_LCURLISTRecord rec = new HD_PRSN_5000_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.pgm_id = Util.checkString(rset0.getString("pgm_id"));
			rec.pgm_nm = Util.checkString(rset0.getString("pgm_nm"));
			rec.annc_frdt = Util.checkString(rset0.getString("annc_frdt"));
			rec.annc_todt = Util.checkString(rset0.getString("annc_todt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_PRSN_5000_LCURLIST1Record rec = new HD_PRSN_5000_LCURLIST1Record();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset1.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset1.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset1.getString("erp_cnt"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			HD_PRSN_5000_LCURLIST2Record rec = new HD_PRSN_5000_LCURLIST2Record();
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset2.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset2.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset2.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset2.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset2.getString("erp_cnt"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			HD_PRSN_5000_LCURLIST3Record rec = new HD_PRSN_5000_LCURLIST3Record();
			rec.dept_cd = Util.checkString(rset3.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset3.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset3.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset3.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset3.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset3.getString("erp_cnt"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			HD_PRSN_5000_LCURLIST4Record rec = new HD_PRSN_5000_LCURLIST4Record();
			rec.dept_cd = Util.checkString(rset4.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset4.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset4.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset4.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset4.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset4.getString("erp_cnt"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			HD_PRSN_5000_LCURLIST5Record rec = new HD_PRSN_5000_LCURLIST5Record();
			rec.dept_cd = Util.checkString(rset5.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset5.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset5.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset5.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset5.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset5.getString("erp_cnt"));
			this.curlist5.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			HD_PRSN_5000_LCURLIST6Record rec = new HD_PRSN_5000_LCURLIST6Record();
			rec.dept_cd = Util.checkString(rset6.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset6.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset6.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset6.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset6.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset6.getString("erp_cnt"));
			this.curlist6.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			HD_PRSN_5000_LCURLIST7Record rec = new HD_PRSN_5000_LCURLIST7Record();
			rec.dept_cd = Util.checkString(rset7.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset7.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset7.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset7.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset7.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset7.getString("erp_cnt"));
			this.curlist7.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(12);
		while(rset8.next()){
			HD_PRSN_5000_LCURLIST8Record rec = new HD_PRSN_5000_LCURLIST8Record();
			rec.dept_cd = Util.checkString(rset8.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset8.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset8.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset8.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset8.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset8.getString("erp_cnt"));
			this.curlist8.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(13);
		while(rset9.next()){
			HD_PRSN_5000_LCURLIST9Record rec = new HD_PRSN_5000_LCURLIST9Record();
			rec.dept_cd = Util.checkString(rset9.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset9.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset9.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset9.getString("nm_korn"));
			rec.eip_cnt = Util.checkString(rset9.getString("eip_cnt"));
			rec.erp_cnt = Util.checkString(rset9.getString("erp_cnt"));
			this.curlist9.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRSN_5000_LDataSet ds = (HD_PRSN_5000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRSN_5000_LCURLISTRecord curlistRec = (HD_PRSN_5000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_PRSN_5000_LCURLIST1Record curlist1Rec = (HD_PRSN_5000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_PRSN_5000_LCURLIST2Record curlist2Rec = (HD_PRSN_5000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_PRSN_5000_LCURLIST3Record curlist3Rec = (HD_PRSN_5000_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_PRSN_5000_LCURLIST4Record curlist4Rec = (HD_PRSN_5000_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_PRSN_5000_LCURLIST5Record curlist5Rec = (HD_PRSN_5000_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_PRSN_5000_LCURLIST6Record curlist6Rec = (HD_PRSN_5000_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		HD_PRSN_5000_LCURLIST7Record curlist7Rec = (HD_PRSN_5000_LCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		HD_PRSN_5000_LCURLIST8Record curlist8Rec = (HD_PRSN_5000_LCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		HD_PRSN_5000_LCURLIST9Record curlist9Rec = (HD_PRSN_5000_LCURLIST9Record)ds.curlist9.get(i);%>
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
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.pgm_id%>
<%= curlistRec.pgm_nm%>
<%= curlistRec.annc_frdt%>
<%= curlistRec.annc_todt%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.eip_cnt%>
<%= curlist1Rec.erp_cnt%>
<%= curlist2Rec.dept_cd%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.nm_korn%>
<%= curlist2Rec.eip_cnt%>
<%= curlist2Rec.erp_cnt%>
<%= curlist3Rec.dept_cd%>
<%= curlist3Rec.dept_nm%>
<%= curlist3Rec.emp_no%>
<%= curlist3Rec.nm_korn%>
<%= curlist3Rec.eip_cnt%>
<%= curlist3Rec.erp_cnt%>
<%= curlist4Rec.dept_cd%>
<%= curlist4Rec.dept_nm%>
<%= curlist4Rec.emp_no%>
<%= curlist4Rec.nm_korn%>
<%= curlist4Rec.eip_cnt%>
<%= curlist4Rec.erp_cnt%>
<%= curlist5Rec.dept_cd%>
<%= curlist5Rec.dept_nm%>
<%= curlist5Rec.emp_no%>
<%= curlist5Rec.nm_korn%>
<%= curlist5Rec.eip_cnt%>
<%= curlist5Rec.erp_cnt%>
<%= curlist6Rec.dept_cd%>
<%= curlist6Rec.dept_nm%>
<%= curlist6Rec.emp_no%>
<%= curlist6Rec.nm_korn%>
<%= curlist6Rec.eip_cnt%>
<%= curlist6Rec.erp_cnt%>
<%= curlist7Rec.dept_cd%>
<%= curlist7Rec.dept_nm%>
<%= curlist7Rec.emp_no%>
<%= curlist7Rec.nm_korn%>
<%= curlist7Rec.eip_cnt%>
<%= curlist7Rec.erp_cnt%>
<%= curlist8Rec.dept_cd%>
<%= curlist8Rec.dept_nm%>
<%= curlist8Rec.emp_no%>
<%= curlist8Rec.nm_korn%>
<%= curlist8Rec.eip_cnt%>
<%= curlist8Rec.erp_cnt%>
<%= curlist9Rec.dept_cd%>
<%= curlist9Rec.dept_nm%>
<%= curlist9Rec.emp_no%>
<%= curlist9Rec.nm_korn%>
<%= curlist9Rec.eip_cnt%>
<%= curlist9Rec.erp_cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 31 16:44:37 KST 2011 */