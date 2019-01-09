/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String prof_type_cd;
	public String new_medi_cd;
	public String new_proc_dt;
	public String new_proc_seq;
	public String del_medi_cd;
	public String del_proc_dt;
	public String del_proc_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_TAX_1220_ADM(){}
	public AD_TAX_1220_ADM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String prof_type_cd, String new_medi_cd, String new_proc_dt, String new_proc_seq, String del_medi_cd, String del_proc_dt, String del_proc_seq, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.prof_type_cd = prof_type_cd;
		this.new_medi_cd = new_medi_cd;
		this.new_proc_dt = new_proc_dt;
		this.new_proc_seq = new_proc_seq;
		this.del_medi_cd = del_medi_cd;
		this.del_proc_dt = del_proc_dt;
		this.del_proc_seq = del_proc_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setNew_medi_cd(String new_medi_cd){
		this.new_medi_cd = new_medi_cd;
	}

	public void setNew_proc_dt(String new_proc_dt){
		this.new_proc_dt = new_proc_dt;
	}

	public void setNew_proc_seq(String new_proc_seq){
		this.new_proc_seq = new_proc_seq;
	}

	public void setDel_medi_cd(String del_medi_cd){
		this.del_medi_cd = del_medi_cd;
	}

	public void setDel_proc_dt(String del_proc_dt){
		this.del_proc_dt = del_proc_dt;
	}

	public void setDel_proc_seq(String del_proc_seq){
		this.del_proc_seq = del_proc_seq;
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

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getNew_medi_cd(){
		return this.new_medi_cd;
	}

	public String getNew_proc_dt(){
		return this.new_proc_dt;
	}

	public String getNew_proc_seq(){
		return this.new_proc_seq;
	}

	public String getDel_medi_cd(){
		return this.del_medi_cd;
	}

	public String getDel_proc_dt(){
		return this.del_proc_dt;
	}

	public String getDel_proc_seq(){
		return this.del_proc_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_TAX_1220_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1220_ADM dm = (AD_TAX_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.prof_type_cd);
		cstmt.setString(8, dm.new_medi_cd);
		cstmt.setString(9, dm.new_proc_dt);
		cstmt.setString(10, dm.new_proc_seq);
		cstmt.setString(11, dm.del_medi_cd);
		cstmt.setString(12, dm.del_proc_dt);
		cstmt.setString(13, dm.del_proc_seq);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1220_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_seq = " + getSlip_seq());
        System.out.println("prof_type_cd = " + getProf_type_cd());
        System.out.println("new_medi_cd = " + getNew_medi_cd());
        System.out.println("new_proc_dt = " + getNew_proc_dt());
        System.out.println("new_proc_seq = " + getNew_proc_seq());
        System.out.println("del_medi_cd = " + getDel_medi_cd());
        System.out.println("del_proc_dt = " + getDel_proc_dt());
        System.out.println("del_proc_seq = " + getDel_proc_seq());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String new_medi_cd = req.getParameter("new_medi_cd");
if( new_medi_cd == null){
	System.out.println(this.toString+" : new_medi_cd is null" );
}else{
	System.out.println(this.toString+" : new_medi_cd is "+new_medi_cd );
}
String new_proc_dt = req.getParameter("new_proc_dt");
if( new_proc_dt == null){
	System.out.println(this.toString+" : new_proc_dt is null" );
}else{
	System.out.println(this.toString+" : new_proc_dt is "+new_proc_dt );
}
String new_proc_seq = req.getParameter("new_proc_seq");
if( new_proc_seq == null){
	System.out.println(this.toString+" : new_proc_seq is null" );
}else{
	System.out.println(this.toString+" : new_proc_seq is "+new_proc_seq );
}
String del_medi_cd = req.getParameter("del_medi_cd");
if( del_medi_cd == null){
	System.out.println(this.toString+" : del_medi_cd is null" );
}else{
	System.out.println(this.toString+" : del_medi_cd is "+del_medi_cd );
}
String del_proc_dt = req.getParameter("del_proc_dt");
if( del_proc_dt == null){
	System.out.println(this.toString+" : del_proc_dt is null" );
}else{
	System.out.println(this.toString+" : del_proc_dt is "+del_proc_dt );
}
String del_proc_seq = req.getParameter("del_proc_seq");
if( del_proc_seq == null){
	System.out.println(this.toString+" : del_proc_seq is null" );
}else{
	System.out.println(this.toString+" : del_proc_seq is "+del_proc_seq );
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
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String new_medi_cd = Util.checkString(req.getParameter("new_medi_cd"));
String new_proc_dt = Util.checkString(req.getParameter("new_proc_dt"));
String new_proc_seq = Util.checkString(req.getParameter("new_proc_seq"));
String del_medi_cd = Util.checkString(req.getParameter("del_medi_cd"));
String del_proc_dt = Util.checkString(req.getParameter("del_proc_dt"));
String del_proc_seq = Util.checkString(req.getParameter("del_proc_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String new_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("new_medi_cd")));
String new_proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_proc_dt")));
String new_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("new_proc_seq")));
String del_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("del_medi_cd")));
String del_proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("del_proc_dt")));
String del_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("del_proc_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setProf_type_cd(prof_type_cd);
dm.setNew_medi_cd(new_medi_cd);
dm.setNew_proc_dt(new_proc_dt);
dm.setNew_proc_seq(new_proc_seq);
dm.setDel_medi_cd(del_medi_cd);
dm.setDel_proc_dt(del_proc_dt);
dm.setDel_proc_seq(del_proc_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 19:54:30 KST 2009 */