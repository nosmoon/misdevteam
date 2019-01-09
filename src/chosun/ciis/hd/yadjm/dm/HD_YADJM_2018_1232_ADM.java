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


public class HD_YADJM_2018_1232_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String stok_savg_type;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String mode;
	public String occr_dt;
	public String seq;
	public String bank_cd;
	public String account_no;
	public String payment;
	public String deduct_amt;

	public HD_YADJM_2018_1232_ADM(){}
	public HD_YADJM_2018_1232_ADM(String cmpy_cd, String adjm_rvrs_yy, String emp_no, String stok_savg_type, String incmg_pers_ip, String incmg_pers, String mode, String occr_dt, String seq, String bank_cd, String account_no, String payment, String deduct_amt){
		this.cmpy_cd = cmpy_cd;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.stok_savg_type = stok_savg_type;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.bank_cd = bank_cd;
		this.account_no = account_no;
		this.payment = payment;
		this.deduct_amt = deduct_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setStok_savg_type(String stok_savg_type){
		this.stok_savg_type = stok_savg_type;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAccount_no(String account_no){
		this.account_no = account_no;
	}

	public void setPayment(String payment){
		this.payment = payment;
	}

	public void setDeduct_amt(String deduct_amt){
		this.deduct_amt = deduct_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getStok_savg_type(){
		return this.stok_savg_type;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAccount_no(){
		return this.account_no;
	}

	public String getPayment(){
		return this.payment;
	}

	public String getDeduct_amt(){
		return this.deduct_amt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_2018_1232_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_2018_1232_ADM dm = (HD_YADJM_2018_1232_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_rvrs_yy);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.stok_savg_type);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.mode);
		cstmt.setString(10, dm.occr_dt);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.bank_cd);
		cstmt.setString(13, dm.account_no);
		cstmt.setString(14, dm.payment);
		cstmt.setString(15, dm.deduct_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_2018_1232_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("stok_savg_type = [" + getStok_savg_type() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("account_no = [" + getAccount_no() + "]");
		System.out.println("payment = [" + getPayment() + "]");
		System.out.println("deduct_amt = [" + getDeduct_amt() + "]");
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
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String stok_savg_type = req.getParameter("stok_savg_type");
if( stok_savg_type == null){
	System.out.println(this.toString+" : stok_savg_type is null" );
}else{
	System.out.println(this.toString+" : stok_savg_type is "+stok_savg_type );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String account_no = req.getParameter("account_no");
if( account_no == null){
	System.out.println(this.toString+" : account_no is null" );
}else{
	System.out.println(this.toString+" : account_no is "+account_no );
}
String payment = req.getParameter("payment");
if( payment == null){
	System.out.println(this.toString+" : payment is null" );
}else{
	System.out.println(this.toString+" : payment is "+payment );
}
String deduct_amt = req.getParameter("deduct_amt");
if( deduct_amt == null){
	System.out.println(this.toString+" : deduct_amt is null" );
}else{
	System.out.println(this.toString+" : deduct_amt is "+deduct_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String stok_savg_type = Util.checkString(req.getParameter("stok_savg_type"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String account_no = Util.checkString(req.getParameter("account_no"));
String payment = Util.checkString(req.getParameter("payment"));
String deduct_amt = Util.checkString(req.getParameter("deduct_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String stok_savg_type = Util.Uni2Ksc(Util.checkString(req.getParameter("stok_savg_type")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String account_no = Util.Uni2Ksc(Util.checkString(req.getParameter("account_no")));
String payment = Util.Uni2Ksc(Util.checkString(req.getParameter("payment")));
String deduct_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("deduct_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setStok_savg_type(stok_savg_type);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setBank_cd(bank_cd);
dm.setAccount_no(account_no);
dm.setPayment(payment);
dm.setDeduct_amt(deduct_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 26 18:07:25 KST 2018 */