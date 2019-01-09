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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1100_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_yy;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode_1;
	public String seq_1;
	public String tot_saly_sctn_1;
	public String tot_saly_sctn_2;
	public String labr_incm_add_amt;
	public String labr_incm_dedu_amt;
	public String labr_incm_dduc_rate;
	public String mode_2;
	public String seq_2;
	public String txn_std_sctn_1;
	public String txn_std_sctn_2;
	public String rate;
	public String dedu_amt;

	public HD_YADJM_1100_ADM(){}
	public HD_YADJM_1100_ADM(String cmpy_cd, String adjm_yy, String incmg_pers_ip, String incmg_pers, String mode_1, String seq_1, String tot_saly_sctn_1, String tot_saly_sctn_2, String labr_incm_add_amt, String labr_incm_dedu_amt, String labr_incm_dduc_rate, String mode_2, String seq_2, String txn_std_sctn_1, String txn_std_sctn_2, String rate, String dedu_amt){
		this.cmpy_cd = cmpy_cd;
		this.adjm_yy = adjm_yy;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode_1 = mode_1;
		this.seq_1 = seq_1;
		this.tot_saly_sctn_1 = tot_saly_sctn_1;
		this.tot_saly_sctn_2 = tot_saly_sctn_2;
		this.labr_incm_add_amt = labr_incm_add_amt;
		this.labr_incm_dedu_amt = labr_incm_dedu_amt;
		this.labr_incm_dduc_rate = labr_incm_dduc_rate;
		this.mode_2 = mode_2;
		this.seq_2 = seq_2;
		this.txn_std_sctn_1 = txn_std_sctn_1;
		this.txn_std_sctn_2 = txn_std_sctn_2;
		this.rate = rate;
		this.dedu_amt = dedu_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_yy(String adjm_yy){
		this.adjm_yy = adjm_yy;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode_1(String mode_1){
		this.mode_1 = mode_1;
	}

	public void setSeq_1(String seq_1){
		this.seq_1 = seq_1;
	}

	public void setTot_saly_sctn_1(String tot_saly_sctn_1){
		this.tot_saly_sctn_1 = tot_saly_sctn_1;
	}

	public void setTot_saly_sctn_2(String tot_saly_sctn_2){
		this.tot_saly_sctn_2 = tot_saly_sctn_2;
	}

	public void setLabr_incm_add_amt(String labr_incm_add_amt){
		this.labr_incm_add_amt = labr_incm_add_amt;
	}

	public void setLabr_incm_dedu_amt(String labr_incm_dedu_amt){
		this.labr_incm_dedu_amt = labr_incm_dedu_amt;
	}

	public void setLabr_incm_dduc_rate(String labr_incm_dduc_rate){
		this.labr_incm_dduc_rate = labr_incm_dduc_rate;
	}

	public void setMode_2(String mode_2){
		this.mode_2 = mode_2;
	}

	public void setSeq_2(String seq_2){
		this.seq_2 = seq_2;
	}

	public void setTxn_std_sctn_1(String txn_std_sctn_1){
		this.txn_std_sctn_1 = txn_std_sctn_1;
	}

	public void setTxn_std_sctn_2(String txn_std_sctn_2){
		this.txn_std_sctn_2 = txn_std_sctn_2;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setDedu_amt(String dedu_amt){
		this.dedu_amt = dedu_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_yy(){
		return this.adjm_yy;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode_1(){
		return this.mode_1;
	}

	public String getSeq_1(){
		return this.seq_1;
	}

	public String getTot_saly_sctn_1(){
		return this.tot_saly_sctn_1;
	}

	public String getTot_saly_sctn_2(){
		return this.tot_saly_sctn_2;
	}

	public String getLabr_incm_add_amt(){
		return this.labr_incm_add_amt;
	}

	public String getLabr_incm_dedu_amt(){
		return this.labr_incm_dedu_amt;
	}

	public String getLabr_incm_dduc_rate(){
		return this.labr_incm_dduc_rate;
	}

	public String getMode_2(){
		return this.mode_2;
	}

	public String getSeq_2(){
		return this.seq_2;
	}

	public String getTxn_std_sctn_1(){
		return this.txn_std_sctn_1;
	}

	public String getTxn_std_sctn_2(){
		return this.txn_std_sctn_2;
	}

	public String getRate(){
		return this.rate;
	}

	public String getDedu_amt(){
		return this.dedu_amt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_1100_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1100_ADM dm = (HD_YADJM_1100_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_yy);
		cstmt.setString(5, dm.incmg_pers_ip);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.mode_1);
		cstmt.setString(8, dm.seq_1);
		cstmt.setString(9, dm.tot_saly_sctn_1);
		cstmt.setString(10, dm.tot_saly_sctn_2);
		cstmt.setString(11, dm.labr_incm_add_amt);
		cstmt.setString(12, dm.labr_incm_dedu_amt);
		cstmt.setString(13, dm.labr_incm_dduc_rate);
		cstmt.setString(14, dm.mode_2);
		cstmt.setString(15, dm.seq_2);
		cstmt.setString(16, dm.txn_std_sctn_1);
		cstmt.setString(17, dm.txn_std_sctn_2);
		cstmt.setString(18, dm.rate);
		cstmt.setString(19, dm.dedu_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1100_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_yy = [" + getAdjm_yy() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode_1 = [" + getMode_1() + "]");
		System.out.println("seq_1 = [" + getSeq_1() + "]");
		System.out.println("tot_saly_sctn_1 = [" + getTot_saly_sctn_1() + "]");
		System.out.println("tot_saly_sctn_2 = [" + getTot_saly_sctn_2() + "]");
		System.out.println("labr_incm_add_amt = [" + getLabr_incm_add_amt() + "]");
		System.out.println("labr_incm_dedu_amt = [" + getLabr_incm_dedu_amt() + "]");
		System.out.println("labr_incm_dduc_rate = [" + getLabr_incm_dduc_rate() + "]");
		System.out.println("mode_2 = [" + getMode_2() + "]");
		System.out.println("seq_2 = [" + getSeq_2() + "]");
		System.out.println("txn_std_sctn_1 = [" + getTxn_std_sctn_1() + "]");
		System.out.println("txn_std_sctn_2 = [" + getTxn_std_sctn_2() + "]");
		System.out.println("rate = [" + getRate() + "]");
		System.out.println("dedu_amt = [" + getDedu_amt() + "]");
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
String adjm_yy = req.getParameter("adjm_yy");
if( adjm_yy == null){
	System.out.println(this.toString+" : adjm_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_yy is "+adjm_yy );
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
String mode_1 = req.getParameter("mode_1");
if( mode_1 == null){
	System.out.println(this.toString+" : mode_1 is null" );
}else{
	System.out.println(this.toString+" : mode_1 is "+mode_1 );
}
String seq_1 = req.getParameter("seq_1");
if( seq_1 == null){
	System.out.println(this.toString+" : seq_1 is null" );
}else{
	System.out.println(this.toString+" : seq_1 is "+seq_1 );
}
String tot_saly_sctn_1 = req.getParameter("tot_saly_sctn_1");
if( tot_saly_sctn_1 == null){
	System.out.println(this.toString+" : tot_saly_sctn_1 is null" );
}else{
	System.out.println(this.toString+" : tot_saly_sctn_1 is "+tot_saly_sctn_1 );
}
String tot_saly_sctn_2 = req.getParameter("tot_saly_sctn_2");
if( tot_saly_sctn_2 == null){
	System.out.println(this.toString+" : tot_saly_sctn_2 is null" );
}else{
	System.out.println(this.toString+" : tot_saly_sctn_2 is "+tot_saly_sctn_2 );
}
String labr_incm_add_amt = req.getParameter("labr_incm_add_amt");
if( labr_incm_add_amt == null){
	System.out.println(this.toString+" : labr_incm_add_amt is null" );
}else{
	System.out.println(this.toString+" : labr_incm_add_amt is "+labr_incm_add_amt );
}
String labr_incm_dedu_amt = req.getParameter("labr_incm_dedu_amt");
if( labr_incm_dedu_amt == null){
	System.out.println(this.toString+" : labr_incm_dedu_amt is null" );
}else{
	System.out.println(this.toString+" : labr_incm_dedu_amt is "+labr_incm_dedu_amt );
}
String labr_incm_dduc_rate = req.getParameter("labr_incm_dduc_rate");
if( labr_incm_dduc_rate == null){
	System.out.println(this.toString+" : labr_incm_dduc_rate is null" );
}else{
	System.out.println(this.toString+" : labr_incm_dduc_rate is "+labr_incm_dduc_rate );
}
String mode_2 = req.getParameter("mode_2");
if( mode_2 == null){
	System.out.println(this.toString+" : mode_2 is null" );
}else{
	System.out.println(this.toString+" : mode_2 is "+mode_2 );
}
String seq_2 = req.getParameter("seq_2");
if( seq_2 == null){
	System.out.println(this.toString+" : seq_2 is null" );
}else{
	System.out.println(this.toString+" : seq_2 is "+seq_2 );
}
String txn_std_sctn_1 = req.getParameter("txn_std_sctn_1");
if( txn_std_sctn_1 == null){
	System.out.println(this.toString+" : txn_std_sctn_1 is null" );
}else{
	System.out.println(this.toString+" : txn_std_sctn_1 is "+txn_std_sctn_1 );
}
String txn_std_sctn_2 = req.getParameter("txn_std_sctn_2");
if( txn_std_sctn_2 == null){
	System.out.println(this.toString+" : txn_std_sctn_2 is null" );
}else{
	System.out.println(this.toString+" : txn_std_sctn_2 is "+txn_std_sctn_2 );
}
String rate = req.getParameter("rate");
if( rate == null){
	System.out.println(this.toString+" : rate is null" );
}else{
	System.out.println(this.toString+" : rate is "+rate );
}
String dedu_amt = req.getParameter("dedu_amt");
if( dedu_amt == null){
	System.out.println(this.toString+" : dedu_amt is null" );
}else{
	System.out.println(this.toString+" : dedu_amt is "+dedu_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_yy = Util.checkString(req.getParameter("adjm_yy"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode_1 = Util.checkString(req.getParameter("mode_1"));
String seq_1 = Util.checkString(req.getParameter("seq_1"));
String tot_saly_sctn_1 = Util.checkString(req.getParameter("tot_saly_sctn_1"));
String tot_saly_sctn_2 = Util.checkString(req.getParameter("tot_saly_sctn_2"));
String labr_incm_add_amt = Util.checkString(req.getParameter("labr_incm_add_amt"));
String labr_incm_dedu_amt = Util.checkString(req.getParameter("labr_incm_dedu_amt"));
String labr_incm_dduc_rate = Util.checkString(req.getParameter("labr_incm_dduc_rate"));
String mode_2 = Util.checkString(req.getParameter("mode_2"));
String seq_2 = Util.checkString(req.getParameter("seq_2"));
String txn_std_sctn_1 = Util.checkString(req.getParameter("txn_std_sctn_1"));
String txn_std_sctn_2 = Util.checkString(req.getParameter("txn_std_sctn_2"));
String rate = Util.checkString(req.getParameter("rate"));
String dedu_amt = Util.checkString(req.getParameter("dedu_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_yy")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_1")));
String seq_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_1")));
String tot_saly_sctn_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_saly_sctn_1")));
String tot_saly_sctn_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_saly_sctn_2")));
String labr_incm_add_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_incm_add_amt")));
String labr_incm_dedu_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_incm_dedu_amt")));
String labr_incm_dduc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("labr_incm_dduc_rate")));
String mode_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_2")));
String seq_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_2")));
String txn_std_sctn_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_std_sctn_1")));
String txn_std_sctn_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_std_sctn_2")));
String rate = Util.Uni2Ksc(Util.checkString(req.getParameter("rate")));
String dedu_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dedu_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_yy(adjm_yy);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode_1(mode_1);
dm.setSeq_1(seq_1);
dm.setTot_saly_sctn_1(tot_saly_sctn_1);
dm.setTot_saly_sctn_2(tot_saly_sctn_2);
dm.setLabr_incm_add_amt(labr_incm_add_amt);
dm.setLabr_incm_dedu_amt(labr_incm_dedu_amt);
dm.setLabr_incm_dduc_rate(labr_incm_dduc_rate);
dm.setMode_2(mode_2);
dm.setSeq_2(seq_2);
dm.setTxn_std_sctn_1(txn_std_sctn_1);
dm.setTxn_std_sctn_2(txn_std_sctn_2);
dm.setRate(rate);
dm.setDedu_amt(dedu_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 14:38:09 KST 2009 */