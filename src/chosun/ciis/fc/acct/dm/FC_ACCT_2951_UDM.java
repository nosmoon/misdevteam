/***************************************************************************************************
* 파일명 : FC_ACCT_2901_L.java
* 기능 :   
* 작성일자 : 
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :   
* 수정일자 : 
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */

public class FC_ACCT_2951_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt_in;
	public String slip_clsf_cd_in;
	public String incmg_emp_no;
	public String incmg_pers_ipadd;
	public String fisc_dt;
	public String ptcr;
	public String chrg_emp_no;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String vexc_cmpy_cd;
	public String vexc_cmpy_nm;
	public String acct_no;
	public String medi_cd;

	public FC_ACCT_2951_UDM(){}
	public FC_ACCT_2951_UDM(String cmpy_cd, String slip_occr_dt_in, String slip_clsf_cd_in, String incmg_emp_no, String incmg_pers_ipadd, String fisc_dt, String ptcr, String chrg_emp_no, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String vexc_cmpy_cd, String vexc_cmpy_nm, String acct_no, String medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt_in = slip_occr_dt_in;
		this.slip_clsf_cd_in = slip_clsf_cd_in;
		this.incmg_emp_no = incmg_emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.fisc_dt = fisc_dt;
		this.ptcr = ptcr;
		this.chrg_emp_no = chrg_emp_no;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.vexc_cmpy_cd = vexc_cmpy_cd;
		this.vexc_cmpy_nm = vexc_cmpy_nm;
		this.acct_no = acct_no;
		this.medi_cd = medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt_in(String slip_occr_dt_in){
		this.slip_occr_dt_in = slip_occr_dt_in;
	}

	public void setSlip_clsf_cd_in(String slip_clsf_cd_in){
		this.slip_clsf_cd_in = slip_clsf_cd_in;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setPtcr(String ptcr){
		this.ptcr = ptcr;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setVexc_cmpy_nm(String vexc_cmpy_nm){
		this.vexc_cmpy_nm = vexc_cmpy_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt_in(){
		return this.slip_occr_dt_in;
	}

	public String getSlip_clsf_cd_in(){
		return this.slip_clsf_cd_in;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getPtcr(){
		return this.ptcr;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getVexc_cmpy_nm(){
		return this.vexc_cmpy_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2951_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2951_UDM dm = (FC_ACCT_2951_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt_in);
		cstmt.setString(5, dm.slip_clsf_cd_in);
		cstmt.setString(6, dm.incmg_emp_no);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.fisc_dt);
		cstmt.setString(9, dm.ptcr);
		cstmt.setString(10, dm.chrg_emp_no);
		cstmt.setString(11, dm.prof_type_cd);
		cstmt.setString(12, dm.slip_clsf_cd);
		cstmt.setString(13, dm.slip_occr_dt);
		cstmt.setString(14, dm.slip_seq);
		cstmt.setString(15, dm.vexc_cmpy_cd);
		cstmt.setString(16, dm.vexc_cmpy_nm);
		cstmt.setString(17, dm.acct_no);
		cstmt.setString(18, dm.medi_cd);
		cstmt.registerOutParameter(19, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2951_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_occr_dt_in = " + getSlip_occr_dt_in());
        System.out.println("slip_clsf_cd_in = " + getSlip_clsf_cd_in());
        System.out.println("incmg_emp_no = " + getIncmg_emp_no());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("fisc_dt = " + getFisc_dt());
        System.out.println("ptcr = " + getPtcr());
        System.out.println("chrg_emp_no = " + getChrg_emp_no());
        System.out.println("prof_type_cd = " + getProf_type_cd());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_seq = " + getSlip_seq());
        System.out.println("vexc_cmpy_cd = " + getVexc_cmpy_cd());
        System.out.println("vexc_cmpy_nm = " + getVexc_cmpy_nm());
        System.out.println("acct_no = " + getAcct_no());
        System.out.println("medi_cd = " + getMedi_cd());
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
String slip_occr_dt_in = req.getParameter("slip_occr_dt_in");
if( slip_occr_dt_in == null){
	System.out.println(this.toString+" : slip_occr_dt_in is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_in is "+slip_occr_dt_in );
}
String slip_clsf_cd_in = req.getParameter("slip_clsf_cd_in");
if( slip_clsf_cd_in == null){
	System.out.println(this.toString+" : slip_clsf_cd_in is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd_in is "+slip_clsf_cd_in );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String ptcr = req.getParameter("ptcr");
if( ptcr == null){
	System.out.println(this.toString+" : ptcr is null" );
}else{
	System.out.println(this.toString+" : ptcr is "+ptcr );
}
String chrg_emp_no = req.getParameter("chrg_emp_no");
if( chrg_emp_no == null){
	System.out.println(this.toString+" : chrg_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_emp_no is "+chrg_emp_no );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String vexc_cmpy_cd = req.getParameter("vexc_cmpy_cd");
if( vexc_cmpy_cd == null){
	System.out.println(this.toString+" : vexc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_cd is "+vexc_cmpy_cd );
}
String vexc_cmpy_nm = req.getParameter("vexc_cmpy_nm");
if( vexc_cmpy_nm == null){
	System.out.println(this.toString+" : vexc_cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_nm is "+vexc_cmpy_nm );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt_in = Util.checkString(req.getParameter("slip_occr_dt_in"));
String slip_clsf_cd_in = Util.checkString(req.getParameter("slip_clsf_cd_in"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String ptcr = Util.checkString(req.getParameter("ptcr"));
String chrg_emp_no = Util.checkString(req.getParameter("chrg_emp_no"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
String vexc_cmpy_nm = Util.checkString(req.getParameter("vexc_cmpy_nm"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt_in = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_in")));
String slip_clsf_cd_in = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd_in")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("ptcr")));
String chrg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_emp_no")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String vexc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_cd")));
String vexc_cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_nm")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt_in(slip_occr_dt_in);
dm.setSlip_clsf_cd_in(slip_clsf_cd_in);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setFisc_dt(fisc_dt);
dm.setPtcr(ptcr);
dm.setChrg_emp_no(chrg_emp_no);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setVexc_cmpy_cd(vexc_cmpy_cd);
dm.setVexc_cmpy_nm(vexc_cmpy_nm);
dm.setAcct_no(acct_no);
dm.setMedi_cd(medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 20:12:21 KST 2009 */