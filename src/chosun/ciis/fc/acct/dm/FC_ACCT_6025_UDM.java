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


public class FC_ACCT_6025_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String proc_yymm;
	public String acct_cd;
	public String budg_cd;
	public String clam_dept_cd;
	public String use_dept_cd;
	public String medi_cd;
	public String slip_mang_clsf;
	public String ndduc_rate;
	public String ndduc_amt;
	public String acml_amt1;
	public String acml_amt2;
	public String orgy_ndduc_amt;
	public String comn_ndduc_amt;
	public String non_dduc_stot;
	public String orgy_dduc_amt;
	public String comn_dduc_amt;
	public String dduc_stot;
	public String incmg_pers;

	public FC_ACCT_6025_UDM(){}
	public FC_ACCT_6025_UDM(String cmpy_cd, String mode, String proc_yymm, String acct_cd, String budg_cd, String clam_dept_cd, String use_dept_cd, String medi_cd, String slip_mang_clsf, String ndduc_rate, String ndduc_amt, String acml_amt1, String acml_amt2, String orgy_ndduc_amt, String comn_ndduc_amt, String non_dduc_stot, String orgy_dduc_amt, String comn_dduc_amt, String dduc_stot, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.proc_yymm = proc_yymm;
		this.acct_cd = acct_cd;
		this.budg_cd = budg_cd;
		this.clam_dept_cd = clam_dept_cd;
		this.use_dept_cd = use_dept_cd;
		this.medi_cd = medi_cd;
		this.slip_mang_clsf = slip_mang_clsf;
		this.ndduc_rate = ndduc_rate;
		this.ndduc_amt = ndduc_amt;
		this.acml_amt1 = acml_amt1;
		this.acml_amt2 = acml_amt2;
		this.orgy_ndduc_amt = orgy_ndduc_amt;
		this.comn_ndduc_amt = comn_ndduc_amt;
		this.non_dduc_stot = non_dduc_stot;
		this.orgy_dduc_amt = orgy_dduc_amt;
		this.comn_dduc_amt = comn_dduc_amt;
		this.dduc_stot = dduc_stot;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setProc_yymm(String proc_yymm){
		this.proc_yymm = proc_yymm;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSlip_mang_clsf(String slip_mang_clsf){
		this.slip_mang_clsf = slip_mang_clsf;
	}

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setNdduc_amt(String ndduc_amt){
		this.ndduc_amt = ndduc_amt;
	}

	public void setAcml_amt1(String acml_amt1){
		this.acml_amt1 = acml_amt1;
	}

	public void setAcml_amt2(String acml_amt2){
		this.acml_amt2 = acml_amt2;
	}

	public void setOrgy_ndduc_amt(String orgy_ndduc_amt){
		this.orgy_ndduc_amt = orgy_ndduc_amt;
	}

	public void setComn_ndduc_amt(String comn_ndduc_amt){
		this.comn_ndduc_amt = comn_ndduc_amt;
	}

	public void setNon_dduc_stot(String non_dduc_stot){
		this.non_dduc_stot = non_dduc_stot;
	}

	public void setOrgy_dduc_amt(String orgy_dduc_amt){
		this.orgy_dduc_amt = orgy_dduc_amt;
	}

	public void setComn_dduc_amt(String comn_dduc_amt){
		this.comn_dduc_amt = comn_dduc_amt;
	}

	public void setDduc_stot(String dduc_stot){
		this.dduc_stot = dduc_stot;
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

	public String getProc_yymm(){
		return this.proc_yymm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSlip_mang_clsf(){
		return this.slip_mang_clsf;
	}

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getNdduc_amt(){
		return this.ndduc_amt;
	}

	public String getAcml_amt1(){
		return this.acml_amt1;
	}

	public String getAcml_amt2(){
		return this.acml_amt2;
	}

	public String getOrgy_ndduc_amt(){
		return this.orgy_ndduc_amt;
	}

	public String getComn_ndduc_amt(){
		return this.comn_ndduc_amt;
	}

	public String getNon_dduc_stot(){
		return this.non_dduc_stot;
	}

	public String getOrgy_dduc_amt(){
		return this.orgy_dduc_amt;
	}

	public String getComn_dduc_amt(){
		return this.comn_dduc_amt;
	}

	public String getDduc_stot(){
		return this.dduc_stot;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6025_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6025_UDM dm = (FC_ACCT_6025_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.proc_yymm);
		cstmt.setString(6, dm.acct_cd);
		cstmt.setString(7, dm.budg_cd);
		cstmt.setString(8, dm.clam_dept_cd);
		cstmt.setString(9, dm.use_dept_cd);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.slip_mang_clsf);
		cstmt.setString(12, dm.ndduc_rate);
		cstmt.setString(13, dm.ndduc_amt);
		cstmt.setString(14, dm.acml_amt1);
		cstmt.setString(15, dm.acml_amt2);
		cstmt.setString(16, dm.orgy_ndduc_amt);
		cstmt.setString(17, dm.comn_ndduc_amt);
		cstmt.setString(18, dm.non_dduc_stot);
		cstmt.setString(19, dm.orgy_dduc_amt);
		cstmt.setString(20, dm.comn_dduc_amt);
		cstmt.setString(21, dm.dduc_stot);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6025_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("proc_yymm = " + getProc_yymm());
        System.out.println("acct_cd = " + getAcct_cd());
        System.out.println("budg_cd = " + getBudg_cd());
        System.out.println("clam_dept_cd = " + getClam_dept_cd());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("slip_mang_clsf = " + getSlip_mang_clsf());
        System.out.println("ndduc_rate = " + getNdduc_rate());
        System.out.println("ndduc_amt = " + getNdduc_amt());
        System.out.println("acml_amt1 = " + getAcml_amt1());
        System.out.println("acml_amt2 = " + getAcml_amt2());
        System.out.println("orgy_ndduc_amt = " + getOrgy_ndduc_amt());
        System.out.println("comn_ndduc_amt = " + getComn_ndduc_amt());
        System.out.println("non_dduc_stot = " + getNon_dduc_stot());
        System.out.println("orgy_dduc_amt = " + getOrgy_dduc_amt());
        System.out.println("comn_dduc_amt = " + getComn_dduc_amt());
        System.out.println("dduc_stot = " + getDduc_stot());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String proc_yymm = req.getParameter("proc_yymm");
if( proc_yymm == null){
	System.out.println(this.toString+" : proc_yymm is null" );
}else{
	System.out.println(this.toString+" : proc_yymm is "+proc_yymm );
}
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String slip_mang_clsf = req.getParameter("slip_mang_clsf");
if( slip_mang_clsf == null){
	System.out.println(this.toString+" : slip_mang_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_mang_clsf is "+slip_mang_clsf );
}
String ndduc_rate = req.getParameter("ndduc_rate");
if( ndduc_rate == null){
	System.out.println(this.toString+" : ndduc_rate is null" );
}else{
	System.out.println(this.toString+" : ndduc_rate is "+ndduc_rate );
}
String ndduc_amt = req.getParameter("ndduc_amt");
if( ndduc_amt == null){
	System.out.println(this.toString+" : ndduc_amt is null" );
}else{
	System.out.println(this.toString+" : ndduc_amt is "+ndduc_amt );
}
String acml_amt1 = req.getParameter("acml_amt1");
if( acml_amt1 == null){
	System.out.println(this.toString+" : acml_amt1 is null" );
}else{
	System.out.println(this.toString+" : acml_amt1 is "+acml_amt1 );
}
String acml_amt2 = req.getParameter("acml_amt2");
if( acml_amt2 == null){
	System.out.println(this.toString+" : acml_amt2 is null" );
}else{
	System.out.println(this.toString+" : acml_amt2 is "+acml_amt2 );
}
String orgy_ndduc_amt = req.getParameter("orgy_ndduc_amt");
if( orgy_ndduc_amt == null){
	System.out.println(this.toString+" : orgy_ndduc_amt is null" );
}else{
	System.out.println(this.toString+" : orgy_ndduc_amt is "+orgy_ndduc_amt );
}
String comn_ndduc_amt = req.getParameter("comn_ndduc_amt");
if( comn_ndduc_amt == null){
	System.out.println(this.toString+" : comn_ndduc_amt is null" );
}else{
	System.out.println(this.toString+" : comn_ndduc_amt is "+comn_ndduc_amt );
}
String non_dduc_stot = req.getParameter("non_dduc_stot");
if( non_dduc_stot == null){
	System.out.println(this.toString+" : non_dduc_stot is null" );
}else{
	System.out.println(this.toString+" : non_dduc_stot is "+non_dduc_stot );
}
String orgy_dduc_amt = req.getParameter("orgy_dduc_amt");
if( orgy_dduc_amt == null){
	System.out.println(this.toString+" : orgy_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : orgy_dduc_amt is "+orgy_dduc_amt );
}
String comn_dduc_amt = req.getParameter("comn_dduc_amt");
if( comn_dduc_amt == null){
	System.out.println(this.toString+" : comn_dduc_amt is null" );
}else{
	System.out.println(this.toString+" : comn_dduc_amt is "+comn_dduc_amt );
}
String dduc_stot = req.getParameter("dduc_stot");
if( dduc_stot == null){
	System.out.println(this.toString+" : dduc_stot is null" );
}else{
	System.out.println(this.toString+" : dduc_stot is "+dduc_stot );
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
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String slip_mang_clsf = Util.checkString(req.getParameter("slip_mang_clsf"));
String ndduc_rate = Util.checkString(req.getParameter("ndduc_rate"));
String ndduc_amt = Util.checkString(req.getParameter("ndduc_amt"));
String acml_amt1 = Util.checkString(req.getParameter("acml_amt1"));
String acml_amt2 = Util.checkString(req.getParameter("acml_amt2"));
String orgy_ndduc_amt = Util.checkString(req.getParameter("orgy_ndduc_amt"));
String comn_ndduc_amt = Util.checkString(req.getParameter("comn_ndduc_amt"));
String non_dduc_stot = Util.checkString(req.getParameter("non_dduc_stot"));
String orgy_dduc_amt = Util.checkString(req.getParameter("orgy_dduc_amt"));
String comn_dduc_amt = Util.checkString(req.getParameter("comn_dduc_amt"));
String dduc_stot = Util.checkString(req.getParameter("dduc_stot"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String slip_mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_mang_clsf")));
String ndduc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_rate")));
String ndduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_amt")));
String acml_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_amt1")));
String acml_amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acml_amt2")));
String orgy_ndduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("orgy_ndduc_amt")));
String comn_ndduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("comn_ndduc_amt")));
String non_dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("non_dduc_stot")));
String orgy_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("orgy_dduc_amt")));
String comn_dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("comn_dduc_amt")));
String dduc_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_stot")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setProc_yymm(proc_yymm);
dm.setAcct_cd(acct_cd);
dm.setBudg_cd(budg_cd);
dm.setClam_dept_cd(clam_dept_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setMedi_cd(medi_cd);
dm.setSlip_mang_clsf(slip_mang_clsf);
dm.setNdduc_rate(ndduc_rate);
dm.setNdduc_amt(ndduc_amt);
dm.setAcml_amt1(acml_amt1);
dm.setAcml_amt2(acml_amt2);
dm.setOrgy_ndduc_amt(orgy_ndduc_amt);
dm.setComn_ndduc_amt(comn_ndduc_amt);
dm.setNon_dduc_stot(non_dduc_stot);
dm.setOrgy_dduc_amt(orgy_dduc_amt);
dm.setComn_dduc_amt(comn_dduc_amt);
dm.setDduc_stot(dduc_stot);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */