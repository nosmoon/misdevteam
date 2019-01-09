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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1006_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String duty_dt;
	public String seq_1;
	public String matr_cd_1;
	public String vip_matr_clsf;
	public String dlco_cd_1;
	public String dlco_nm_1;
	public String use_qunt_1_1;
	public String use_qunt_2_1;
	public String seq_2;
	public String matr_cd_2;
	public String dlco_cd_2;
	public String dlco_nm_2;
	public String use_qunt_1_2;
	public String use_qunt_2_2;
	public String seq_3;
	public String matr_cd_3;
	public String dlco_cd_3;
	public String dlco_nm_3;
	public String use_qunt_1_3;
	public String seq_4;
	public String matr_cd_4;
	public String medi_cd;
	public String use_qunt_1_4;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_1006_ADM(){}
	public PR_PAPMAKE_1006_ADM(String cmpy_cd, String fac_clsf, String duty_dt, String seq_1, String matr_cd_1, String vip_matr_clsf, String dlco_cd_1, String dlco_nm_1, String use_qunt_1_1, String use_qunt_2_1, String seq_2, String matr_cd_2, String dlco_cd_2, String dlco_nm_2, String use_qunt_1_2, String use_qunt_2_2, String seq_3, String matr_cd_3, String dlco_cd_3, String dlco_nm_3, String use_qunt_1_3, String seq_4, String matr_cd_4, String medi_cd, String use_qunt_1_4, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.duty_dt = duty_dt;
		this.seq_1 = seq_1;
		this.matr_cd_1 = matr_cd_1;
		this.vip_matr_clsf = vip_matr_clsf;
		this.dlco_cd_1 = dlco_cd_1;
		this.dlco_nm_1 = dlco_nm_1;
		this.use_qunt_1_1 = use_qunt_1_1;
		this.use_qunt_2_1 = use_qunt_2_1;
		this.seq_2 = seq_2;
		this.matr_cd_2 = matr_cd_2;
		this.dlco_cd_2 = dlco_cd_2;
		this.dlco_nm_2 = dlco_nm_2;
		this.use_qunt_1_2 = use_qunt_1_2;
		this.use_qunt_2_2 = use_qunt_2_2;
		this.seq_3 = seq_3;
		this.matr_cd_3 = matr_cd_3;
		this.dlco_cd_3 = dlco_cd_3;
		this.dlco_nm_3 = dlco_nm_3;
		this.use_qunt_1_3 = use_qunt_1_3;
		this.seq_4 = seq_4;
		this.matr_cd_4 = matr_cd_4;
		this.medi_cd = medi_cd;
		this.use_qunt_1_4 = use_qunt_1_4;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setSeq_1(String seq_1){
		this.seq_1 = seq_1;
	}

	public void setMatr_cd_1(String matr_cd_1){
		this.matr_cd_1 = matr_cd_1;
	}

	public void setVip_matr_clsf(String vip_matr_clsf){
		this.vip_matr_clsf = vip_matr_clsf;
	}

	public void setDlco_cd_1(String dlco_cd_1){
		this.dlco_cd_1 = dlco_cd_1;
	}

	public void setDlco_nm_1(String dlco_nm_1){
		this.dlco_nm_1 = dlco_nm_1;
	}

	public void setUse_qunt_1_1(String use_qunt_1_1){
		this.use_qunt_1_1 = use_qunt_1_1;
	}

	public void setUse_qunt_2_1(String use_qunt_2_1){
		this.use_qunt_2_1 = use_qunt_2_1;
	}

	public void setSeq_2(String seq_2){
		this.seq_2 = seq_2;
	}

	public void setMatr_cd_2(String matr_cd_2){
		this.matr_cd_2 = matr_cd_2;
	}

	public void setDlco_cd_2(String dlco_cd_2){
		this.dlco_cd_2 = dlco_cd_2;
	}

	public void setDlco_nm_2(String dlco_nm_2){
		this.dlco_nm_2 = dlco_nm_2;
	}

	public void setUse_qunt_1_2(String use_qunt_1_2){
		this.use_qunt_1_2 = use_qunt_1_2;
	}

	public void setUse_qunt_2_2(String use_qunt_2_2){
		this.use_qunt_2_2 = use_qunt_2_2;
	}

	public void setSeq_3(String seq_3){
		this.seq_3 = seq_3;
	}

	public void setMatr_cd_3(String matr_cd_3){
		this.matr_cd_3 = matr_cd_3;
	}

	public void setDlco_cd_3(String dlco_cd_3){
		this.dlco_cd_3 = dlco_cd_3;
	}

	public void setDlco_nm_3(String dlco_nm_3){
		this.dlco_nm_3 = dlco_nm_3;
	}

	public void setUse_qunt_1_3(String use_qunt_1_3){
		this.use_qunt_1_3 = use_qunt_1_3;
	}

	public void setSeq_4(String seq_4){
		this.seq_4 = seq_4;
	}

	public void setMatr_cd_4(String matr_cd_4){
		this.matr_cd_4 = matr_cd_4;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_qunt_1_4(String use_qunt_1_4){
		this.use_qunt_1_4 = use_qunt_1_4;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getSeq_1(){
		return this.seq_1;
	}

	public String getMatr_cd_1(){
		return this.matr_cd_1;
	}

	public String getVip_matr_clsf(){
		return this.vip_matr_clsf;
	}

	public String getDlco_cd_1(){
		return this.dlco_cd_1;
	}

	public String getDlco_nm_1(){
		return this.dlco_nm_1;
	}

	public String getUse_qunt_1_1(){
		return this.use_qunt_1_1;
	}

	public String getUse_qunt_2_1(){
		return this.use_qunt_2_1;
	}

	public String getSeq_2(){
		return this.seq_2;
	}

	public String getMatr_cd_2(){
		return this.matr_cd_2;
	}

	public String getDlco_cd_2(){
		return this.dlco_cd_2;
	}

	public String getDlco_nm_2(){
		return this.dlco_nm_2;
	}

	public String getUse_qunt_1_2(){
		return this.use_qunt_1_2;
	}

	public String getUse_qunt_2_2(){
		return this.use_qunt_2_2;
	}

	public String getSeq_3(){
		return this.seq_3;
	}

	public String getMatr_cd_3(){
		return this.matr_cd_3;
	}

	public String getDlco_cd_3(){
		return this.dlco_cd_3;
	}

	public String getDlco_nm_3(){
		return this.dlco_nm_3;
	}

	public String getUse_qunt_1_3(){
		return this.use_qunt_1_3;
	}

	public String getSeq_4(){
		return this.seq_4;
	}

	public String getMatr_cd_4(){
		return this.matr_cd_4;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_qunt_1_4(){
		return this.use_qunt_1_4;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_1006_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_1006_ADM dm = (PR_PAPMAKE_1006_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.seq_1);
		cstmt.setString(7, dm.matr_cd_1);
		cstmt.setString(8, dm.vip_matr_clsf);
		cstmt.setString(9, dm.dlco_cd_1);
		cstmt.setString(10, dm.dlco_nm_1);
		cstmt.setString(11, dm.use_qunt_1_1);
		cstmt.setString(12, dm.use_qunt_2_1);
		cstmt.setString(13, dm.seq_2);
		cstmt.setString(14, dm.matr_cd_2);
		cstmt.setString(15, dm.dlco_cd_2);
		cstmt.setString(16, dm.dlco_nm_2);
		cstmt.setString(17, dm.use_qunt_1_2);
		cstmt.setString(18, dm.use_qunt_2_2);
		cstmt.setString(19, dm.seq_3);
		cstmt.setString(20, dm.matr_cd_3);
		cstmt.setString(21, dm.dlco_cd_3);
		cstmt.setString(22, dm.dlco_nm_3);
		cstmt.setString(23, dm.use_qunt_1_3);
		cstmt.setString(24, dm.seq_4);
		cstmt.setString(25, dm.matr_cd_4);
		cstmt.setString(26, dm.medi_cd);
		cstmt.setString(27, dm.use_qunt_1_4);
		cstmt.setString(28, dm.incmg_pers_ipaddr);
		cstmt.setString(29, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_1006_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("seq_1 = [" + getSeq_1() + "]");
		System.out.println("matr_cd_1 = [" + getMatr_cd_1() + "]");
		System.out.println("vip_matr_clsf = [" + getVip_matr_clsf() + "]");
		System.out.println("dlco_cd_1 = [" + getDlco_cd_1() + "]");
		System.out.println("dlco_nm_1 = [" + getDlco_nm_1() + "]");
		System.out.println("use_qunt_1_1 = [" + getUse_qunt_1_1() + "]");
		System.out.println("use_qunt_2_1 = [" + getUse_qunt_2_1() + "]");
		System.out.println("seq_2 = [" + getSeq_2() + "]");
		System.out.println("matr_cd_2 = [" + getMatr_cd_2() + "]");
		System.out.println("dlco_cd_2 = [" + getDlco_cd_2() + "]");
		System.out.println("dlco_nm_2 = [" + getDlco_nm_2() + "]");
		System.out.println("use_qunt_1_2 = [" + getUse_qunt_1_2() + "]");
		System.out.println("use_qunt_2_2 = [" + getUse_qunt_2_2() + "]");
		System.out.println("seq_3 = [" + getSeq_3() + "]");
		System.out.println("matr_cd_3 = [" + getMatr_cd_3() + "]");
		System.out.println("dlco_cd_3 = [" + getDlco_cd_3() + "]");
		System.out.println("dlco_nm_3 = [" + getDlco_nm_3() + "]");
		System.out.println("use_qunt_1_3 = [" + getUse_qunt_1_3() + "]");
		System.out.println("seq_4 = [" + getSeq_4() + "]");
		System.out.println("matr_cd_4 = [" + getMatr_cd_4() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("use_qunt_1_4 = [" + getUse_qunt_1_4() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String seq_1 = req.getParameter("seq_1");
if( seq_1 == null){
	System.out.println(this.toString+" : seq_1 is null" );
}else{
	System.out.println(this.toString+" : seq_1 is "+seq_1 );
}
String matr_cd_1 = req.getParameter("matr_cd_1");
if( matr_cd_1 == null){
	System.out.println(this.toString+" : matr_cd_1 is null" );
}else{
	System.out.println(this.toString+" : matr_cd_1 is "+matr_cd_1 );
}
String vip_matr_clsf = req.getParameter("vip_matr_clsf");
if( vip_matr_clsf == null){
	System.out.println(this.toString+" : vip_matr_clsf is null" );
}else{
	System.out.println(this.toString+" : vip_matr_clsf is "+vip_matr_clsf );
}
String dlco_cd_1 = req.getParameter("dlco_cd_1");
if( dlco_cd_1 == null){
	System.out.println(this.toString+" : dlco_cd_1 is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_1 is "+dlco_cd_1 );
}
String dlco_nm_1 = req.getParameter("dlco_nm_1");
if( dlco_nm_1 == null){
	System.out.println(this.toString+" : dlco_nm_1 is null" );
}else{
	System.out.println(this.toString+" : dlco_nm_1 is "+dlco_nm_1 );
}
String use_qunt_1_1 = req.getParameter("use_qunt_1_1");
if( use_qunt_1_1 == null){
	System.out.println(this.toString+" : use_qunt_1_1 is null" );
}else{
	System.out.println(this.toString+" : use_qunt_1_1 is "+use_qunt_1_1 );
}
String use_qunt_2_1 = req.getParameter("use_qunt_2_1");
if( use_qunt_2_1 == null){
	System.out.println(this.toString+" : use_qunt_2_1 is null" );
}else{
	System.out.println(this.toString+" : use_qunt_2_1 is "+use_qunt_2_1 );
}
String seq_2 = req.getParameter("seq_2");
if( seq_2 == null){
	System.out.println(this.toString+" : seq_2 is null" );
}else{
	System.out.println(this.toString+" : seq_2 is "+seq_2 );
}
String matr_cd_2 = req.getParameter("matr_cd_2");
if( matr_cd_2 == null){
	System.out.println(this.toString+" : matr_cd_2 is null" );
}else{
	System.out.println(this.toString+" : matr_cd_2 is "+matr_cd_2 );
}
String dlco_cd_2 = req.getParameter("dlco_cd_2");
if( dlco_cd_2 == null){
	System.out.println(this.toString+" : dlco_cd_2 is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_2 is "+dlco_cd_2 );
}
String dlco_nm_2 = req.getParameter("dlco_nm_2");
if( dlco_nm_2 == null){
	System.out.println(this.toString+" : dlco_nm_2 is null" );
}else{
	System.out.println(this.toString+" : dlco_nm_2 is "+dlco_nm_2 );
}
String use_qunt_1_2 = req.getParameter("use_qunt_1_2");
if( use_qunt_1_2 == null){
	System.out.println(this.toString+" : use_qunt_1_2 is null" );
}else{
	System.out.println(this.toString+" : use_qunt_1_2 is "+use_qunt_1_2 );
}
String use_qunt_2_2 = req.getParameter("use_qunt_2_2");
if( use_qunt_2_2 == null){
	System.out.println(this.toString+" : use_qunt_2_2 is null" );
}else{
	System.out.println(this.toString+" : use_qunt_2_2 is "+use_qunt_2_2 );
}
String seq_3 = req.getParameter("seq_3");
if( seq_3 == null){
	System.out.println(this.toString+" : seq_3 is null" );
}else{
	System.out.println(this.toString+" : seq_3 is "+seq_3 );
}
String matr_cd_3 = req.getParameter("matr_cd_3");
if( matr_cd_3 == null){
	System.out.println(this.toString+" : matr_cd_3 is null" );
}else{
	System.out.println(this.toString+" : matr_cd_3 is "+matr_cd_3 );
}
String dlco_cd_3 = req.getParameter("dlco_cd_3");
if( dlco_cd_3 == null){
	System.out.println(this.toString+" : dlco_cd_3 is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_3 is "+dlco_cd_3 );
}
String dlco_nm_3 = req.getParameter("dlco_nm_3");
if( dlco_nm_3 == null){
	System.out.println(this.toString+" : dlco_nm_3 is null" );
}else{
	System.out.println(this.toString+" : dlco_nm_3 is "+dlco_nm_3 );
}
String use_qunt_1_3 = req.getParameter("use_qunt_1_3");
if( use_qunt_1_3 == null){
	System.out.println(this.toString+" : use_qunt_1_3 is null" );
}else{
	System.out.println(this.toString+" : use_qunt_1_3 is "+use_qunt_1_3 );
}
String seq_4 = req.getParameter("seq_4");
if( seq_4 == null){
	System.out.println(this.toString+" : seq_4 is null" );
}else{
	System.out.println(this.toString+" : seq_4 is "+seq_4 );
}
String matr_cd_4 = req.getParameter("matr_cd_4");
if( matr_cd_4 == null){
	System.out.println(this.toString+" : matr_cd_4 is null" );
}else{
	System.out.println(this.toString+" : matr_cd_4 is "+matr_cd_4 );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String use_qunt_1_4 = req.getParameter("use_qunt_1_4");
if( use_qunt_1_4 == null){
	System.out.println(this.toString+" : use_qunt_1_4 is null" );
}else{
	System.out.println(this.toString+" : use_qunt_1_4 is "+use_qunt_1_4 );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String seq_1 = Util.checkString(req.getParameter("seq_1"));
String matr_cd_1 = Util.checkString(req.getParameter("matr_cd_1"));
String vip_matr_clsf = Util.checkString(req.getParameter("vip_matr_clsf"));
String dlco_cd_1 = Util.checkString(req.getParameter("dlco_cd_1"));
String dlco_nm_1 = Util.checkString(req.getParameter("dlco_nm_1"));
String use_qunt_1_1 = Util.checkString(req.getParameter("use_qunt_1_1"));
String use_qunt_2_1 = Util.checkString(req.getParameter("use_qunt_2_1"));
String seq_2 = Util.checkString(req.getParameter("seq_2"));
String matr_cd_2 = Util.checkString(req.getParameter("matr_cd_2"));
String dlco_cd_2 = Util.checkString(req.getParameter("dlco_cd_2"));
String dlco_nm_2 = Util.checkString(req.getParameter("dlco_nm_2"));
String use_qunt_1_2 = Util.checkString(req.getParameter("use_qunt_1_2"));
String use_qunt_2_2 = Util.checkString(req.getParameter("use_qunt_2_2"));
String seq_3 = Util.checkString(req.getParameter("seq_3"));
String matr_cd_3 = Util.checkString(req.getParameter("matr_cd_3"));
String dlco_cd_3 = Util.checkString(req.getParameter("dlco_cd_3"));
String dlco_nm_3 = Util.checkString(req.getParameter("dlco_nm_3"));
String use_qunt_1_3 = Util.checkString(req.getParameter("use_qunt_1_3"));
String seq_4 = Util.checkString(req.getParameter("seq_4"));
String matr_cd_4 = Util.checkString(req.getParameter("matr_cd_4"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String use_qunt_1_4 = Util.checkString(req.getParameter("use_qunt_1_4"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String seq_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_1")));
String matr_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_1")));
String vip_matr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vip_matr_clsf")));
String dlco_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_1")));
String dlco_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm_1")));
String use_qunt_1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt_1_1")));
String use_qunt_2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt_2_1")));
String seq_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_2")));
String matr_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_2")));
String dlco_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_2")));
String dlco_nm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm_2")));
String use_qunt_1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt_1_2")));
String use_qunt_2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt_2_2")));
String seq_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_3")));
String matr_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_3")));
String dlco_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_3")));
String dlco_nm_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm_3")));
String use_qunt_1_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt_1_3")));
String seq_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_4")));
String matr_cd_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_4")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String use_qunt_1_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("use_qunt_1_4")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setDuty_dt(duty_dt);
dm.setSeq_1(seq_1);
dm.setMatr_cd_1(matr_cd_1);
dm.setVip_matr_clsf(vip_matr_clsf);
dm.setDlco_cd_1(dlco_cd_1);
dm.setDlco_nm_1(dlco_nm_1);
dm.setUse_qunt_1_1(use_qunt_1_1);
dm.setUse_qunt_2_1(use_qunt_2_1);
dm.setSeq_2(seq_2);
dm.setMatr_cd_2(matr_cd_2);
dm.setDlco_cd_2(dlco_cd_2);
dm.setDlco_nm_2(dlco_nm_2);
dm.setUse_qunt_1_2(use_qunt_1_2);
dm.setUse_qunt_2_2(use_qunt_2_2);
dm.setSeq_3(seq_3);
dm.setMatr_cd_3(matr_cd_3);
dm.setDlco_cd_3(dlco_cd_3);
dm.setDlco_nm_3(dlco_nm_3);
dm.setUse_qunt_1_3(use_qunt_1_3);
dm.setSeq_4(seq_4);
dm.setMatr_cd_4(matr_cd_4);
dm.setMedi_cd(medi_cd);
dm.setUse_qunt_1_4(use_qunt_1_4);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 18 13:05:50 KST 2009 */