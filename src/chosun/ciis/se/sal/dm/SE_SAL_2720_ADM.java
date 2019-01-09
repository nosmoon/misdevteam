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


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2720_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String dept_cd;
	public String sub_dept_cd;
	public String area_cd;
	public String bo_cd;
	public String bo_seq;
	public String chrg_pers;
	public String bgn_mm;
	public String end_mm;
	public String months;
	public String damt_decid_amt;
	public String widr_yn;
	public String widr_bgn_mm;
	public String widr_amt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String chg_pers;

	public SE_SAL_2720_ADM(){}
	public SE_SAL_2720_ADM(String cmpy_cd, String yymm, String dept_cd, String sub_dept_cd, String area_cd, String bo_cd, String bo_seq, String chrg_pers, String bgn_mm, String end_mm, String months, String damt_decid_amt, String widr_yn, String widr_bgn_mm, String widr_amt, String incmg_pers_ip, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.area_cd = area_cd;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.chrg_pers = chrg_pers;
		this.bgn_mm = bgn_mm;
		this.end_mm = end_mm;
		this.months = months;
		this.damt_decid_amt = damt_decid_amt;
		this.widr_yn = widr_yn;
		this.widr_bgn_mm = widr_bgn_mm;
		this.widr_amt = widr_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setBgn_mm(String bgn_mm){
		this.bgn_mm = bgn_mm;
	}

	public void setEnd_mm(String end_mm){
		this.end_mm = end_mm;
	}

	public void setMonths(String months){
		this.months = months;
	}

	public void setDamt_decid_amt(String damt_decid_amt){
		this.damt_decid_amt = damt_decid_amt;
	}

	public void setWidr_yn(String widr_yn){
		this.widr_yn = widr_yn;
	}

	public void setWidr_bgn_mm(String widr_bgn_mm){
		this.widr_bgn_mm = widr_bgn_mm;
	}

	public void setWidr_amt(String widr_amt){
		this.widr_amt = widr_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getBgn_mm(){
		return this.bgn_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getMonths(){
		return this.months;
	}

	public String getDamt_decid_amt(){
		return this.damt_decid_amt;
	}

	public String getWidr_yn(){
		return this.widr_yn;
	}

	public String getWidr_bgn_mm(){
		return this.widr_bgn_mm;
	}

	public String getWidr_amt(){
		return this.widr_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_2720_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2720_ADM dm = (SE_SAL_2720_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.sub_dept_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.bo_cd);
		cstmt.setString(9, dm.bo_seq);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.bgn_mm);
		cstmt.setString(12, dm.end_mm);
		cstmt.setString(13, dm.months);
		cstmt.setString(14, dm.damt_decid_amt);
		cstmt.setString(15, dm.widr_yn);
		cstmt.setString(16, dm.widr_bgn_mm);
		cstmt.setString(17, dm.widr_amt);
		cstmt.setString(18, dm.incmg_pers_ip);
		cstmt.setString(19, dm.incmg_pers);
		cstmt.setString(20, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2720_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("bgn_mm = [" + getBgn_mm() + "]");
		System.out.println("end_mm = [" + getEnd_mm() + "]");
		System.out.println("months = [" + getMonths() + "]");
		System.out.println("damt_decid_amt = [" + getDamt_decid_amt() + "]");
		System.out.println("widr_yn = [" + getWidr_yn() + "]");
		System.out.println("widr_bgn_mm = [" + getWidr_bgn_mm() + "]");
		System.out.println("widr_amt = [" + getWidr_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String bgn_mm = req.getParameter("bgn_mm");
if( bgn_mm == null){
	System.out.println(this.toString+" : bgn_mm is null" );
}else{
	System.out.println(this.toString+" : bgn_mm is "+bgn_mm );
}
String end_mm = req.getParameter("end_mm");
if( end_mm == null){
	System.out.println(this.toString+" : end_mm is null" );
}else{
	System.out.println(this.toString+" : end_mm is "+end_mm );
}
String months = req.getParameter("months");
if( months == null){
	System.out.println(this.toString+" : months is null" );
}else{
	System.out.println(this.toString+" : months is "+months );
}
String damt_decid_amt = req.getParameter("damt_decid_amt");
if( damt_decid_amt == null){
	System.out.println(this.toString+" : damt_decid_amt is null" );
}else{
	System.out.println(this.toString+" : damt_decid_amt is "+damt_decid_amt );
}
String widr_yn = req.getParameter("widr_yn");
if( widr_yn == null){
	System.out.println(this.toString+" : widr_yn is null" );
}else{
	System.out.println(this.toString+" : widr_yn is "+widr_yn );
}
String widr_bgn_mm = req.getParameter("widr_bgn_mm");
if( widr_bgn_mm == null){
	System.out.println(this.toString+" : widr_bgn_mm is null" );
}else{
	System.out.println(this.toString+" : widr_bgn_mm is "+widr_bgn_mm );
}
String widr_amt = req.getParameter("widr_amt");
if( widr_amt == null){
	System.out.println(this.toString+" : widr_amt is null" );
}else{
	System.out.println(this.toString+" : widr_amt is "+widr_amt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String bgn_mm = Util.checkString(req.getParameter("bgn_mm"));
String end_mm = Util.checkString(req.getParameter("end_mm"));
String months = Util.checkString(req.getParameter("months"));
String damt_decid_amt = Util.checkString(req.getParameter("damt_decid_amt"));
String widr_yn = Util.checkString(req.getParameter("widr_yn"));
String widr_bgn_mm = Util.checkString(req.getParameter("widr_bgn_mm"));
String widr_amt = Util.checkString(req.getParameter("widr_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String bgn_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_mm")));
String end_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_mm")));
String months = Util.Uni2Ksc(Util.checkString(req.getParameter("months")));
String damt_decid_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("damt_decid_amt")));
String widr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_yn")));
String widr_bgn_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_bgn_mm")));
String widr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setArea_cd(area_cd);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setChrg_pers(chrg_pers);
dm.setBgn_mm(bgn_mm);
dm.setEnd_mm(end_mm);
dm.setMonths(months);
dm.setDamt_decid_amt(damt_decid_amt);
dm.setWidr_yn(widr_yn);
dm.setWidr_bgn_mm(widr_bgn_mm);
dm.setWidr_amt(widr_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 07 17:31:51 KST 2013 */