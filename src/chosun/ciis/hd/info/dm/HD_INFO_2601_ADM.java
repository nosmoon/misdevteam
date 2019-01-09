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


public class HD_INFO_2601_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String cmpy_nm;
	public String rptv_movm_nm;
	public String emp_cnt;
	public String vip_serv_job;
	public String cntr_cnclus_dt;
	public String aply_yymm;
	public String mm_servcost;
	public String one_pers_servcost;
	public String spc_matt;
	public String remk;
	public String seq;
	public String occr_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public HD_INFO_2601_ADM(){}
	public HD_INFO_2601_ADM(String mode, String cmpy_cd, String cmpy_nm, String rptv_movm_nm, String emp_cnt, String vip_serv_job, String cntr_cnclus_dt, String aply_yymm, String mm_servcost, String one_pers_servcost, String spc_matt, String remk, String seq, String occr_dt, String incmg_pers, String incmg_pers_ipadd){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.cmpy_nm = cmpy_nm;
		this.rptv_movm_nm = rptv_movm_nm;
		this.emp_cnt = emp_cnt;
		this.vip_serv_job = vip_serv_job;
		this.cntr_cnclus_dt = cntr_cnclus_dt;
		this.aply_yymm = aply_yymm;
		this.mm_servcost = mm_servcost;
		this.one_pers_servcost = one_pers_servcost;
		this.spc_matt = spc_matt;
		this.remk = remk;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setRptv_movm_nm(String rptv_movm_nm){
		this.rptv_movm_nm = rptv_movm_nm;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setVip_serv_job(String vip_serv_job){
		this.vip_serv_job = vip_serv_job;
	}

	public void setCntr_cnclus_dt(String cntr_cnclus_dt){
		this.cntr_cnclus_dt = cntr_cnclus_dt;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setMm_servcost(String mm_servcost){
		this.mm_servcost = mm_servcost;
	}

	public void setOne_pers_servcost(String one_pers_servcost){
		this.one_pers_servcost = one_pers_servcost;
	}

	public void setSpc_matt(String spc_matt){
		this.spc_matt = spc_matt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getRptv_movm_nm(){
		return this.rptv_movm_nm;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getVip_serv_job(){
		return this.vip_serv_job;
	}

	public String getCntr_cnclus_dt(){
		return this.cntr_cnclus_dt;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getMm_servcost(){
		return this.mm_servcost;
	}

	public String getOne_pers_servcost(){
		return this.one_pers_servcost;
	}

	public String getSpc_matt(){
		return this.spc_matt;
	}

	public String getRemk(){
		return this.remk;
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
		 return "{ call MISHDL.SP_HD_INFO_2601_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2601_ADM dm = (HD_INFO_2601_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.cmpy_nm);
		cstmt.setString(6, dm.rptv_movm_nm);
		cstmt.setString(7, dm.emp_cnt);
		cstmt.setString(8, dm.vip_serv_job);
		cstmt.setString(9, dm.cntr_cnclus_dt);
		cstmt.setString(10, dm.aply_yymm);
		cstmt.setString(11, dm.mm_servcost);
		cstmt.setString(12, dm.one_pers_servcost);
		cstmt.setString(13, dm.spc_matt);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.seq);
		cstmt.setString(16, dm.occr_dt);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2601_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cmpy_nm = [" + getCmpy_nm() + "]");
		System.out.println("rptv_movm_nm = [" + getRptv_movm_nm() + "]");
		System.out.println("emp_cnt = [" + getEmp_cnt() + "]");
		System.out.println("vip_serv_job = [" + getVip_serv_job() + "]");
		System.out.println("cntr_cnclus_dt = [" + getCntr_cnclus_dt() + "]");
		System.out.println("aply_yymm = [" + getAply_yymm() + "]");
		System.out.println("mm_servcost = [" + getMm_servcost() + "]");
		System.out.println("one_pers_servcost = [" + getOne_pers_servcost() + "]");
		System.out.println("spc_matt = [" + getSpc_matt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String cmpy_nm = req.getParameter("cmpy_nm");
if( cmpy_nm == null){
	System.out.println(this.toString+" : cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : cmpy_nm is "+cmpy_nm );
}
String rptv_movm_nm = req.getParameter("rptv_movm_nm");
if( rptv_movm_nm == null){
	System.out.println(this.toString+" : rptv_movm_nm is null" );
}else{
	System.out.println(this.toString+" : rptv_movm_nm is "+rptv_movm_nm );
}
String emp_cnt = req.getParameter("emp_cnt");
if( emp_cnt == null){
	System.out.println(this.toString+" : emp_cnt is null" );
}else{
	System.out.println(this.toString+" : emp_cnt is "+emp_cnt );
}
String vip_serv_job = req.getParameter("vip_serv_job");
if( vip_serv_job == null){
	System.out.println(this.toString+" : vip_serv_job is null" );
}else{
	System.out.println(this.toString+" : vip_serv_job is "+vip_serv_job );
}
String cntr_cnclus_dt = req.getParameter("cntr_cnclus_dt");
if( cntr_cnclus_dt == null){
	System.out.println(this.toString+" : cntr_cnclus_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_cnclus_dt is "+cntr_cnclus_dt );
}
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String mm_servcost = req.getParameter("mm_servcost");
if( mm_servcost == null){
	System.out.println(this.toString+" : mm_servcost is null" );
}else{
	System.out.println(this.toString+" : mm_servcost is "+mm_servcost );
}
String one_pers_servcost = req.getParameter("one_pers_servcost");
if( one_pers_servcost == null){
	System.out.println(this.toString+" : one_pers_servcost is null" );
}else{
	System.out.println(this.toString+" : one_pers_servcost is "+one_pers_servcost );
}
String spc_matt = req.getParameter("spc_matt");
if( spc_matt == null){
	System.out.println(this.toString+" : spc_matt is null" );
}else{
	System.out.println(this.toString+" : spc_matt is "+spc_matt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cmpy_nm = Util.checkString(req.getParameter("cmpy_nm"));
String rptv_movm_nm = Util.checkString(req.getParameter("rptv_movm_nm"));
String emp_cnt = Util.checkString(req.getParameter("emp_cnt"));
String vip_serv_job = Util.checkString(req.getParameter("vip_serv_job"));
String cntr_cnclus_dt = Util.checkString(req.getParameter("cntr_cnclus_dt"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String mm_servcost = Util.checkString(req.getParameter("mm_servcost"));
String one_pers_servcost = Util.checkString(req.getParameter("one_pers_servcost"));
String spc_matt = Util.checkString(req.getParameter("spc_matt"));
String remk = Util.checkString(req.getParameter("remk"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_nm")));
String rptv_movm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_movm_nm")));
String emp_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_cnt")));
String vip_serv_job = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_serv_job")));
String cntr_cnclus_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_cnclus_dt")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String mm_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_servcost")));
String one_pers_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("one_pers_servcost")));
String spc_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_matt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setCmpy_nm(cmpy_nm);
dm.setRptv_movm_nm(rptv_movm_nm);
dm.setEmp_cnt(emp_cnt);
dm.setVip_serv_job(vip_serv_job);
dm.setCntr_cnclus_dt(cntr_cnclus_dt);
dm.setAply_yymm(aply_yymm);
dm.setMm_servcost(mm_servcost);
dm.setOne_pers_servcost(one_pers_servcost);
dm.setSpc_matt(spc_matt);
dm.setRemk(remk);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 17:35:04 KST 2009 */