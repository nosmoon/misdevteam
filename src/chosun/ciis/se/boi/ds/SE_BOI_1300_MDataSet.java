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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1300_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur4 = new ArrayList();
	public ArrayList area_cdcur = new ArrayList();
	public ArrayList commcdcur3 = new ArrayList();
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public ArrayList team_cdcur = new ArrayList();
	public ArrayList part_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1300_MDataSet(){}
	public SE_BOI_1300_MDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SE_BOI_1300_MTEAM_CDCURRecord rec = new SE_BOI_1300_MTEAM_CDCURRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			this.team_cdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SE_BOI_1300_MPART_CDCURRecord rec = new SE_BOI_1300_MPART_CDCURRecord();
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset2.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.part_cdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			SE_BOI_1300_MAREA_CDCURRecord rec = new SE_BOI_1300_MAREA_CDCURRecord();
			rec.area_cd = Util.checkString(rset3.getString("area_cd"));
			rec.area_nm = Util.checkString(rset3.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset3.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset3.getString("supr_dept_cd"));
			this.area_cdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			SE_BOI_1300_MCOMMCDCUR1Record rec = new SE_BOI_1300_MCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset4.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			SE_BOI_1300_MCOMMCDCUR2Record rec = new SE_BOI_1300_MCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.commcdcur2.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			SE_BOI_1300_MCOMMCDCUR3Record rec = new SE_BOI_1300_MCOMMCDCUR3Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			this.commcdcur3.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			SE_BOI_1300_MCOMMCDCUR4Record rec = new SE_BOI_1300_MCOMMCDCUR4Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			this.commcdcur4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1300_MDataSet ds = (SE_BOI_1300_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.team_cdcur.size(); i++){
		SE_BOI_1300_MTEAM_CDCURRecord team_cdcurRec = (SE_BOI_1300_MTEAM_CDCURRecord)ds.team_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.part_cdcur.size(); i++){
		SE_BOI_1300_MPART_CDCURRecord part_cdcurRec = (SE_BOI_1300_MPART_CDCURRecord)ds.part_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.area_cdcur.size(); i++){
		SE_BOI_1300_MAREA_CDCURRecord area_cdcurRec = (SE_BOI_1300_MAREA_CDCURRecord)ds.area_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_BOI_1300_MCOMMCDCUR1Record commcdcur1Rec = (SE_BOI_1300_MCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_BOI_1300_MCOMMCDCUR2Record commcdcur2Rec = (SE_BOI_1300_MCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur3.size(); i++){
		SE_BOI_1300_MCOMMCDCUR3Record commcdcur3Rec = (SE_BOI_1300_MCOMMCDCUR3Record)ds.commcdcur3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur4.size(); i++){
		SE_BOI_1300_MCOMMCDCUR4Record commcdcur4Rec = (SE_BOI_1300_MCOMMCDCUR4Record)ds.commcdcur4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeam_cdcur()%>
<%= ds.getPart_cdcur()%>
<%= ds.getArea_cdcur()%>
<%= ds.getCommcdcur1()%>
<%= ds.getCommcdcur2()%>
<%= ds.getCommcdcur3()%>
<%= ds.getCommcdcur4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= team_cdcurRec.dept_cd%>
<%= team_cdcurRec.dept_nm%>
<%= part_cdcurRec.dept_cd%>
<%= part_cdcurRec.dept_nm%>
<%= part_cdcurRec.supr_dept_cd%>
<%= area_cdcurRec.area_cd%>
<%= area_cdcurRec.area_nm%>
<%= area_cdcurRec.dept_cd%>
<%= area_cdcurRec.supr_dept_cd%>
<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= commcdcur2Rec.cd%>
<%= commcdcur2Rec.cdnm%>
<%= commcdcur2Rec.cd_abrv_nm%>
<%= commcdcur3Rec.cd%>
<%= commcdcur3Rec.cdnm%>
<%= commcdcur3Rec.cd_abrv_nm%>
<%= commcdcur4Rec.cd%>
<%= commcdcur4Rec.cdnm%>
<%= commcdcur4Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */