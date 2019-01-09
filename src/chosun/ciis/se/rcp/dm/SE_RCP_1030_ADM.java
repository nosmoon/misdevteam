/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode_ar;
	public String bo_cdseq_ar;
	public String biz_reg_no_ar;
	public String bank_id_ar;
	public String acct_num_ar;
	public String tran_date_ar;
	public String tran_date_seq_ar;
	public String tran_amt_ar;
	public String cnfm_yn_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_1030_ADM(){}
	public SE_RCP_1030_ADM(String cmpy_cd, String mode_ar, String bo_cdseq_ar, String biz_reg_no_ar, String bank_id_ar, String acct_num_ar, String tran_date_ar, String tran_date_seq_ar, String tran_amt_ar, String cnfm_yn_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode_ar = mode_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.biz_reg_no_ar = biz_reg_no_ar;
		this.bank_id_ar = bank_id_ar;
		this.acct_num_ar = acct_num_ar;
		this.tran_date_ar = tran_date_ar;
		this.tran_date_seq_ar = tran_date_seq_ar;
		this.tran_amt_ar = tran_amt_ar;
		this.cnfm_yn_ar = cnfm_yn_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cdseq_ar(String bo_cdseq_ar){
		this.bo_cdseq_ar = bo_cdseq_ar;
	}

	public void setBiz_reg_no_ar(String biz_reg_no_ar){
		this.biz_reg_no_ar = biz_reg_no_ar;
	}

	public void setBank_id_ar(String bank_id_ar){
		this.bank_id_ar = bank_id_ar;
	}

	public void setAcct_num_ar(String acct_num_ar){
		this.acct_num_ar = acct_num_ar;
	}

	public void setTran_date_ar(String tran_date_ar){
		this.tran_date_ar = tran_date_ar;
	}

	public void setTran_date_seq_ar(String tran_date_seq_ar){
		this.tran_date_seq_ar = tran_date_seq_ar;
	}

	public void setTran_amt_ar(String tran_amt_ar){
		this.tran_amt_ar = tran_amt_ar;
	}

	public void setCnfm_yn_ar(String cnfm_yn_ar){
		this.cnfm_yn_ar = cnfm_yn_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cdseq_ar(){
		return this.bo_cdseq_ar;
	}

	public String getBiz_reg_no_ar(){
		return this.biz_reg_no_ar;
	}

	public String getBank_id_ar(){
		return this.bank_id_ar;
	}

	public String getAcct_num_ar(){
		return this.acct_num_ar;
	}

	public String getTran_date_ar(){
		return this.tran_date_ar;
	}

	public String getTran_date_seq_ar(){
		return this.tran_date_seq_ar;
	}

	public String getTran_amt_ar(){
		return this.tran_amt_ar;
	}

	public String getCnfm_yn_ar(){
		return this.cnfm_yn_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1030_ADM dm = (SE_RCP_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode_ar);
		cstmt.setString(5, dm.bo_cdseq_ar);
		cstmt.setString(6, dm.biz_reg_no_ar);
		cstmt.setString(7, dm.bank_id_ar);
		cstmt.setString(8, dm.acct_num_ar);
		cstmt.setString(9, dm.tran_date_ar);
		cstmt.setString(10, dm.tran_date_seq_ar);
		cstmt.setString(11, dm.tran_amt_ar);
		cstmt.setString(12, dm.cnfm_yn_ar);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1030_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("biz_reg_no_ar = " + getBiz_reg_no_ar());
        System.out.println("bank_id_ar = " + getBank_id_ar());
        System.out.println("acct_num_ar = " + getAcct_num_ar());
        System.out.println("tran_date_ar = " + getTran_date_ar());
        System.out.println("tran_date_seq_ar = " + getTran_date_seq_ar());
        System.out.println("tran_amt_ar = " + getTran_amt_ar());
        System.out.println("cnfm_yn_ar = " + getCnfm_yn_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cdseq_ar = req.getParameter("bo_cdseq_ar");
if( bo_cdseq_ar == null){
	System.out.println(this.toString+" : bo_cdseq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_ar is "+bo_cdseq_ar );
}
String biz_reg_no_ar = req.getParameter("biz_reg_no_ar");
if( biz_reg_no_ar == null){
	System.out.println(this.toString+" : biz_reg_no_ar is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no_ar is "+biz_reg_no_ar );
}
String bank_id_ar = req.getParameter("bank_id_ar");
if( bank_id_ar == null){
	System.out.println(this.toString+" : bank_id_ar is null" );
}else{
	System.out.println(this.toString+" : bank_id_ar is "+bank_id_ar );
}
String acct_num_ar = req.getParameter("acct_num_ar");
if( acct_num_ar == null){
	System.out.println(this.toString+" : acct_num_ar is null" );
}else{
	System.out.println(this.toString+" : acct_num_ar is "+acct_num_ar );
}
String tran_date_ar = req.getParameter("tran_date_ar");
if( tran_date_ar == null){
	System.out.println(this.toString+" : tran_date_ar is null" );
}else{
	System.out.println(this.toString+" : tran_date_ar is "+tran_date_ar );
}
String tran_date_seq_ar = req.getParameter("tran_date_seq_ar");
if( tran_date_seq_ar == null){
	System.out.println(this.toString+" : tran_date_seq_ar is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq_ar is "+tran_date_seq_ar );
}
String tran_amt_ar = req.getParameter("tran_amt_ar");
if( tran_amt_ar == null){
	System.out.println(this.toString+" : tran_amt_ar is null" );
}else{
	System.out.println(this.toString+" : tran_amt_ar is "+tran_amt_ar );
}
String cnfm_yn_ar = req.getParameter("cnfm_yn_ar");
if( cnfm_yn_ar == null){
	System.out.println(this.toString+" : cnfm_yn_ar is null" );
}else{
	System.out.println(this.toString+" : cnfm_yn_ar is "+cnfm_yn_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String biz_reg_no_ar = Util.checkString(req.getParameter("biz_reg_no_ar"));
String bank_id_ar = Util.checkString(req.getParameter("bank_id_ar"));
String acct_num_ar = Util.checkString(req.getParameter("acct_num_ar"));
String tran_date_ar = Util.checkString(req.getParameter("tran_date_ar"));
String tran_date_seq_ar = Util.checkString(req.getParameter("tran_date_seq_ar"));
String tran_amt_ar = Util.checkString(req.getParameter("tran_amt_ar"));
String cnfm_yn_ar = Util.checkString(req.getParameter("cnfm_yn_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String biz_reg_no_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no_ar")));
String bank_id_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id_ar")));
String acct_num_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num_ar")));
String tran_date_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_ar")));
String tran_date_seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq_ar")));
String tran_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt_ar")));
String cnfm_yn_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_yn_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode_ar(mode_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setBiz_reg_no_ar(biz_reg_no_ar);
dm.setBank_id_ar(bank_id_ar);
dm.setAcct_num_ar(acct_num_ar);
dm.setTran_date_ar(tran_date_ar);
dm.setTran_date_seq_ar(tran_date_seq_ar);
dm.setTran_amt_ar(tran_amt_ar);
dm.setCnfm_yn_ar(cnfm_yn_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 17:44:05 KST 2009 */