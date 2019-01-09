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


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2330_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String issu_dt;
	public String send_clos_grp_clsf;
	public String clos_tms;
	public String ser_no1;
	public String ser_no2;
	public String sect_remk;
	public String remk;
	public String chg_matt;
	public String mode_ar;
	public String send_proc_seq_ar;
	public String prt_dt_ar;
	public String route_clsf_ar;
	public String medi_cd_ar;
	public String sect_cd_ar;
	public String pcnt_ar;
	public String clr_pcnt_ar;
	public String add_prt_seq_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_QTY_2330_ADM(){}
	public SE_QTY_2330_ADM(String cmpy_cd, String accflag, String issu_dt, String send_clos_grp_clsf, String clos_tms, String ser_no1, String ser_no2, String sect_remk, String remk, String chg_matt, String mode_ar, String send_proc_seq_ar, String prt_dt_ar, String route_clsf_ar, String medi_cd_ar, String sect_cd_ar, String pcnt_ar, String clr_pcnt_ar, String add_prt_seq_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.issu_dt = issu_dt;
		this.send_clos_grp_clsf = send_clos_grp_clsf;
		this.clos_tms = clos_tms;
		this.ser_no1 = ser_no1;
		this.ser_no2 = ser_no2;
		this.sect_remk = sect_remk;
		this.remk = remk;
		this.chg_matt = chg_matt;
		this.mode_ar = mode_ar;
		this.send_proc_seq_ar = send_proc_seq_ar;
		this.prt_dt_ar = prt_dt_ar;
		this.route_clsf_ar = route_clsf_ar;
		this.medi_cd_ar = medi_cd_ar;
		this.sect_cd_ar = sect_cd_ar;
		this.pcnt_ar = pcnt_ar;
		this.clr_pcnt_ar = clr_pcnt_ar;
		this.add_prt_seq_ar = add_prt_seq_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSend_clos_grp_clsf(String send_clos_grp_clsf){
		this.send_clos_grp_clsf = send_clos_grp_clsf;
	}

	public void setClos_tms(String clos_tms){
		this.clos_tms = clos_tms;
	}

	public void setSer_no1(String ser_no1){
		this.ser_no1 = ser_no1;
	}

	public void setSer_no2(String ser_no2){
		this.ser_no2 = ser_no2;
	}

	public void setSect_remk(String sect_remk){
		this.sect_remk = sect_remk;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_matt(String chg_matt){
		this.chg_matt = chg_matt;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setSend_proc_seq_ar(String send_proc_seq_ar){
		this.send_proc_seq_ar = send_proc_seq_ar;
	}

	public void setPrt_dt_ar(String prt_dt_ar){
		this.prt_dt_ar = prt_dt_ar;
	}

	public void setRoute_clsf_ar(String route_clsf_ar){
		this.route_clsf_ar = route_clsf_ar;
	}

	public void setMedi_cd_ar(String medi_cd_ar){
		this.medi_cd_ar = medi_cd_ar;
	}

	public void setSect_cd_ar(String sect_cd_ar){
		this.sect_cd_ar = sect_cd_ar;
	}

	public void setPcnt_ar(String pcnt_ar){
		this.pcnt_ar = pcnt_ar;
	}

	public void setClr_pcnt_ar(String clr_pcnt_ar){
		this.clr_pcnt_ar = clr_pcnt_ar;
	}

	public void setAdd_prt_seq_ar(String add_prt_seq_ar){
		this.add_prt_seq_ar = add_prt_seq_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSend_clos_grp_clsf(){
		return this.send_clos_grp_clsf;
	}

	public String getClos_tms(){
		return this.clos_tms;
	}

	public String getSer_no1(){
		return this.ser_no1;
	}

	public String getSer_no2(){
		return this.ser_no2;
	}

	public String getSect_remk(){
		return this.sect_remk;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_matt(){
		return this.chg_matt;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getSend_proc_seq_ar(){
		return this.send_proc_seq_ar;
	}

	public String getPrt_dt_ar(){
		return this.prt_dt_ar;
	}

	public String getRoute_clsf_ar(){
		return this.route_clsf_ar;
	}

	public String getMedi_cd_ar(){
		return this.medi_cd_ar;
	}

	public String getSect_cd_ar(){
		return this.sect_cd_ar;
	}

	public String getPcnt_ar(){
		return this.pcnt_ar;
	}

	public String getClr_pcnt_ar(){
		return this.clr_pcnt_ar;
	}

	public String getAdd_prt_seq_ar(){
		return this.add_prt_seq_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2330_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2330_ADM dm = (SE_QTY_2330_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.send_clos_grp_clsf);
		cstmt.setString(7, dm.clos_tms);
		cstmt.setString(8, dm.ser_no1);
		cstmt.setString(9, dm.ser_no2);
		cstmt.setString(10, dm.sect_remk);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.chg_matt);
		cstmt.setString(13, dm.mode_ar);
		cstmt.setString(14, dm.send_proc_seq_ar);
		cstmt.setString(15, dm.prt_dt_ar);
		cstmt.setString(16, dm.route_clsf_ar);
		cstmt.setString(17, dm.medi_cd_ar);
		cstmt.setString(18, dm.sect_cd_ar);
		cstmt.setString(19, dm.pcnt_ar);
		cstmt.setString(20, dm.clr_pcnt_ar);
		cstmt.setString(21, dm.add_prt_seq_ar);
		cstmt.setString(22, dm.incmg_pers);
		cstmt.setString(23, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2330_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("send_clos_grp_clsf = " + getSend_clos_grp_clsf());
        System.out.println("clos_tms = " + getClos_tms());
        System.out.println("ser_no1 = " + getSer_no1());
        System.out.println("ser_no2 = " + getSer_no2());
        System.out.println("sect_remk = " + getSect_remk());
        System.out.println("remk = " + getRemk());
        System.out.println("chg_matt = " + getChg_matt());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("send_proc_seq_ar = " + getSend_proc_seq_ar());
        System.out.println("prt_dt_ar = " + getPrt_dt_ar());
        System.out.println("route_clsf_ar = " + getRoute_clsf_ar());
        System.out.println("medi_cd_ar = " + getMedi_cd_ar());
        System.out.println("sect_cd_ar = " + getSect_cd_ar());
        System.out.println("pcnt_ar = " + getPcnt_ar());
        System.out.println("clr_pcnt_ar = " + getClr_pcnt_ar());
        System.out.println("add_prt_seq_ar = " + getAdd_prt_seq_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String send_clos_grp_clsf = req.getParameter("send_clos_grp_clsf");
if( send_clos_grp_clsf == null){
	System.out.println(this.toString+" : send_clos_grp_clsf is null" );
}else{
	System.out.println(this.toString+" : send_clos_grp_clsf is "+send_clos_grp_clsf );
}
String clos_tms = req.getParameter("clos_tms");
if( clos_tms == null){
	System.out.println(this.toString+" : clos_tms is null" );
}else{
	System.out.println(this.toString+" : clos_tms is "+clos_tms );
}
String ser_no1 = req.getParameter("ser_no1");
if( ser_no1 == null){
	System.out.println(this.toString+" : ser_no1 is null" );
}else{
	System.out.println(this.toString+" : ser_no1 is "+ser_no1 );
}
String ser_no2 = req.getParameter("ser_no2");
if( ser_no2 == null){
	System.out.println(this.toString+" : ser_no2 is null" );
}else{
	System.out.println(this.toString+" : ser_no2 is "+ser_no2 );
}
String sect_remk = req.getParameter("sect_remk");
if( sect_remk == null){
	System.out.println(this.toString+" : sect_remk is null" );
}else{
	System.out.println(this.toString+" : sect_remk is "+sect_remk );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String chg_matt = req.getParameter("chg_matt");
if( chg_matt == null){
	System.out.println(this.toString+" : chg_matt is null" );
}else{
	System.out.println(this.toString+" : chg_matt is "+chg_matt );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String send_proc_seq_ar = req.getParameter("send_proc_seq_ar");
if( send_proc_seq_ar == null){
	System.out.println(this.toString+" : send_proc_seq_ar is null" );
}else{
	System.out.println(this.toString+" : send_proc_seq_ar is "+send_proc_seq_ar );
}
String prt_dt_ar = req.getParameter("prt_dt_ar");
if( prt_dt_ar == null){
	System.out.println(this.toString+" : prt_dt_ar is null" );
}else{
	System.out.println(this.toString+" : prt_dt_ar is "+prt_dt_ar );
}
String route_clsf_ar = req.getParameter("route_clsf_ar");
if( route_clsf_ar == null){
	System.out.println(this.toString+" : route_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : route_clsf_ar is "+route_clsf_ar );
}
String medi_cd_ar = req.getParameter("medi_cd_ar");
if( medi_cd_ar == null){
	System.out.println(this.toString+" : medi_cd_ar is null" );
}else{
	System.out.println(this.toString+" : medi_cd_ar is "+medi_cd_ar );
}
String sect_cd_ar = req.getParameter("sect_cd_ar");
if( sect_cd_ar == null){
	System.out.println(this.toString+" : sect_cd_ar is null" );
}else{
	System.out.println(this.toString+" : sect_cd_ar is "+sect_cd_ar );
}
String pcnt_ar = req.getParameter("pcnt_ar");
if( pcnt_ar == null){
	System.out.println(this.toString+" : pcnt_ar is null" );
}else{
	System.out.println(this.toString+" : pcnt_ar is "+pcnt_ar );
}
String clr_pcnt_ar = req.getParameter("clr_pcnt_ar");
if( clr_pcnt_ar == null){
	System.out.println(this.toString+" : clr_pcnt_ar is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt_ar is "+clr_pcnt_ar );
}
String add_prt_seq_ar = req.getParameter("add_prt_seq_ar");
if( add_prt_seq_ar == null){
	System.out.println(this.toString+" : add_prt_seq_ar is null" );
}else{
	System.out.println(this.toString+" : add_prt_seq_ar is "+add_prt_seq_ar );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String accflag = Util.checkString(req.getParameter("accflag"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String send_clos_grp_clsf = Util.checkString(req.getParameter("send_clos_grp_clsf"));
String clos_tms = Util.checkString(req.getParameter("clos_tms"));
String ser_no1 = Util.checkString(req.getParameter("ser_no1"));
String ser_no2 = Util.checkString(req.getParameter("ser_no2"));
String sect_remk = Util.checkString(req.getParameter("sect_remk"));
String remk = Util.checkString(req.getParameter("remk"));
String chg_matt = Util.checkString(req.getParameter("chg_matt"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String send_proc_seq_ar = Util.checkString(req.getParameter("send_proc_seq_ar"));
String prt_dt_ar = Util.checkString(req.getParameter("prt_dt_ar"));
String route_clsf_ar = Util.checkString(req.getParameter("route_clsf_ar"));
String medi_cd_ar = Util.checkString(req.getParameter("medi_cd_ar"));
String sect_cd_ar = Util.checkString(req.getParameter("sect_cd_ar"));
String pcnt_ar = Util.checkString(req.getParameter("pcnt_ar"));
String clr_pcnt_ar = Util.checkString(req.getParameter("clr_pcnt_ar"));
String add_prt_seq_ar = Util.checkString(req.getParameter("add_prt_seq_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String send_clos_grp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("send_clos_grp_clsf")));
String clos_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_tms")));
String ser_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ser_no1")));
String ser_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ser_no2")));
String sect_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_remk")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String chg_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_matt")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String send_proc_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("send_proc_seq_ar")));
String prt_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt_ar")));
String route_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf_ar")));
String medi_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_ar")));
String sect_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_ar")));
String pcnt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt_ar")));
String clr_pcnt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt_ar")));
String add_prt_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("add_prt_seq_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setIssu_dt(issu_dt);
dm.setSend_clos_grp_clsf(send_clos_grp_clsf);
dm.setClos_tms(clos_tms);
dm.setSer_no1(ser_no1);
dm.setSer_no2(ser_no2);
dm.setSect_remk(sect_remk);
dm.setRemk(remk);
dm.setChg_matt(chg_matt);
dm.setMode_ar(mode_ar);
dm.setSend_proc_seq_ar(send_proc_seq_ar);
dm.setPrt_dt_ar(prt_dt_ar);
dm.setRoute_clsf_ar(route_clsf_ar);
dm.setMedi_cd_ar(medi_cd_ar);
dm.setSect_cd_ar(sect_cd_ar);
dm.setPcnt_ar(pcnt_ar);
dm.setClr_pcnt_ar(clr_pcnt_ar);
dm.setAdd_prt_seq_ar(add_prt_seq_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 11:52:53 KST 2009 */