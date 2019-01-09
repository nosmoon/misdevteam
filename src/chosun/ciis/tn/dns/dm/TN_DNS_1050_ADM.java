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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String promiseidx;
	public String memberidx;
	public String paymentidx;
	public String paydate;
	public String payprice;
	public String receiptissue;
	public String paymentmemo;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String g1_rcpm_dt;
	public String g1_rcpm_amt;
	public String g1_rcpm_pers_nm;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;

	public TN_DNS_1050_ADM(){}
	public TN_DNS_1050_ADM(String mode, String cmpy_cd, String promiseidx, String memberidx, String paymentidx, String paydate, String payprice, String receiptissue, String paymentmemo, String incmg_pers, String incmg_pers_ipadd, String g1_rcpm_dt, String g1_rcpm_amt, String g1_rcpm_pers_nm, String biz_reg_no, String bank_id, String acct_num, String tran_date_seq){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.promiseidx = promiseidx;
		this.memberidx = memberidx;
		this.paymentidx = paymentidx;
		this.paydate = paydate;
		this.payprice = payprice;
		this.receiptissue = receiptissue;
		this.paymentmemo = paymentmemo;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.g1_rcpm_dt = g1_rcpm_dt;
		this.g1_rcpm_amt = g1_rcpm_amt;
		this.g1_rcpm_pers_nm = g1_rcpm_pers_nm;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date_seq = tran_date_seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setReceiptissue(String receiptissue){
		this.receiptissue = receiptissue;
	}

	public void setPaymentmemo(String paymentmemo){
		this.paymentmemo = paymentmemo;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setG1_rcpm_dt(String g1_rcpm_dt){
		this.g1_rcpm_dt = g1_rcpm_dt;
	}

	public void setG1_rcpm_amt(String g1_rcpm_amt){
		this.g1_rcpm_amt = g1_rcpm_amt;
	}

	public void setG1_rcpm_pers_nm(String g1_rcpm_pers_nm){
		this.g1_rcpm_pers_nm = g1_rcpm_pers_nm;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getReceiptissue(){
		return this.receiptissue;
	}

	public String getPaymentmemo(){
		return this.paymentmemo;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getG1_rcpm_dt(){
		return this.g1_rcpm_dt;
	}

	public String getG1_rcpm_amt(){
		return this.g1_rcpm_amt;
	}

	public String getG1_rcpm_pers_nm(){
		return this.g1_rcpm_pers_nm;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1050_ADM dm = (TN_DNS_1050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.promiseidx);
		cstmt.setString(6, dm.memberidx);
		cstmt.setString(7, dm.paymentidx);
		cstmt.setString(8, dm.paydate);
		cstmt.setString(9, dm.payprice);
		cstmt.setString(10, dm.receiptissue);
		cstmt.setString(11, dm.paymentmemo);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.g1_rcpm_dt);
		cstmt.setString(15, dm.g1_rcpm_amt);
		cstmt.setString(16, dm.g1_rcpm_pers_nm);
		cstmt.setString(17, dm.biz_reg_no);
		cstmt.setString(18, dm.bank_id);
		cstmt.setString(19, dm.acct_num);
		cstmt.setString(20, dm.tran_date_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("paymentidx = [" + getPaymentidx() + "]");
		System.out.println("paydate = [" + getPaydate() + "]");
		System.out.println("payprice = [" + getPayprice() + "]");
		System.out.println("receiptissue = [" + getReceiptissue() + "]");
		System.out.println("paymentmemo = [" + getPaymentmemo() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("g1_rcpm_dt = [" + getG1_rcpm_dt() + "]");
		System.out.println("g1_rcpm_amt = [" + getG1_rcpm_amt() + "]");
		System.out.println("g1_rcpm_pers_nm = [" + getG1_rcpm_pers_nm() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String paymentidx = req.getParameter("paymentidx");
if( paymentidx == null){
	System.out.println(this.toString+" : paymentidx is null" );
}else{
	System.out.println(this.toString+" : paymentidx is "+paymentidx );
}
String paydate = req.getParameter("paydate");
if( paydate == null){
	System.out.println(this.toString+" : paydate is null" );
}else{
	System.out.println(this.toString+" : paydate is "+paydate );
}
String payprice = req.getParameter("payprice");
if( payprice == null){
	System.out.println(this.toString+" : payprice is null" );
}else{
	System.out.println(this.toString+" : payprice is "+payprice );
}
String receiptissue = req.getParameter("receiptissue");
if( receiptissue == null){
	System.out.println(this.toString+" : receiptissue is null" );
}else{
	System.out.println(this.toString+" : receiptissue is "+receiptissue );
}
String paymentmemo = req.getParameter("paymentmemo");
if( paymentmemo == null){
	System.out.println(this.toString+" : paymentmemo is null" );
}else{
	System.out.println(this.toString+" : paymentmemo is "+paymentmemo );
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
String g1_rcpm_dt = req.getParameter("g1_rcpm_dt");
if( g1_rcpm_dt == null){
	System.out.println(this.toString+" : g1_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_dt is "+g1_rcpm_dt );
}
String g1_rcpm_amt = req.getParameter("g1_rcpm_amt");
if( g1_rcpm_amt == null){
	System.out.println(this.toString+" : g1_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_amt is "+g1_rcpm_amt );
}
String g1_rcpm_pers_nm = req.getParameter("g1_rcpm_pers_nm");
if( g1_rcpm_pers_nm == null){
	System.out.println(this.toString+" : g1_rcpm_pers_nm is null" );
}else{
	System.out.println(this.toString+" : g1_rcpm_pers_nm is "+g1_rcpm_pers_nm );
}
String biz_reg_no = req.getParameter("biz_reg_no");
if( biz_reg_no == null){
	System.out.println(this.toString+" : biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no is "+biz_reg_no );
}
String bank_id = req.getParameter("bank_id");
if( bank_id == null){
	System.out.println(this.toString+" : bank_id is null" );
}else{
	System.out.println(this.toString+" : bank_id is "+bank_id );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String paymentidx = Util.checkString(req.getParameter("paymentidx"));
String paydate = Util.checkString(req.getParameter("paydate"));
String payprice = Util.checkString(req.getParameter("payprice"));
String receiptissue = Util.checkString(req.getParameter("receiptissue"));
String paymentmemo = Util.checkString(req.getParameter("paymentmemo"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String g1_rcpm_dt = Util.checkString(req.getParameter("g1_rcpm_dt"));
String g1_rcpm_amt = Util.checkString(req.getParameter("g1_rcpm_amt"));
String g1_rcpm_pers_nm = Util.checkString(req.getParameter("g1_rcpm_pers_nm"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String paymentidx = Util.Uni2Ksc(Util.checkString(req.getParameter("paymentidx")));
String paydate = Util.Uni2Ksc(Util.checkString(req.getParameter("paydate")));
String payprice = Util.Uni2Ksc(Util.checkString(req.getParameter("payprice")));
String receiptissue = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptissue")));
String paymentmemo = Util.Uni2Ksc(Util.checkString(req.getParameter("paymentmemo")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String g1_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_dt")));
String g1_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_amt")));
String g1_rcpm_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("g1_rcpm_pers_nm")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setPromiseidx(promiseidx);
dm.setMemberidx(memberidx);
dm.setPaymentidx(paymentidx);
dm.setPaydate(paydate);
dm.setPayprice(payprice);
dm.setReceiptissue(receiptissue);
dm.setPaymentmemo(paymentmemo);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setG1_rcpm_dt(g1_rcpm_dt);
dm.setG1_rcpm_amt(g1_rcpm_amt);
dm.setG1_rcpm_pers_nm(g1_rcpm_pers_nm);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date_seq(tran_date_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 10 10:59:36 KST 2016 */