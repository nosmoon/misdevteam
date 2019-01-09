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


public class FC_ACCT_4021_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_acct_cd1;
	public String occr_acct_cd2;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String slip_clsf_cd;
	public String extnc_acct_cd;
	public String fr_fisc_dt;
	public String to_fisc_dt;
	public String slip_occr_dt;
	public String slip_seq;
	public String slip_sub_seq;
	public String mode;

	public FC_ACCT_4021_LDM(){}
	public FC_ACCT_4021_LDM(String cmpy_cd, String occr_acct_cd1, String occr_acct_cd2, String dlco_clsf_cd, String dlco_cd, String slip_clsf_cd, String extnc_acct_cd, String fr_fisc_dt, String to_fisc_dt, String slip_occr_dt, String slip_seq, String slip_sub_seq, String mode){
		this.cmpy_cd = cmpy_cd;
		this.occr_acct_cd1 = occr_acct_cd1;
		this.occr_acct_cd2 = occr_acct_cd2;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.extnc_acct_cd = extnc_acct_cd;
		this.fr_fisc_dt = fr_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_acct_cd1(String occr_acct_cd1){
		this.occr_acct_cd1 = occr_acct_cd1;
	}

	public void setOccr_acct_cd2(String occr_acct_cd2){
		this.occr_acct_cd2 = occr_acct_cd2;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setExtnc_acct_cd(String extnc_acct_cd){
		this.extnc_acct_cd = extnc_acct_cd;
	}

	public void setFr_fisc_dt(String fr_fisc_dt){
		this.fr_fisc_dt = fr_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_acct_cd1(){
		return this.occr_acct_cd1;
	}

	public String getOccr_acct_cd2(){
		return this.occr_acct_cd2;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getExtnc_acct_cd(){
		return this.extnc_acct_cd;
	}

	public String getFr_fisc_dt(){
		return this.fr_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_4021_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_4021_LDM dm = (FC_ACCT_4021_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_acct_cd1);
		cstmt.setString(5, dm.occr_acct_cd2);
		cstmt.setString(6, dm.dlco_clsf_cd);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.slip_clsf_cd);
		cstmt.setString(9, dm.extnc_acct_cd);
		cstmt.setString(10, dm.fr_fisc_dt);
		cstmt.setString(11, dm.to_fisc_dt);
		cstmt.setString(12, dm.slip_occr_dt);
		cstmt.setString(13, dm.slip_seq);
		cstmt.setString(14, dm.slip_sub_seq);
		cstmt.setString(15, dm.mode);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_4021_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_acct_cd1 = [" + getOccr_acct_cd1() + "]");
		System.out.println("occr_acct_cd2 = [" + getOccr_acct_cd2() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("extnc_acct_cd = [" + getExtnc_acct_cd() + "]");
		System.out.println("fr_fisc_dt = [" + getFr_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String occr_acct_cd1 = req.getParameter("occr_acct_cd1");
if( occr_acct_cd1 == null){
	System.out.println(this.toString+" : occr_acct_cd1 is null" );
}else{
	System.out.println(this.toString+" : occr_acct_cd1 is "+occr_acct_cd1 );
}
String occr_acct_cd2 = req.getParameter("occr_acct_cd2");
if( occr_acct_cd2 == null){
	System.out.println(this.toString+" : occr_acct_cd2 is null" );
}else{
	System.out.println(this.toString+" : occr_acct_cd2 is "+occr_acct_cd2 );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String extnc_acct_cd = req.getParameter("extnc_acct_cd");
if( extnc_acct_cd == null){
	System.out.println(this.toString+" : extnc_acct_cd is null" );
}else{
	System.out.println(this.toString+" : extnc_acct_cd is "+extnc_acct_cd );
}
String fr_fisc_dt = req.getParameter("fr_fisc_dt");
if( fr_fisc_dt == null){
	System.out.println(this.toString+" : fr_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fr_fisc_dt is "+fr_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
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
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_acct_cd1 = Util.checkString(req.getParameter("occr_acct_cd1"));
String occr_acct_cd2 = Util.checkString(req.getParameter("occr_acct_cd2"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String extnc_acct_cd = Util.checkString(req.getParameter("extnc_acct_cd"));
String fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_acct_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_acct_cd1")));
String occr_acct_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_acct_cd2")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String extnc_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_acct_cd")));
String fr_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_acct_cd1(occr_acct_cd1);
dm.setOccr_acct_cd2(occr_acct_cd2);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setExtnc_acct_cd(extnc_acct_cd);
dm.setFr_fisc_dt(fr_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 03 11:19:26 KST 2009 */