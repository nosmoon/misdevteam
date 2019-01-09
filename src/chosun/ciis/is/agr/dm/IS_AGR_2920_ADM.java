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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String make_ask_reg_dt;
	public String make_ask_reg_seq;
	public String prz_amt;
	public String prz_phb_saly_boks;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_AGR_2920_ADM(){}
	public IS_AGR_2920_ADM(String cmpy_cd, String mode, String make_ask_reg_dt, String make_ask_reg_seq, String prz_amt, String prz_phb_saly_boks, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.make_ask_reg_dt = make_ask_reg_dt;
		this.make_ask_reg_seq = make_ask_reg_seq;
		this.prz_amt = prz_amt;
		this.prz_phb_saly_boks = prz_phb_saly_boks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMake_ask_reg_dt(String make_ask_reg_dt){
		this.make_ask_reg_dt = make_ask_reg_dt;
	}

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setPrz_phb_saly_boks(String prz_phb_saly_boks){
		this.prz_phb_saly_boks = prz_phb_saly_boks;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMake_ask_reg_dt(){
		return this.make_ask_reg_dt;
	}

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getPrz_phb_saly_boks(){
		return this.prz_phb_saly_boks;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_2920_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_2920_ADM dm = (IS_AGR_2920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.make_ask_reg_dt);
		cstmt.setString(6, dm.make_ask_reg_seq);
		cstmt.setString(7, dm.prz_amt);
		cstmt.setString(8, dm.prz_phb_saly_boks);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_2920_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("make_ask_reg_dt = [" + getMake_ask_reg_dt() + "]");
		System.out.println("make_ask_reg_seq = [" + getMake_ask_reg_seq() + "]");
		System.out.println("prz_amt = [" + getPrz_amt() + "]");
		System.out.println("prz_phb_saly_boks = [" + getPrz_phb_saly_boks() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String make_ask_reg_dt = req.getParameter("make_ask_reg_dt");
if( make_ask_reg_dt == null){
	System.out.println(this.toString+" : make_ask_reg_dt is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_dt is "+make_ask_reg_dt );
}
String make_ask_reg_seq = req.getParameter("make_ask_reg_seq");
if( make_ask_reg_seq == null){
	System.out.println(this.toString+" : make_ask_reg_seq is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_seq is "+make_ask_reg_seq );
}
String prz_amt = req.getParameter("prz_amt");
if( prz_amt == null){
	System.out.println(this.toString+" : prz_amt is null" );
}else{
	System.out.println(this.toString+" : prz_amt is "+prz_amt );
}
String prz_phb_saly_boks = req.getParameter("prz_phb_saly_boks");
if( prz_phb_saly_boks == null){
	System.out.println(this.toString+" : prz_phb_saly_boks is null" );
}else{
	System.out.println(this.toString+" : prz_phb_saly_boks is "+prz_phb_saly_boks );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
String make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
String prz_amt = Util.checkString(req.getParameter("prz_amt"));
String prz_phb_saly_boks = Util.checkString(req.getParameter("prz_phb_saly_boks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String make_ask_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_dt")));
String make_ask_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_seq")));
String prz_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_amt")));
String prz_phb_saly_boks = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_phb_saly_boks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setMake_ask_reg_dt(make_ask_reg_dt);
dm.setMake_ask_reg_seq(make_ask_reg_seq);
dm.setPrz_amt(prz_amt);
dm.setPrz_phb_saly_boks(prz_phb_saly_boks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 10:29:25 KST 2012 */