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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flag;
	public String dt;
	public String seq;
	public String vist_bgn_tm;
	public String vist_end_tm;
	public String vist_obj_clsf;
	public String vist_clsf;
	public String dlco_no;
	public String callcoms;
	public String job_cont;
	public String job_clas;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SUP_1030_ADM(){}
	public SP_SUP_1030_ADM(String cmpy_cd, String flag, String dt, String seq, String vist_bgn_tm, String vist_end_tm, String vist_obj_clsf, String vist_clsf, String dlco_no, String callcoms, String job_cont, String job_clas, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.flag = flag;
		this.dt = dt;
		this.seq = seq;
		this.vist_bgn_tm = vist_bgn_tm;
		this.vist_end_tm = vist_end_tm;
		this.vist_obj_clsf = vist_obj_clsf;
		this.vist_clsf = vist_clsf;
		this.dlco_no = dlco_no;
		this.callcoms = callcoms;
		this.job_cont = job_cont;
		this.job_clas = job_clas;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setVist_bgn_tm(String vist_bgn_tm){
		this.vist_bgn_tm = vist_bgn_tm;
	}

	public void setVist_end_tm(String vist_end_tm){
		this.vist_end_tm = vist_end_tm;
	}

	public void setVist_obj_clsf(String vist_obj_clsf){
		this.vist_obj_clsf = vist_obj_clsf;
	}

	public void setVist_clsf(String vist_clsf){
		this.vist_clsf = vist_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCallcoms(String callcoms){
		this.callcoms = callcoms;
	}

	public void setJob_cont(String job_cont){
		this.job_cont = job_cont;
	}

	public void setJob_clas(String job_clas){
		this.job_clas = job_clas;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getDt(){
		return this.dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getVist_bgn_tm(){
		return this.vist_bgn_tm;
	}

	public String getVist_end_tm(){
		return this.vist_end_tm;
	}

	public String getVist_obj_clsf(){
		return this.vist_obj_clsf;
	}

	public String getVist_clsf(){
		return this.vist_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCallcoms(){
		return this.callcoms;
	}

	public String getJob_cont(){
		return this.job_cont;
	}

	public String getJob_clas(){
		return this.job_clas;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1030_ADM dm = (SP_SUP_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flag);
		cstmt.setString(5, dm.dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.vist_bgn_tm);
		cstmt.setString(8, dm.vist_end_tm);
		cstmt.setString(9, dm.vist_obj_clsf);
		cstmt.setString(10, dm.vist_clsf);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.callcoms);
		cstmt.setString(13, dm.job_cont);
		cstmt.setString(14, dm.job_clas);
		cstmt.setString(15, dm.incmg_pers_ip);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("dt = [" + getDt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("vist_bgn_tm = [" + getVist_bgn_tm() + "]");
		System.out.println("vist_end_tm = [" + getVist_end_tm() + "]");
		System.out.println("vist_obj_clsf = [" + getVist_obj_clsf() + "]");
		System.out.println("vist_clsf = [" + getVist_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("callcoms = [" + getCallcoms() + "]");
		System.out.println("job_cont = [" + getJob_cont() + "]");
		System.out.println("job_clas = [" + getJob_clas() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String vist_bgn_tm = req.getParameter("vist_bgn_tm");
if( vist_bgn_tm == null){
	System.out.println(this.toString+" : vist_bgn_tm is null" );
}else{
	System.out.println(this.toString+" : vist_bgn_tm is "+vist_bgn_tm );
}
String vist_end_tm = req.getParameter("vist_end_tm");
if( vist_end_tm == null){
	System.out.println(this.toString+" : vist_end_tm is null" );
}else{
	System.out.println(this.toString+" : vist_end_tm is "+vist_end_tm );
}
String vist_obj_clsf = req.getParameter("vist_obj_clsf");
if( vist_obj_clsf == null){
	System.out.println(this.toString+" : vist_obj_clsf is null" );
}else{
	System.out.println(this.toString+" : vist_obj_clsf is "+vist_obj_clsf );
}
String vist_clsf = req.getParameter("vist_clsf");
if( vist_clsf == null){
	System.out.println(this.toString+" : vist_clsf is null" );
}else{
	System.out.println(this.toString+" : vist_clsf is "+vist_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String callcoms = req.getParameter("callcoms");
if( callcoms == null){
	System.out.println(this.toString+" : callcoms is null" );
}else{
	System.out.println(this.toString+" : callcoms is "+callcoms );
}
String job_cont = req.getParameter("job_cont");
if( job_cont == null){
	System.out.println(this.toString+" : job_cont is null" );
}else{
	System.out.println(this.toString+" : job_cont is "+job_cont );
}
String job_clas = req.getParameter("job_clas");
if( job_clas == null){
	System.out.println(this.toString+" : job_clas is null" );
}else{
	System.out.println(this.toString+" : job_clas is "+job_clas );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String flag = Util.checkString(req.getParameter("flag"));
String dt = Util.checkString(req.getParameter("dt"));
String seq = Util.checkString(req.getParameter("seq"));
String vist_bgn_tm = Util.checkString(req.getParameter("vist_bgn_tm"));
String vist_end_tm = Util.checkString(req.getParameter("vist_end_tm"));
String vist_obj_clsf = Util.checkString(req.getParameter("vist_obj_clsf"));
String vist_clsf = Util.checkString(req.getParameter("vist_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String callcoms = Util.checkString(req.getParameter("callcoms"));
String job_cont = Util.checkString(req.getParameter("job_cont"));
String job_clas = Util.checkString(req.getParameter("job_clas"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String vist_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("vist_bgn_tm")));
String vist_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("vist_end_tm")));
String vist_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vist_obj_clsf")));
String vist_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vist_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String callcoms = Util.Uni2Ksc(Util.checkString(req.getParameter("callcoms")));
String job_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("job_cont")));
String job_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clas")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlag(flag);
dm.setDt(dt);
dm.setSeq(seq);
dm.setVist_bgn_tm(vist_bgn_tm);
dm.setVist_end_tm(vist_end_tm);
dm.setVist_obj_clsf(vist_obj_clsf);
dm.setVist_clsf(vist_clsf);
dm.setDlco_no(dlco_no);
dm.setCallcoms(callcoms);
dm.setJob_cont(job_cont);
dm.setJob_clas(job_clas);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 19 10:08:50 KST 2012 */