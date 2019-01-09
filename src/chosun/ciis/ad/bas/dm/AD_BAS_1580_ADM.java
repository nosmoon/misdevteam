/***************************************************************************************************
* 파일명   : SP_AD_BAS_1580_A.java
* 기능     : 기초자료관리-일일보고 야근일지 입력, 수정, 삭제
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 기초자료관리-일일보고 야근일지 입력, 수정, 삭제
 */


public class AD_BAS_1580_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{	
	public String cmpy_cd;
	public long seq;
	public String night_shift_dt;
	public String duty_main_empno;
	public String duty_sub_empno;
	public String make_centr_main_empno;
	public String make_centr_sub_empno;
	public String dd_nwsp_cont;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String flag;

	public AD_BAS_1580_ADM(){}
	public AD_BAS_1580_ADM(String cmpy_cd, long seq, String night_shift_dt, String duty_main_empno, String duty_sub_empno, String make_centr_main_empno, String make_centr_sub_empno, String dd_nwsp_cont, String incmg_pers, String incmg_pers_ip, String flag){
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.night_shift_dt = night_shift_dt;
		this.duty_main_empno = duty_main_empno;
		this.duty_sub_empno = duty_sub_empno;
		this.make_centr_main_empno = make_centr_main_empno;
		this.make_centr_sub_empno = make_centr_sub_empno;
		this.dd_nwsp_cont = dd_nwsp_cont;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setNight_shift_dt(String night_shift_dt){
		this.night_shift_dt = night_shift_dt;
	}

	public void setDuty_main_empno(String duty_main_empno){
		this.duty_main_empno = duty_main_empno;
	}

	public void setDuty_sub_empno(String duty_sub_empno){
		this.duty_sub_empno = duty_sub_empno;
	}

	public void setMake_centr_main_empno(String make_centr_main_empno){
		this.make_centr_main_empno = make_centr_main_empno;
	}

	public void setMake_centr_sub_empno(String make_centr_sub_empno){
		this.make_centr_sub_empno = make_centr_sub_empno;
	}

	public void setDd_nwsp_cont(String dd_nwsp_cont){
		this.dd_nwsp_cont = dd_nwsp_cont;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getNight_shift_dt(){
		return this.night_shift_dt;
	}

	public String getDuty_main_empno(){
		return this.duty_main_empno;
	}

	public String getDuty_sub_empno(){
		return this.duty_sub_empno;
	}

	public String getMake_centr_main_empno(){
		return this.make_centr_main_empno;
	}

	public String getMake_centr_sub_empno(){
		return this.make_centr_sub_empno;
	}

	public String getDd_nwsp_cont(){
		return this.dd_nwsp_cont;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_1580_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1580_ADM dm = (AD_BAS_1580_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.night_shift_dt);
		cstmt.setString(6, dm.duty_main_empno);
		cstmt.setString(7, dm.duty_sub_empno);
		cstmt.setString(8, dm.make_centr_main_empno);
		cstmt.setString(9, dm.make_centr_sub_empno);
		cstmt.setString(10, dm.dd_nwsp_cont);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1580_ADataSet();
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String night_shift_dt = req.getParameter("night_shift_dt");
if( night_shift_dt == null){
	System.out.println(this.toString+" : night_shift_dt is null" );
}else{
	System.out.println(this.toString+" : night_shift_dt is "+night_shift_dt );
}
String duty_main_empno = req.getParameter("duty_main_empno");
if( duty_main_empno == null){
	System.out.println(this.toString+" : duty_main_empno is null" );
}else{
	System.out.println(this.toString+" : duty_main_empno is "+duty_main_empno );
}
String duty_sub_empno = req.getParameter("duty_sub_empno");
if( duty_sub_empno == null){
	System.out.println(this.toString+" : duty_sub_empno is null" );
}else{
	System.out.println(this.toString+" : duty_sub_empno is "+duty_sub_empno );
}
String make_centr_main_empno = req.getParameter("make_centr_main_empno");
if( make_centr_main_empno == null){
	System.out.println(this.toString+" : make_centr_main_empno is null" );
}else{
	System.out.println(this.toString+" : make_centr_main_empno is "+make_centr_main_empno );
}
String make_centr_sub_empno = req.getParameter("make_centr_sub_empno");
if( make_centr_sub_empno == null){
	System.out.println(this.toString+" : make_centr_sub_empno is null" );
}else{
	System.out.println(this.toString+" : make_centr_sub_empno is "+make_centr_sub_empno );
}
String dd_nwsp_cont = req.getParameter("dd_nwsp_cont");
if( dd_nwsp_cont == null){
	System.out.println(this.toString+" : dd_nwsp_cont is null" );
}else{
	System.out.println(this.toString+" : dd_nwsp_cont is "+dd_nwsp_cont );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String night_shift_dt = Util.checkString(req.getParameter("night_shift_dt"));
String duty_main_empno = Util.checkString(req.getParameter("duty_main_empno"));
String duty_sub_empno = Util.checkString(req.getParameter("duty_sub_empno"));
String make_centr_main_empno = Util.checkString(req.getParameter("make_centr_main_empno"));
String make_centr_sub_empno = Util.checkString(req.getParameter("make_centr_sub_empno"));
String dd_nwsp_cont = Util.checkString(req.getParameter("dd_nwsp_cont"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String night_shift_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("night_shift_dt")));
String duty_main_empno = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_main_empno")));
String duty_sub_empno = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_sub_empno")));
String make_centr_main_empno = Util.Uni2Ksc(Util.checkString(req.getParameter("make_centr_main_empno")));
String make_centr_sub_empno = Util.Uni2Ksc(Util.checkString(req.getParameter("make_centr_sub_empno")));
String dd_nwsp_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_nwsp_cont")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setNight_shift_dt(night_shift_dt);
dm.setDuty_main_empno(duty_main_empno);
dm.setDuty_sub_empno(duty_sub_empno);
dm.setMake_centr_main_empno(make_centr_main_empno);
dm.setMake_centr_sub_empno(make_centr_sub_empno);
dm.setDd_nwsp_cont(dd_nwsp_cont);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 11:06:46 KST 2009 */