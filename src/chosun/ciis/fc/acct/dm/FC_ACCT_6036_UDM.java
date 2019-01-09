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


public class FC_ACCT_6036_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String data_clsf;
	public String rec_suply_reg_no;
	public String suply_pers_reg_no;
	public String seq;
	public String erplace_cd;
	public String nosh;
	public String deal_cnt;
	public String suply_amt;
	public String vat_amt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_6036_UDM(){}
	public FC_ACCT_6036_UDM(String cmpy_cd, String mode, String data_clsf, String rec_suply_reg_no, String suply_pers_reg_no, String seq, String erplace_cd, String nosh, String deal_cnt, String suply_amt, String vat_amt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.data_clsf = data_clsf;
		this.rec_suply_reg_no = rec_suply_reg_no;
		this.suply_pers_reg_no = suply_pers_reg_no;
		this.seq = seq;
		this.erplace_cd = erplace_cd;
		this.nosh = nosh;
		this.deal_cnt = deal_cnt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setRec_suply_reg_no(String rec_suply_reg_no){
		this.rec_suply_reg_no = rec_suply_reg_no;
	}

	public void setSuply_pers_reg_no(String suply_pers_reg_no){
		this.suply_pers_reg_no = suply_pers_reg_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setNosh(String nosh){
		this.nosh = nosh;
	}

	public void setDeal_cnt(String deal_cnt){
		this.deal_cnt = deal_cnt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getRec_suply_reg_no(){
		return this.rec_suply_reg_no;
	}

	public String getSuply_pers_reg_no(){
		return this.suply_pers_reg_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getNosh(){
		return this.nosh;
	}

	public String getDeal_cnt(){
		return this.deal_cnt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6036_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6036_UDM dm = (FC_ACCT_6036_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.data_clsf);
		cstmt.setString(6, dm.rec_suply_reg_no);
		cstmt.setString(7, dm.suply_pers_reg_no);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.erplace_cd);
		cstmt.setString(10, dm.nosh);
		cstmt.setString(11, dm.deal_cnt);
		cstmt.setString(12, dm.suply_amt);
		cstmt.setString(13, dm.vat_amt);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6036_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("data_clsf = [" + getData_clsf() + "]");
		System.out.println("rec_suply_reg_no = [" + getRec_suply_reg_no() + "]");
		System.out.println("suply_pers_reg_no = [" + getSuply_pers_reg_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("nosh = [" + getNosh() + "]");
		System.out.println("deal_cnt = [" + getDeal_cnt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String data_clsf = req.getParameter("data_clsf");
if( data_clsf == null){
	System.out.println(this.toString+" : data_clsf is null" );
}else{
	System.out.println(this.toString+" : data_clsf is "+data_clsf );
}
String rec_suply_reg_no = req.getParameter("rec_suply_reg_no");
if( rec_suply_reg_no == null){
	System.out.println(this.toString+" : rec_suply_reg_no is null" );
}else{
	System.out.println(this.toString+" : rec_suply_reg_no is "+rec_suply_reg_no );
}
String suply_pers_reg_no = req.getParameter("suply_pers_reg_no");
if( suply_pers_reg_no == null){
	System.out.println(this.toString+" : suply_pers_reg_no is null" );
}else{
	System.out.println(this.toString+" : suply_pers_reg_no is "+suply_pers_reg_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String nosh = req.getParameter("nosh");
if( nosh == null){
	System.out.println(this.toString+" : nosh is null" );
}else{
	System.out.println(this.toString+" : nosh is "+nosh );
}
String deal_cnt = req.getParameter("deal_cnt");
if( deal_cnt == null){
	System.out.println(this.toString+" : deal_cnt is null" );
}else{
	System.out.println(this.toString+" : deal_cnt is "+deal_cnt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String data_clsf = Util.checkString(req.getParameter("data_clsf"));
String rec_suply_reg_no = Util.checkString(req.getParameter("rec_suply_reg_no"));
String suply_pers_reg_no = Util.checkString(req.getParameter("suply_pers_reg_no"));
String seq = Util.checkString(req.getParameter("seq"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String nosh = Util.checkString(req.getParameter("nosh"));
String deal_cnt = Util.checkString(req.getParameter("deal_cnt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String data_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("data_clsf")));
String rec_suply_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rec_suply_reg_no")));
String suply_pers_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_pers_reg_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String nosh = Util.Uni2Ksc(Util.checkString(req.getParameter("nosh")));
String deal_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_cnt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setData_clsf(data_clsf);
dm.setRec_suply_reg_no(rec_suply_reg_no);
dm.setSuply_pers_reg_no(suply_pers_reg_no);
dm.setSeq(seq);
dm.setErplace_cd(erplace_cd);
dm.setNosh(nosh);
dm.setDeal_cnt(deal_cnt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 06 14:19:09 KST 2012 */