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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String tms;
	public String prv_insp_dt;
	public String prv_insp_ocom;
	public String prv_insp_resn;
	public String main_insp_dt;
	public String main_insp_ocom;
	public String prz_pnsh_cd;
	public String prz_resn_cd;
	public String prz_grad;
	public String prz_amt;
	public String clas_clsf_cd;
	public String dtls_cont;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;

	public HD_PRZ_1103_ADM(){}
	public HD_PRZ_1103_ADM(String mode, String cmpy_cd, String occr_dt, String seq, String sub_seq, String tms, String prv_insp_dt, String prv_insp_ocom, String prv_insp_resn, String main_insp_dt, String main_insp_ocom, String prz_pnsh_cd, String prz_resn_cd, String prz_grad, String prz_amt, String clas_clsf_cd, String dtls_cont, String incmg_pers_ipadd, String incmg_pers, String incmg_dt_tm){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.tms = tms;
		this.prv_insp_dt = prv_insp_dt;
		this.prv_insp_ocom = prv_insp_ocom;
		this.prv_insp_resn = prv_insp_resn;
		this.main_insp_dt = main_insp_dt;
		this.main_insp_ocom = main_insp_ocom;
		this.prz_pnsh_cd = prz_pnsh_cd;
		this.prz_resn_cd = prz_resn_cd;
		this.prz_grad = prz_grad;
		this.prz_amt = prz_amt;
		this.clas_clsf_cd = clas_clsf_cd;
		this.dtls_cont = dtls_cont;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setPrv_insp_dt(String prv_insp_dt){
		this.prv_insp_dt = prv_insp_dt;
	}

	public void setPrv_insp_ocom(String prv_insp_ocom){
		this.prv_insp_ocom = prv_insp_ocom;
	}

	public void setPrv_insp_resn(String prv_insp_resn){
		this.prv_insp_resn = prv_insp_resn;
	}

	public void setMain_insp_dt(String main_insp_dt){
		this.main_insp_dt = main_insp_dt;
	}

	public void setMain_insp_ocom(String main_insp_ocom){
		this.main_insp_ocom = main_insp_ocom;
	}

	public void setPrz_pnsh_cd(String prz_pnsh_cd){
		this.prz_pnsh_cd = prz_pnsh_cd;
	}

	public void setPrz_resn_cd(String prz_resn_cd){
		this.prz_resn_cd = prz_resn_cd;
	}

	public void setPrz_grad(String prz_grad){
		this.prz_grad = prz_grad;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}
	
	public void setClas_clsf_cd(String clas_clsf_cd){
		this.clas_clsf_cd = clas_clsf_cd;
	}
	
	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getTms(){
		return this.tms;
	}

	public String getPrv_insp_dt(){
		return this.prv_insp_dt;
	}

	public String getPrv_insp_ocom(){
		return this.prv_insp_ocom;
	}

	public String getPrv_insp_resn(){
		return this.prv_insp_resn;
	}

	public String getMain_insp_dt(){
		return this.main_insp_dt;
	}

	public String getMain_insp_ocom(){
		return this.main_insp_ocom;
	}

	public String getPrz_pnsh_cd(){
		return this.prz_pnsh_cd;
	}

	public String getPrz_resn_cd(){
		return this.prz_resn_cd;
	}

	public String getPrz_grad(){
		return this.prz_grad;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}
	
	public String getClas_clsf_cd(){
		return this.clas_clsf_cd;
	}
	
	public String getDtls_cont(){
		return this.dtls_cont;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1103_ADM dm = (HD_PRZ_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.sub_seq);
		cstmt.setString(8, dm.tms);
		cstmt.setString(9, dm.prv_insp_dt);
		cstmt.setString(10, dm.prv_insp_ocom);
		cstmt.setString(11, dm.prv_insp_resn);
		cstmt.setString(12, dm.main_insp_dt);
		cstmt.setString(13, dm.main_insp_ocom);
		cstmt.setString(14, dm.prz_pnsh_cd);
		cstmt.setString(15, dm.prz_resn_cd);
		cstmt.setString(16, dm.prz_grad);
		cstmt.setString(17, dm.prz_amt);
		cstmt.setString(18, dm.clas_clsf_cd);
		cstmt.setString(19, dm.dtls_cont);
		cstmt.setString(20, dm.incmg_pers_ipadd);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.incmg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("prv_insp_dt = [" + getPrv_insp_dt() + "]");
		System.out.println("prv_insp_ocom = [" + getPrv_insp_ocom() + "]");
		System.out.println("prv_insp_resn = [" + getPrv_insp_resn() + "]");
		System.out.println("main_insp_dt = [" + getMain_insp_dt() + "]");
		System.out.println("main_insp_ocom = [" + getMain_insp_ocom() + "]");
		System.out.println("prz_pnsh_cd = [" + getPrz_pnsh_cd() + "]");
		System.out.println("prz_resn_cd = [" + getPrz_resn_cd() + "]");
		System.out.println("prz_grad = [" + getPrz_grad() + "]");
		System.out.println("prz_amt = [" + getPrz_amt() + "]");
		System.out.println("clas_clsf_cd = [" + getClas_clsf_cd() + "]");
		System.out.println("dtls_cont = [" + getDtls_cont() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String prv_insp_dt = req.getParameter("prv_insp_dt");
if( prv_insp_dt == null){
	System.out.println(this.toString+" : prv_insp_dt is null" );
}else{
	System.out.println(this.toString+" : prv_insp_dt is "+prv_insp_dt );
}
String prv_insp_ocom = req.getParameter("prv_insp_ocom");
if( prv_insp_ocom == null){
	System.out.println(this.toString+" : prv_insp_ocom is null" );
}else{
	System.out.println(this.toString+" : prv_insp_ocom is "+prv_insp_ocom );
}
String prv_insp_resn = req.getParameter("prv_insp_resn");
if( prv_insp_resn == null){
	System.out.println(this.toString+" : prv_insp_resn is null" );
}else{
	System.out.println(this.toString+" : prv_insp_resn is "+prv_insp_resn );
}
String main_insp_dt = req.getParameter("main_insp_dt");
if( main_insp_dt == null){
	System.out.println(this.toString+" : main_insp_dt is null" );
}else{
	System.out.println(this.toString+" : main_insp_dt is "+main_insp_dt );
}
String main_insp_ocom = req.getParameter("main_insp_ocom");
if( main_insp_ocom == null){
	System.out.println(this.toString+" : main_insp_ocom is null" );
}else{
	System.out.println(this.toString+" : main_insp_ocom is "+main_insp_ocom );
}
String prz_pnsh_cd = req.getParameter("prz_pnsh_cd");
if( prz_pnsh_cd == null){
	System.out.println(this.toString+" : prz_pnsh_cd is null" );
}else{
	System.out.println(this.toString+" : prz_pnsh_cd is "+prz_pnsh_cd );
}
String prz_resn_cd = req.getParameter("prz_resn_cd");
if( prz_resn_cd == null){
	System.out.println(this.toString+" : prz_resn_cd is null" );
}else{
	System.out.println(this.toString+" : prz_resn_cd is "+prz_resn_cd );
}
String prz_grad = req.getParameter("prz_grad");
if( prz_grad == null){
	System.out.println(this.toString+" : prz_grad is null" );
}else{
	System.out.println(this.toString+" : prz_grad is "+prz_grad );
}
String prz_amt = req.getParameter("prz_amt");
if( prz_amt == null){
	System.out.println(this.toString+" : prz_amt is null" );
}else{
	System.out.println(this.toString+" : prz_amt is "+prz_amt );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String tms = Util.checkString(req.getParameter("tms"));
String prv_insp_dt = Util.checkString(req.getParameter("prv_insp_dt"));
String prv_insp_ocom = Util.checkString(req.getParameter("prv_insp_ocom"));
String prv_insp_resn = Util.checkString(req.getParameter("prv_insp_resn"));
String main_insp_dt = Util.checkString(req.getParameter("main_insp_dt"));
String main_insp_ocom = Util.checkString(req.getParameter("main_insp_ocom"));
String prz_pnsh_cd = Util.checkString(req.getParameter("prz_pnsh_cd"));
String prz_resn_cd = Util.checkString(req.getParameter("prz_resn_cd"));
String prz_grad = Util.checkString(req.getParameter("prz_grad"));
String prz_amt = Util.checkString(req.getParameter("prz_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String prv_insp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_insp_dt")));
String prv_insp_ocom = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_insp_ocom")));
String prv_insp_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_insp_resn")));
String main_insp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("main_insp_dt")));
String main_insp_ocom = Util.Uni2Ksc(Util.checkString(req.getParameter("main_insp_ocom")));
String prz_pnsh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_pnsh_cd")));
String prz_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_resn_cd")));
String prz_grad = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_grad")));
String prz_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setTms(tms);
dm.setPrv_insp_dt(prv_insp_dt);
dm.setPrv_insp_ocom(prv_insp_ocom);
dm.setPrv_insp_resn(prv_insp_resn);
dm.setMain_insp_dt(main_insp_dt);
dm.setMain_insp_ocom(main_insp_ocom);
dm.setPrz_pnsh_cd(prz_pnsh_cd);
dm.setPrz_resn_cd(prz_resn_cd);
dm.setPrz_grad(prz_grad);
dm.setPrz_amt(prz_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 19:38:35 KST 2009 */