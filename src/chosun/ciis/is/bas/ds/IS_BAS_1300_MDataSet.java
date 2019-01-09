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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist5 = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList curlist4 = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList cs_arealist = new ArrayList();
	public ArrayList curlist11 = new ArrayList();
	public ArrayList cs_teamlist = new ArrayList();
	public ArrayList curlist10 = new ArrayList();
	public ArrayList curlist9 = new ArrayList();
	public ArrayList curlist8 = new ArrayList();
	public ArrayList cs_partlist = new ArrayList();
	public ArrayList curlist7 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_1300_MDataSet(){}
	public IS_BAS_1300_MDataSet(String errcode, String errmsg){
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
			IS_BAS_1300_MTEAMLISTRecord rec = new IS_BAS_1300_MTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			IS_BAS_1300_MPARTLISTRecord rec = new IS_BAS_1300_MPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			IS_BAS_1300_MCURLIST1Record rec = new IS_BAS_1300_MCURLIST1Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset2.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset2.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset2.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			IS_BAS_1300_MCURLIST2Record rec = new IS_BAS_1300_MCURLIST2Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset3.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset3.getString("cdabrvnm_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			IS_BAS_1300_MCURLIST3Record rec = new IS_BAS_1300_MCURLIST3Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset4.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset4.getString("cdabrvnm_cd"));
			this.curlist3.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			IS_BAS_1300_MCURLIST4Record rec = new IS_BAS_1300_MCURLIST4Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset5.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset5.getString("cdabrvnm_cd"));
			this.curlist4.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			IS_BAS_1300_MCURLIST5Record rec = new IS_BAS_1300_MCURLIST5Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset6.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset6.getString("cdabrvnm_cd"));
			this.curlist5.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			IS_BAS_1300_MCURLIST6Record rec = new IS_BAS_1300_MCURLIST6Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset7.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset7.getString("cdabrvnm_cd"));
			this.curlist6.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(16);
		while(rset8.next()){
			IS_BAS_1300_MCURLIST7Record rec = new IS_BAS_1300_MCURLIST7Record();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset8.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset8.getString("cdabrvnm_cd"));
			this.curlist7.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(17);
		while(rset9.next()){
			IS_BAS_1300_MCURLIST8Record rec = new IS_BAS_1300_MCURLIST8Record();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset9.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset9.getString("cdabrvnm_cd"));
			this.curlist8.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(18);
		while(rset10.next()){
			IS_BAS_1300_MCURLIST9Record rec = new IS_BAS_1300_MCURLIST9Record();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset10.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset10.getString("cdabrvnm_cd"));
			this.curlist9.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(19);
		while(rset11.next()){
			IS_BAS_1300_MCURLIST10Record rec = new IS_BAS_1300_MCURLIST10Record();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset11.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset11.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset11.getString("cdabrvnm_cd"));
			this.curlist10.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(20);
		while(rset12.next()){
			IS_BAS_1300_MCURLIST11Record rec = new IS_BAS_1300_MCURLIST11Record();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset12.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset12.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset12.getString("cdabrvnm_cd"));
			this.curlist11.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(21);
		while(rset13.next()){
			IS_BAS_1300_MCS_TEAMLISTRecord rec = new IS_BAS_1300_MCS_TEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset13.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset13.getString("dept_nm"));
			this.cs_teamlist.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(22);
		while(rset14.next()){
			IS_BAS_1300_MCS_PARTLISTRecord rec = new IS_BAS_1300_MCS_PARTLISTRecord();
			rec.dept_cd = Util.checkString(rset14.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset14.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset14.getString("supr_dept_cd"));
			this.cs_partlist.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(23);
		while(rset15.next()){
			IS_BAS_1300_MCS_AREALISTRecord rec = new IS_BAS_1300_MCS_AREALISTRecord();
			rec.area_cd = Util.checkString(rset15.getString("area_cd"));
			rec.area_nm = Util.checkString(rset15.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset15.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset15.getString("supr_dept_cd"));
			this.cs_arealist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1300_MDataSet ds = (IS_BAS_1300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		IS_BAS_1300_MTEAMLISTRecord teamlistRec = (IS_BAS_1300_MTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		IS_BAS_1300_MPARTLISTRecord partlistRec = (IS_BAS_1300_MPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_BAS_1300_MCURLIST1Record curlist1Rec = (IS_BAS_1300_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		IS_BAS_1300_MCURLIST2Record curlist2Rec = (IS_BAS_1300_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		IS_BAS_1300_MCURLIST3Record curlist3Rec = (IS_BAS_1300_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		IS_BAS_1300_MCURLIST4Record curlist4Rec = (IS_BAS_1300_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		IS_BAS_1300_MCURLIST5Record curlist5Rec = (IS_BAS_1300_MCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		IS_BAS_1300_MCURLIST6Record curlist6Rec = (IS_BAS_1300_MCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist7.size(); i++){
		IS_BAS_1300_MCURLIST7Record curlist7Rec = (IS_BAS_1300_MCURLIST7Record)ds.curlist7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist8.size(); i++){
		IS_BAS_1300_MCURLIST8Record curlist8Rec = (IS_BAS_1300_MCURLIST8Record)ds.curlist8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist9.size(); i++){
		IS_BAS_1300_MCURLIST9Record curlist9Rec = (IS_BAS_1300_MCURLIST9Record)ds.curlist9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist10.size(); i++){
		IS_BAS_1300_MCURLIST10Record curlist10Rec = (IS_BAS_1300_MCURLIST10Record)ds.curlist10.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist11.size(); i++){
		IS_BAS_1300_MCURLIST11Record curlist11Rec = (IS_BAS_1300_MCURLIST11Record)ds.curlist11.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cs_teamlist.size(); i++){
		IS_BAS_1300_MCS_TEAMLISTRecord cs_teamlistRec = (IS_BAS_1300_MCS_TEAMLISTRecord)ds.cs_teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cs_partlist.size(); i++){
		IS_BAS_1300_MCS_PARTLISTRecord cs_partlistRec = (IS_BAS_1300_MCS_PARTLISTRecord)ds.cs_partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cs_arealist.size(); i++){
		IS_BAS_1300_MCS_AREALISTRecord cs_arealistRec = (IS_BAS_1300_MCS_AREALISTRecord)ds.cs_arealist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getCurlist7()%>
<%= ds.getCurlist8()%>
<%= ds.getCurlist9()%>
<%= ds.getCurlist10()%>
<%= ds.getCurlist11()%>
<%= ds.getCs_teamlist()%>
<%= ds.getCs_partlist()%>
<%= ds.getCs_arealist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.cdnm_cd%>
<%= curlist2Rec.cdabrvnm_cd%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist3Rec.cdnm_cd%>
<%= curlist3Rec.cdabrvnm_cd%>
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
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist6Rec.cd_abrv_nm%>
<%= curlist6Rec.cdnm_cd%>
<%= curlist6Rec.cdabrvnm_cd%>
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
<%= curlist10Rec.cd%>
<%= curlist10Rec.cdnm%>
<%= curlist10Rec.cd_abrv_nm%>
<%= curlist10Rec.cdnm_cd%>
<%= curlist10Rec.cdabrvnm_cd%>
<%= curlist11Rec.cd%>
<%= curlist11Rec.cdnm%>
<%= curlist11Rec.cd_abrv_nm%>
<%= curlist11Rec.cdnm_cd%>
<%= curlist11Rec.cdabrvnm_cd%>
<%= cs_teamlistRec.dept_cd%>
<%= cs_teamlistRec.dept_nm%>
<%= cs_partlistRec.dept_cd%>
<%= cs_partlistRec.dept_nm%>
<%= cs_partlistRec.supr_dept_cd%>
<%= cs_arealistRec.area_cd%>
<%= cs_arealistRec.area_nm%>
<%= cs_arealistRec.dept_cd%>
<%= cs_arealistRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 14:43:45 KST 2012 */