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


package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_3140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String plan_dt;
	public String gubun;
	public String mon_ck;
	public String tue_ck;
	public String wed_ck;
	public String thu_ck;
	public String fri_ck;
	public String sat_ck;
	public String sun_ck;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_VACA_3140_ADM(){}
	public HD_VACA_3140_ADM(String mode, String cmpy_cd, String emp_no, String plan_dt, String gubun, String mon_ck, String tue_ck, String wed_ck, String thu_ck, String fri_ck, String sat_ck, String sun_ck, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.plan_dt = plan_dt;
		this.gubun = gubun;
		this.mon_ck = mon_ck;
		this.tue_ck = tue_ck;
		this.wed_ck = wed_ck;
		this.thu_ck = thu_ck;
		this.fri_ck = fri_ck;
		this.sat_ck = sat_ck;
		this.sun_ck = sun_ck;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setMon_ck(String mon_ck){
		this.mon_ck = mon_ck;
	}

	public void setTue_ck(String tue_ck){
		this.tue_ck = tue_ck;
	}

	public void setWed_ck(String wed_ck){
		this.wed_ck = wed_ck;
	}

	public void setThu_ck(String thu_ck){
		this.thu_ck = thu_ck;
	}

	public void setFri_ck(String fri_ck){
		this.fri_ck = fri_ck;
	}

	public void setSat_ck(String sat_ck){
		this.sat_ck = sat_ck;
	}

	public void setSun_ck(String sun_ck){
		this.sun_ck = sun_ck;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getMon_ck(){
		return this.mon_ck;
	}

	public String getTue_ck(){
		return this.tue_ck;
	}

	public String getWed_ck(){
		return this.wed_ck;
	}

	public String getThu_ck(){
		return this.thu_ck;
	}

	public String getFri_ck(){
		return this.fri_ck;
	}

	public String getSat_ck(){
		return this.sat_ck;
	}

	public String getSun_ck(){
		return this.sun_ck;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_3140_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_3140_ADM dm = (HD_VACA_3140_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.plan_dt);
		cstmt.setString(7, dm.gubun);
		cstmt.setString(8, dm.mon_ck);
		cstmt.setString(9, dm.tue_ck);
		cstmt.setString(10, dm.wed_ck);
		cstmt.setString(11, dm.thu_ck);
		cstmt.setString(12, dm.fri_ck);
		cstmt.setString(13, dm.sat_ck);
		cstmt.setString(14, dm.sun_ck);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_3140_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("plan_dt = [" + getPlan_dt() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("mon_ck = [" + getMon_ck() + "]");
		System.out.println("tue_ck = [" + getTue_ck() + "]");
		System.out.println("wed_ck = [" + getWed_ck() + "]");
		System.out.println("thu_ck = [" + getThu_ck() + "]");
		System.out.println("fri_ck = [" + getFri_ck() + "]");
		System.out.println("sat_ck = [" + getSat_ck() + "]");
		System.out.println("sun_ck = [" + getSun_ck() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String plan_dt = req.getParameter("plan_dt");
if( plan_dt == null){
	System.out.println(this.toString+" : plan_dt is null" );
}else{
	System.out.println(this.toString+" : plan_dt is "+plan_dt );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String mon_ck = req.getParameter("mon_ck");
if( mon_ck == null){
	System.out.println(this.toString+" : mon_ck is null" );
}else{
	System.out.println(this.toString+" : mon_ck is "+mon_ck );
}
String tue_ck = req.getParameter("tue_ck");
if( tue_ck == null){
	System.out.println(this.toString+" : tue_ck is null" );
}else{
	System.out.println(this.toString+" : tue_ck is "+tue_ck );
}
String wed_ck = req.getParameter("wed_ck");
if( wed_ck == null){
	System.out.println(this.toString+" : wed_ck is null" );
}else{
	System.out.println(this.toString+" : wed_ck is "+wed_ck );
}
String thu_ck = req.getParameter("thu_ck");
if( thu_ck == null){
	System.out.println(this.toString+" : thu_ck is null" );
}else{
	System.out.println(this.toString+" : thu_ck is "+thu_ck );
}
String fri_ck = req.getParameter("fri_ck");
if( fri_ck == null){
	System.out.println(this.toString+" : fri_ck is null" );
}else{
	System.out.println(this.toString+" : fri_ck is "+fri_ck );
}
String sat_ck = req.getParameter("sat_ck");
if( sat_ck == null){
	System.out.println(this.toString+" : sat_ck is null" );
}else{
	System.out.println(this.toString+" : sat_ck is "+sat_ck );
}
String sun_ck = req.getParameter("sun_ck");
if( sun_ck == null){
	System.out.println(this.toString+" : sun_ck is null" );
}else{
	System.out.println(this.toString+" : sun_ck is "+sun_ck );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String plan_dt = Util.checkString(req.getParameter("plan_dt"));
String gubun = Util.checkString(req.getParameter("gubun"));
String mon_ck = Util.checkString(req.getParameter("mon_ck"));
String tue_ck = Util.checkString(req.getParameter("tue_ck"));
String wed_ck = Util.checkString(req.getParameter("wed_ck"));
String thu_ck = Util.checkString(req.getParameter("thu_ck"));
String fri_ck = Util.checkString(req.getParameter("fri_ck"));
String sat_ck = Util.checkString(req.getParameter("sat_ck"));
String sun_ck = Util.checkString(req.getParameter("sun_ck"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dt")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String mon_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("mon_ck")));
String tue_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("tue_ck")));
String wed_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("wed_ck")));
String thu_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("thu_ck")));
String fri_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("fri_ck")));
String sat_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("sat_ck")));
String sun_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("sun_ck")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setPlan_dt(plan_dt);
dm.setGubun(gubun);
dm.setMon_ck(mon_ck);
dm.setTue_ck(tue_ck);
dm.setWed_ck(wed_ck);
dm.setThu_ck(thu_ck);
dm.setFri_ck(fri_ck);
dm.setSat_ck(sat_ck);
dm.setSun_ck(sun_ck);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 12 10:49:08 KST 2015 */