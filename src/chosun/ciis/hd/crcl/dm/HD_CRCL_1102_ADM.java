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


package chosun.ciis.hd.crcl.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.crcl.ds.*;
import chosun.ciis.hd.crcl.rec.*;

/**
 * 
 */


public class HD_CRCL_1102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String paty_crc_cd;
	public String frdt;
	public String todt;
	public String bank_cd;
	public String bank_acct_no;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_CRCL_1102_ADM(){}
	public HD_CRCL_1102_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String paty_crc_cd, String frdt, String todt, String bank_cd, String bank_acct_no, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.paty_crc_cd = paty_crc_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.bank_cd = bank_cd;
		this.bank_acct_no = bank_acct_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_acct_no(String bank_acct_no){
		this.bank_acct_no = bank_acct_no;
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

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_acct_no(){
		return this.bank_acct_no;
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

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CRCL_1102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CRCL_1102_ADM dm = (HD_CRCL_1102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.paty_crc_cd);
		cstmt.setString(10, dm.frdt);
		cstmt.setString(11, dm.todt);
		cstmt.setString(12, dm.bank_cd);
		cstmt.setString(13, dm.bank_acct_no);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.crcl.ds.HD_CRCL_1102_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("flnm = " + getFlnm());
        System.out.println("paty_crc_cd = " + getPaty_crc_cd());
        System.out.println("frdt = " + getFrdt());
        System.out.println("todt = " + getTodt());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("bank_acct_no = " + getBank_acct_no());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String paty_crc_cd = req.getParameter("paty_crc_cd");
if( paty_crc_cd == null){
	System.out.println(this.toString+" : paty_crc_cd is null" );
}else{
	System.out.println(this.toString+" : paty_crc_cd is "+paty_crc_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String bank_acct_no = req.getParameter("bank_acct_no");
if( bank_acct_no == null){
	System.out.println(this.toString+" : bank_acct_no is null" );
}else{
	System.out.println(this.toString+" : bank_acct_no is "+bank_acct_no );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String bank_acct_no = Util.checkString(req.getParameter("bank_acct_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String paty_crc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_crc_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String bank_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_acct_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setPaty_crc_cd(paty_crc_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setBank_cd(bank_cd);
dm.setBank_acct_no(bank_acct_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 17:17:23 KST 2009 */