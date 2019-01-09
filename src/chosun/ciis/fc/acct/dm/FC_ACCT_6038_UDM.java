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


public class FC_ACCT_6038_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String recd_clsf;
	public String data_clsf;
	public String seq;
	public String erplace_cd;
	public String taxoff;
	public String subm_ern;
	public String sale_dlco_ern;
	public String stmt_nosh;
	public String minus_indc;
	public String sale_amt;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_6038_UDM(){}
	public FC_ACCT_6038_UDM(String cmpy_cd, String mode, String recd_clsf, String data_clsf, String seq, String erplace_cd, String taxoff, String subm_ern, String sale_dlco_ern, String stmt_nosh, String minus_indc, String sale_amt, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.recd_clsf = recd_clsf;
		this.data_clsf = data_clsf;
		this.seq = seq;
		this.erplace_cd = erplace_cd;
		this.taxoff = taxoff;
		this.subm_ern = subm_ern;
		this.sale_dlco_ern = sale_dlco_ern;
		this.stmt_nosh = stmt_nosh;
		this.minus_indc = minus_indc;
		this.sale_amt = sale_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRecd_clsf(String recd_clsf){
		this.recd_clsf = recd_clsf;
	}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setTaxoff(String taxoff){
		this.taxoff = taxoff;
	}

	public void setSubm_ern(String subm_ern){
		this.subm_ern = subm_ern;
	}

	public void setSale_dlco_ern(String sale_dlco_ern){
		this.sale_dlco_ern = sale_dlco_ern;
	}

	public void setStmt_nosh(String stmt_nosh){
		this.stmt_nosh = stmt_nosh;
	}

	public void setMinus_indc(String minus_indc){
		this.minus_indc = minus_indc;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
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

	public String getRecd_clsf(){
		return this.recd_clsf;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getTaxoff(){
		return this.taxoff;
	}

	public String getSubm_ern(){
		return this.subm_ern;
	}

	public String getSale_dlco_ern(){
		return this.sale_dlco_ern;
	}

	public String getStmt_nosh(){
		return this.stmt_nosh;
	}

	public String getMinus_indc(){
		return this.minus_indc;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6038_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6038_UDM dm = (FC_ACCT_6038_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.recd_clsf);
		cstmt.setString(6, dm.data_clsf);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.erplace_cd);
		cstmt.setString(9, dm.taxoff);
		cstmt.setString(10, dm.subm_ern);
		cstmt.setString(11, dm.sale_dlco_ern);
		cstmt.setString(12, dm.stmt_nosh);
		cstmt.setString(13, dm.minus_indc);
		cstmt.setString(14, dm.sale_amt);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6038_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("recd_clsf = [" + getRecd_clsf() + "]");
		System.out.println("data_clsf = [" + getData_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("taxoff = [" + getTaxoff() + "]");
		System.out.println("subm_ern = [" + getSubm_ern() + "]");
		System.out.println("sale_dlco_ern = [" + getSale_dlco_ern() + "]");
		System.out.println("stmt_nosh = [" + getStmt_nosh() + "]");
		System.out.println("minus_indc = [" + getMinus_indc() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
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
String recd_clsf = req.getParameter("recd_clsf");
if( recd_clsf == null){
	System.out.println(this.toString+" : recd_clsf is null" );
}else{
	System.out.println(this.toString+" : recd_clsf is "+recd_clsf );
}
String data_clsf = req.getParameter("data_clsf");
if( data_clsf == null){
	System.out.println(this.toString+" : data_clsf is null" );
}else{
	System.out.println(this.toString+" : data_clsf is "+data_clsf );
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
String taxoff = req.getParameter("taxoff");
if( taxoff == null){
	System.out.println(this.toString+" : taxoff is null" );
}else{
	System.out.println(this.toString+" : taxoff is "+taxoff );
}
String subm_ern = req.getParameter("subm_ern");
if( subm_ern == null){
	System.out.println(this.toString+" : subm_ern is null" );
}else{
	System.out.println(this.toString+" : subm_ern is "+subm_ern );
}
String sale_dlco_ern = req.getParameter("sale_dlco_ern");
if( sale_dlco_ern == null){
	System.out.println(this.toString+" : sale_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : sale_dlco_ern is "+sale_dlco_ern );
}
String stmt_nosh = req.getParameter("stmt_nosh");
if( stmt_nosh == null){
	System.out.println(this.toString+" : stmt_nosh is null" );
}else{
	System.out.println(this.toString+" : stmt_nosh is "+stmt_nosh );
}
String minus_indc = req.getParameter("minus_indc");
if( minus_indc == null){
	System.out.println(this.toString+" : minus_indc is null" );
}else{
	System.out.println(this.toString+" : minus_indc is "+minus_indc );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
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
String recd_clsf = Util.checkString(req.getParameter("recd_clsf"));
String data_clsf = Util.checkString(req.getParameter("data_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String taxoff = Util.checkString(req.getParameter("taxoff"));
String subm_ern = Util.checkString(req.getParameter("subm_ern"));
String sale_dlco_ern = Util.checkString(req.getParameter("sale_dlco_ern"));
String stmt_nosh = Util.checkString(req.getParameter("stmt_nosh"));
String minus_indc = Util.checkString(req.getParameter("minus_indc"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String recd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("recd_clsf")));
String data_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("data_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String taxoff = Util.Uni2Ksc(Util.checkString(req.getParameter("taxoff")));
String subm_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("subm_ern")));
String sale_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dlco_ern")));
String stmt_nosh = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_nosh")));
String minus_indc = Util.Uni2Ksc(Util.checkString(req.getParameter("minus_indc")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setRecd_clsf(recd_clsf);
dm.setData_clsf(data_clsf);
dm.setSeq(seq);
dm.setErplace_cd(erplace_cd);
dm.setTaxoff(taxoff);
dm.setSubm_ern(subm_ern);
dm.setSale_dlco_ern(sale_dlco_ern);
dm.setStmt_nosh(stmt_nosh);
dm.setMinus_indc(minus_indc);
dm.setSale_amt(sale_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 06 17:30:19 KST 2012 */