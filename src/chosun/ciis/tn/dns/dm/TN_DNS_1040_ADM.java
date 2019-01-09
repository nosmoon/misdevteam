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


public class TN_DNS_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String incmg_pers;
	public String memberidx;
	public String promiseidx;
	public String promisedate;
	public String promiseprice;
	public String paystopped;
	public String contributormemo;
	public String promisememo;
	public String fundidx;
	public String supportidx;
	public String useoriginal;
	public String purposememo;
	public String paymethod;
	public String paymethodcode;
	public String bankaccoutcode;
	public String bankownerclsf;
	public String bankowneridentity;
	public String bankcode;
	public String bankaccount;
	public String bankaccountowner;
	public String filename;
	public String partitiontype;
	public String monthlypayday;
	public String monthlypayprice;
	public String partitioncount;
	public String paystartdate;
	public String payenddate;
	public String excludenopay;
	public String stopdate;
	public String stopresn;
	public String itemname;
	public String itemqty;
	public String itemprice;
	public String itemremk;
	public String cardcmpy;
	public String cardnumber;
	public String cardyymm;
	public String mobiaprvname;
	public String mobiaprvcmpy;
	public String mobiaprvnumber;
	public String mobiaprvprn;
	public String cmsstopped;
	public String cmsstopdate;
	public String cmsstatus;
	public String cmsupdatedate;
	public String cardidentity;
	public String cardowner;

	public TN_DNS_1040_ADM(){}
	public TN_DNS_1040_ADM(String mode, String cmpy_cd, String incmg_pers, String memberidx, String promiseidx, String promisedate, String promiseprice, String paystopped, String contributormemo, String promisememo, String fundidx, String supportidx, String useoriginal, String purposememo, String paymethod, String paymethodcode, String bankaccoutcode, String bankownerclsf, String bankowneridentity, String bankcode, String bankaccount, String bankaccountowner, String filename, String partitiontype, String monthlypayday, String monthlypayprice, String partitioncount, String paystartdate, String payenddate, String excludenopay, String stopdate, String stopresn, String itemname, String itemqty, String itemprice, String itemremk, String cardcmpy, String cardnumber, String cardyymm, String mobiaprvname, String mobiaprvcmpy, String mobiaprvnumber, String mobiaprvprn, String cmsstopped, String cmsstopdate, String cmsstatus, String cmsupdatedate, String cardidentity, String cardowner){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.memberidx = memberidx;
		this.promiseidx = promiseidx;
		this.promisedate = promisedate;
		this.promiseprice = promiseprice;
		this.paystopped = paystopped;
		this.contributormemo = contributormemo;
		this.promisememo = promisememo;
		this.fundidx = fundidx;
		this.supportidx = supportidx;
		this.useoriginal = useoriginal;
		this.purposememo = purposememo;
		this.paymethod = paymethod;
		this.paymethodcode = paymethodcode;
		this.bankaccoutcode = bankaccoutcode;
		this.bankownerclsf = bankownerclsf;
		this.bankowneridentity = bankowneridentity;
		this.bankcode = bankcode;
		this.bankaccount = bankaccount;
		this.bankaccountowner = bankaccountowner;
		this.filename = filename;
		this.partitiontype = partitiontype;
		this.monthlypayday = monthlypayday;
		this.monthlypayprice = monthlypayprice;
		this.partitioncount = partitioncount;
		this.paystartdate = paystartdate;
		this.payenddate = payenddate;
		this.excludenopay = excludenopay;
		this.stopdate = stopdate;
		this.stopresn = stopresn;
		this.itemname = itemname;
		this.itemqty = itemqty;
		this.itemprice = itemprice;
		this.itemremk = itemremk;
		this.cardcmpy = cardcmpy;
		this.cardnumber = cardnumber;
		this.cardyymm = cardyymm;
		this.mobiaprvname = mobiaprvname;
		this.mobiaprvcmpy = mobiaprvcmpy;
		this.mobiaprvnumber = mobiaprvnumber;
		this.mobiaprvprn = mobiaprvprn;
		this.cmsstopped = cmsstopped;
		this.cmsstopdate = cmsstopdate;
		this.cmsstatus = cmsstatus;
		this.cmsupdatedate = cmsupdatedate;
		this.cardidentity = cardidentity;
		this.cardowner = cardowner;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setPromisedate(String promisedate){
		this.promisedate = promisedate;
	}

	public void setPromiseprice(String promiseprice){
		this.promiseprice = promiseprice;
	}

	public void setPaystopped(String paystopped){
		this.paystopped = paystopped;
	}

	public void setContributormemo(String contributormemo){
		this.contributormemo = contributormemo;
	}

	public void setPromisememo(String promisememo){
		this.promisememo = promisememo;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setUseoriginal(String useoriginal){
		this.useoriginal = useoriginal;
	}

	public void setPurposememo(String purposememo){
		this.purposememo = purposememo;
	}

	public void setPaymethod(String paymethod){
		this.paymethod = paymethod;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setBankaccoutcode(String bankaccoutcode){
		this.bankaccoutcode = bankaccoutcode;
	}

	public void setBankownerclsf(String bankownerclsf){
		this.bankownerclsf = bankownerclsf;
	}

	public void setBankowneridentity(String bankowneridentity){
		this.bankowneridentity = bankowneridentity;
	}

	public void setBankcode(String bankcode){
		this.bankcode = bankcode;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setFilename(String filename){
		this.filename = filename;
	}

	public void setPartitiontype(String partitiontype){
		this.partitiontype = partitiontype;
	}

	public void setMonthlypayday(String monthlypayday){
		this.monthlypayday = monthlypayday;
	}

	public void setMonthlypayprice(String monthlypayprice){
		this.monthlypayprice = monthlypayprice;
	}

	public void setPartitioncount(String partitioncount){
		this.partitioncount = partitioncount;
	}

	public void setPaystartdate(String paystartdate){
		this.paystartdate = paystartdate;
	}

	public void setPayenddate(String payenddate){
		this.payenddate = payenddate;
	}

	public void setExcludenopay(String excludenopay){
		this.excludenopay = excludenopay;
	}

	public void setStopdate(String stopdate){
		this.stopdate = stopdate;
	}

	public void setStopresn(String stopresn){
		this.stopresn = stopresn;
	}

	public void setItemname(String itemname){
		this.itemname = itemname;
	}

	public void setItemqty(String itemqty){
		this.itemqty = itemqty;
	}

	public void setItemprice(String itemprice){
		this.itemprice = itemprice;
	}

	public void setItemremk(String itemremk){
		this.itemremk = itemremk;
	}

	public void setCardcmpy(String cardcmpy){
		this.cardcmpy = cardcmpy;
	}

	public void setCardnumber(String cardnumber){
		this.cardnumber = cardnumber;
	}

	public void setCardyymm(String cardyymm){
		this.cardyymm = cardyymm;
	}

	public void setMobiaprvname(String mobiaprvname){
		this.mobiaprvname = mobiaprvname;
	}

	public void setMobiaprvcmpy(String mobiaprvcmpy){
		this.mobiaprvcmpy = mobiaprvcmpy;
	}

	public void setMobiaprvnumber(String mobiaprvnumber){
		this.mobiaprvnumber = mobiaprvnumber;
	}

	public void setMobiaprvprn(String mobiaprvprn){
		this.mobiaprvprn = mobiaprvprn;
	}

	public void setCmsstopped(String cmsstopped){
		this.cmsstopped = cmsstopped;
	}

	public void setCmsstopdate(String cmsstopdate){
		this.cmsstopdate = cmsstopdate;
	}

	public void setCmsstatus(String cmsstatus){
		this.cmsstatus = cmsstatus;
	}

	public void setCmsupdatedate(String cmsupdatedate){
		this.cmsupdatedate = cmsupdatedate;
	}

	public void setCardidentity(String cardidentity){
		this.cardidentity = cardidentity;
	}

	public void setCardowner(String cardowner){
		this.cardowner = cardowner;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getPromisedate(){
		return this.promisedate;
	}

	public String getPromiseprice(){
		return this.promiseprice;
	}

	public String getPaystopped(){
		return this.paystopped;
	}

	public String getContributormemo(){
		return this.contributormemo;
	}

	public String getPromisememo(){
		return this.promisememo;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getUseoriginal(){
		return this.useoriginal;
	}

	public String getPurposememo(){
		return this.purposememo;
	}

	public String getPaymethod(){
		return this.paymethod;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getBankaccoutcode(){
		return this.bankaccoutcode;
	}

	public String getBankownerclsf(){
		return this.bankownerclsf;
	}

	public String getBankowneridentity(){
		return this.bankowneridentity;
	}

	public String getBankcode(){
		return this.bankcode;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getFilename(){
		return this.filename;
	}

	public String getPartitiontype(){
		return this.partitiontype;
	}

	public String getMonthlypayday(){
		return this.monthlypayday;
	}

	public String getMonthlypayprice(){
		return this.monthlypayprice;
	}

	public String getPartitioncount(){
		return this.partitioncount;
	}

	public String getPaystartdate(){
		return this.paystartdate;
	}

	public String getPayenddate(){
		return this.payenddate;
	}

	public String getExcludenopay(){
		return this.excludenopay;
	}

	public String getStopdate(){
		return this.stopdate;
	}

	public String getStopresn(){
		return this.stopresn;
	}

	public String getItemname(){
		return this.itemname;
	}

	public String getItemqty(){
		return this.itemqty;
	}

	public String getItemprice(){
		return this.itemprice;
	}

	public String getItemremk(){
		return this.itemremk;
	}

	public String getCardcmpy(){
		return this.cardcmpy;
	}

	public String getCardnumber(){
		return this.cardnumber;
	}

	public String getCardyymm(){
		return this.cardyymm;
	}

	public String getMobiaprvname(){
		return this.mobiaprvname;
	}

	public String getMobiaprvcmpy(){
		return this.mobiaprvcmpy;
	}

	public String getMobiaprvnumber(){
		return this.mobiaprvnumber;
	}

	public String getMobiaprvprn(){
		return this.mobiaprvprn;
	}

	public String getCmsstopped(){
		return this.cmsstopped;
	}

	public String getCmsstopdate(){
		return this.cmsstopdate;
	}

	public String getCmsstatus(){
		return this.cmsstatus;
	}

	public String getCmsupdatedate(){
		return this.cmsupdatedate;
	}

	public String getCardidentity(){
		return this.cardidentity;
	}

	public String getCardowner(){
		return this.cardowner;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1040_ADM dm = (TN_DNS_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.memberidx);
		cstmt.setString(7, dm.promiseidx);
		cstmt.setString(8, dm.promisedate);
		cstmt.setString(9, dm.promiseprice);
		cstmt.setString(10, dm.paystopped);
		cstmt.setString(11, dm.contributormemo);
		cstmt.setString(12, dm.promisememo);
		cstmt.setString(13, dm.fundidx);
		cstmt.setString(14, dm.supportidx);
		cstmt.setString(15, dm.useoriginal);
		cstmt.setString(16, dm.purposememo);
		cstmt.setString(17, dm.paymethod);
		cstmt.setString(18, dm.paymethodcode);
		cstmt.setString(19, dm.bankaccoutcode);
		cstmt.setString(20, dm.bankownerclsf);
		cstmt.setString(21, dm.bankowneridentity);
		cstmt.setString(22, dm.bankcode);
		cstmt.setString(23, dm.bankaccount);
		cstmt.setString(24, dm.bankaccountowner);
		cstmt.setString(25, dm.filename);
		cstmt.setString(26, dm.partitiontype);
		cstmt.setString(27, dm.monthlypayday);
		cstmt.setString(28, dm.monthlypayprice);
		cstmt.setString(29, dm.partitioncount);
		cstmt.setString(30, dm.paystartdate);
		cstmt.setString(31, dm.payenddate);
		cstmt.setString(32, dm.excludenopay);
		cstmt.setString(33, dm.stopdate);
		cstmt.setString(34, dm.stopresn);
		cstmt.setString(35, dm.itemname);
		cstmt.setString(36, dm.itemqty);
		cstmt.setString(37, dm.itemprice);
		cstmt.setString(38, dm.itemremk);
		cstmt.setString(39, dm.cardcmpy);
		cstmt.setString(40, dm.cardnumber);
		cstmt.setString(41, dm.cardyymm);
		cstmt.setString(42, dm.mobiaprvname);
		cstmt.setString(43, dm.mobiaprvcmpy);
		cstmt.setString(44, dm.mobiaprvnumber);
		cstmt.setString(45, dm.mobiaprvprn);
		cstmt.setString(46, dm.cmsstopped);
		cstmt.setString(47, dm.cmsstopdate);
		cstmt.setString(48, dm.cmsstatus);
		cstmt.setString(49, dm.cmsupdatedate);
		cstmt.setString(50, dm.cardidentity);
		cstmt.setString(51, dm.cardowner);
		cstmt.registerOutParameter(52, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("promisedate = [" + getPromisedate() + "]");
		System.out.println("promiseprice = [" + getPromiseprice() + "]");
		System.out.println("paystopped = [" + getPaystopped() + "]");
		System.out.println("contributormemo = [" + getContributormemo() + "]");
		System.out.println("promisememo = [" + getPromisememo() + "]");
		System.out.println("fundidx = [" + getFundidx() + "]");
		System.out.println("supportidx = [" + getSupportidx() + "]");
		System.out.println("useoriginal = [" + getUseoriginal() + "]");
		System.out.println("purposememo = [" + getPurposememo() + "]");
		System.out.println("paymethod = [" + getPaymethod() + "]");
		System.out.println("paymethodcode = [" + getPaymethodcode() + "]");
		System.out.println("bankaccoutcode = [" + getBankaccoutcode() + "]");
		System.out.println("bankownerclsf = [" + getBankownerclsf() + "]");
		System.out.println("bankowneridentity = [" + getBankowneridentity() + "]");
		System.out.println("bankcode = [" + getBankcode() + "]");
		System.out.println("bankaccount = [" + getBankaccount() + "]");
		System.out.println("bankaccountowner = [" + getBankaccountowner() + "]");
		System.out.println("filename = [" + getFilename() + "]");
		System.out.println("partitiontype = [" + getPartitiontype() + "]");
		System.out.println("monthlypayday = [" + getMonthlypayday() + "]");
		System.out.println("monthlypayprice = [" + getMonthlypayprice() + "]");
		System.out.println("partitioncount = [" + getPartitioncount() + "]");
		System.out.println("paystartdate = [" + getPaystartdate() + "]");
		System.out.println("payenddate = [" + getPayenddate() + "]");
		System.out.println("excludenopay = [" + getExcludenopay() + "]");
		System.out.println("stopdate = [" + getStopdate() + "]");
		System.out.println("stopresn = [" + getStopresn() + "]");
		System.out.println("itemname = [" + getItemname() + "]");
		System.out.println("itemqty = [" + getItemqty() + "]");
		System.out.println("itemprice = [" + getItemprice() + "]");
		System.out.println("itemremk = [" + getItemremk() + "]");
		System.out.println("cardcmpy = [" + getCardcmpy() + "]");
		System.out.println("cardnumber = [" + getCardnumber() + "]");
		System.out.println("cardyymm = [" + getCardyymm() + "]");
		System.out.println("mobiaprvname = [" + getMobiaprvname() + "]");
		System.out.println("mobiaprvcmpy = [" + getMobiaprvcmpy() + "]");
		System.out.println("mobiaprvnumber = [" + getMobiaprvnumber() + "]");
		System.out.println("mobiaprvprn = [" + getMobiaprvprn() + "]");
		System.out.println("cmsstopped = [" + getCmsstopped() + "]");
		System.out.println("cmsstopdate = [" + getCmsstopdate() + "]");
		System.out.println("cmsstatus = [" + getCmsstatus() + "]");
		System.out.println("cmsupdatedate = [" + getCmsupdatedate() + "]");
		System.out.println("cardidentity = [" + getCardidentity() + "]");
		System.out.println("cardowner = [" + getCardowner() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String promisedate = req.getParameter("promisedate");
if( promisedate == null){
	System.out.println(this.toString+" : promisedate is null" );
}else{
	System.out.println(this.toString+" : promisedate is "+promisedate );
}
String promiseprice = req.getParameter("promiseprice");
if( promiseprice == null){
	System.out.println(this.toString+" : promiseprice is null" );
}else{
	System.out.println(this.toString+" : promiseprice is "+promiseprice );
}
String paystopped = req.getParameter("paystopped");
if( paystopped == null){
	System.out.println(this.toString+" : paystopped is null" );
}else{
	System.out.println(this.toString+" : paystopped is "+paystopped );
}
String contributormemo = req.getParameter("contributormemo");
if( contributormemo == null){
	System.out.println(this.toString+" : contributormemo is null" );
}else{
	System.out.println(this.toString+" : contributormemo is "+contributormemo );
}
String promisememo = req.getParameter("promisememo");
if( promisememo == null){
	System.out.println(this.toString+" : promisememo is null" );
}else{
	System.out.println(this.toString+" : promisememo is "+promisememo );
}
String fundidx = req.getParameter("fundidx");
if( fundidx == null){
	System.out.println(this.toString+" : fundidx is null" );
}else{
	System.out.println(this.toString+" : fundidx is "+fundidx );
}
String supportidx = req.getParameter("supportidx");
if( supportidx == null){
	System.out.println(this.toString+" : supportidx is null" );
}else{
	System.out.println(this.toString+" : supportidx is "+supportidx );
}
String useoriginal = req.getParameter("useoriginal");
if( useoriginal == null){
	System.out.println(this.toString+" : useoriginal is null" );
}else{
	System.out.println(this.toString+" : useoriginal is "+useoriginal );
}
String purposememo = req.getParameter("purposememo");
if( purposememo == null){
	System.out.println(this.toString+" : purposememo is null" );
}else{
	System.out.println(this.toString+" : purposememo is "+purposememo );
}
String paymethod = req.getParameter("paymethod");
if( paymethod == null){
	System.out.println(this.toString+" : paymethod is null" );
}else{
	System.out.println(this.toString+" : paymethod is "+paymethod );
}
String paymethodcode = req.getParameter("paymethodcode");
if( paymethodcode == null){
	System.out.println(this.toString+" : paymethodcode is null" );
}else{
	System.out.println(this.toString+" : paymethodcode is "+paymethodcode );
}
String bankaccoutcode = req.getParameter("bankaccoutcode");
if( bankaccoutcode == null){
	System.out.println(this.toString+" : bankaccoutcode is null" );
}else{
	System.out.println(this.toString+" : bankaccoutcode is "+bankaccoutcode );
}
String bankownerclsf = req.getParameter("bankownerclsf");
if( bankownerclsf == null){
	System.out.println(this.toString+" : bankownerclsf is null" );
}else{
	System.out.println(this.toString+" : bankownerclsf is "+bankownerclsf );
}
String bankowneridentity = req.getParameter("bankowneridentity");
if( bankowneridentity == null){
	System.out.println(this.toString+" : bankowneridentity is null" );
}else{
	System.out.println(this.toString+" : bankowneridentity is "+bankowneridentity );
}
String bankcode = req.getParameter("bankcode");
if( bankcode == null){
	System.out.println(this.toString+" : bankcode is null" );
}else{
	System.out.println(this.toString+" : bankcode is "+bankcode );
}
String bankaccount = req.getParameter("bankaccount");
if( bankaccount == null){
	System.out.println(this.toString+" : bankaccount is null" );
}else{
	System.out.println(this.toString+" : bankaccount is "+bankaccount );
}
String bankaccountowner = req.getParameter("bankaccountowner");
if( bankaccountowner == null){
	System.out.println(this.toString+" : bankaccountowner is null" );
}else{
	System.out.println(this.toString+" : bankaccountowner is "+bankaccountowner );
}
String filename = req.getParameter("filename");
if( filename == null){
	System.out.println(this.toString+" : filename is null" );
}else{
	System.out.println(this.toString+" : filename is "+filename );
}
String partitiontype = req.getParameter("partitiontype");
if( partitiontype == null){
	System.out.println(this.toString+" : partitiontype is null" );
}else{
	System.out.println(this.toString+" : partitiontype is "+partitiontype );
}
String monthlypayday = req.getParameter("monthlypayday");
if( monthlypayday == null){
	System.out.println(this.toString+" : monthlypayday is null" );
}else{
	System.out.println(this.toString+" : monthlypayday is "+monthlypayday );
}
String monthlypayprice = req.getParameter("monthlypayprice");
if( monthlypayprice == null){
	System.out.println(this.toString+" : monthlypayprice is null" );
}else{
	System.out.println(this.toString+" : monthlypayprice is "+monthlypayprice );
}
String partitioncount = req.getParameter("partitioncount");
if( partitioncount == null){
	System.out.println(this.toString+" : partitioncount is null" );
}else{
	System.out.println(this.toString+" : partitioncount is "+partitioncount );
}
String paystartdate = req.getParameter("paystartdate");
if( paystartdate == null){
	System.out.println(this.toString+" : paystartdate is null" );
}else{
	System.out.println(this.toString+" : paystartdate is "+paystartdate );
}
String payenddate = req.getParameter("payenddate");
if( payenddate == null){
	System.out.println(this.toString+" : payenddate is null" );
}else{
	System.out.println(this.toString+" : payenddate is "+payenddate );
}
String excludenopay = req.getParameter("excludenopay");
if( excludenopay == null){
	System.out.println(this.toString+" : excludenopay is null" );
}else{
	System.out.println(this.toString+" : excludenopay is "+excludenopay );
}
String stopdate = req.getParameter("stopdate");
if( stopdate == null){
	System.out.println(this.toString+" : stopdate is null" );
}else{
	System.out.println(this.toString+" : stopdate is "+stopdate );
}
String stopresn = req.getParameter("stopresn");
if( stopresn == null){
	System.out.println(this.toString+" : stopresn is null" );
}else{
	System.out.println(this.toString+" : stopresn is "+stopresn );
}
String itemname = req.getParameter("itemname");
if( itemname == null){
	System.out.println(this.toString+" : itemname is null" );
}else{
	System.out.println(this.toString+" : itemname is "+itemname );
}
String itemqty = req.getParameter("itemqty");
if( itemqty == null){
	System.out.println(this.toString+" : itemqty is null" );
}else{
	System.out.println(this.toString+" : itemqty is "+itemqty );
}
String itemprice = req.getParameter("itemprice");
if( itemprice == null){
	System.out.println(this.toString+" : itemprice is null" );
}else{
	System.out.println(this.toString+" : itemprice is "+itemprice );
}
String itemremk = req.getParameter("itemremk");
if( itemremk == null){
	System.out.println(this.toString+" : itemremk is null" );
}else{
	System.out.println(this.toString+" : itemremk is "+itemremk );
}
String cardcmpy = req.getParameter("cardcmpy");
if( cardcmpy == null){
	System.out.println(this.toString+" : cardcmpy is null" );
}else{
	System.out.println(this.toString+" : cardcmpy is "+cardcmpy );
}
String cardnumber = req.getParameter("cardnumber");
if( cardnumber == null){
	System.out.println(this.toString+" : cardnumber is null" );
}else{
	System.out.println(this.toString+" : cardnumber is "+cardnumber );
}
String cardyymm = req.getParameter("cardyymm");
if( cardyymm == null){
	System.out.println(this.toString+" : cardyymm is null" );
}else{
	System.out.println(this.toString+" : cardyymm is "+cardyymm );
}
String mobiaprvname = req.getParameter("mobiaprvname");
if( mobiaprvname == null){
	System.out.println(this.toString+" : mobiaprvname is null" );
}else{
	System.out.println(this.toString+" : mobiaprvname is "+mobiaprvname );
}
String mobiaprvcmpy = req.getParameter("mobiaprvcmpy");
if( mobiaprvcmpy == null){
	System.out.println(this.toString+" : mobiaprvcmpy is null" );
}else{
	System.out.println(this.toString+" : mobiaprvcmpy is "+mobiaprvcmpy );
}
String mobiaprvnumber = req.getParameter("mobiaprvnumber");
if( mobiaprvnumber == null){
	System.out.println(this.toString+" : mobiaprvnumber is null" );
}else{
	System.out.println(this.toString+" : mobiaprvnumber is "+mobiaprvnumber );
}
String mobiaprvprn = req.getParameter("mobiaprvprn");
if( mobiaprvprn == null){
	System.out.println(this.toString+" : mobiaprvprn is null" );
}else{
	System.out.println(this.toString+" : mobiaprvprn is "+mobiaprvprn );
}
String cmsstopped = req.getParameter("cmsstopped");
if( cmsstopped == null){
	System.out.println(this.toString+" : cmsstopped is null" );
}else{
	System.out.println(this.toString+" : cmsstopped is "+cmsstopped );
}
String cmsstopdate = req.getParameter("cmsstopdate");
if( cmsstopdate == null){
	System.out.println(this.toString+" : cmsstopdate is null" );
}else{
	System.out.println(this.toString+" : cmsstopdate is "+cmsstopdate );
}
String cmsstatus = req.getParameter("cmsstatus");
if( cmsstatus == null){
	System.out.println(this.toString+" : cmsstatus is null" );
}else{
	System.out.println(this.toString+" : cmsstatus is "+cmsstatus );
}
String cmsupdatedate = req.getParameter("cmsupdatedate");
if( cmsupdatedate == null){
	System.out.println(this.toString+" : cmsupdatedate is null" );
}else{
	System.out.println(this.toString+" : cmsupdatedate is "+cmsupdatedate );
}
String cardidentity = req.getParameter("cardidentity");
if( cardidentity == null){
	System.out.println(this.toString+" : cardidentity is null" );
}else{
	System.out.println(this.toString+" : cardidentity is "+cardidentity );
}
String cardowner = req.getParameter("cardowner");
if( cardowner == null){
	System.out.println(this.toString+" : cardowner is null" );
}else{
	System.out.println(this.toString+" : cardowner is "+cardowner );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String promisedate = Util.checkString(req.getParameter("promisedate"));
String promiseprice = Util.checkString(req.getParameter("promiseprice"));
String paystopped = Util.checkString(req.getParameter("paystopped"));
String contributormemo = Util.checkString(req.getParameter("contributormemo"));
String promisememo = Util.checkString(req.getParameter("promisememo"));
String fundidx = Util.checkString(req.getParameter("fundidx"));
String supportidx = Util.checkString(req.getParameter("supportidx"));
String useoriginal = Util.checkString(req.getParameter("useoriginal"));
String purposememo = Util.checkString(req.getParameter("purposememo"));
String paymethod = Util.checkString(req.getParameter("paymethod"));
String paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
String bankaccoutcode = Util.checkString(req.getParameter("bankaccoutcode"));
String bankownerclsf = Util.checkString(req.getParameter("bankownerclsf"));
String bankowneridentity = Util.checkString(req.getParameter("bankowneridentity"));
String bankcode = Util.checkString(req.getParameter("bankcode"));
String bankaccount = Util.checkString(req.getParameter("bankaccount"));
String bankaccountowner = Util.checkString(req.getParameter("bankaccountowner"));
String filename = Util.checkString(req.getParameter("filename"));
String partitiontype = Util.checkString(req.getParameter("partitiontype"));
String monthlypayday = Util.checkString(req.getParameter("monthlypayday"));
String monthlypayprice = Util.checkString(req.getParameter("monthlypayprice"));
String partitioncount = Util.checkString(req.getParameter("partitioncount"));
String paystartdate = Util.checkString(req.getParameter("paystartdate"));
String payenddate = Util.checkString(req.getParameter("payenddate"));
String excludenopay = Util.checkString(req.getParameter("excludenopay"));
String stopdate = Util.checkString(req.getParameter("stopdate"));
String stopresn = Util.checkString(req.getParameter("stopresn"));
String itemname = Util.checkString(req.getParameter("itemname"));
String itemqty = Util.checkString(req.getParameter("itemqty"));
String itemprice = Util.checkString(req.getParameter("itemprice"));
String itemremk = Util.checkString(req.getParameter("itemremk"));
String cardcmpy = Util.checkString(req.getParameter("cardcmpy"));
String cardnumber = Util.checkString(req.getParameter("cardnumber"));
String cardyymm = Util.checkString(req.getParameter("cardyymm"));
String mobiaprvname = Util.checkString(req.getParameter("mobiaprvname"));
String mobiaprvcmpy = Util.checkString(req.getParameter("mobiaprvcmpy"));
String mobiaprvnumber = Util.checkString(req.getParameter("mobiaprvnumber"));
String mobiaprvprn = Util.checkString(req.getParameter("mobiaprvprn"));
String cmsstopped = Util.checkString(req.getParameter("cmsstopped"));
String cmsstopdate = Util.checkString(req.getParameter("cmsstopdate"));
String cmsstatus = Util.checkString(req.getParameter("cmsstatus"));
String cmsupdatedate = Util.checkString(req.getParameter("cmsupdatedate"));
String cardidentity = Util.checkString(req.getParameter("cardidentity"));
String cardowner = Util.checkString(req.getParameter("cardowner"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String promisedate = Util.Uni2Ksc(Util.checkString(req.getParameter("promisedate")));
String promiseprice = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseprice")));
String paystopped = Util.Uni2Ksc(Util.checkString(req.getParameter("paystopped")));
String contributormemo = Util.Uni2Ksc(Util.checkString(req.getParameter("contributormemo")));
String promisememo = Util.Uni2Ksc(Util.checkString(req.getParameter("promisememo")));
String fundidx = Util.Uni2Ksc(Util.checkString(req.getParameter("fundidx")));
String supportidx = Util.Uni2Ksc(Util.checkString(req.getParameter("supportidx")));
String useoriginal = Util.Uni2Ksc(Util.checkString(req.getParameter("useoriginal")));
String purposememo = Util.Uni2Ksc(Util.checkString(req.getParameter("purposememo")));
String paymethod = Util.Uni2Ksc(Util.checkString(req.getParameter("paymethod")));
String paymethodcode = Util.Uni2Ksc(Util.checkString(req.getParameter("paymethodcode")));
String bankaccoutcode = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccoutcode")));
String bankownerclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bankownerclsf")));
String bankowneridentity = Util.Uni2Ksc(Util.checkString(req.getParameter("bankowneridentity")));
String bankcode = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcode")));
String bankaccount = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccount")));
String bankaccountowner = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccountowner")));
String filename = Util.Uni2Ksc(Util.checkString(req.getParameter("filename")));
String partitiontype = Util.Uni2Ksc(Util.checkString(req.getParameter("partitiontype")));
String monthlypayday = Util.Uni2Ksc(Util.checkString(req.getParameter("monthlypayday")));
String monthlypayprice = Util.Uni2Ksc(Util.checkString(req.getParameter("monthlypayprice")));
String partitioncount = Util.Uni2Ksc(Util.checkString(req.getParameter("partitioncount")));
String paystartdate = Util.Uni2Ksc(Util.checkString(req.getParameter("paystartdate")));
String payenddate = Util.Uni2Ksc(Util.checkString(req.getParameter("payenddate")));
String excludenopay = Util.Uni2Ksc(Util.checkString(req.getParameter("excludenopay")));
String stopdate = Util.Uni2Ksc(Util.checkString(req.getParameter("stopdate")));
String stopresn = Util.Uni2Ksc(Util.checkString(req.getParameter("stopresn")));
String itemname = Util.Uni2Ksc(Util.checkString(req.getParameter("itemname")));
String itemqty = Util.Uni2Ksc(Util.checkString(req.getParameter("itemqty")));
String itemprice = Util.Uni2Ksc(Util.checkString(req.getParameter("itemprice")));
String itemremk = Util.Uni2Ksc(Util.checkString(req.getParameter("itemremk")));
String cardcmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("cardcmpy")));
String cardnumber = Util.Uni2Ksc(Util.checkString(req.getParameter("cardnumber")));
String cardyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("cardyymm")));
String mobiaprvname = Util.Uni2Ksc(Util.checkString(req.getParameter("mobiaprvname")));
String mobiaprvcmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("mobiaprvcmpy")));
String mobiaprvnumber = Util.Uni2Ksc(Util.checkString(req.getParameter("mobiaprvnumber")));
String mobiaprvprn = Util.Uni2Ksc(Util.checkString(req.getParameter("mobiaprvprn")));
String cmsstopped = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsstopped")));
String cmsstopdate = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsstopdate")));
String cmsstatus = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsstatus")));
String cmsupdatedate = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsupdatedate")));
String cardidentity = Util.Uni2Ksc(Util.checkString(req.getParameter("cardidentity")));
String cardowner = Util.Uni2Ksc(Util.checkString(req.getParameter("cardowner")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMemberidx(memberidx);
dm.setPromiseidx(promiseidx);
dm.setPromisedate(promisedate);
dm.setPromiseprice(promiseprice);
dm.setPaystopped(paystopped);
dm.setContributormemo(contributormemo);
dm.setPromisememo(promisememo);
dm.setFundidx(fundidx);
dm.setSupportidx(supportidx);
dm.setUseoriginal(useoriginal);
dm.setPurposememo(purposememo);
dm.setPaymethod(paymethod);
dm.setPaymethodcode(paymethodcode);
dm.setBankaccoutcode(bankaccoutcode);
dm.setBankownerclsf(bankownerclsf);
dm.setBankowneridentity(bankowneridentity);
dm.setBankcode(bankcode);
dm.setBankaccount(bankaccount);
dm.setBankaccountowner(bankaccountowner);
dm.setFilename(filename);
dm.setPartitiontype(partitiontype);
dm.setMonthlypayday(monthlypayday);
dm.setMonthlypayprice(monthlypayprice);
dm.setPartitioncount(partitioncount);
dm.setPaystartdate(paystartdate);
dm.setPayenddate(payenddate);
dm.setExcludenopay(excludenopay);
dm.setStopdate(stopdate);
dm.setStopresn(stopresn);
dm.setItemname(itemname);
dm.setItemqty(itemqty);
dm.setItemprice(itemprice);
dm.setItemremk(itemremk);
dm.setCardcmpy(cardcmpy);
dm.setCardnumber(cardnumber);
dm.setCardyymm(cardyymm);
dm.setMobiaprvname(mobiaprvname);
dm.setMobiaprvcmpy(mobiaprvcmpy);
dm.setMobiaprvnumber(mobiaprvnumber);
dm.setMobiaprvprn(mobiaprvprn);
dm.setCmsstopped(cmsstopped);
dm.setCmsstopdate(cmsstopdate);
dm.setCmsstatus(cmsstatus);
dm.setCmsupdatedate(cmsupdatedate);
dm.setCardidentity(cardidentity);
dm.setCardowner(cardowner);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 02 16:35:06 KST 2016 */