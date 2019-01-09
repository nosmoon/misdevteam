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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2520_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String dlco_cd;
	public String clam;
	public String clam_amt;
	public String qunt;
	public String amt;
	public String card_qunt;
	public String card_coms;
	public String card_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_2520_ADM(){}
	public SP_SAL_2520_ADM(String cmpy_cd, String sale_yymm, String dlco_cd, String clam, String clam_amt, String qunt, String amt, String card_qunt, String card_coms, String card_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.dlco_cd = dlco_cd;
		this.clam = clam;
		this.clam_amt = clam_amt;
		this.qunt = qunt;
		this.amt = amt;
		this.card_qunt = card_qunt;
		this.card_coms = card_coms;
		this.card_amt = card_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setClam(String clam){
		this.clam = clam;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setCard_qunt(String card_qunt){
		this.card_qunt = card_qunt;
	}

	public void setCard_coms(String card_coms){
		this.card_coms = card_coms;
	}

	public void setCard_amt(String card_amt){
		this.card_amt = card_amt;
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

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getClam(){
		return this.clam;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getCard_qunt(){
		return this.card_qunt;
	}

	public String getCard_coms(){
		return this.card_coms;
	}

	public String getCard_amt(){
		return this.card_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2520_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2520_ADM dm = (SP_SAL_2520_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.setString(6, dm.clam);
		cstmt.setString(7, dm.clam_amt);
		cstmt.setString(8, dm.qunt);
		cstmt.setString(9, dm.amt);
		cstmt.setString(10, dm.card_qunt);
		cstmt.setString(11, dm.card_coms);
		cstmt.setString(12, dm.card_amt);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2520_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("clam = [" + getClam() + "]");
		System.out.println("clam_amt = [" + getClam_amt() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("card_qunt = [" + getCard_qunt() + "]");
		System.out.println("card_coms = [" + getCard_coms() + "]");
		System.out.println("card_amt = [" + getCard_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String clam = req.getParameter("clam");
if( clam == null){
	System.out.println(this.toString+" : clam is null" );
}else{
	System.out.println(this.toString+" : clam is "+clam );
}
String clam_amt = req.getParameter("clam_amt");
if( clam_amt == null){
	System.out.println(this.toString+" : clam_amt is null" );
}else{
	System.out.println(this.toString+" : clam_amt is "+clam_amt );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String card_qunt = req.getParameter("card_qunt");
if( card_qunt == null){
	System.out.println(this.toString+" : card_qunt is null" );
}else{
	System.out.println(this.toString+" : card_qunt is "+card_qunt );
}
String card_coms = req.getParameter("card_coms");
if( card_coms == null){
	System.out.println(this.toString+" : card_coms is null" );
}else{
	System.out.println(this.toString+" : card_coms is "+card_coms );
}
String card_amt = req.getParameter("card_amt");
if( card_amt == null){
	System.out.println(this.toString+" : card_amt is null" );
}else{
	System.out.println(this.toString+" : card_amt is "+card_amt );
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
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String clam = Util.checkString(req.getParameter("clam"));
String clam_amt = Util.checkString(req.getParameter("clam_amt"));
String qunt = Util.checkString(req.getParameter("qunt"));
String amt = Util.checkString(req.getParameter("amt"));
String card_qunt = Util.checkString(req.getParameter("card_qunt"));
String card_coms = Util.checkString(req.getParameter("card_coms"));
String card_amt = Util.checkString(req.getParameter("card_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String clam = Util.Uni2Ksc(Util.checkString(req.getParameter("clam")));
String clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_amt")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String card_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_qunt")));
String card_coms = Util.Uni2Ksc(Util.checkString(req.getParameter("card_coms")));
String card_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setDlco_cd(dlco_cd);
dm.setClam(clam);
dm.setClam_amt(clam_amt);
dm.setQunt(qunt);
dm.setAmt(amt);
dm.setCard_qunt(card_qunt);
dm.setCard_coms(card_coms);
dm.setCard_amt(card_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 16 17:27:22 KST 2012 */