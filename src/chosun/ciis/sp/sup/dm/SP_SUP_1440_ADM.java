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


public class SP_SUP_1440_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String acpn_no;
	public String cns_clsf;
	public String acpn_pers;
	public String acpn_dt;
	public String acpn_bgn_tm;
	public String acpn_end_tm;
	public String acpn_clsf;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String rdr_nm;
	public String type_cd;
	public String cns_ptcr;
	public String proc_clsf;
	public String end_dt_tm;
	public String cns_cont_clsf_1;
	public String cns_cont_clsf_2;
	public String cns_cont_clsf_3;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SP_SUP_1440_ADM(){}
	public SP_SUP_1440_ADM(String flag, String cmpy_cd, String acpn_no, String cns_clsf, String acpn_pers, String acpn_dt, String acpn_bgn_tm, String acpn_end_tm, String acpn_clsf, String dlco_clsf, String dlco_cd, String dlco_seq, String rdr_nm, String type_cd, String cns_ptcr, String proc_clsf, String end_dt_tm, String cns_cont_clsf_1, String cns_cont_clsf_2, String cns_cont_clsf_3, String incmg_pers, String incmg_pers_ip){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.acpn_no = acpn_no;
		this.cns_clsf = cns_clsf;
		this.acpn_pers = acpn_pers;
		this.acpn_dt = acpn_dt;
		this.acpn_bgn_tm = acpn_bgn_tm;
		this.acpn_end_tm = acpn_end_tm;
		this.acpn_clsf = acpn_clsf;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.rdr_nm = rdr_nm;
		this.type_cd = type_cd;
		this.cns_ptcr = cns_ptcr;
		this.proc_clsf = proc_clsf;
		this.end_dt_tm = end_dt_tm;
		this.cns_cont_clsf_1 = cns_cont_clsf_1;
		this.cns_cont_clsf_2 = cns_cont_clsf_2;
		this.cns_cont_clsf_3 = cns_cont_clsf_3;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_no(String acpn_no){
		this.acpn_no = acpn_no;
	}

	public void setCns_clsf(String cns_clsf){
		this.cns_clsf = cns_clsf;
	}

	public void setAcpn_pers(String acpn_pers){
		this.acpn_pers = acpn_pers;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setAcpn_bgn_tm(String acpn_bgn_tm){
		this.acpn_bgn_tm = acpn_bgn_tm;
	}

	public void setAcpn_end_tm(String acpn_end_tm){
		this.acpn_end_tm = acpn_end_tm;
	}

	public void setAcpn_clsf(String acpn_clsf){
		this.acpn_clsf = acpn_clsf;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setType_cd(String type_cd){
		this.type_cd = type_cd;
	}

	public void setCns_ptcr(String cns_ptcr){
		this.cns_ptcr = cns_ptcr;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setEnd_dt_tm(String end_dt_tm){
		this.end_dt_tm = end_dt_tm;
	}

	public void setCns_cont_clsf_1(String cns_cont_clsf_1){
		this.cns_cont_clsf_1 = cns_cont_clsf_1;
	}

	public void setCns_cont_clsf_2(String cns_cont_clsf_2){
		this.cns_cont_clsf_2 = cns_cont_clsf_2;
	}

	public void setCns_cont_clsf_3(String cns_cont_clsf_3){
		this.cns_cont_clsf_3 = cns_cont_clsf_3;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_no(){
		return this.acpn_no;
	}

	public String getCns_clsf(){
		return this.cns_clsf;
	}

	public String getAcpn_pers(){
		return this.acpn_pers;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getAcpn_bgn_tm(){
		return this.acpn_bgn_tm;
	}

	public String getAcpn_end_tm(){
		return this.acpn_end_tm;
	}

	public String getAcpn_clsf(){
		return this.acpn_clsf;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getType_cd(){
		return this.type_cd;
	}

	public String getCns_ptcr(){
		return this.cns_ptcr;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getEnd_dt_tm(){
		return this.end_dt_tm;
	}

	public String getCns_cont_clsf_1(){
		return this.cns_cont_clsf_1;
	}

	public String getCns_cont_clsf_2(){
		return this.cns_cont_clsf_2;
	}

	public String getCns_cont_clsf_3(){
		return this.cns_cont_clsf_3;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1440_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1440_ADM dm = (SP_SUP_1440_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.acpn_no);
		cstmt.setString(6, dm.cns_clsf);
		cstmt.setString(7, dm.acpn_pers);
		cstmt.setString(8, dm.acpn_dt);
		cstmt.setString(9, dm.acpn_bgn_tm);
		cstmt.setString(10, dm.acpn_end_tm);
		cstmt.setString(11, dm.acpn_clsf);
		cstmt.setString(12, dm.dlco_clsf);
		cstmt.setString(13, dm.dlco_cd);
		cstmt.setString(14, dm.dlco_seq);
		cstmt.setString(15, dm.rdr_nm);
		cstmt.setString(16, dm.type_cd);
		cstmt.setString(17, dm.cns_ptcr);
		cstmt.setString(18, dm.proc_clsf);
		cstmt.setString(19, dm.end_dt_tm);
		cstmt.setString(20, dm.cns_cont_clsf_1);
		cstmt.setString(21, dm.cns_cont_clsf_2);
		cstmt.setString(22, dm.cns_cont_clsf_3);
		cstmt.setString(23, dm.incmg_pers);
		cstmt.setString(24, dm.incmg_pers_ip);
		cstmt.registerOutParameter(25, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1440_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_no = [" + getAcpn_no() + "]");
		System.out.println("cns_clsf = [" + getCns_clsf() + "]");
		System.out.println("acpn_pers = [" + getAcpn_pers() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
		System.out.println("acpn_bgn_tm = [" + getAcpn_bgn_tm() + "]");
		System.out.println("acpn_end_tm = [" + getAcpn_end_tm() + "]");
		System.out.println("acpn_clsf = [" + getAcpn_clsf() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("rdr_nm = [" + getRdr_nm() + "]");
		System.out.println("type_cd = [" + getType_cd() + "]");
		System.out.println("cns_ptcr = [" + getCns_ptcr() + "]");
		System.out.println("proc_clsf = [" + getProc_clsf() + "]");
		System.out.println("end_dt_tm = [" + getEnd_dt_tm() + "]");
		System.out.println("cns_cont_clsf_1 = [" + getCns_cont_clsf_1() + "]");
		System.out.println("cns_cont_clsf_2 = [" + getCns_cont_clsf_2() + "]");
		System.out.println("cns_cont_clsf_3 = [" + getCns_cont_clsf_3() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String acpn_no = req.getParameter("acpn_no");
if( acpn_no == null){
	System.out.println(this.toString+" : acpn_no is null" );
}else{
	System.out.println(this.toString+" : acpn_no is "+acpn_no );
}
String cns_clsf = req.getParameter("cns_clsf");
if( cns_clsf == null){
	System.out.println(this.toString+" : cns_clsf is null" );
}else{
	System.out.println(this.toString+" : cns_clsf is "+cns_clsf );
}
String acpn_pers = req.getParameter("acpn_pers");
if( acpn_pers == null){
	System.out.println(this.toString+" : acpn_pers is null" );
}else{
	System.out.println(this.toString+" : acpn_pers is "+acpn_pers );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
String acpn_bgn_tm = req.getParameter("acpn_bgn_tm");
if( acpn_bgn_tm == null){
	System.out.println(this.toString+" : acpn_bgn_tm is null" );
}else{
	System.out.println(this.toString+" : acpn_bgn_tm is "+acpn_bgn_tm );
}
String acpn_end_tm = req.getParameter("acpn_end_tm");
if( acpn_end_tm == null){
	System.out.println(this.toString+" : acpn_end_tm is null" );
}else{
	System.out.println(this.toString+" : acpn_end_tm is "+acpn_end_tm );
}
String acpn_clsf = req.getParameter("acpn_clsf");
if( acpn_clsf == null){
	System.out.println(this.toString+" : acpn_clsf is null" );
}else{
	System.out.println(this.toString+" : acpn_clsf is "+acpn_clsf );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
String rdr_nm = req.getParameter("rdr_nm");
if( rdr_nm == null){
	System.out.println(this.toString+" : rdr_nm is null" );
}else{
	System.out.println(this.toString+" : rdr_nm is "+rdr_nm );
}
String type_cd = req.getParameter("type_cd");
if( type_cd == null){
	System.out.println(this.toString+" : type_cd is null" );
}else{
	System.out.println(this.toString+" : type_cd is "+type_cd );
}
String cns_ptcr = req.getParameter("cns_ptcr");
if( cns_ptcr == null){
	System.out.println(this.toString+" : cns_ptcr is null" );
}else{
	System.out.println(this.toString+" : cns_ptcr is "+cns_ptcr );
}
String proc_clsf = req.getParameter("proc_clsf");
if( proc_clsf == null){
	System.out.println(this.toString+" : proc_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_clsf is "+proc_clsf );
}
String end_dt_tm = req.getParameter("end_dt_tm");
if( end_dt_tm == null){
	System.out.println(this.toString+" : end_dt_tm is null" );
}else{
	System.out.println(this.toString+" : end_dt_tm is "+end_dt_tm );
}
String cns_cont_clsf_1 = req.getParameter("cns_cont_clsf_1");
if( cns_cont_clsf_1 == null){
	System.out.println(this.toString+" : cns_cont_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : cns_cont_clsf_1 is "+cns_cont_clsf_1 );
}
String cns_cont_clsf_2 = req.getParameter("cns_cont_clsf_2");
if( cns_cont_clsf_2 == null){
	System.out.println(this.toString+" : cns_cont_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : cns_cont_clsf_2 is "+cns_cont_clsf_2 );
}
String cns_cont_clsf_3 = req.getParameter("cns_cont_clsf_3");
if( cns_cont_clsf_3 == null){
	System.out.println(this.toString+" : cns_cont_clsf_3 is null" );
}else{
	System.out.println(this.toString+" : cns_cont_clsf_3 is "+cns_cont_clsf_3 );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acpn_no = Util.checkString(req.getParameter("acpn_no"));
String cns_clsf = Util.checkString(req.getParameter("cns_clsf"));
String acpn_pers = Util.checkString(req.getParameter("acpn_pers"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
String acpn_bgn_tm = Util.checkString(req.getParameter("acpn_bgn_tm"));
String acpn_end_tm = Util.checkString(req.getParameter("acpn_end_tm"));
String acpn_clsf = Util.checkString(req.getParameter("acpn_clsf"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String rdr_nm = Util.checkString(req.getParameter("rdr_nm"));
String type_cd = Util.checkString(req.getParameter("type_cd"));
String cns_ptcr = Util.checkString(req.getParameter("cns_ptcr"));
String proc_clsf = Util.checkString(req.getParameter("proc_clsf"));
String end_dt_tm = Util.checkString(req.getParameter("end_dt_tm"));
String cns_cont_clsf_1 = Util.checkString(req.getParameter("cns_cont_clsf_1"));
String cns_cont_clsf_2 = Util.checkString(req.getParameter("cns_cont_clsf_2"));
String cns_cont_clsf_3 = Util.checkString(req.getParameter("cns_cont_clsf_3"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_no")));
String cns_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_clsf")));
String acpn_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_pers")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
String acpn_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_bgn_tm")));
String acpn_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_end_tm")));
String acpn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_clsf")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String rdr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_nm")));
String type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("type_cd")));
String cns_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_ptcr")));
String proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_clsf")));
String end_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt_tm")));
String cns_cont_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_cont_clsf_1")));
String cns_cont_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_cont_clsf_2")));
String cns_cont_clsf_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_cont_clsf_3")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_no(acpn_no);
dm.setCns_clsf(cns_clsf);
dm.setAcpn_pers(acpn_pers);
dm.setAcpn_dt(acpn_dt);
dm.setAcpn_bgn_tm(acpn_bgn_tm);
dm.setAcpn_end_tm(acpn_end_tm);
dm.setAcpn_clsf(acpn_clsf);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setRdr_nm(rdr_nm);
dm.setType_cd(type_cd);
dm.setCns_ptcr(cns_ptcr);
dm.setProc_clsf(proc_clsf);
dm.setEnd_dt_tm(end_dt_tm);
dm.setCns_cont_clsf_1(cns_cont_clsf_1);
dm.setCns_cont_clsf_2(cns_cont_clsf_2);
dm.setCns_cont_clsf_3(cns_cont_clsf_3);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 04 21:52:43 KST 2012 */