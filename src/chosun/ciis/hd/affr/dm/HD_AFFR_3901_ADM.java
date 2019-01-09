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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_3901_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String dept_cd;
	public String aplc_dt;
	public String acq_pers;
	public String start_plac;
	public String ariv_plac;
	public String use_purp;
	public String cont_item;
	public String remk;
	public String aplc_cnfm_yn;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_AFFR_3901_ADM(){}
	public HD_AFFR_3901_ADM(String cmpy_cd, String mode, String emp_no, String dept_cd, String aplc_dt, String acq_pers, String start_plac, String ariv_plac, String use_purp, String cont_item, String remk, String aplc_cnfm_yn, String seq, String occr_dt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.aplc_dt = aplc_dt;
		this.acq_pers = acq_pers;
		this.start_plac = start_plac;
		this.ariv_plac = ariv_plac;
		this.use_purp = use_purp;
		this.cont_item = cont_item;
		this.remk = remk;
		this.aplc_cnfm_yn = aplc_cnfm_yn;
		this.seq = seq;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAcq_pers(String acq_pers){
		this.acq_pers = acq_pers;
	}

	public void setStart_plac(String start_plac){
		this.start_plac = start_plac;
	}

	public void setAriv_plac(String ariv_plac){
		this.ariv_plac = ariv_plac;
	}

	public void setUse_purp(String use_purp){
		this.use_purp = use_purp;
	}

	public void setCont_item(String cont_item){
		this.cont_item = cont_item;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAplc_cnfm_yn(String aplc_cnfm_yn){
		this.aplc_cnfm_yn = aplc_cnfm_yn;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAcq_pers(){
		return this.acq_pers;
	}

	public String getStart_plac(){
		return this.start_plac;
	}

	public String getAriv_plac(){
		return this.ariv_plac;
	}

	public String getUse_purp(){
		return this.use_purp;
	}

	public String getCont_item(){
		return this.cont_item;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAplc_cnfm_yn(){
		return this.aplc_cnfm_yn;
	}

	public String getSeq(){
		return this.seq;
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
		 return "{ call MISHDL.SP_HD_AFFR_3901_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3901_ADM dm = (HD_AFFR_3901_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.aplc_dt);
		cstmt.setString(8, dm.acq_pers);
		cstmt.setString(9, dm.start_plac);
		cstmt.setString(10, dm.ariv_plac);
		cstmt.setString(11, dm.use_purp);
		cstmt.setString(12, dm.cont_item);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.aplc_cnfm_yn);
		cstmt.setString(15, dm.seq);
		cstmt.setString(16, dm.occr_dt);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3901_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("acq_pers = [" + getAcq_pers() + "]");
		System.out.println("start_plac = [" + getStart_plac() + "]");
		System.out.println("ariv_plac = [" + getAriv_plac() + "]");
		System.out.println("use_purp = [" + getUse_purp() + "]");
		System.out.println("cont_item = [" + getCont_item() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("aplc_cnfm_yn = [" + getAplc_cnfm_yn() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String acq_pers = req.getParameter("acq_pers");
if( acq_pers == null){
	System.out.println(this.toString+" : acq_pers is null" );
}else{
	System.out.println(this.toString+" : acq_pers is "+acq_pers );
}
String start_plac = req.getParameter("start_plac");
if( start_plac == null){
	System.out.println(this.toString+" : start_plac is null" );
}else{
	System.out.println(this.toString+" : start_plac is "+start_plac );
}
String ariv_plac = req.getParameter("ariv_plac");
if( ariv_plac == null){
	System.out.println(this.toString+" : ariv_plac is null" );
}else{
	System.out.println(this.toString+" : ariv_plac is "+ariv_plac );
}
String use_purp = req.getParameter("use_purp");
if( use_purp == null){
	System.out.println(this.toString+" : use_purp is null" );
}else{
	System.out.println(this.toString+" : use_purp is "+use_purp );
}
String cont_item = req.getParameter("cont_item");
if( cont_item == null){
	System.out.println(this.toString+" : cont_item is null" );
}else{
	System.out.println(this.toString+" : cont_item is "+cont_item );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String aplc_cnfm_yn = req.getParameter("aplc_cnfm_yn");
if( aplc_cnfm_yn == null){
	System.out.println(this.toString+" : aplc_cnfm_yn is null" );
}else{
	System.out.println(this.toString+" : aplc_cnfm_yn is "+aplc_cnfm_yn );
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
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String acq_pers = Util.checkString(req.getParameter("acq_pers"));
String start_plac = Util.checkString(req.getParameter("start_plac"));
String ariv_plac = Util.checkString(req.getParameter("ariv_plac"));
String use_purp = Util.checkString(req.getParameter("use_purp"));
String cont_item = Util.checkString(req.getParameter("cont_item"));
String remk = Util.checkString(req.getParameter("remk"));
String aplc_cnfm_yn = Util.checkString(req.getParameter("aplc_cnfm_yn"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String acq_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acq_pers")));
String start_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("start_plac")));
String ariv_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_plac")));
String use_purp = Util.Uni2Ksc(Util.checkString(req.getParameter("use_purp")));
String cont_item = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_item")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String aplc_cnfm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_cnfm_yn")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setAplc_dt(aplc_dt);
dm.setAcq_pers(acq_pers);
dm.setStart_plac(start_plac);
dm.setAriv_plac(ariv_plac);
dm.setUse_purp(use_purp);
dm.setCont_item(cont_item);
dm.setRemk(remk);
dm.setAplc_cnfm_yn(aplc_cnfm_yn);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 10 18:20:24 KST 2018 */