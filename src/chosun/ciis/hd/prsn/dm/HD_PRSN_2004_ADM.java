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


package chosun.ciis.hd.prsn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.ds.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_2004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String pgm_id;
	public String pgm_nm;
	public String pgm_url;
	public String job_clsf;
	public String annc_frdt;
	public String annc_todt;
	public String annc_cont;
	public String annc_clsf;
	public String lg_id;
	public String occr_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_PRSN_2004_ADM(){}
	public HD_PRSN_2004_ADM(String cmpy_cd, String mode, String emp_no, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String pgm_id, String pgm_nm, String pgm_url, String job_clsf, String annc_frdt, String annc_todt, String annc_cont, String annc_clsf, String lg_id, String occr_dt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.pgm_id = pgm_id;
		this.pgm_nm = pgm_nm;
		this.pgm_url = pgm_url;
		this.job_clsf = job_clsf;
		this.annc_frdt = annc_frdt;
		this.annc_todt = annc_todt;
		this.annc_cont = annc_cont;
		this.annc_clsf = annc_clsf;
		this.lg_id = lg_id;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_url(String pgm_url){
		this.pgm_url = pgm_url;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAnnc_frdt(String annc_frdt){
		this.annc_frdt = annc_frdt;
	}

	public void setAnnc_todt(String annc_todt){
		this.annc_todt = annc_todt;
	}

	public void setAnnc_cont(String annc_cont){
		this.annc_cont = annc_cont;
	}

	public void setAnnc_clsf(String annc_clsf){
		this.annc_clsf = annc_clsf;
	}

	public void setLg_id(String lg_id){
		this.lg_id = lg_id;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
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

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSeq(){
		return this.seq;
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

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_url(){
		return this.pgm_url;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAnnc_frdt(){
		return this.annc_frdt;
	}

	public String getAnnc_todt(){
		return this.annc_todt;
	}

	public String getAnnc_cont(){
		return this.annc_cont;
	}

	public String getAnnc_clsf(){
		return this.annc_clsf;
	}

	public String getLg_id(){
		return this.lg_id;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRSN_2004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRSN_2004_ADM dm = (HD_PRSN_2004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.dty_cd);
		cstmt.setString(10, dm.posi_cd);
		cstmt.setString(11, dm.pgm_id);
		cstmt.setString(12, dm.pgm_nm);
		cstmt.setString(13, dm.pgm_url);
		cstmt.setString(14, dm.job_clsf);
		cstmt.setString(15, dm.annc_frdt);
		cstmt.setString(16, dm.annc_todt);
		cstmt.setString(17, dm.annc_cont);
		cstmt.setString(18, dm.annc_clsf);
		cstmt.setString(19, dm.lg_id);
		cstmt.setString(20, dm.occr_dt);
		cstmt.setString(21, dm.incmg_pers_ipadd);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prsn.ds.HD_PRSN_2004_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("seq = " + getSeq());
        System.out.println("flnm = " + getFlnm());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dty_cd = " + getDty_cd());
        System.out.println("posi_cd = " + getPosi_cd());
        System.out.println("pgm_id = " + getPgm_id());
        System.out.println("pgm_nm = " + getPgm_nm());
        System.out.println("pgm_url = " + getPgm_url());
        System.out.println("job_clsf = " + getJob_clsf());
        System.out.println("annc_frdt = " + getAnnc_frdt());
        System.out.println("annc_todt = " + getAnnc_todt());
        System.out.println("annc_cont = " + getAnnc_cont());
        System.out.println("annc_clsf = " + getAnnc_clsf());
        System.out.println("lg_id = " + getLg_id());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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
String pgm_id = req.getParameter("pgm_id");
if( pgm_id == null){
	System.out.println(this.toString+" : pgm_id is null" );
}else{
	System.out.println(this.toString+" : pgm_id is "+pgm_id );
}
String pgm_nm = req.getParameter("pgm_nm");
if( pgm_nm == null){
	System.out.println(this.toString+" : pgm_nm is null" );
}else{
	System.out.println(this.toString+" : pgm_nm is "+pgm_nm );
}
String pgm_url = req.getParameter("pgm_url");
if( pgm_url == null){
	System.out.println(this.toString+" : pgm_url is null" );
}else{
	System.out.println(this.toString+" : pgm_url is "+pgm_url );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String annc_frdt = req.getParameter("annc_frdt");
if( annc_frdt == null){
	System.out.println(this.toString+" : annc_frdt is null" );
}else{
	System.out.println(this.toString+" : annc_frdt is "+annc_frdt );
}
String annc_todt = req.getParameter("annc_todt");
if( annc_todt == null){
	System.out.println(this.toString+" : annc_todt is null" );
}else{
	System.out.println(this.toString+" : annc_todt is "+annc_todt );
}
String annc_cont = req.getParameter("annc_cont");
if( annc_cont == null){
	System.out.println(this.toString+" : annc_cont is null" );
}else{
	System.out.println(this.toString+" : annc_cont is "+annc_cont );
}
String annc_clsf = req.getParameter("annc_clsf");
if( annc_clsf == null){
	System.out.println(this.toString+" : annc_clsf is null" );
}else{
	System.out.println(this.toString+" : annc_clsf is "+annc_clsf );
}
String lg_id = req.getParameter("lg_id");
if( lg_id == null){
	System.out.println(this.toString+" : lg_id is null" );
}else{
	System.out.println(this.toString+" : lg_id is "+lg_id );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String pgm_id = Util.checkString(req.getParameter("pgm_id"));
String pgm_nm = Util.checkString(req.getParameter("pgm_nm"));
String pgm_url = Util.checkString(req.getParameter("pgm_url"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String annc_frdt = Util.checkString(req.getParameter("annc_frdt"));
String annc_todt = Util.checkString(req.getParameter("annc_todt"));
String annc_cont = Util.checkString(req.getParameter("annc_cont"));
String annc_clsf = Util.checkString(req.getParameter("annc_clsf"));
String lg_id = Util.checkString(req.getParameter("lg_id"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_id")));
String pgm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_nm")));
String pgm_url = Util.Uni2Ksc(Util.checkString(req.getParameter("pgm_url")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String annc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_frdt")));
String annc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_todt")));
String annc_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_cont")));
String annc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("annc_clsf")));
String lg_id = Util.Uni2Ksc(Util.checkString(req.getParameter("lg_id")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setPgm_id(pgm_id);
dm.setPgm_nm(pgm_nm);
dm.setPgm_url(pgm_url);
dm.setJob_clsf(job_clsf);
dm.setAnnc_frdt(annc_frdt);
dm.setAnnc_todt(annc_todt);
dm.setAnnc_cont(annc_cont);
dm.setAnnc_clsf(annc_clsf);
dm.setLg_id(lg_id);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 11:10:48 KST 2009 */