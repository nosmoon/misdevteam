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


public class FC_ACCT_6232_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String sub_flag_ary;
	public String seq;
	public String exp_decl_no;
	public String ship_dt;
	public String frcr_clsf_cd;
	public String exrate;
	public String frcr_amt;
	public String won_amt;
	public long qunt_etc;
	public long frcr_amt_etc;
	public long won_amt_etc;

	public FC_ACCT_6232_ADM(){}
	public FC_ACCT_6232_ADM(String flag, String incmg_pers, String incmg_pers_ipadd, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String sub_flag_ary, String seq, String exp_decl_no, String ship_dt, String frcr_clsf_cd, String exrate, String frcr_amt, String won_amt, long qunt_etc, long frcr_amt_etc, long won_amt_etc){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.sub_flag_ary = sub_flag_ary;
		this.seq = seq;
		this.exp_decl_no = exp_decl_no;
		this.ship_dt = ship_dt;
		this.frcr_clsf_cd = frcr_clsf_cd;
		this.exrate = exrate;
		this.frcr_amt = frcr_amt;
		this.won_amt = won_amt;
		this.qunt_etc = qunt_etc;
		this.frcr_amt_etc = frcr_amt_etc;
		this.won_amt_etc = won_amt_etc;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setSub_flag_ary(String sub_flag_ary){
		this.sub_flag_ary = sub_flag_ary;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setExp_decl_no(String exp_decl_no){
		this.exp_decl_no = exp_decl_no;
	}

	public void setShip_dt(String ship_dt){
		this.ship_dt = ship_dt;
	}

	public void setFrcr_clsf_cd(String frcr_clsf_cd){
		this.frcr_clsf_cd = frcr_clsf_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setQunt_etc(long qunt_etc){
		this.qunt_etc = qunt_etc;
	}

	public void setFrcr_amt_etc(long frcr_amt_etc){
		this.frcr_amt_etc = frcr_amt_etc;
	}

	public void setWon_amt_etc(long won_amt_etc){
		this.won_amt_etc = won_amt_etc;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getSub_flag_ary(){
		return this.sub_flag_ary;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getExp_decl_no(){
		return this.exp_decl_no;
	}

	public String getShip_dt(){
		return this.ship_dt;
	}

	public String getFrcr_clsf_cd(){
		return this.frcr_clsf_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public long getQunt_etc(){
		return this.qunt_etc;
	}

	public long getFrcr_amt_etc(){
		return this.frcr_amt_etc;
	}

	public long getWon_amt_etc(){
		return this.won_amt_etc;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6232_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6232_ADM dm = (FC_ACCT_6232_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.erplace_cd);
		cstmt.setString(8, dm.vat_fr_yymm);
		cstmt.setString(9, dm.vat_to_yymm);
		cstmt.setString(10, dm.sub_flag_ary);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.exp_decl_no);
		cstmt.setString(13, dm.ship_dt);
		cstmt.setString(14, dm.frcr_clsf_cd);
		cstmt.setString(15, dm.exrate);
		cstmt.setString(16, dm.frcr_amt);
		cstmt.setString(17, dm.won_amt);
		cstmt.setLong(18, dm.qunt_etc);
		cstmt.setLong(19, dm.frcr_amt_etc);
		cstmt.setLong(20, dm.won_amt_etc);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6232_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("sub_flag_ary = [" + getSub_flag_ary() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("exp_decl_no = [" + getExp_decl_no() + "]");
		System.out.println("ship_dt = [" + getShip_dt() + "]");
		System.out.println("frcr_clsf_cd = [" + getFrcr_clsf_cd() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("frcr_amt = [" + getFrcr_amt() + "]");
		System.out.println("won_amt = [" + getWon_amt() + "]");
		System.out.println("qunt_etc = [" + getQunt_etc() + "]");
		System.out.println("frcr_amt_etc = [" + getFrcr_amt_etc() + "]");
		System.out.println("won_amt_etc = [" + getWon_amt_etc() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String sub_flag_ary = req.getParameter("sub_flag_ary");
if( sub_flag_ary == null){
	System.out.println(this.toString+" : sub_flag_ary is null" );
}else{
	System.out.println(this.toString+" : sub_flag_ary is "+sub_flag_ary );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String exp_decl_no = req.getParameter("exp_decl_no");
if( exp_decl_no == null){
	System.out.println(this.toString+" : exp_decl_no is null" );
}else{
	System.out.println(this.toString+" : exp_decl_no is "+exp_decl_no );
}
String ship_dt = req.getParameter("ship_dt");
if( ship_dt == null){
	System.out.println(this.toString+" : ship_dt is null" );
}else{
	System.out.println(this.toString+" : ship_dt is "+ship_dt );
}
String frcr_clsf_cd = req.getParameter("frcr_clsf_cd");
if( frcr_clsf_cd == null){
	System.out.println(this.toString+" : frcr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : frcr_clsf_cd is "+frcr_clsf_cd );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String frcr_amt = req.getParameter("frcr_amt");
if( frcr_amt == null){
	System.out.println(this.toString+" : frcr_amt is null" );
}else{
	System.out.println(this.toString+" : frcr_amt is "+frcr_amt );
}
String won_amt = req.getParameter("won_amt");
if( won_amt == null){
	System.out.println(this.toString+" : won_amt is null" );
}else{
	System.out.println(this.toString+" : won_amt is "+won_amt );
}
String qunt_etc = req.getParameter("qunt_etc");
if( qunt_etc == null){
	System.out.println(this.toString+" : qunt_etc is null" );
}else{
	System.out.println(this.toString+" : qunt_etc is "+qunt_etc );
}
String frcr_amt_etc = req.getParameter("frcr_amt_etc");
if( frcr_amt_etc == null){
	System.out.println(this.toString+" : frcr_amt_etc is null" );
}else{
	System.out.println(this.toString+" : frcr_amt_etc is "+frcr_amt_etc );
}
String won_amt_etc = req.getParameter("won_amt_etc");
if( won_amt_etc == null){
	System.out.println(this.toString+" : won_amt_etc is null" );
}else{
	System.out.println(this.toString+" : won_amt_etc is "+won_amt_etc );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String sub_flag_ary = Util.checkString(req.getParameter("sub_flag_ary"));
String seq = Util.checkString(req.getParameter("seq"));
String exp_decl_no = Util.checkString(req.getParameter("exp_decl_no"));
String ship_dt = Util.checkString(req.getParameter("ship_dt"));
String frcr_clsf_cd = Util.checkString(req.getParameter("frcr_clsf_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
String won_amt = Util.checkString(req.getParameter("won_amt"));
String qunt_etc = Util.checkString(req.getParameter("qunt_etc"));
String frcr_amt_etc = Util.checkString(req.getParameter("frcr_amt_etc"));
String won_amt_etc = Util.checkString(req.getParameter("won_amt_etc"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String sub_flag_ary = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_flag_ary")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String exp_decl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("exp_decl_no")));
String ship_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ship_dt")));
String frcr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_clsf_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String frcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt")));
String won_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("won_amt")));
String qunt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt_etc")));
String frcr_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt_etc")));
String won_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("won_amt_etc")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setSub_flag_ary(sub_flag_ary);
dm.setSeq(seq);
dm.setExp_decl_no(exp_decl_no);
dm.setShip_dt(ship_dt);
dm.setFrcr_clsf_cd(frcr_clsf_cd);
dm.setExrate(exrate);
dm.setFrcr_amt(frcr_amt);
dm.setWon_amt(won_amt);
dm.setQunt_etc(qunt_etc);
dm.setFrcr_amt_etc(frcr_amt_etc);
dm.setWon_amt_etc(won_amt_etc);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 16 13:45:26 KST 2014 */