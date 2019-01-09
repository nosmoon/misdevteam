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


public class HD_VACA_3220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String send;
	public String retu;
	public String aply_yymm;
	public String mon_ck;
	public String tue_ck;
	public String wed_ck;
	public String thu_ck;
	public String fri_ck;
	public String sat_ck;
	public String sun_ck;
	public String hody_plan_dt_mon;
	public String hody_plan_dt_tue;
	public String hody_plan_dt_wed;
	public String hody_plan_dt_thu;
	public String hody_plan_dt_fri;
	public String hody_plan_dt_sat;
	public String hody_plan_dt_sun;
	public String emp_no_tm;
	public String ep_seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_VACA_3220_ADM(){}
	public HD_VACA_3220_ADM(String cmpy_cd, String emp_no, String send, String retu, String aply_yymm, String mon_ck, String tue_ck, String wed_ck, String thu_ck, String fri_ck, String sat_ck, String sun_ck, String hody_plan_dt_mon, String hody_plan_dt_tue, String hody_plan_dt_wed, String hody_plan_dt_thu, String hody_plan_dt_fri, String hody_plan_dt_sat, String hody_plan_dt_sun, String emp_no_tm, String ep_seq, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.send = send;
		this.retu = retu;
		this.aply_yymm = aply_yymm;
		this.mon_ck = mon_ck;
		this.tue_ck = tue_ck;
		this.wed_ck = wed_ck;
		this.thu_ck = thu_ck;
		this.fri_ck = fri_ck;
		this.sat_ck = sat_ck;
		this.sun_ck = sun_ck;
		this.hody_plan_dt_mon = hody_plan_dt_mon;
		this.hody_plan_dt_tue = hody_plan_dt_tue;
		this.hody_plan_dt_wed = hody_plan_dt_wed;
		this.hody_plan_dt_thu = hody_plan_dt_thu;
		this.hody_plan_dt_fri = hody_plan_dt_fri;
		this.hody_plan_dt_sat = hody_plan_dt_sat;
		this.hody_plan_dt_sun = hody_plan_dt_sun;
		this.emp_no_tm = emp_no_tm;
		this.ep_seq = ep_seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSend(String send){
		this.send = send;
	}

	public void setRetu(String retu){
		this.retu = retu;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
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

	public void setHody_plan_dt_mon(String hody_plan_dt_mon){
		this.hody_plan_dt_mon = hody_plan_dt_mon;
	}

	public void setHody_plan_dt_tue(String hody_plan_dt_tue){
		this.hody_plan_dt_tue = hody_plan_dt_tue;
	}

	public void setHody_plan_dt_wed(String hody_plan_dt_wed){
		this.hody_plan_dt_wed = hody_plan_dt_wed;
	}

	public void setHody_plan_dt_thu(String hody_plan_dt_thu){
		this.hody_plan_dt_thu = hody_plan_dt_thu;
	}

	public void setHody_plan_dt_fri(String hody_plan_dt_fri){
		this.hody_plan_dt_fri = hody_plan_dt_fri;
	}

	public void setHody_plan_dt_sat(String hody_plan_dt_sat){
		this.hody_plan_dt_sat = hody_plan_dt_sat;
	}

	public void setHody_plan_dt_sun(String hody_plan_dt_sun){
		this.hody_plan_dt_sun = hody_plan_dt_sun;
	}

	public void setEmp_no_tm(String emp_no_tm){
		this.emp_no_tm = emp_no_tm;
	}

	public void setEp_seq(String ep_seq){
		this.ep_seq = ep_seq;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSend(){
		return this.send;
	}

	public String getRetu(){
		return this.retu;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
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

	public String getHody_plan_dt_mon(){
		return this.hody_plan_dt_mon;
	}

	public String getHody_plan_dt_tue(){
		return this.hody_plan_dt_tue;
	}

	public String getHody_plan_dt_wed(){
		return this.hody_plan_dt_wed;
	}

	public String getHody_plan_dt_thu(){
		return this.hody_plan_dt_thu;
	}

	public String getHody_plan_dt_fri(){
		return this.hody_plan_dt_fri;
	}

	public String getHody_plan_dt_sat(){
		return this.hody_plan_dt_sat;
	}

	public String getHody_plan_dt_sun(){
		return this.hody_plan_dt_sun;
	}

	public String getEmp_no_tm(){
		return this.emp_no_tm;
	}

	public String getEp_seq(){
		return this.ep_seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_3220_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_3220_ADM dm = (HD_VACA_3220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.send);
		cstmt.setString(6, dm.retu);
		cstmt.setString(7, dm.aply_yymm);
		cstmt.setString(8, dm.mon_ck);
		cstmt.setString(9, dm.tue_ck);
		cstmt.setString(10, dm.wed_ck);
		cstmt.setString(11, dm.thu_ck);
		cstmt.setString(12, dm.fri_ck);
		cstmt.setString(13, dm.sat_ck);
		cstmt.setString(14, dm.sun_ck);
		cstmt.setString(15, dm.hody_plan_dt_mon);
		cstmt.setString(16, dm.hody_plan_dt_tue);
		cstmt.setString(17, dm.hody_plan_dt_wed);
		cstmt.setString(18, dm.hody_plan_dt_thu);
		cstmt.setString(19, dm.hody_plan_dt_fri);
		cstmt.setString(20, dm.hody_plan_dt_sat);
		cstmt.setString(21, dm.hody_plan_dt_sun);
		cstmt.setString(22, dm.emp_no_tm);
		cstmt.setString(23, dm.ep_seq);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_3220_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("send = [" + getSend() + "]");
		System.out.println("retu = [" + getRetu() + "]");
		System.out.println("aply_yymm = [" + getAply_yymm() + "]");
		System.out.println("mon_ck = [" + getMon_ck() + "]");
		System.out.println("tue_ck = [" + getTue_ck() + "]");
		System.out.println("wed_ck = [" + getWed_ck() + "]");
		System.out.println("thu_ck = [" + getThu_ck() + "]");
		System.out.println("fri_ck = [" + getFri_ck() + "]");
		System.out.println("sat_ck = [" + getSat_ck() + "]");
		System.out.println("sun_ck = [" + getSun_ck() + "]");
		System.out.println("hody_plan_dt_mon = [" + getHody_plan_dt_mon() + "]");
		System.out.println("hody_plan_dt_tue = [" + getHody_plan_dt_tue() + "]");
		System.out.println("hody_plan_dt_wed = [" + getHody_plan_dt_wed() + "]");
		System.out.println("hody_plan_dt_thu = [" + getHody_plan_dt_thu() + "]");
		System.out.println("hody_plan_dt_fri = [" + getHody_plan_dt_fri() + "]");
		System.out.println("hody_plan_dt_sat = [" + getHody_plan_dt_sat() + "]");
		System.out.println("hody_plan_dt_sun = [" + getHody_plan_dt_sun() + "]");
		System.out.println("emp_no_tm = [" + getEmp_no_tm() + "]");
		System.out.println("ep_seq = [" + getEp_seq() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String send = req.getParameter("send");
if( send == null){
	System.out.println(this.toString+" : send is null" );
}else{
	System.out.println(this.toString+" : send is "+send );
}
String retu = req.getParameter("retu");
if( retu == null){
	System.out.println(this.toString+" : retu is null" );
}else{
	System.out.println(this.toString+" : retu is "+retu );
}
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
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
String hody_plan_dt_mon = req.getParameter("hody_plan_dt_mon");
if( hody_plan_dt_mon == null){
	System.out.println(this.toString+" : hody_plan_dt_mon is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_mon is "+hody_plan_dt_mon );
}
String hody_plan_dt_tue = req.getParameter("hody_plan_dt_tue");
if( hody_plan_dt_tue == null){
	System.out.println(this.toString+" : hody_plan_dt_tue is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_tue is "+hody_plan_dt_tue );
}
String hody_plan_dt_wed = req.getParameter("hody_plan_dt_wed");
if( hody_plan_dt_wed == null){
	System.out.println(this.toString+" : hody_plan_dt_wed is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_wed is "+hody_plan_dt_wed );
}
String hody_plan_dt_thu = req.getParameter("hody_plan_dt_thu");
if( hody_plan_dt_thu == null){
	System.out.println(this.toString+" : hody_plan_dt_thu is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_thu is "+hody_plan_dt_thu );
}
String hody_plan_dt_fri = req.getParameter("hody_plan_dt_fri");
if( hody_plan_dt_fri == null){
	System.out.println(this.toString+" : hody_plan_dt_fri is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_fri is "+hody_plan_dt_fri );
}
String hody_plan_dt_sat = req.getParameter("hody_plan_dt_sat");
if( hody_plan_dt_sat == null){
	System.out.println(this.toString+" : hody_plan_dt_sat is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_sat is "+hody_plan_dt_sat );
}
String hody_plan_dt_sun = req.getParameter("hody_plan_dt_sun");
if( hody_plan_dt_sun == null){
	System.out.println(this.toString+" : hody_plan_dt_sun is null" );
}else{
	System.out.println(this.toString+" : hody_plan_dt_sun is "+hody_plan_dt_sun );
}
String emp_no_tm = req.getParameter("emp_no_tm");
if( emp_no_tm == null){
	System.out.println(this.toString+" : emp_no_tm is null" );
}else{
	System.out.println(this.toString+" : emp_no_tm is "+emp_no_tm );
}
String ep_seq = req.getParameter("ep_seq");
if( ep_seq == null){
	System.out.println(this.toString+" : ep_seq is null" );
}else{
	System.out.println(this.toString+" : ep_seq is "+ep_seq );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String send = Util.checkString(req.getParameter("send"));
String retu = Util.checkString(req.getParameter("retu"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String mon_ck = Util.checkString(req.getParameter("mon_ck"));
String tue_ck = Util.checkString(req.getParameter("tue_ck"));
String wed_ck = Util.checkString(req.getParameter("wed_ck"));
String thu_ck = Util.checkString(req.getParameter("thu_ck"));
String fri_ck = Util.checkString(req.getParameter("fri_ck"));
String sat_ck = Util.checkString(req.getParameter("sat_ck"));
String sun_ck = Util.checkString(req.getParameter("sun_ck"));
String hody_plan_dt_mon = Util.checkString(req.getParameter("hody_plan_dt_mon"));
String hody_plan_dt_tue = Util.checkString(req.getParameter("hody_plan_dt_tue"));
String hody_plan_dt_wed = Util.checkString(req.getParameter("hody_plan_dt_wed"));
String hody_plan_dt_thu = Util.checkString(req.getParameter("hody_plan_dt_thu"));
String hody_plan_dt_fri = Util.checkString(req.getParameter("hody_plan_dt_fri"));
String hody_plan_dt_sat = Util.checkString(req.getParameter("hody_plan_dt_sat"));
String hody_plan_dt_sun = Util.checkString(req.getParameter("hody_plan_dt_sun"));
String emp_no_tm = Util.checkString(req.getParameter("emp_no_tm"));
String ep_seq = Util.checkString(req.getParameter("ep_seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String send = Util.Uni2Ksc(Util.checkString(req.getParameter("send")));
String retu = Util.Uni2Ksc(Util.checkString(req.getParameter("retu")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String mon_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("mon_ck")));
String tue_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("tue_ck")));
String wed_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("wed_ck")));
String thu_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("thu_ck")));
String fri_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("fri_ck")));
String sat_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("sat_ck")));
String sun_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("sun_ck")));
String hody_plan_dt_mon = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_mon")));
String hody_plan_dt_tue = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_tue")));
String hody_plan_dt_wed = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_wed")));
String hody_plan_dt_thu = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_thu")));
String hody_plan_dt_fri = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_fri")));
String hody_plan_dt_sat = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_sat")));
String hody_plan_dt_sun = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_plan_dt_sun")));
String emp_no_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no_tm")));
String ep_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ep_seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSend(send);
dm.setRetu(retu);
dm.setAply_yymm(aply_yymm);
dm.setMon_ck(mon_ck);
dm.setTue_ck(tue_ck);
dm.setWed_ck(wed_ck);
dm.setThu_ck(thu_ck);
dm.setFri_ck(fri_ck);
dm.setSat_ck(sat_ck);
dm.setSun_ck(sun_ck);
dm.setHody_plan_dt_mon(hody_plan_dt_mon);
dm.setHody_plan_dt_tue(hody_plan_dt_tue);
dm.setHody_plan_dt_wed(hody_plan_dt_wed);
dm.setHody_plan_dt_thu(hody_plan_dt_thu);
dm.setHody_plan_dt_fri(hody_plan_dt_fri);
dm.setHody_plan_dt_sat(hody_plan_dt_sat);
dm.setHody_plan_dt_sun(hody_plan_dt_sun);
dm.setEmp_no_tm(emp_no_tm);
dm.setEp_seq(ep_seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 15 16:02:19 KST 2015 */