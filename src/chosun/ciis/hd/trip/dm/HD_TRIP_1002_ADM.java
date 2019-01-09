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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_1002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String medi_cd;
	public String dtl_medi_cd;
	public String mode_tm;
	public String busi_trip_dt_tm;
	public String start_area_tm;
	public String via_area_tm;
	public String ariv_area_tm;
	public String stay_area_tm;
	public String trff_means_cd_tm;
	public String trff_means_etc_tm;
	public String cmpy_cd;
	public String fr_dt;
	public String to_dt;
	public String busi_trip;
	public String trff_means;
	public String busi_trip_purp;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_TRIP_1002_ADM(){}
	public HD_TRIP_1002_ADM(String mode, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String medi_cd, String dtl_medi_cd, String mode_tm, String busi_trip_dt_tm, String start_area_tm, String via_area_tm, String ariv_area_tm, String stay_area_tm, String trff_means_cd_tm, String trff_means_etc_tm, String cmpy_cd, String fr_dt, String to_dt, String busi_trip, String trff_means, String busi_trip_purp, String remk, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.medi_cd = medi_cd;
		this.dtl_medi_cd = dtl_medi_cd;
		this.mode_tm = mode_tm;
		this.busi_trip_dt_tm = busi_trip_dt_tm;
		this.start_area_tm = start_area_tm;
		this.via_area_tm = via_area_tm;
		this.ariv_area_tm = ariv_area_tm;
		this.stay_area_tm = stay_area_tm;
		this.trff_means_cd_tm = trff_means_cd_tm;
		this.trff_means_etc_tm = trff_means_etc_tm;
		this.cmpy_cd = cmpy_cd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.busi_trip = busi_trip;
		this.trff_means = trff_means;
		this.busi_trip_purp = busi_trip_purp;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtl_medi_cd(String dtl_medi_cd){
		this.dtl_medi_cd = dtl_medi_cd;
	}

	public void setMode_tm(String mode_tm){
		this.mode_tm = mode_tm;
	}

	public void setBusi_trip_dt_tm(String busi_trip_dt_tm){
		this.busi_trip_dt_tm = busi_trip_dt_tm;
	}

	public void setStart_area_tm(String start_area_tm){
		this.start_area_tm = start_area_tm;
	}

	public void setVia_area_tm(String via_area_tm){
		this.via_area_tm = via_area_tm;
	}

	public void setAriv_area_tm(String ariv_area_tm){
		this.ariv_area_tm = ariv_area_tm;
	}

	public void setStay_area_tm(String stay_area_tm){
		this.stay_area_tm = stay_area_tm;
	}

	public void setTrff_means_cd_tm(String trff_means_cd_tm){
		this.trff_means_cd_tm = trff_means_cd_tm;
	}

	public void setTrff_means_etc_tm(String trff_means_etc_tm){
		this.trff_means_etc_tm = trff_means_etc_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setBusi_trip(String busi_trip){
		this.busi_trip = busi_trip;
	}

	public void setTrff_means(String trff_means){
		this.trff_means = trff_means;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtl_medi_cd(){
		return this.dtl_medi_cd;
	}

	public String getMode_tm(){
		return this.mode_tm;
	}

	public String getBusi_trip_dt_tm(){
		return this.busi_trip_dt_tm;
	}

	public String getStart_area_tm(){
		return this.start_area_tm;
	}

	public String getVia_area_tm(){
		return this.via_area_tm;
	}

	public String getAriv_area_tm(){
		return this.ariv_area_tm;
	}

	public String getStay_area_tm(){
		return this.stay_area_tm;
	}

	public String getTrff_means_cd_tm(){
		return this.trff_means_cd_tm;
	}

	public String getTrff_means_etc_tm(){
		return this.trff_means_etc_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getBusi_trip(){
		return this.busi_trip;
	}

	public String getTrff_means(){
		return this.trff_means;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1002_ADM dm = (HD_TRIP_1002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.flnm);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.dty_cd);
		cstmt.setString(8, dm.posi_cd);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.dtl_medi_cd);
		cstmt.setString(11, dm.mode_tm);
		cstmt.setString(12, dm.busi_trip_dt_tm);
		cstmt.setString(13, dm.start_area_tm);
		cstmt.setString(14, dm.via_area_tm);
		cstmt.setString(15, dm.ariv_area_tm);
		cstmt.setString(16, dm.stay_area_tm);
		cstmt.setString(17, dm.trff_means_cd_tm);
		cstmt.setString(18, dm.trff_means_etc_tm);
		cstmt.setString(19, dm.cmpy_cd);
		cstmt.setString(20, dm.fr_dt);
		cstmt.setString(21, dm.to_dt);
		cstmt.setString(22, dm.busi_trip);
		cstmt.setString(23, dm.trff_means);
		cstmt.setString(24, dm.busi_trip_purp);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.incmg_pers_ipadd);
		cstmt.setString(27, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtl_medi_cd = [" + getDtl_medi_cd() + "]");
		System.out.println("mode_tm = [" + getMode_tm() + "]");
		System.out.println("busi_trip_dt_tm = [" + getBusi_trip_dt_tm() + "]");
		System.out.println("start_area_tm = [" + getStart_area_tm() + "]");
		System.out.println("via_area_tm = [" + getVia_area_tm() + "]");
		System.out.println("ariv_area_tm = [" + getAriv_area_tm() + "]");
		System.out.println("stay_area_tm = [" + getStay_area_tm() + "]");
		System.out.println("trff_means_cd_tm = [" + getTrff_means_cd_tm() + "]");
		System.out.println("trff_means_etc_tm = [" + getTrff_means_etc_tm() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("busi_trip = [" + getBusi_trip() + "]");
		System.out.println("trff_means = [" + getTrff_means() + "]");
		System.out.println("busi_trip_purp = [" + getBusi_trip_purp() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtl_medi_cd = req.getParameter("dtl_medi_cd");
if( dtl_medi_cd == null){
	System.out.println(this.toString+" : dtl_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtl_medi_cd is "+dtl_medi_cd );
}
String mode_tm = req.getParameter("mode_tm");
if( mode_tm == null){
	System.out.println(this.toString+" : mode_tm is null" );
}else{
	System.out.println(this.toString+" : mode_tm is "+mode_tm );
}
String busi_trip_dt_tm = req.getParameter("busi_trip_dt_tm");
if( busi_trip_dt_tm == null){
	System.out.println(this.toString+" : busi_trip_dt_tm is null" );
}else{
	System.out.println(this.toString+" : busi_trip_dt_tm is "+busi_trip_dt_tm );
}
String start_area_tm = req.getParameter("start_area_tm");
if( start_area_tm == null){
	System.out.println(this.toString+" : start_area_tm is null" );
}else{
	System.out.println(this.toString+" : start_area_tm is "+start_area_tm );
}
String via_area_tm = req.getParameter("via_area_tm");
if( via_area_tm == null){
	System.out.println(this.toString+" : via_area_tm is null" );
}else{
	System.out.println(this.toString+" : via_area_tm is "+via_area_tm );
}
String ariv_area_tm = req.getParameter("ariv_area_tm");
if( ariv_area_tm == null){
	System.out.println(this.toString+" : ariv_area_tm is null" );
}else{
	System.out.println(this.toString+" : ariv_area_tm is "+ariv_area_tm );
}
String stay_area_tm = req.getParameter("stay_area_tm");
if( stay_area_tm == null){
	System.out.println(this.toString+" : stay_area_tm is null" );
}else{
	System.out.println(this.toString+" : stay_area_tm is "+stay_area_tm );
}
String trff_means_cd_tm = req.getParameter("trff_means_cd_tm");
if( trff_means_cd_tm == null){
	System.out.println(this.toString+" : trff_means_cd_tm is null" );
}else{
	System.out.println(this.toString+" : trff_means_cd_tm is "+trff_means_cd_tm );
}
String trff_means_etc_tm = req.getParameter("trff_means_etc_tm");
if( trff_means_etc_tm == null){
	System.out.println(this.toString+" : trff_means_etc_tm is null" );
}else{
	System.out.println(this.toString+" : trff_means_etc_tm is "+trff_means_etc_tm );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String busi_trip = req.getParameter("busi_trip");
if( busi_trip == null){
	System.out.println(this.toString+" : busi_trip is null" );
}else{
	System.out.println(this.toString+" : busi_trip is "+busi_trip );
}
String trff_means = req.getParameter("trff_means");
if( trff_means == null){
	System.out.println(this.toString+" : trff_means is null" );
}else{
	System.out.println(this.toString+" : trff_means is "+trff_means );
}
String busi_trip_purp = req.getParameter("busi_trip_purp");
if( busi_trip_purp == null){
	System.out.println(this.toString+" : busi_trip_purp is null" );
}else{
	System.out.println(this.toString+" : busi_trip_purp is "+busi_trip_purp );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtl_medi_cd = Util.checkString(req.getParameter("dtl_medi_cd"));
String mode_tm = Util.checkString(req.getParameter("mode_tm"));
String busi_trip_dt_tm = Util.checkString(req.getParameter("busi_trip_dt_tm"));
String start_area_tm = Util.checkString(req.getParameter("start_area_tm"));
String via_area_tm = Util.checkString(req.getParameter("via_area_tm"));
String ariv_area_tm = Util.checkString(req.getParameter("ariv_area_tm"));
String stay_area_tm = Util.checkString(req.getParameter("stay_area_tm"));
String trff_means_cd_tm = Util.checkString(req.getParameter("trff_means_cd_tm"));
String trff_means_etc_tm = Util.checkString(req.getParameter("trff_means_etc_tm"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String busi_trip = Util.checkString(req.getParameter("busi_trip"));
String trff_means = Util.checkString(req.getParameter("trff_means"));
String busi_trip_purp = Util.checkString(req.getParameter("busi_trip_purp"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtl_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtl_medi_cd")));
String mode_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_tm")));
String busi_trip_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_dt_tm")));
String start_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("start_area_tm")));
String via_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("via_area_tm")));
String ariv_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_area_tm")));
String stay_area_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_area_tm")));
String trff_means_cd_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_means_cd_tm")));
String trff_means_etc_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_means_etc_tm")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String busi_trip = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip")));
String trff_means = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_means")));
String busi_trip_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_purp")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setMedi_cd(medi_cd);
dm.setDtl_medi_cd(dtl_medi_cd);
dm.setMode_tm(mode_tm);
dm.setBusi_trip_dt_tm(busi_trip_dt_tm);
dm.setStart_area_tm(start_area_tm);
dm.setVia_area_tm(via_area_tm);
dm.setAriv_area_tm(ariv_area_tm);
dm.setStay_area_tm(stay_area_tm);
dm.setTrff_means_cd_tm(trff_means_cd_tm);
dm.setTrff_means_etc_tm(trff_means_etc_tm);
dm.setCmpy_cd(cmpy_cd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setBusi_trip(busi_trip);
dm.setTrff_means(trff_means);
dm.setBusi_trip_purp(busi_trip_purp);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 17 09:53:58 KST 2012 */