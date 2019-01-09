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


public class FC_ACCT_2572_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_chg_pers_ip;
	public String incmg_chg_pers;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String acct_tonghwa;
	public String tran_date;
	public String tran_date_seq;
	public String extnc_seq;
	public String actu_slip_no;
	public String extnc_amt;

	public FC_ACCT_2572_UDM(){}
	public FC_ACCT_2572_UDM(String cmpy_cd, String incmg_chg_pers_ip, String incmg_chg_pers, String biz_reg_no, String bank_id, String acct_num, String acct_tonghwa, String tran_date, String tran_date_seq, String extnc_seq, String actu_slip_no, String extnc_amt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_chg_pers_ip = incmg_chg_pers_ip;
		this.incmg_chg_pers = incmg_chg_pers;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.acct_tonghwa = acct_tonghwa;
		this.tran_date = tran_date;
		this.tran_date_seq = tran_date_seq;
		this.extnc_seq = extnc_seq;
		this.actu_slip_no = actu_slip_no;
		this.extnc_amt = extnc_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_chg_pers_ip(String incmg_chg_pers_ip){
		this.incmg_chg_pers_ip = incmg_chg_pers_ip;
	}

	public void setIncmg_chg_pers(String incmg_chg_pers){
		this.incmg_chg_pers = incmg_chg_pers;
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

	public void setAcct_tonghwa(String acct_tonghwa){
		this.acct_tonghwa = acct_tonghwa;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setExtnc_seq(String extnc_seq){
		this.extnc_seq = extnc_seq;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}
	
	public void setExtnc_amt(String extnc_amt) {
		this.extnc_amt = extnc_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_chg_pers_ip(){
		return this.incmg_chg_pers_ip;
	}

	public String getIncmg_chg_pers(){
		return this.incmg_chg_pers;
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

	public String getAcct_tonghwa(){
		return this.acct_tonghwa;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getExtnc_seq(){
		return this.extnc_seq;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
	
	public String getExtnc_amt() {
	    return this.extnc_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2572_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2572_UDM dm = (FC_ACCT_2572_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_chg_pers_ip);
		cstmt.setString(5, dm.incmg_chg_pers);
		cstmt.setString(6, dm.biz_reg_no);
		cstmt.setString(7, dm.bank_id);
		cstmt.setString(8, dm.acct_num);
		cstmt.setString(9, dm.acct_tonghwa);
		cstmt.setString(10, dm.tran_date);
		cstmt.setString(11, dm.tran_date_seq);
		cstmt.setString(12, dm.extnc_seq);
		cstmt.setString(13, dm.actu_slip_no);
		cstmt.setString(14, dm.extnc_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2572_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_chg_pers_ip = [" + getIncmg_chg_pers_ip() + "]");
		System.out.println("incmg_chg_pers = [" + getIncmg_chg_pers() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("acct_tonghwa = [" + getAcct_tonghwa() + "]");
		System.out.println("tran_date = [" + getTran_date() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("extnc_seq = [" + getExtnc_seq() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("extnc_amt = [" + getExtnc_amt() + "]");
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
String incmg_chg_pers_ip = req.getParameter("incmg_chg_pers_ip");
if( incmg_chg_pers_ip == null){
	System.out.println(this.toString+" : incmg_chg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_chg_pers_ip is "+incmg_chg_pers_ip );
}
String incmg_chg_pers = req.getParameter("incmg_chg_pers");
if( incmg_chg_pers == null){
	System.out.println(this.toString+" : incmg_chg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_chg_pers is "+incmg_chg_pers );
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
String acct_tonghwa = req.getParameter("acct_tonghwa");
if( acct_tonghwa == null){
	System.out.println(this.toString+" : acct_tonghwa is null" );
}else{
	System.out.println(this.toString+" : acct_tonghwa is "+acct_tonghwa );
}
String tran_date = req.getParameter("tran_date");
if( tran_date == null){
	System.out.println(this.toString+" : tran_date is null" );
}else{
	System.out.println(this.toString+" : tran_date is "+tran_date );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String extnc_seq = req.getParameter("extnc_seq");
if( extnc_seq == null){
	System.out.println(this.toString+" : extnc_seq is null" );
}else{
	System.out.println(this.toString+" : extnc_seq is "+extnc_seq );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_chg_pers_ip = Util.checkString(req.getParameter("incmg_chg_pers_ip"));
String incmg_chg_pers = Util.checkString(req.getParameter("incmg_chg_pers"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String acct_tonghwa = Util.checkString(req.getParameter("acct_tonghwa"));
String tran_date = Util.checkString(req.getParameter("tran_date"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String extnc_seq = Util.checkString(req.getParameter("extnc_seq"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_chg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_chg_pers_ip")));
String incmg_chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_chg_pers")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String acct_tonghwa = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_tonghwa")));
String tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String extnc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_seq")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_chg_pers_ip(incmg_chg_pers_ip);
dm.setIncmg_chg_pers(incmg_chg_pers);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setAcct_tonghwa(acct_tonghwa);
dm.setTran_date(tran_date);
dm.setTran_date_seq(tran_date_seq);
dm.setExtnc_seq(extnc_seq);
dm.setActu_slip_no(actu_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 17:16:48 KST 2009 */