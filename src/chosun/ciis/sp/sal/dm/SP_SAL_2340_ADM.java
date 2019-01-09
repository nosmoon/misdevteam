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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2340_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mappli;
	public String auto_shift_clsf;
	public String bank_nm;
	public String bank_cd;
	public String acct_no;
	public String amt;
	public String deps_pers;
	public String bo_nm;
	public String bo_cd;
	public String dept_nm;
	public String area_nm;
	public String bo_nm_1;
	public String shft_noit;
	public String payo_amt;
	public String coms;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_2340_ADM(){}
	public SP_SAL_2340_ADM(String cmpy_cd, String mappli, String auto_shift_clsf, String bank_nm, String bank_cd, String acct_no, String amt, String deps_pers, String bo_nm, String bo_cd, String dept_nm, String area_nm, String bo_nm_1, String shft_noit, String payo_amt, String coms, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mappli = mappli;
		this.auto_shift_clsf = auto_shift_clsf;
		this.bank_nm = bank_nm;
		this.bank_cd = bank_cd;
		this.acct_no = acct_no;
		this.amt = amt;
		this.deps_pers = deps_pers;
		this.bo_nm = bo_nm;
		this.bo_cd = bo_cd;
		this.dept_nm = dept_nm;
		this.area_nm = area_nm;
		this.bo_nm_1 = bo_nm_1;
		this.shft_noit = shft_noit;
		this.payo_amt = payo_amt;
		this.coms = coms;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMappli(String mappli){
		this.mappli = mappli;
	}

	public void setAuto_shift_clsf(String auto_shift_clsf){
		this.auto_shift_clsf = auto_shift_clsf;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setDeps_pers(String deps_pers){
		this.deps_pers = deps_pers;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm_1(String bo_nm_1){
		this.bo_nm_1 = bo_nm_1;
	}

	public void setShft_noit(String shft_noit){
		this.shft_noit = shft_noit;
	}

	public void setPayo_amt(String payo_amt){
		this.payo_amt = payo_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMappli(){
		return this.mappli;
	}

	public String getAuto_shift_clsf(){
		return this.auto_shift_clsf;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getDeps_pers(){
		return this.deps_pers;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm_1(){
		return this.bo_nm_1;
	}

	public String getShft_noit(){
		return this.shft_noit;
	}

	public String getPayo_amt(){
		return this.payo_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2340_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2340_ADM dm = (SP_SAL_2340_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mappli);
		cstmt.setString(5, dm.auto_shift_clsf);
		cstmt.setString(6, dm.bank_nm);
		cstmt.setString(7, dm.bank_cd);
		cstmt.setString(8, dm.acct_no);
		cstmt.setString(9, dm.amt);
		cstmt.setString(10, dm.deps_pers);
		cstmt.setString(11, dm.bo_nm);
		cstmt.setString(12, dm.bo_cd);
		cstmt.setString(13, dm.dept_nm);
		cstmt.setString(14, dm.area_nm);
		cstmt.setString(15, dm.bo_nm_1);
		cstmt.setString(16, dm.shft_noit);
		cstmt.setString(17, dm.payo_amt);
		cstmt.setString(18, dm.coms);
		cstmt.setString(19, dm.incmg_pers_ip);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2340_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mappli = [" + getMappli() + "]");
		System.out.println("auto_shift_clsf = [" + getAuto_shift_clsf() + "]");
		System.out.println("bank_nm = [" + getBank_nm() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("deps_pers = [" + getDeps_pers() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("area_nm = [" + getArea_nm() + "]");
		System.out.println("bo_nm_1 = [" + getBo_nm_1() + "]");
		System.out.println("shft_noit = [" + getShft_noit() + "]");
		System.out.println("payo_amt = [" + getPayo_amt() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mappli = req.getParameter("mappli");
if( mappli == null){
	System.out.println(this.toString+" : mappli is null" );
}else{
	System.out.println(this.toString+" : mappli is "+mappli );
}
String auto_shift_clsf = req.getParameter("auto_shift_clsf");
if( auto_shift_clsf == null){
	System.out.println(this.toString+" : auto_shift_clsf is null" );
}else{
	System.out.println(this.toString+" : auto_shift_clsf is "+auto_shift_clsf );
}
String bank_nm = req.getParameter("bank_nm");
if( bank_nm == null){
	System.out.println(this.toString+" : bank_nm is null" );
}else{
	System.out.println(this.toString+" : bank_nm is "+bank_nm );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String deps_pers = req.getParameter("deps_pers");
if( deps_pers == null){
	System.out.println(this.toString+" : deps_pers is null" );
}else{
	System.out.println(this.toString+" : deps_pers is "+deps_pers );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String area_nm = req.getParameter("area_nm");
if( area_nm == null){
	System.out.println(this.toString+" : area_nm is null" );
}else{
	System.out.println(this.toString+" : area_nm is "+area_nm );
}
String bo_nm_1 = req.getParameter("bo_nm_1");
if( bo_nm_1 == null){
	System.out.println(this.toString+" : bo_nm_1 is null" );
}else{
	System.out.println(this.toString+" : bo_nm_1 is "+bo_nm_1 );
}
String shft_noit = req.getParameter("shft_noit");
if( shft_noit == null){
	System.out.println(this.toString+" : shft_noit is null" );
}else{
	System.out.println(this.toString+" : shft_noit is "+shft_noit );
}
String payo_amt = req.getParameter("payo_amt");
if( payo_amt == null){
	System.out.println(this.toString+" : payo_amt is null" );
}else{
	System.out.println(this.toString+" : payo_amt is "+payo_amt );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mappli = Util.checkString(req.getParameter("mappli"));
String auto_shift_clsf = Util.checkString(req.getParameter("auto_shift_clsf"));
String bank_nm = Util.checkString(req.getParameter("bank_nm"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String amt = Util.checkString(req.getParameter("amt"));
String deps_pers = Util.checkString(req.getParameter("deps_pers"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String area_nm = Util.checkString(req.getParameter("area_nm"));
String bo_nm_1 = Util.checkString(req.getParameter("bo_nm_1"));
String shft_noit = Util.checkString(req.getParameter("shft_noit"));
String payo_amt = Util.checkString(req.getParameter("payo_amt"));
String coms = Util.checkString(req.getParameter("coms"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mappli = Util.Uni2Ksc(Util.checkString(req.getParameter("mappli")));
String auto_shift_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("auto_shift_clsf")));
String bank_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_nm")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String deps_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_pers")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String area_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("area_nm")));
String bo_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm_1")));
String shft_noit = Util.Uni2Ksc(Util.checkString(req.getParameter("shft_noit")));
String payo_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("payo_amt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMappli(mappli);
dm.setAuto_shift_clsf(auto_shift_clsf);
dm.setBank_nm(bank_nm);
dm.setBank_cd(bank_cd);
dm.setAcct_no(acct_no);
dm.setAmt(amt);
dm.setDeps_pers(deps_pers);
dm.setBo_nm(bo_nm);
dm.setBo_cd(bo_cd);
dm.setDept_nm(dept_nm);
dm.setArea_nm(area_nm);
dm.setBo_nm_1(bo_nm_1);
dm.setShft_noit(shft_noit);
dm.setPayo_amt(payo_amt);
dm.setComs(coms);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 17 22:04:56 KST 2012 */