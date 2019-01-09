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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5253_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String carr_seq;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String offi_nm;
	public String dty;
	public String posk;
	public String asaly;
	public String lvcmpy_resn;
	public String natn_cd;
	public String duty_yys;
	public String duty_dds;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String proc_stat;
	public String proc_stat_req;
	public String gubun;

	public HD_INFO_5253_ADM(){}
	public HD_INFO_5253_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String carr_seq, String in_cmpy_dt, String lvcmpy_dt, String offi_nm, String dty, String posk, String asaly, String lvcmpy_resn, String natn_cd, String duty_yys, String duty_dds, String incmg_pers_ipadd, String incmg_pers, String proc_stat, String proc_stat_req, String gubun){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.carr_seq = carr_seq;
		this.in_cmpy_dt = in_cmpy_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.offi_nm = offi_nm;
		this.dty = dty;
		this.posk = posk;
		this.asaly = asaly;
		this.lvcmpy_resn = lvcmpy_resn;
		this.natn_cd = natn_cd;
		this.duty_yys = duty_yys;
		this.duty_dds = duty_dds;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.proc_stat = proc_stat;
		this.proc_stat_req = proc_stat_req;
		this.gubun = gubun;
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

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCarr_seq(String carr_seq){
		this.carr_seq = carr_seq;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDty(String dty){
		this.dty = dty;
	}

	public void setPosk(String posk){
		this.posk = posk;
	}

	public void setAsaly(String asaly){
		this.asaly = asaly;
	}

	public void setLvcmpy_resn(String lvcmpy_resn){
		this.lvcmpy_resn = lvcmpy_resn;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setDuty_yys(String duty_yys){
		this.duty_yys = duty_yys;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_req(String proc_stat_req){
		this.proc_stat_req = proc_stat_req;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
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

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCarr_seq(){
		return this.carr_seq;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDty(){
		return this.dty;
	}

	public String getPosk(){
		return this.posk;
	}

	public String getAsaly(){
		return this.asaly;
	}

	public String getLvcmpy_resn(){
		return this.lvcmpy_resn;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getDuty_yys(){
		return this.duty_yys;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_req(){
		return this.proc_stat_req;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_5253_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_5253_ADM dm = (HD_INFO_5253_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.carr_seq);
		cstmt.setString(9, dm.in_cmpy_dt);
		cstmt.setString(10, dm.lvcmpy_dt);
		cstmt.setString(11, dm.offi_nm);
		cstmt.setString(12, dm.dty);
		cstmt.setString(13, dm.posk);
		cstmt.setString(14, dm.asaly);
		cstmt.setString(15, dm.lvcmpy_resn);
		cstmt.setString(16, dm.natn_cd);
		cstmt.setString(17, dm.duty_yys);
		cstmt.setString(18, dm.duty_dds);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.proc_stat);
		cstmt.setString(22, dm.proc_stat_req);
		cstmt.setString(23, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_5253_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("carr_seq = [" + getCarr_seq() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("offi_nm = [" + getOffi_nm() + "]");
		System.out.println("dty = [" + getDty() + "]");
		System.out.println("posk = [" + getPosk() + "]");
		System.out.println("asaly = [" + getAsaly() + "]");
		System.out.println("lvcmpy_resn = [" + getLvcmpy_resn() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("duty_yys = [" + getDuty_yys() + "]");
		System.out.println("duty_dds = [" + getDuty_dds() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("proc_stat_req = [" + getProc_stat_req() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String carr_seq = req.getParameter("carr_seq");
if( carr_seq == null){
	System.out.println(this.toString+" : carr_seq is null" );
}else{
	System.out.println(this.toString+" : carr_seq is "+carr_seq );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String offi_nm = req.getParameter("offi_nm");
if( offi_nm == null){
	System.out.println(this.toString+" : offi_nm is null" );
}else{
	System.out.println(this.toString+" : offi_nm is "+offi_nm );
}
String dty = req.getParameter("dty");
if( dty == null){
	System.out.println(this.toString+" : dty is null" );
}else{
	System.out.println(this.toString+" : dty is "+dty );
}
String posk = req.getParameter("posk");
if( posk == null){
	System.out.println(this.toString+" : posk is null" );
}else{
	System.out.println(this.toString+" : posk is "+posk );
}
String asaly = req.getParameter("asaly");
if( asaly == null){
	System.out.println(this.toString+" : asaly is null" );
}else{
	System.out.println(this.toString+" : asaly is "+asaly );
}
String lvcmpy_resn = req.getParameter("lvcmpy_resn");
if( lvcmpy_resn == null){
	System.out.println(this.toString+" : lvcmpy_resn is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_resn is "+lvcmpy_resn );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String duty_yys = req.getParameter("duty_yys");
if( duty_yys == null){
	System.out.println(this.toString+" : duty_yys is null" );
}else{
	System.out.println(this.toString+" : duty_yys is "+duty_yys );
}
String duty_dds = req.getParameter("duty_dds");
if( duty_dds == null){
	System.out.println(this.toString+" : duty_dds is null" );
}else{
	System.out.println(this.toString+" : duty_dds is "+duty_dds );
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
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String proc_stat_req = req.getParameter("proc_stat_req");
if( proc_stat_req == null){
	System.out.println(this.toString+" : proc_stat_req is null" );
}else{
	System.out.println(this.toString+" : proc_stat_req is "+proc_stat_req );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String carr_seq = Util.checkString(req.getParameter("carr_seq"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String offi_nm = Util.checkString(req.getParameter("offi_nm"));
String dty = Util.checkString(req.getParameter("dty"));
String posk = Util.checkString(req.getParameter("posk"));
String asaly = Util.checkString(req.getParameter("asaly"));
String lvcmpy_resn = Util.checkString(req.getParameter("lvcmpy_resn"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String duty_yys = Util.checkString(req.getParameter("duty_yys"));
String duty_dds = Util.checkString(req.getParameter("duty_dds"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String proc_stat_req = Util.checkString(req.getParameter("proc_stat_req"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String carr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("carr_seq")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String offi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("offi_nm")));
String dty = Util.Uni2Ksc(Util.checkString(req.getParameter("dty")));
String posk = Util.Uni2Ksc(Util.checkString(req.getParameter("posk")));
String asaly = Util.Uni2Ksc(Util.checkString(req.getParameter("asaly")));
String lvcmpy_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_resn")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String duty_yys = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_yys")));
String duty_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dds")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String proc_stat_req = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_req")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setCarr_seq(carr_seq);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setOffi_nm(offi_nm);
dm.setDty(dty);
dm.setPosk(posk);
dm.setAsaly(asaly);
dm.setLvcmpy_resn(lvcmpy_resn);
dm.setNatn_cd(natn_cd);
dm.setDuty_yys(duty_yys);
dm.setDuty_dds(duty_dds);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setProc_stat(proc_stat);
dm.setProc_stat_req(proc_stat_req);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 21:17:30 KST 2009 */