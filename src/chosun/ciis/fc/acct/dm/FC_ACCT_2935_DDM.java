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


public class FC_ACCT_2935_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aprv_slip_occr_dt;
	public String aprv_slip_clsf;
	public String aprv_slip_occr_seqo;
	public String aprv_slip_occr_sub_seq;
	public String budg_cd;
	public String dt_clsf;
	public String rmtt_dwload_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_2935_DDM(){}
	public FC_ACCT_2935_DDM(String cmpy_cd, String aprv_slip_occr_dt, String aprv_slip_clsf, String aprv_slip_occr_seqo, String aprv_slip_occr_sub_seq, String budg_cd, String dt_clsf, String rmtt_dwload_dt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
		this.aprv_slip_clsf = aprv_slip_clsf;
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
		this.aprv_slip_occr_sub_seq = aprv_slip_occr_sub_seq;
		this.budg_cd = budg_cd;
		this.dt_clsf = dt_clsf;
		this.rmtt_dwload_dt = rmtt_dwload_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAprv_slip_occr_dt(String aprv_slip_occr_dt){
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
	}

	public void setAprv_slip_clsf(String aprv_slip_clsf){
		this.aprv_slip_clsf = aprv_slip_clsf;
	}

	public void setAprv_slip_occr_seqo(String aprv_slip_occr_seqo){
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
	}

	public void setAprv_slip_occr_sub_seq(String aprv_slip_occr_sub_seq){
		this.aprv_slip_occr_sub_seq = aprv_slip_occr_sub_seq;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setRmtt_dwload_dt(String rmtt_dwload_dt){
		this.rmtt_dwload_dt = rmtt_dwload_dt;
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

	public String getAprv_slip_occr_dt(){
		return this.aprv_slip_occr_dt;
	}

	public String getAprv_slip_clsf(){
		return this.aprv_slip_clsf;
	}

	public String getAprv_slip_occr_seqo(){
		return this.aprv_slip_occr_seqo;
	}

	public String getAprv_slip_occr_sub_seq(){
		return this.aprv_slip_occr_sub_seq;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getRmtt_dwload_dt(){
		return this.rmtt_dwload_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2935_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2935_DDM dm = (FC_ACCT_2935_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aprv_slip_occr_dt);
		cstmt.setString(5, dm.aprv_slip_clsf);
		cstmt.setString(6, dm.aprv_slip_occr_seqo);
		cstmt.setString(7, dm.aprv_slip_occr_sub_seq);
		cstmt.setString(8, dm.budg_cd);
		cstmt.setString(9, dm.dt_clsf);
		cstmt.setString(10, dm.rmtt_dwload_dt);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2935_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aprv_slip_occr_dt = [" + getAprv_slip_occr_dt() + "]");
		System.out.println("aprv_slip_clsf = [" + getAprv_slip_clsf() + "]");
		System.out.println("aprv_slip_occr_seqo = [" + getAprv_slip_occr_seqo() + "]");
		System.out.println("aprv_slip_occr_sub_seq = [" + getAprv_slip_occr_sub_seq() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("rmtt_dwload_dt = [" + getRmtt_dwload_dt() + "]");
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
String aprv_slip_occr_dt = req.getParameter("aprv_slip_occr_dt");
if( aprv_slip_occr_dt == null){
	System.out.println(this.toString+" : aprv_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_dt is "+aprv_slip_occr_dt );
}
String aprv_slip_clsf = req.getParameter("aprv_slip_clsf");
if( aprv_slip_clsf == null){
	System.out.println(this.toString+" : aprv_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_clsf is "+aprv_slip_clsf );
}
String aprv_slip_occr_seqo = req.getParameter("aprv_slip_occr_seqo");
if( aprv_slip_occr_seqo == null){
	System.out.println(this.toString+" : aprv_slip_occr_seqo is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_seqo is "+aprv_slip_occr_seqo );
}
String aprv_slip_occr_sub_seq = req.getParameter("aprv_slip_occr_sub_seq");
if( aprv_slip_occr_sub_seq == null){
	System.out.println(this.toString+" : aprv_slip_occr_sub_seq is null" );
}else{
	System.out.println(this.toString+" : aprv_slip_occr_sub_seq is "+aprv_slip_occr_sub_seq );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String rmtt_dwload_dt = req.getParameter("rmtt_dwload_dt");
if( rmtt_dwload_dt == null){
	System.out.println(this.toString+" : rmtt_dwload_dt is null" );
}else{
	System.out.println(this.toString+" : rmtt_dwload_dt is "+rmtt_dwload_dt );
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
String aprv_slip_occr_dt = Util.checkString(req.getParameter("aprv_slip_occr_dt"));
String aprv_slip_clsf = Util.checkString(req.getParameter("aprv_slip_clsf"));
String aprv_slip_occr_seqo = Util.checkString(req.getParameter("aprv_slip_occr_seqo"));
String aprv_slip_occr_sub_seq = Util.checkString(req.getParameter("aprv_slip_occr_sub_seq"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String rmtt_dwload_dt = Util.checkString(req.getParameter("rmtt_dwload_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aprv_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_dt")));
String aprv_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_clsf")));
String aprv_slip_occr_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_seqo")));
String aprv_slip_occr_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_slip_occr_sub_seq")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String rmtt_dwload_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmtt_dwload_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAprv_slip_occr_dt(aprv_slip_occr_dt);
dm.setAprv_slip_clsf(aprv_slip_clsf);
dm.setAprv_slip_occr_seqo(aprv_slip_occr_seqo);
dm.setAprv_slip_occr_sub_seq(aprv_slip_occr_sub_seq);
dm.setBudg_cd(budg_cd);
dm.setRmtt_dwload_dt(rmtt_dwload_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 17:06:37 KST 2009 */