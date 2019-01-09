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


public class FC_ACCT_6027_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_occr_dt1;
	public String slip_clsf_cd1;
	public String slip_seq1;
	public String slip_sub_seq1;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String canc_flag;

	public FC_ACCT_6027_UDM(){}
	public FC_ACCT_6027_UDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String slip_occr_dt1, String slip_clsf_cd1, String slip_seq1, String slip_sub_seq1, String incmg_pers, String incmg_pers_ipadd, String canc_flag){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.slip_occr_dt1 = slip_occr_dt1;
		this.slip_clsf_cd1 = slip_clsf_cd1;
		this.slip_seq1 = slip_seq1;
		this.slip_sub_seq1 = slip_sub_seq1;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.canc_flag = canc_flag;
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

	public void setSlip_occr_dt1(String slip_occr_dt1){
		this.slip_occr_dt1 = slip_occr_dt1;
	}

	public void setSlip_clsf_cd1(String slip_clsf_cd1){
		this.slip_clsf_cd1 = slip_clsf_cd1;
	}

	public void setSlip_seq1(String slip_seq1){
		this.slip_seq1 = slip_seq1;
	}

	public void setSlip_sub_seq1(String slip_sub_seq1){
		this.slip_sub_seq1 = slip_sub_seq1;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCanc_flag(String canc_flag){
		this.canc_flag = canc_flag;
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

	public String getSlip_occr_dt1(){
		return this.slip_occr_dt1;
	}

	public String getSlip_clsf_cd1(){
		return this.slip_clsf_cd1;
	}

	public String getSlip_seq1(){
		return this.slip_seq1;
	}

	public String getSlip_sub_seq1(){
		return this.slip_sub_seq1;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCanc_flag(){
		return this.canc_flag;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6027_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6027_UDM dm = (FC_ACCT_6027_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.slip_sub_seq);
		cstmt.setString(8, dm.slip_occr_dt1);
		cstmt.setString(9, dm.slip_clsf_cd1);
		cstmt.setString(10, dm.slip_seq1);
		cstmt.setString(11, dm.slip_sub_seq1);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.canc_flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6027_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_seq = " + getSlip_seq());
        System.out.println("slip_sub_seq = " + getSlip_sub_seq());
        System.out.println("slip_occr_dt1 = " + getSlip_occr_dt1());
        System.out.println("slip_clsf_cd1 = " + getSlip_clsf_cd1());
        System.out.println("slip_seq1 = " + getSlip_seq1());
        System.out.println("slip_sub_seq1 = " + getSlip_sub_seq1());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("canc_flag = " + getCanc_flag());
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
String slip_occr_dt1 = req.getParameter("slip_occr_dt1");
if( slip_occr_dt1 == null){
	System.out.println(this.toString+" : slip_occr_dt1 is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt1 is "+slip_occr_dt1 );
}
String slip_clsf_cd1 = req.getParameter("slip_clsf_cd1");
if( slip_clsf_cd1 == null){
	System.out.println(this.toString+" : slip_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd1 is "+slip_clsf_cd1 );
}
String slip_seq1 = req.getParameter("slip_seq1");
if( slip_seq1 == null){
	System.out.println(this.toString+" : slip_seq1 is null" );
}else{
	System.out.println(this.toString+" : slip_seq1 is "+slip_seq1 );
}
String slip_sub_seq1 = req.getParameter("slip_sub_seq1");
if( slip_sub_seq1 == null){
	System.out.println(this.toString+" : slip_sub_seq1 is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq1 is "+slip_sub_seq1 );
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
String canc_flag = req.getParameter("canc_flag");
if( canc_flag == null){
	System.out.println(this.toString+" : canc_flag is null" );
}else{
	System.out.println(this.toString+" : canc_flag is "+canc_flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String slip_occr_dt1 = Util.checkString(req.getParameter("slip_occr_dt1"));
String slip_clsf_cd1 = Util.checkString(req.getParameter("slip_clsf_cd1"));
String slip_seq1 = Util.checkString(req.getParameter("slip_seq1"));
String slip_sub_seq1 = Util.checkString(req.getParameter("slip_sub_seq1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String canc_flag = Util.checkString(req.getParameter("canc_flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String slip_occr_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt1")));
String slip_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd1")));
String slip_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq1")));
String slip_sub_seq1 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String canc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setSlip_occr_dt1(slip_occr_dt1);
dm.setSlip_clsf_cd1(slip_clsf_cd1);
dm.setSlip_seq1(slip_seq1);
dm.setSlip_sub_seq1(slip_sub_seq1);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCanc_flag(canc_flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */