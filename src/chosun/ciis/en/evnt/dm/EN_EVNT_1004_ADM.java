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


package chosun.ciis.en.evnt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.evnt.ds.*;
import chosun.ciis.en.evnt.rec.*;

/**
 * 
 */


public class EN_EVNT_1004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String evnt_nm;
	public String evnt_type;
	public String regu_non_regu_clsf;
	public String spons_clsf;
	public String entr_cost;
	public String charg_entr_nops;
	public String free_entr_nops;
	public String grp_entr_nops;
	public String grp_entr_team_cnt;
	public String evnt_dds;
	public String evnt_frdt;
	public String evnt_todt;
	public String plac_1;
	public String plac_2;
	public String plac_3;
	public String dept_cd;
	public String chrg_pers_emp_no;
	public String vat_incd_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String chg_pers;

	public EN_EVNT_1004_ADM(){}
	public EN_EVNT_1004_ADM(String mode, String cmpy_cd, String evnt_yy, String evnt_cd, String evnt_seq, String evnt_nm, String evnt_type, String regu_non_regu_clsf, String spons_clsf, String entr_cost, String charg_entr_nops, String free_entr_nops, String grp_entr_nops, String grp_entr_team_cnt, String evnt_dds, String evnt_frdt, String evnt_todt, String plac_1, String plac_2, String plac_3, String dept_cd, String chrg_pers_emp_no, String vat_incd_yn, String incmg_pers_ip, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
		this.evnt_nm = evnt_nm;
		this.evnt_type = evnt_type;
		this.regu_non_regu_clsf = regu_non_regu_clsf;
		this.spons_clsf = spons_clsf;
		this.entr_cost = entr_cost;
		this.charg_entr_nops = charg_entr_nops;
		this.free_entr_nops = free_entr_nops;
		this.grp_entr_nops = grp_entr_nops;
		this.grp_entr_team_cnt = grp_entr_team_cnt;
		this.evnt_dds = evnt_dds;
		this.evnt_frdt = evnt_frdt;
		this.evnt_todt = evnt_todt;
		this.plac_1 = plac_1;
		this.plac_2 = plac_2;
		this.plac_3 = plac_3;
		this.dept_cd = dept_cd;
		this.chrg_pers_emp_no = chrg_pers_emp_no;
		this.vat_incd_yn = vat_incd_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setEvnt_type(String evnt_type){
		this.evnt_type = evnt_type;
	}

	public void setRegu_non_regu_clsf(String regu_non_regu_clsf){
		this.regu_non_regu_clsf = regu_non_regu_clsf;
	}

	public void setSpons_clsf(String spons_clsf){
		this.spons_clsf = spons_clsf;
	}

	public void setEntr_cost(String entr_cost){
		this.entr_cost = entr_cost;
	}

	public void setCharg_entr_nops(String charg_entr_nops){
		this.charg_entr_nops = charg_entr_nops;
	}

	public void setFree_entr_nops(String free_entr_nops){
		this.free_entr_nops = free_entr_nops;
	}

	public void setGrp_entr_nops(String grp_entr_nops){
		this.grp_entr_nops = grp_entr_nops;
	}

	public void setGrp_entr_team_cnt(String grp_entr_team_cnt){
		this.grp_entr_team_cnt = grp_entr_team_cnt;
	}

	public void setEvnt_dds(String evnt_dds){
		this.evnt_dds = evnt_dds;
	}

	public void setEvnt_frdt(String evnt_frdt){
		this.evnt_frdt = evnt_frdt;
	}

	public void setEvnt_todt(String evnt_todt){
		this.evnt_todt = evnt_todt;
	}

	public void setPlac_1(String plac_1){
		this.plac_1 = plac_1;
	}

	public void setPlac_2(String plac_2){
		this.plac_2 = plac_2;
	}

	public void setPlac_3(String plac_3){
		this.plac_3 = plac_3;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setVat_incd_yn(String vat_incd_yn){
		this.vat_incd_yn = vat_incd_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getEvnt_type(){
		return this.evnt_type;
	}

	public String getRegu_non_regu_clsf(){
		return this.regu_non_regu_clsf;
	}

	public String getSpons_clsf(){
		return this.spons_clsf;
	}

	public String getEntr_cost(){
		return this.entr_cost;
	}

	public String getCharg_entr_nops(){
		return this.charg_entr_nops;
	}

	public String getFree_entr_nops(){
		return this.free_entr_nops;
	}

	public String getGrp_entr_nops(){
		return this.grp_entr_nops;
	}

	public String getGrp_entr_team_cnt(){
		return this.grp_entr_team_cnt;
	}

	public String getEvnt_dds(){
		return this.evnt_dds;
	}

	public String getEvnt_frdt(){
		return this.evnt_frdt;
	}

	public String getEvnt_todt(){
		return this.evnt_todt;
	}

	public String getPlac_1(){
		return this.plac_1;
	}

	public String getPlac_2(){
		return this.plac_2;
	}

	public String getPlac_3(){
		return this.plac_3;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getVat_incd_yn(){
		return this.vat_incd_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_EVNT_1004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_EVNT_1004_ADM dm = (EN_EVNT_1004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.evnt_yy);
		cstmt.setString(6, dm.evnt_cd);
		cstmt.setString(7, dm.evnt_seq);
		cstmt.setString(8, dm.evnt_nm);
		cstmt.setString(9, dm.evnt_type);
		cstmt.setString(10, dm.regu_non_regu_clsf);
		cstmt.setString(11, dm.spons_clsf);
		cstmt.setString(12, dm.entr_cost);
		cstmt.setString(13, dm.charg_entr_nops);
		cstmt.setString(14, dm.free_entr_nops);
		cstmt.setString(15, dm.grp_entr_nops);
		cstmt.setString(16, dm.grp_entr_team_cnt);
		cstmt.setString(17, dm.evnt_dds);
		cstmt.setString(18, dm.evnt_frdt);
		cstmt.setString(19, dm.evnt_todt);
		cstmt.setString(20, dm.plac_1);
		cstmt.setString(21, dm.plac_2);
		cstmt.setString(22, dm.plac_3);
		cstmt.setString(23, dm.dept_cd);
		cstmt.setString(24, dm.chrg_pers_emp_no);
		cstmt.setString(25, dm.vat_incd_yn);
		cstmt.setString(26, dm.incmg_pers_ip);
		cstmt.setString(27, dm.incmg_pers);
		cstmt.setString(28, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.evnt.ds.EN_EVNT_1004_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_seq = " + getEvnt_seq());
        System.out.println("evnt_nm = " + getEvnt_nm());
        System.out.println("evnt_type = " + getEvnt_type());
        System.out.println("regu_non_regu_clsf = " + getRegu_non_regu_clsf());
        System.out.println("spons_clsf = " + getSpons_clsf());
        System.out.println("entr_cost = " + getEntr_cost());
        System.out.println("charg_entr_nops = " + getCharg_entr_nops());
        System.out.println("free_entr_nops = " + getFree_entr_nops());
        System.out.println("grp_entr_nops = " + getGrp_entr_nops());
        System.out.println("grp_entr_team_cnt = " + getGrp_entr_team_cnt());
        System.out.println("evnt_dds = " + getEvnt_dds());
        System.out.println("evnt_frdt = " + getEvnt_frdt());
        System.out.println("evnt_todt = " + getEvnt_todt());
        System.out.println("plac_1 = " + getPlac_1());
        System.out.println("plac_2 = " + getPlac_2());
        System.out.println("plac_3 = " + getPlac_3());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("chrg_pers_emp_no = " + getChrg_pers_emp_no());
        System.out.println("vat_incd_yn = " + getVat_incd_yn());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
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
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String evnt_nm = req.getParameter("evnt_nm");
if( evnt_nm == null){
	System.out.println(this.toString+" : evnt_nm is null" );
}else{
	System.out.println(this.toString+" : evnt_nm is "+evnt_nm );
}
String evnt_type = req.getParameter("evnt_type");
if( evnt_type == null){
	System.out.println(this.toString+" : evnt_type is null" );
}else{
	System.out.println(this.toString+" : evnt_type is "+evnt_type );
}
String regu_non_regu_clsf = req.getParameter("regu_non_regu_clsf");
if( regu_non_regu_clsf == null){
	System.out.println(this.toString+" : regu_non_regu_clsf is null" );
}else{
	System.out.println(this.toString+" : regu_non_regu_clsf is "+regu_non_regu_clsf );
}
String spons_clsf = req.getParameter("spons_clsf");
if( spons_clsf == null){
	System.out.println(this.toString+" : spons_clsf is null" );
}else{
	System.out.println(this.toString+" : spons_clsf is "+spons_clsf );
}
String entr_cost = req.getParameter("entr_cost");
if( entr_cost == null){
	System.out.println(this.toString+" : entr_cost is null" );
}else{
	System.out.println(this.toString+" : entr_cost is "+entr_cost );
}
String charg_entr_nops = req.getParameter("charg_entr_nops");
if( charg_entr_nops == null){
	System.out.println(this.toString+" : charg_entr_nops is null" );
}else{
	System.out.println(this.toString+" : charg_entr_nops is "+charg_entr_nops );
}
String free_entr_nops = req.getParameter("free_entr_nops");
if( free_entr_nops == null){
	System.out.println(this.toString+" : free_entr_nops is null" );
}else{
	System.out.println(this.toString+" : free_entr_nops is "+free_entr_nops );
}
String grp_entr_nops = req.getParameter("grp_entr_nops");
if( grp_entr_nops == null){
	System.out.println(this.toString+" : grp_entr_nops is null" );
}else{
	System.out.println(this.toString+" : grp_entr_nops is "+grp_entr_nops );
}
String grp_entr_team_cnt = req.getParameter("grp_entr_team_cnt");
if( grp_entr_team_cnt == null){
	System.out.println(this.toString+" : grp_entr_team_cnt is null" );
}else{
	System.out.println(this.toString+" : grp_entr_team_cnt is "+grp_entr_team_cnt );
}
String evnt_dds = req.getParameter("evnt_dds");
if( evnt_dds == null){
	System.out.println(this.toString+" : evnt_dds is null" );
}else{
	System.out.println(this.toString+" : evnt_dds is "+evnt_dds );
}
String evnt_frdt = req.getParameter("evnt_frdt");
if( evnt_frdt == null){
	System.out.println(this.toString+" : evnt_frdt is null" );
}else{
	System.out.println(this.toString+" : evnt_frdt is "+evnt_frdt );
}
String evnt_todt = req.getParameter("evnt_todt");
if( evnt_todt == null){
	System.out.println(this.toString+" : evnt_todt is null" );
}else{
	System.out.println(this.toString+" : evnt_todt is "+evnt_todt );
}
String plac_1 = req.getParameter("plac_1");
if( plac_1 == null){
	System.out.println(this.toString+" : plac_1 is null" );
}else{
	System.out.println(this.toString+" : plac_1 is "+plac_1 );
}
String plac_2 = req.getParameter("plac_2");
if( plac_2 == null){
	System.out.println(this.toString+" : plac_2 is null" );
}else{
	System.out.println(this.toString+" : plac_2 is "+plac_2 );
}
String plac_3 = req.getParameter("plac_3");
if( plac_3 == null){
	System.out.println(this.toString+" : plac_3 is null" );
}else{
	System.out.println(this.toString+" : plac_3 is "+plac_3 );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String chrg_pers_emp_no = req.getParameter("chrg_pers_emp_no");
if( chrg_pers_emp_no == null){
	System.out.println(this.toString+" : chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_emp_no is "+chrg_pers_emp_no );
}
String vat_incd_yn = req.getParameter("vat_incd_yn");
if( vat_incd_yn == null){
	System.out.println(this.toString+" : vat_incd_yn is null" );
}else{
	System.out.println(this.toString+" : vat_incd_yn is "+vat_incd_yn );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
String evnt_type = Util.checkString(req.getParameter("evnt_type"));
String regu_non_regu_clsf = Util.checkString(req.getParameter("regu_non_regu_clsf"));
String spons_clsf = Util.checkString(req.getParameter("spons_clsf"));
String entr_cost = Util.checkString(req.getParameter("entr_cost"));
String charg_entr_nops = Util.checkString(req.getParameter("charg_entr_nops"));
String free_entr_nops = Util.checkString(req.getParameter("free_entr_nops"));
String grp_entr_nops = Util.checkString(req.getParameter("grp_entr_nops"));
String grp_entr_team_cnt = Util.checkString(req.getParameter("grp_entr_team_cnt"));
String evnt_dds = Util.checkString(req.getParameter("evnt_dds"));
String evnt_frdt = Util.checkString(req.getParameter("evnt_frdt"));
String evnt_todt = Util.checkString(req.getParameter("evnt_todt"));
String plac_1 = Util.checkString(req.getParameter("plac_1"));
String plac_2 = Util.checkString(req.getParameter("plac_2"));
String plac_3 = Util.checkString(req.getParameter("plac_3"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
String vat_incd_yn = Util.checkString(req.getParameter("vat_incd_yn"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
String evnt_type = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_type")));
String regu_non_regu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("regu_non_regu_clsf")));
String spons_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spons_clsf")));
String entr_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_cost")));
String charg_entr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("charg_entr_nops")));
String free_entr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("free_entr_nops")));
String grp_entr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_entr_nops")));
String grp_entr_team_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_entr_team_cnt")));
String evnt_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_dds")));
String evnt_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_frdt")));
String evnt_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_todt")));
String plac_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("plac_1")));
String plac_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("plac_2")));
String plac_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("plac_3")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_emp_no")));
String vat_incd_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_incd_yn")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
dm.setEvnt_nm(evnt_nm);
dm.setEvnt_type(evnt_type);
dm.setRegu_non_regu_clsf(regu_non_regu_clsf);
dm.setSpons_clsf(spons_clsf);
dm.setEntr_cost(entr_cost);
dm.setCharg_entr_nops(charg_entr_nops);
dm.setFree_entr_nops(free_entr_nops);
dm.setGrp_entr_nops(grp_entr_nops);
dm.setGrp_entr_team_cnt(grp_entr_team_cnt);
dm.setEvnt_dds(evnt_dds);
dm.setEvnt_frdt(evnt_frdt);
dm.setEvnt_todt(evnt_todt);
dm.setPlac_1(plac_1);
dm.setPlac_2(plac_2);
dm.setPlac_3(plac_3);
dm.setDept_cd(dept_cd);
dm.setChrg_pers_emp_no(chrg_pers_emp_no);
dm.setVat_incd_yn(vat_incd_yn);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 10 09:17:02 KST 2009 */