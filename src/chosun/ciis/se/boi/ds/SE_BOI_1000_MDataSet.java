/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_BOI_1000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur9 = new ArrayList();
	public ArrayList area_cdcur = new ArrayList();
	public ArrayList commcdcur8 = new ArrayList();
	public ArrayList commcdcur7 = new ArrayList();
	public ArrayList commcdcur6 = new ArrayList();
	public ArrayList commcdcur5 = new ArrayList();
	public ArrayList commcdcur4 = new ArrayList();
	public ArrayList commcdcur18 = new ArrayList();
	public ArrayList commcdcur3 = new ArrayList();
	public ArrayList commcdcur17 = new ArrayList();
	public ArrayList commcdcur2 = new ArrayList();
	public ArrayList commcdcur16 = new ArrayList();
	public ArrayList commcdcur1 = new ArrayList();
	public ArrayList commcdcur15 = new ArrayList();
	public ArrayList commcdcur14 = new ArrayList();
	public ArrayList commcdcur13 = new ArrayList();
	public ArrayList commcdcur12 = new ArrayList();
	public ArrayList commcdcur11 = new ArrayList();
	public ArrayList commcdcur10 = new ArrayList();
	public ArrayList part_cdcur = new ArrayList();
	public ArrayList team_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BOI_1000_MDataSet(){}
	public SE_BOI_1000_MDataSet(String errcode, String errmsg){
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
			SE_BOI_1000_MTEAM_CDCURRecord rec = new SE_BOI_1000_MTEAM_CDCURRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.team_cdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SE_BOI_1000_MPART_CDCURRecord rec = new SE_BOI_1000_MPART_CDCURRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.part_cdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SE_BOI_1000_MAREA_CDCURRecord rec = new SE_BOI_1000_MAREA_CDCURRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.area_cdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			SE_BOI_1000_MCOMMCDCUR1Record rec = new SE_BOI_1000_MCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.commcdcur1.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			SE_BOI_1000_MCOMMCDCUR2Record rec = new SE_BOI_1000_MCOMMCDCUR2Record();
			rec.cd = Util.checkString(rset4.getString("cd"));
			rec.cdnm = Util.checkString(rset4.getString("cdnm"));
			rec.chrg_pers = Util.checkString(rset4.getString("chrg_pers"));
			rec.chrg_persnm = Util.checkString(rset4.getString("chrg_persnm"));
			this.commcdcur2.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(10);
		while(rset5.next()){
			SE_BOI_1000_MCOMMCDCUR3Record rec = new SE_BOI_1000_MCOMMCDCUR3Record();
			rec.cd = Util.checkString(rset5.getString("cd"));
			rec.cdnm = Util.checkString(rset5.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset5.getString("cd_abrv_nm"));
			this.commcdcur3.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(11);
		while(rset6.next()){
			SE_BOI_1000_MCOMMCDCUR4Record rec = new SE_BOI_1000_MCOMMCDCUR4Record();
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset6.getString("cd_abrv_nm"));
			this.commcdcur4.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(12);
		while(rset7.next()){
			SE_BOI_1000_MCOMMCDCUR5Record rec = new SE_BOI_1000_MCOMMCDCUR5Record();
			rec.cd = Util.checkString(rset7.getString("cd"));
			rec.cdnm = Util.checkString(rset7.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset7.getString("cd_abrv_nm"));
			this.commcdcur5.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(13);
		while(rset8.next()){
			SE_BOI_1000_MCOMMCDCUR6Record rec = new SE_BOI_1000_MCOMMCDCUR6Record();
			rec.cd = Util.checkString(rset8.getString("cd"));
			rec.cdnm = Util.checkString(rset8.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset8.getString("cd_abrv_nm"));
			this.commcdcur6.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(14);
		while(rset9.next()){
			SE_BOI_1000_MCOMMCDCUR7Record rec = new SE_BOI_1000_MCOMMCDCUR7Record();
			rec.cd = Util.checkString(rset9.getString("cd"));
			rec.cdnm = Util.checkString(rset9.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset9.getString("cd_abrv_nm"));
			this.commcdcur7.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(15);
		while(rset10.next()){
			SE_BOI_1000_MCOMMCDCUR8Record rec = new SE_BOI_1000_MCOMMCDCUR8Record();
			rec.cd = Util.checkString(rset10.getString("cd"));
			rec.cdnm = Util.checkString(rset10.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset10.getString("cd_abrv_nm"));
			this.commcdcur8.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(16);
		while(rset11.next()){
			SE_BOI_1000_MCOMMCDCUR9Record rec = new SE_BOI_1000_MCOMMCDCUR9Record();
			rec.cd = Util.checkString(rset11.getString("cd"));
			rec.cdnm = Util.checkString(rset11.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset11.getString("cd_abrv_nm"));
			this.commcdcur9.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(17);
		while(rset12.next()){
			SE_BOI_1000_MCOMMCDCUR10Record rec = new SE_BOI_1000_MCOMMCDCUR10Record();
			rec.cd = Util.checkString(rset12.getString("cd"));
			rec.cdnm = Util.checkString(rset12.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset12.getString("cd_abrv_nm"));
			this.commcdcur10.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(18);
		while(rset13.next()){
			SE_BOI_1000_MCOMMCDCUR11Record rec = new SE_BOI_1000_MCOMMCDCUR11Record();
			rec.cd = Util.checkString(rset13.getString("cd"));
			rec.cdnm = Util.checkString(rset13.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset13.getString("cd_abrv_nm"));
			this.commcdcur11.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(19);
		while(rset14.next()){
			SE_BOI_1000_MCOMMCDCUR12Record rec = new SE_BOI_1000_MCOMMCDCUR12Record();
			rec.cd = Util.checkString(rset14.getString("cd"));
			rec.cdnm = Util.checkString(rset14.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset14.getString("cd_abrv_nm"));
			this.commcdcur12.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(20);
		while(rset15.next()){
			SE_BOI_1000_MCOMMCDCUR13Record rec = new SE_BOI_1000_MCOMMCDCUR13Record();
			rec.cd = Util.checkString(rset15.getString("cd"));
			rec.cdnm = Util.checkString(rset15.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset15.getString("cd_abrv_nm"));
			this.commcdcur13.add(rec);
		}
		ResultSet rset16 = (ResultSet) cstmt.getObject(21);
		while(rset16.next()){
			SE_BOI_1000_MCOMMCDCUR14Record rec = new SE_BOI_1000_MCOMMCDCUR14Record();
			rec.cd = Util.checkString(rset16.getString("cd"));
			rec.cdnm = Util.checkString(rset16.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset16.getString("cd_abrv_nm"));
			this.commcdcur14.add(rec);
		}
		ResultSet rset17 = (ResultSet) cstmt.getObject(22);
		while(rset17.next()){
			SE_BOI_1000_MCOMMCDCUR15Record rec = new SE_BOI_1000_MCOMMCDCUR15Record();
			rec.cd = Util.checkString(rset17.getString("cd"));
			rec.cdnm = Util.checkString(rset17.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset17.getString("cd_abrv_nm"));
			this.commcdcur15.add(rec);
		}
		ResultSet rset18 = (ResultSet) cstmt.getObject(23);
		while(rset18.next()){
			SE_BOI_1000_MCOMMCDCUR16Record rec = new SE_BOI_1000_MCOMMCDCUR16Record();
			rec.cd = Util.checkString(rset18.getString("cd"));
			rec.cdnm = Util.checkString(rset18.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset18.getString("cd_abrv_nm"));
			this.commcdcur16.add(rec);
		}
		ResultSet rset19 = (ResultSet) cstmt.getObject(24);
		while(rset19.next()){
			SE_BOI_1000_MCOMMCDCUR17Record rec = new SE_BOI_1000_MCOMMCDCUR17Record();
			rec.cd = Util.checkString(rset19.getString("cd"));
			rec.cdnm = Util.checkString(rset19.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset19.getString("cd_abrv_nm"));
			this.commcdcur17.add(rec);
		}
		ResultSet rset20 = (ResultSet) cstmt.getObject(25);
		while(rset20.next()){
			SE_BOI_1000_MCOMMCDCUR18Record rec = new SE_BOI_1000_MCOMMCDCUR18Record();
			rec.cd = Util.checkString(rset20.getString("cd"));
			rec.cdnm = Util.checkString(rset20.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset20.getString("cd_abrv_nm"));
			this.commcdcur18.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1000_MDataSet ds = (SE_BOI_1000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.team_cdcur.size(); i++){
		SE_BOI_1000_MTEAM_CDCURRecord team_cdcurRec = (SE_BOI_1000_MTEAM_CDCURRecord)ds.team_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.part_cdcur.size(); i++){
		SE_BOI_1000_MPART_CDCURRecord part_cdcurRec = (SE_BOI_1000_MPART_CDCURRecord)ds.part_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.area_cdcur.size(); i++){
		SE_BOI_1000_MAREA_CDCURRecord area_cdcurRec = (SE_BOI_1000_MAREA_CDCURRecord)ds.area_cdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		SE_BOI_1000_MCOMMCDCUR1Record commcdcur1Rec = (SE_BOI_1000_MCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur2.size(); i++){
		SE_BOI_1000_MCOMMCDCUR2Record commcdcur2Rec = (SE_BOI_1000_MCOMMCDCUR2Record)ds.commcdcur2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur3.size(); i++){
		SE_BOI_1000_MCOMMCDCUR3Record commcdcur3Rec = (SE_BOI_1000_MCOMMCDCUR3Record)ds.commcdcur3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur4.size(); i++){
		SE_BOI_1000_MCOMMCDCUR4Record commcdcur4Rec = (SE_BOI_1000_MCOMMCDCUR4Record)ds.commcdcur4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur5.size(); i++){
		SE_BOI_1000_MCOMMCDCUR5Record commcdcur5Rec = (SE_BOI_1000_MCOMMCDCUR5Record)ds.commcdcur5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur6.size(); i++){
		SE_BOI_1000_MCOMMCDCUR6Record commcdcur6Rec = (SE_BOI_1000_MCOMMCDCUR6Record)ds.commcdcur6.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur7.size(); i++){
		SE_BOI_1000_MCOMMCDCUR7Record commcdcur7Rec = (SE_BOI_1000_MCOMMCDCUR7Record)ds.commcdcur7.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur8.size(); i++){
		SE_BOI_1000_MCOMMCDCUR8Record commcdcur8Rec = (SE_BOI_1000_MCOMMCDCUR8Record)ds.commcdcur8.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur9.size(); i++){
		SE_BOI_1000_MCOMMCDCUR9Record commcdcur9Rec = (SE_BOI_1000_MCOMMCDCUR9Record)ds.commcdcur9.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur10.size(); i++){
		SE_BOI_1000_MCOMMCDCUR10Record commcdcur10Rec = (SE_BOI_1000_MCOMMCDCUR10Record)ds.commcdcur10.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur11.size(); i++){
		SE_BOI_1000_MCOMMCDCUR11Record commcdcur11Rec = (SE_BOI_1000_MCOMMCDCUR11Record)ds.commcdcur11.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur12.size(); i++){
		SE_BOI_1000_MCOMMCDCUR12Record commcdcur12Rec = (SE_BOI_1000_MCOMMCDCUR12Record)ds.commcdcur12.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur13.size(); i++){
		SE_BOI_1000_MCOMMCDCUR13Record commcdcur13Rec = (SE_BOI_1000_MCOMMCDCUR13Record)ds.commcdcur13.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur14.size(); i++){
		SE_BOI_1000_MCOMMCDCUR14Record commcdcur14Rec = (SE_BOI_1000_MCOMMCDCUR14Record)ds.commcdcur14.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur15.size(); i++){
		SE_BOI_1000_MCOMMCDCUR15Record commcdcur15Rec = (SE_BOI_1000_MCOMMCDCUR15Record)ds.commcdcur15.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur16.size(); i++){
		SE_BOI_1000_MCOMMCDCUR16Record commcdcur16Rec = (SE_BOI_1000_MCOMMCDCUR16Record)ds.commcdcur16.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur17.size(); i++){
		SE_BOI_1000_MCOMMCDCUR17Record commcdcur17Rec = (SE_BOI_1000_MCOMMCDCUR17Record)ds.commcdcur17.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.commcdcur18.size(); i++){
		SE_BOI_1000_MCOMMCDCUR18Record commcdcur18Rec = (SE_BOI_1000_MCOMMCDCUR18Record)ds.commcdcur18.get(i);%>
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
<%= ds.getCommcdcur5()%>
<%= ds.getCommcdcur6()%>
<%= ds.getCommcdcur7()%>
<%= ds.getCommcdcur8()%>
<%= ds.getCommcdcur9()%>
<%= ds.getCommcdcur10()%>
<%= ds.getCommcdcur11()%>
<%= ds.getCommcdcur12()%>
<%= ds.getCommcdcur13()%>
<%= ds.getCommcdcur14()%>
<%= ds.getCommcdcur15()%>
<%= ds.getCommcdcur16()%>
<%= ds.getCommcdcur17()%>
<%= ds.getCommcdcur18()%>
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
<%= commcdcur2Rec.chrg_pers%>
<%= commcdcur2Rec.chrg_persnm%>
<%= commcdcur3Rec.cd%>
<%= commcdcur3Rec.cdnm%>
<%= commcdcur3Rec.cd_abrv_nm%>
<%= commcdcur4Rec.cd%>
<%= commcdcur4Rec.cdnm%>
<%= commcdcur4Rec.cd_abrv_nm%>
<%= commcdcur5Rec.cd%>
<%= commcdcur5Rec.cdnm%>
<%= commcdcur5Rec.cd_abrv_nm%>
<%= commcdcur6Rec.cd%>
<%= commcdcur6Rec.cdnm%>
<%= commcdcur6Rec.cd_abrv_nm%>
<%= commcdcur7Rec.cd%>
<%= commcdcur7Rec.cdnm%>
<%= commcdcur7Rec.cd_abrv_nm%>
<%= commcdcur8Rec.cd%>
<%= commcdcur8Rec.cdnm%>
<%= commcdcur8Rec.cd_abrv_nm%>
<%= commcdcur9Rec.cd%>
<%= commcdcur9Rec.cdnm%>
<%= commcdcur9Rec.cd_abrv_nm%>
<%= commcdcur10Rec.cd%>
<%= commcdcur10Rec.cdnm%>
<%= commcdcur10Rec.cd_abrv_nm%>
<%= commcdcur11Rec.cd%>
<%= commcdcur11Rec.cdnm%>
<%= commcdcur11Rec.cd_abrv_nm%>
<%= commcdcur12Rec.cd%>
<%= commcdcur12Rec.cdnm%>
<%= commcdcur12Rec.cd_abrv_nm%>
<%= commcdcur13Rec.cd%>
<%= commcdcur13Rec.cdnm%>
<%= commcdcur13Rec.cd_abrv_nm%>
<%= commcdcur14Rec.cd%>
<%= commcdcur14Rec.cdnm%>
<%= commcdcur14Rec.cd_abrv_nm%>
<%= commcdcur15Rec.cd%>
<%= commcdcur15Rec.cdnm%>
<%= commcdcur15Rec.cd_abrv_nm%>
<%= commcdcur16Rec.cd%>
<%= commcdcur16Rec.cdnm%>
<%= commcdcur16Rec.cd_abrv_nm%>
<%= commcdcur17Rec.cd%>
<%= commcdcur17Rec.cdnm%>
<%= commcdcur17Rec.cd_abrv_nm%>
<%= commcdcur18Rec.cd%>
<%= commcdcur18Rec.cdnm%>
<%= commcdcur18Rec.cd_abrv_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 11:52:05 KST 2009 */