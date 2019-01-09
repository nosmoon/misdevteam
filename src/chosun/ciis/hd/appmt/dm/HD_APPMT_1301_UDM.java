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


package chosun.ciis.hd.appmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.ds.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1301_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String save;
	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String appmt_cd;
	public String appmt_resn_cd;
	public String appmt_dt;
	public String appmt_cont;
	public String clos_proc_yn;
	public String emp_clsf_cd;
	public String base_saly;
	public String posk_saly;
	public String saly_stot;
	public String seq;
	public String occr_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_APPMT_1301_UDM(){}
	public HD_APPMT_1301_UDM(String save, String mode, String cmpy_cd, String emp_no, String flnm, String dept_cd, String appmt_cd, String appmt_resn_cd, String appmt_dt, String appmt_cont, String clos_proc_yn, String emp_clsf_cd, String base_saly, String posk_saly, String saly_stot, String seq, String occr_dt, String incmg_pers, String incmg_pers_ipadd){
		this.save = save;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.appmt_cd = appmt_cd;
		this.appmt_resn_cd = appmt_resn_cd;
		this.appmt_dt = appmt_dt;
		this.appmt_cont = appmt_cont;
		this.clos_proc_yn = clos_proc_yn;
		this.emp_clsf_cd = emp_clsf_cd;
		this.base_saly = base_saly;
		this.posk_saly = posk_saly;
		this.saly_stot = saly_stot;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSave(String save){
		this.save = save;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setAppmt_resn_cd(String appmt_resn_cd){
		this.appmt_resn_cd = appmt_resn_cd;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setClos_proc_yn(String clos_proc_yn){
		this.clos_proc_yn = clos_proc_yn;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setSaly_stot(String saly_stot){
		this.saly_stot = saly_stot;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getSave(){
		return this.save;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getAppmt_resn_cd(){
		return this.appmt_resn_cd;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getClos_proc_yn(){
		return this.clos_proc_yn;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getSaly_stot(){
		return this.saly_stot;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_APPMT_1301_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_APPMT_1301_UDM dm = (HD_APPMT_1301_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.save);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.appmt_cd);
		cstmt.setString(10, dm.appmt_resn_cd);
		cstmt.setString(11, dm.appmt_dt);
		cstmt.setString(12, dm.appmt_cont);
		cstmt.setString(13, dm.clos_proc_yn);
		cstmt.setString(14, dm.emp_clsf_cd);
		cstmt.setString(15, dm.base_saly);
		cstmt.setString(16, dm.posk_saly);
		cstmt.setString(17, dm.saly_stot);
		cstmt.setString(18, dm.seq);
		cstmt.setString(19, dm.occr_dt);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.appmt.ds.HD_APPMT_1301_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("save = [" + getSave() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("appmt_cd = [" + getAppmt_cd() + "]");
		System.out.println("appmt_resn_cd = [" + getAppmt_resn_cd() + "]");
		System.out.println("appmt_dt = [" + getAppmt_dt() + "]");
		System.out.println("appmt_cont = [" + getAppmt_cont() + "]");
		System.out.println("clos_proc_yn = [" + getClos_proc_yn() + "]");
		System.out.println("emp_clsf_cd = [" + getEmp_clsf_cd() + "]");
		System.out.println("base_saly = [" + getBase_saly() + "]");
		System.out.println("posk_saly = [" + getPosk_saly() + "]");
		System.out.println("saly_stot = [" + getSaly_stot() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String save = req.getParameter("save");
if( save == null){
	System.out.println(this.toString+" : save is null" );
}else{
	System.out.println(this.toString+" : save is "+save );
}
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
String appmt_cd = req.getParameter("appmt_cd");
if( appmt_cd == null){
	System.out.println(this.toString+" : appmt_cd is null" );
}else{
	System.out.println(this.toString+" : appmt_cd is "+appmt_cd );
}
String appmt_resn_cd = req.getParameter("appmt_resn_cd");
if( appmt_resn_cd == null){
	System.out.println(this.toString+" : appmt_resn_cd is null" );
}else{
	System.out.println(this.toString+" : appmt_resn_cd is "+appmt_resn_cd );
}
String appmt_dt = req.getParameter("appmt_dt");
if( appmt_dt == null){
	System.out.println(this.toString+" : appmt_dt is null" );
}else{
	System.out.println(this.toString+" : appmt_dt is "+appmt_dt );
}
String appmt_cont = req.getParameter("appmt_cont");
if( appmt_cont == null){
	System.out.println(this.toString+" : appmt_cont is null" );
}else{
	System.out.println(this.toString+" : appmt_cont is "+appmt_cont );
}
String clos_proc_yn = req.getParameter("clos_proc_yn");
if( clos_proc_yn == null){
	System.out.println(this.toString+" : clos_proc_yn is null" );
}else{
	System.out.println(this.toString+" : clos_proc_yn is "+clos_proc_yn );
}
String emp_clsf_cd = req.getParameter("emp_clsf_cd");
if( emp_clsf_cd == null){
	System.out.println(this.toString+" : emp_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : emp_clsf_cd is "+emp_clsf_cd );
}
String base_saly = req.getParameter("base_saly");
if( base_saly == null){
	System.out.println(this.toString+" : base_saly is null" );
}else{
	System.out.println(this.toString+" : base_saly is "+base_saly );
}
String posk_saly = req.getParameter("posk_saly");
if( posk_saly == null){
	System.out.println(this.toString+" : posk_saly is null" );
}else{
	System.out.println(this.toString+" : posk_saly is "+posk_saly );
}
String saly_stot = req.getParameter("saly_stot");
if( saly_stot == null){
	System.out.println(this.toString+" : saly_stot is null" );
}else{
	System.out.println(this.toString+" : saly_stot is "+saly_stot );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String save = Util.checkString(req.getParameter("save"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String appmt_cd = Util.checkString(req.getParameter("appmt_cd"));
String appmt_resn_cd = Util.checkString(req.getParameter("appmt_resn_cd"));
String appmt_dt = Util.checkString(req.getParameter("appmt_dt"));
String appmt_cont = Util.checkString(req.getParameter("appmt_cont"));
String clos_proc_yn = Util.checkString(req.getParameter("clos_proc_yn"));
String emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
String base_saly = Util.checkString(req.getParameter("base_saly"));
String posk_saly = Util.checkString(req.getParameter("posk_saly"));
String saly_stot = Util.checkString(req.getParameter("saly_stot"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String save = Util.Uni2Ksc(Util.checkString(req.getParameter("save")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String appmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_cd")));
String appmt_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_resn_cd")));
String appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_dt")));
String appmt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("appmt_cont")));
String clos_proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_proc_yn")));
String emp_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf_cd")));
String base_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("base_saly")));
String posk_saly = Util.Uni2Ksc(Util.checkString(req.getParameter("posk_saly")));
String saly_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_stot")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSave(save);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setAppmt_cd(appmt_cd);
dm.setAppmt_resn_cd(appmt_resn_cd);
dm.setAppmt_dt(appmt_dt);
dm.setAppmt_cont(appmt_cont);
dm.setClos_proc_yn(clos_proc_yn);
dm.setEmp_clsf_cd(emp_clsf_cd);
dm.setBase_saly(base_saly);
dm.setPosk_saly(posk_saly);
dm.setSaly_stot(saly_stot);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 22 15:11:47 KST 2009 */