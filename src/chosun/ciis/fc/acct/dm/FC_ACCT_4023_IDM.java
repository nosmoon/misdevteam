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


public class FC_ACCT_4023_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String extnc_acct_cd;
	public String setoff_reserv_exne;
	public String setoff_reserv_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_4023_IDM(){}
	public FC_ACCT_4023_IDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String slip_arow_no, String extnc_acct_cd, String setoff_reserv_exne, String setoff_reserv_dt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.slip_arow_no = slip_arow_no;
		this.extnc_acct_cd = extnc_acct_cd;
		this.setoff_reserv_exne = setoff_reserv_exne;
		this.setoff_reserv_dt = setoff_reserv_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setExtnc_acct_cd(String extnc_acct_cd){
		this.extnc_acct_cd = extnc_acct_cd;
	}

	public void setSetoff_reserv_exne(String setoff_reserv_exne){
		this.setoff_reserv_exne = setoff_reserv_exne;
	}

	public void setSetoff_reserv_dt(String setoff_reserv_dt){
		this.setoff_reserv_dt = setoff_reserv_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getExtnc_acct_cd(){
		return this.extnc_acct_cd;
	}

	public String getSetoff_reserv_exne(){
		return this.setoff_reserv_exne;
	}

	public String getSetoff_reserv_dt(){
		return this.setoff_reserv_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_4023_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_4023_IDM dm = (FC_ACCT_4023_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.slip_sub_seq);
		cstmt.setString(8, dm.slip_arow_no);
		cstmt.setString(9, dm.extnc_acct_cd);
		cstmt.setString(10, dm.setoff_reserv_exne);
		cstmt.setString(11, dm.setoff_reserv_dt);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_4023_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
		System.out.println("extnc_acct_cd = [" + getExtnc_acct_cd() + "]");
		System.out.println("setoff_reserv_exne = [" + getSetoff_reserv_exne() + "]");
		System.out.println("setoff_reserv_dt = [" + getSetoff_reserv_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
}
String extnc_acct_cd = req.getParameter("extnc_acct_cd");
if( extnc_acct_cd == null){
	System.out.println(this.toString+" : extnc_acct_cd is null" );
}else{
	System.out.println(this.toString+" : extnc_acct_cd is "+extnc_acct_cd );
}
String setoff_reserv_exne = req.getParameter("setoff_reserv_exne");
if( setoff_reserv_exne == null){
	System.out.println(this.toString+" : setoff_reserv_exne is null" );
}else{
	System.out.println(this.toString+" : setoff_reserv_exne is "+setoff_reserv_exne );
}
String setoff_reserv_dt = req.getParameter("setoff_reserv_dt");
if( setoff_reserv_dt == null){
	System.out.println(this.toString+" : setoff_reserv_dt is null" );
}else{
	System.out.println(this.toString+" : setoff_reserv_dt is "+setoff_reserv_dt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));
String setoff_reserv_exne = Util.checkString(req.getParameter("setoff_reserv_exne"));
String setoff_reserv_dt = Util.checkString(req.getParameter("setoff_reserv_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String extnc_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_acct_cd")));
String setoff_reserv_exne = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_reserv_exne")));
String setoff_reserv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_reserv_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setSlip_arow_no(slip_arow_no);
dm.setExtnc_acct_cd(extnc_acct_cd);
dm.setSetoff_reserv_exne(setoff_reserv_exne);
dm.setSetoff_reserv_dt(setoff_reserv_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 10:10:36 KST 2009 */