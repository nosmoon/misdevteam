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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_3210_LDataSet(){}
	public HD_VACA_3210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			HD_VACA_3210_LCURLISTRecord rec = new HD_VACA_3210_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.aply_yymm = Util.checkString(rset0.getString("aply_yymm"));
			rec.week = Util.checkString(rset0.getString("week"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.mon_ck = Util.checkString(rset0.getString("mon_ck"));
			rec.tue_ck = Util.checkString(rset0.getString("tue_ck"));
			rec.wed_ck = Util.checkString(rset0.getString("wed_ck"));
			rec.thu_ck = Util.checkString(rset0.getString("thu_ck"));
			rec.fri_ck = Util.checkString(rset0.getString("fri_ck"));
			rec.sat_ck = Util.checkString(rset0.getString("sat_ck"));
			rec.sun_ck = Util.checkString(rset0.getString("sun_ck"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.hody_plan_dt_mon = Util.checkString(rset0.getString("hody_plan_dt_mon"));
			rec.hody_plan_dt_tue = Util.checkString(rset0.getString("hody_plan_dt_tue"));
			rec.hody_plan_dt_wed = Util.checkString(rset0.getString("hody_plan_dt_wed"));
			rec.hody_plan_dt_thu = Util.checkString(rset0.getString("hody_plan_dt_thu"));
			rec.hody_plan_dt_fri = Util.checkString(rset0.getString("hody_plan_dt_fri"));
			rec.hody_plan_dt_sat = Util.checkString(rset0.getString("hody_plan_dt_sat"));
			rec.hody_plan_dt_sun = Util.checkString(rset0.getString("hody_plan_dt_sun"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_nm = Util.checkString(rset0.getString("proc_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			HD_VACA_3210_LCURLIST1Record rec = new HD_VACA_3210_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.aply_yymm = Util.checkString(rset1.getString("aply_yymm"));
			rec.week = Util.checkString(rset1.getString("week"));
			rec.nm_korn = Util.checkString(rset1.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset1.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset1.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset1.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset1.getString("dty_nm"));
			rec.mon_ck = Util.checkString(rset1.getString("mon_ck"));
			rec.tue_ck = Util.checkString(rset1.getString("tue_ck"));
			rec.wed_ck = Util.checkString(rset1.getString("wed_ck"));
			rec.thu_ck = Util.checkString(rset1.getString("thu_ck"));
			rec.fri_ck = Util.checkString(rset1.getString("fri_ck"));
			rec.sat_ck = Util.checkString(rset1.getString("sat_ck"));
			rec.sun_ck = Util.checkString(rset1.getString("sun_ck"));
			rec.wkdy = Util.checkString(rset1.getString("wkdy"));
			rec.frdt = Util.checkString(rset1.getString("frdt"));
			rec.todt = Util.checkString(rset1.getString("todt"));
			rec.hody_plan_dt_mon = Util.checkString(rset1.getString("hody_plan_dt_mon"));
			rec.hody_plan_dt_tue = Util.checkString(rset1.getString("hody_plan_dt_tue"));
			rec.hody_plan_dt_wed = Util.checkString(rset1.getString("hody_plan_dt_wed"));
			rec.hody_plan_dt_thu = Util.checkString(rset1.getString("hody_plan_dt_thu"));
			rec.hody_plan_dt_fri = Util.checkString(rset1.getString("hody_plan_dt_fri"));
			rec.hody_plan_dt_sat = Util.checkString(rset1.getString("hody_plan_dt_sat"));
			rec.hody_plan_dt_sun = Util.checkString(rset1.getString("hody_plan_dt_sun"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			rec.proc_nm = Util.checkString(rset1.getString("proc_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(12);
		while(rset2.next()){
			HD_VACA_3210_LCURLIST2Record rec = new HD_VACA_3210_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset2.getString("emp_no"));
			rec.aply_yymm = Util.checkString(rset2.getString("aply_yymm"));
			rec.week = Util.checkString(rset2.getString("week"));
			rec.nm_korn = Util.checkString(rset2.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset2.getString("dept_nm"));
			rec.posi_cd = Util.checkString(rset2.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset2.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset2.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset2.getString("dty_nm"));
			rec.week1 = Util.checkString(rset2.getString("week1"));
			rec.week2 = Util.checkString(rset2.getString("week2"));
			rec.week3 = Util.checkString(rset2.getString("week3"));
			rec.week4 = Util.checkString(rset2.getString("week4"));
			rec.week5 = Util.checkString(rset2.getString("week5"));
			rec.sun_rate = Util.checkString(rset2.getString("sun_rate"));
			rec.week_rate = Util.checkString(rset2.getString("week_rate"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(13);
		while(rset3.next()){
			HD_VACA_3210_LCURLIST3Record rec = new HD_VACA_3210_LCURLIST3Record();
			rec.emp_cnt = Util.checkString(rset3.getString("emp_cnt"));
			rec.tot_week_rate = Util.checkString(rset3.getString("tot_week_rate"));
			rec.tot_sunday_rate = Util.checkString(rset3.getString("tot_sunday_rate"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_3210_LDataSet ds = (HD_VACA_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_3210_LCURLISTRecord curlistRec = (HD_VACA_3210_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_VACA_3210_LCURLIST1Record curlist1Rec = (HD_VACA_3210_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_VACA_3210_LCURLIST2Record curlist2Rec = (HD_VACA_3210_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_VACA_3210_LCURLIST3Record curlist3Rec = (HD_VACA_3210_LCURLIST3Record)ds.curlist3.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.aply_yymm%>
<%= curlistRec.week%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.mon_ck%>
<%= curlistRec.tue_ck%>
<%= curlistRec.wed_ck%>
<%= curlistRec.thu_ck%>
<%= curlistRec.fri_ck%>
<%= curlistRec.sat_ck%>
<%= curlistRec.sun_ck%>
<%= curlistRec.wkdy%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.hody_plan_dt_mon%>
<%= curlistRec.hody_plan_dt_tue%>
<%= curlistRec.hody_plan_dt_wed%>
<%= curlistRec.hody_plan_dt_thu%>
<%= curlistRec.hody_plan_dt_fri%>
<%= curlistRec.hody_plan_dt_sat%>
<%= curlistRec.hody_plan_dt_sun%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_nm%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.aply_yymm%>
<%= curlist1Rec.week%>
<%= curlist1Rec.nm_korn%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.posi_cd%>
<%= curlist1Rec.posi_nm%>
<%= curlist1Rec.dty_cd%>
<%= curlist1Rec.dty_nm%>
<%= curlist1Rec.mon_ck%>
<%= curlist1Rec.tue_ck%>
<%= curlist1Rec.wed_ck%>
<%= curlist1Rec.thu_ck%>
<%= curlist1Rec.fri_ck%>
<%= curlist1Rec.sat_ck%>
<%= curlist1Rec.sun_ck%>
<%= curlist1Rec.wkdy%>
<%= curlist1Rec.frdt%>
<%= curlist1Rec.todt%>
<%= curlist1Rec.hody_plan_dt_mon%>
<%= curlist1Rec.hody_plan_dt_tue%>
<%= curlist1Rec.hody_plan_dt_wed%>
<%= curlist1Rec.hody_plan_dt_thu%>
<%= curlist1Rec.hody_plan_dt_fri%>
<%= curlist1Rec.hody_plan_dt_sat%>
<%= curlist1Rec.hody_plan_dt_sun%>
<%= curlist1Rec.proc_stat%>
<%= curlist1Rec.proc_nm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.aply_yymm%>
<%= curlist2Rec.week%>
<%= curlist2Rec.nm_korn%>
<%= curlist2Rec.dept_cd%>
<%= curlist2Rec.dept_nm%>
<%= curlist2Rec.posi_cd%>
<%= curlist2Rec.posi_nm%>
<%= curlist2Rec.dty_cd%>
<%= curlist2Rec.dty_nm%>
<%= curlist2Rec.week1%>
<%= curlist2Rec.week2%>
<%= curlist2Rec.week3%>
<%= curlist2Rec.week4%>
<%= curlist2Rec.week5%>
<%= curlist2Rec.sun_rate%>
<%= curlist2Rec.week_rate%>
<%= curlist3Rec.emp_cnt%>
<%= curlist3Rec.tot_week_rate%>
<%= curlist3Rec.tot_sunday_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 02 09:51:56 KST 2015 */