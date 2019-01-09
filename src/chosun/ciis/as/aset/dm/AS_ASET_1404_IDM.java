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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1404_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String occr_seq;
	public String ndduc_year;
	public String ndduc_prd_clsf;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String acct_cd;
	public String ndduc_rate;
	public String ndduc_amt;

	public AS_ASET_1404_IDM(){}
	public AS_ASET_1404_IDM(String cmpy_cd, String occr_dt, String occr_seq, String ndduc_year, String ndduc_prd_clsf, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String acct_cd, String ndduc_rate, String ndduc_amt){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.ndduc_year = ndduc_year;
		this.ndduc_prd_clsf = ndduc_prd_clsf;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.acct_cd = acct_cd;
		this.ndduc_rate = ndduc_rate;
		this.ndduc_amt = ndduc_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setNdduc_year(String ndduc_year){
		this.ndduc_year = ndduc_year;
	}

	public void setNdduc_prd_clsf(String ndduc_prd_clsf){
		this.ndduc_prd_clsf = ndduc_prd_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setNdduc_amt(String ndduc_amt){
		this.ndduc_amt = ndduc_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getNdduc_year(){
		return this.ndduc_year;
	}

	public String getNdduc_prd_clsf(){
		return this.ndduc_prd_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getNdduc_amt(){
		return this.ndduc_amt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1404_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1404_IDM dm = (AS_ASET_1404_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.occr_seq);
		cstmt.setString(6, dm.ndduc_year);
		cstmt.setString(7, dm.ndduc_prd_clsf);
		cstmt.setString(8, dm.remk);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.acct_cd);
		cstmt.setString(13, dm.ndduc_rate);
		cstmt.setString(14, dm.ndduc_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1404_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("occr_seq = " + getOccr_seq());
        System.out.println("ndduc_year = " + getNdduc_year());
        System.out.println("ndduc_prd_clsf = " + getNdduc_prd_clsf());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("acct_cd = " + getAcct_cd());
        System.out.println("ndduc_rate = " + getNdduc_rate());
        System.out.println("ndduc_amt = " + getNdduc_amt());
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
String ndduc_year = req.getParameter("ndduc_year");
if( ndduc_year == null){
	System.out.println(this.toString+" : ndduc_year is null" );
}else{
	System.out.println(this.toString+" : ndduc_year is "+ndduc_year );
}
String ndduc_prd_clsf = req.getParameter("ndduc_prd_clsf");
if( ndduc_prd_clsf == null){
	System.out.println(this.toString+" : ndduc_prd_clsf is null" );
}else{
	System.out.println(this.toString+" : ndduc_prd_clsf is "+ndduc_prd_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String ndduc_rate = req.getParameter("ndduc_rate");
if( ndduc_rate == null){
	System.out.println(this.toString+" : ndduc_rate is null" );
}else{
	System.out.println(this.toString+" : ndduc_rate is "+ndduc_rate );
}
String ndduc_amt = req.getParameter("ndduc_amt");
if( ndduc_amt == null){
	System.out.println(this.toString+" : ndduc_amt is null" );
}else{
	System.out.println(this.toString+" : ndduc_amt is "+ndduc_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String ndduc_year = Util.checkString(req.getParameter("ndduc_year"));
String ndduc_prd_clsf = Util.checkString(req.getParameter("ndduc_prd_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String ndduc_rate = Util.checkString(req.getParameter("ndduc_rate"));
String ndduc_amt = Util.checkString(req.getParameter("ndduc_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String ndduc_year = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_year")));
String ndduc_prd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_prd_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String ndduc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_rate")));
String ndduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setNdduc_year(ndduc_year);
dm.setNdduc_prd_clsf(ndduc_prd_clsf);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setAcct_cd(acct_cd);
dm.setNdduc_rate(ndduc_rate);
dm.setNdduc_amt(ndduc_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 16:27:21 KST 2009 */