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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_5108_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String slip_proc_seq;
	public String tax_stmt_seq;
	public String slip_proc_occr_dt;

	public MT_PAPINOUT_5108_ADM(){}
	public MT_PAPINOUT_5108_ADM(String cmpy_cd, String seq, String occr_dt, String incmg_pers_ipaddr, String incmg_pers, String slip_proc_seq, String tax_stmt_seq, String slip_proc_occr_dt){
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.slip_proc_seq = slip_proc_seq;
		this.tax_stmt_seq = tax_stmt_seq;
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_5108_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_5108_ADM dm = (MT_PAPINOUT_5108_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.incmg_pers_ipaddr);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.slip_proc_seq);
		cstmt.setString(9, dm.tax_stmt_seq);
		cstmt.setString(10, dm.slip_proc_occr_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5108_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("slip_proc_seq = [" + getSlip_proc_seq() + "]");
		System.out.println("tax_stmt_seq = [" + getTax_stmt_seq() + "]");
		System.out.println("slip_proc_occr_dt = [" + getSlip_proc_occr_dt() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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
String slip_proc_seq = req.getParameter("slip_proc_seq");
if( slip_proc_seq == null){
	System.out.println(this.toString+" : slip_proc_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_seq is "+slip_proc_seq );
}
String tax_stmt_seq = req.getParameter("tax_stmt_seq");
if( tax_stmt_seq == null){
	System.out.println(this.toString+" : tax_stmt_seq is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_seq is "+tax_stmt_seq );
}
String slip_proc_occr_dt = req.getParameter("slip_proc_occr_dt");
if( slip_proc_occr_dt == null){
	System.out.println(this.toString+" : slip_proc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_occr_dt is "+slip_proc_occr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
String tax_stmt_seq = Util.checkString(req.getParameter("tax_stmt_seq"));
String slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String slip_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_seq")));
String tax_stmt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_seq")));
String slip_proc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_occr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setSlip_proc_seq(slip_proc_seq);
dm.setTax_stmt_seq(tax_stmt_seq);
dm.setSlip_proc_occr_dt(slip_proc_occr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 13:14:21 KST 2009 */