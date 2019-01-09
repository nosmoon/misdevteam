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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1252_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpt_rpt_idx;
	public String dept_clsf;
	public String cret_frdt;
	public String cret_todt;
	public String cret_stnd;
	public String mngr_nm;
	public String mngr_phon;
	public String rpt_dt;
	public String pay_frdt;
	public String pay_todt;
	public String incmg_pers;

	public TN_LNK_1252_ADM(){}
	public TN_LNK_1252_ADM(String cmpy_cd, String rcpt_rpt_idx, String dept_clsf, String cret_frdt, String cret_todt, String cret_stnd, String mngr_nm, String mngr_phon, String rpt_dt, String pay_frdt, String pay_todt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rcpt_rpt_idx = rcpt_rpt_idx;
		this.dept_clsf = dept_clsf;
		this.cret_frdt = cret_frdt;
		this.cret_todt = cret_todt;
		this.cret_stnd = cret_stnd;
		this.mngr_nm = mngr_nm;
		this.mngr_phon = mngr_phon;
		this.rpt_dt = rpt_dt;
		this.pay_frdt = pay_frdt;
		this.pay_todt = pay_todt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpt_rpt_idx(String rcpt_rpt_idx){
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public void setDept_clsf(String dept_clsf){
		this.dept_clsf = dept_clsf;
	}

	public void setCret_frdt(String cret_frdt){
		this.cret_frdt = cret_frdt;
	}

	public void setCret_todt(String cret_todt){
		this.cret_todt = cret_todt;
	}

	public void setCret_stnd(String cret_stnd){
		this.cret_stnd = cret_stnd;
	}

	public void setMngr_nm(String mngr_nm){
		this.mngr_nm = mngr_nm;
	}

	public void setMngr_phon(String mngr_phon){
		this.mngr_phon = mngr_phon;
	}

	public void setRpt_dt(String rpt_dt){
		this.rpt_dt = rpt_dt;
	}

	public void setPay_frdt(String pay_frdt){
		this.pay_frdt = pay_frdt;
	}

	public void setPay_todt(String pay_todt){
		this.pay_todt = pay_todt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpt_rpt_idx(){
		return this.rcpt_rpt_idx;
	}

	public String getDept_clsf(){
		return this.dept_clsf;
	}

	public String getCret_frdt(){
		return this.cret_frdt;
	}

	public String getCret_todt(){
		return this.cret_todt;
	}

	public String getCret_stnd(){
		return this.cret_stnd;
	}

	public String getMngr_nm(){
		return this.mngr_nm;
	}

	public String getMngr_phon(){
		return this.mngr_phon;
	}

	public String getRpt_dt(){
		return this.rpt_dt;
	}

	public String getPay_frdt(){
		return this.pay_frdt;
	}

	public String getPay_todt(){
		return this.pay_todt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1252_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1252_ADM dm = (TN_LNK_1252_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpt_rpt_idx);
		cstmt.setString(5, dm.dept_clsf);
		cstmt.setString(6, dm.cret_frdt);
		cstmt.setString(7, dm.cret_todt);
		cstmt.setString(8, dm.cret_stnd);
		cstmt.setString(9, dm.mngr_nm);
		cstmt.setString(10, dm.mngr_phon);
		cstmt.setString(11, dm.rpt_dt);
		cstmt.setString(12, dm.pay_frdt);
		cstmt.setString(13, dm.pay_todt);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1252_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpt_rpt_idx = [" + getRcpt_rpt_idx() + "]");
		System.out.println("dept_clsf = [" + getDept_clsf() + "]");
		System.out.println("cret_frdt = [" + getCret_frdt() + "]");
		System.out.println("cret_todt = [" + getCret_todt() + "]");
		System.out.println("cret_stnd = [" + getCret_stnd() + "]");
		System.out.println("mngr_nm = [" + getMngr_nm() + "]");
		System.out.println("mngr_phon = [" + getMngr_phon() + "]");
		System.out.println("rpt_dt = [" + getRpt_dt() + "]");
		System.out.println("pay_frdt = [" + getPay_frdt() + "]");
		System.out.println("pay_todt = [" + getPay_todt() + "]");
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
String rcpt_rpt_idx = req.getParameter("rcpt_rpt_idx");
if( rcpt_rpt_idx == null){
	System.out.println(this.toString+" : rcpt_rpt_idx is null" );
}else{
	System.out.println(this.toString+" : rcpt_rpt_idx is "+rcpt_rpt_idx );
}
String dept_clsf = req.getParameter("dept_clsf");
if( dept_clsf == null){
	System.out.println(this.toString+" : dept_clsf is null" );
}else{
	System.out.println(this.toString+" : dept_clsf is "+dept_clsf );
}
String cret_frdt = req.getParameter("cret_frdt");
if( cret_frdt == null){
	System.out.println(this.toString+" : cret_frdt is null" );
}else{
	System.out.println(this.toString+" : cret_frdt is "+cret_frdt );
}
String cret_todt = req.getParameter("cret_todt");
if( cret_todt == null){
	System.out.println(this.toString+" : cret_todt is null" );
}else{
	System.out.println(this.toString+" : cret_todt is "+cret_todt );
}
String cret_stnd = req.getParameter("cret_stnd");
if( cret_stnd == null){
	System.out.println(this.toString+" : cret_stnd is null" );
}else{
	System.out.println(this.toString+" : cret_stnd is "+cret_stnd );
}
String mngr_nm = req.getParameter("mngr_nm");
if( mngr_nm == null){
	System.out.println(this.toString+" : mngr_nm is null" );
}else{
	System.out.println(this.toString+" : mngr_nm is "+mngr_nm );
}
String mngr_phon = req.getParameter("mngr_phon");
if( mngr_phon == null){
	System.out.println(this.toString+" : mngr_phon is null" );
}else{
	System.out.println(this.toString+" : mngr_phon is "+mngr_phon );
}
String rpt_dt = req.getParameter("rpt_dt");
if( rpt_dt == null){
	System.out.println(this.toString+" : rpt_dt is null" );
}else{
	System.out.println(this.toString+" : rpt_dt is "+rpt_dt );
}
String pay_frdt = req.getParameter("pay_frdt");
if( pay_frdt == null){
	System.out.println(this.toString+" : pay_frdt is null" );
}else{
	System.out.println(this.toString+" : pay_frdt is "+pay_frdt );
}
String pay_todt = req.getParameter("pay_todt");
if( pay_todt == null){
	System.out.println(this.toString+" : pay_todt is null" );
}else{
	System.out.println(this.toString+" : pay_todt is "+pay_todt );
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
String rcpt_rpt_idx = Util.checkString(req.getParameter("rcpt_rpt_idx"));
String dept_clsf = Util.checkString(req.getParameter("dept_clsf"));
String cret_frdt = Util.checkString(req.getParameter("cret_frdt"));
String cret_todt = Util.checkString(req.getParameter("cret_todt"));
String cret_stnd = Util.checkString(req.getParameter("cret_stnd"));
String mngr_nm = Util.checkString(req.getParameter("mngr_nm"));
String mngr_phon = Util.checkString(req.getParameter("mngr_phon"));
String rpt_dt = Util.checkString(req.getParameter("rpt_dt"));
String pay_frdt = Util.checkString(req.getParameter("pay_frdt"));
String pay_todt = Util.checkString(req.getParameter("pay_todt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpt_rpt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_rpt_idx")));
String dept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_clsf")));
String cret_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_frdt")));
String cret_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_todt")));
String cret_stnd = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_stnd")));
String mngr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mngr_nm")));
String mngr_phon = Util.Uni2Ksc(Util.checkString(req.getParameter("mngr_phon")));
String rpt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rpt_dt")));
String pay_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_frdt")));
String pay_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_todt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpt_rpt_idx(rcpt_rpt_idx);
dm.setDept_clsf(dept_clsf);
dm.setCret_frdt(cret_frdt);
dm.setCret_todt(cret_todt);
dm.setCret_stnd(cret_stnd);
dm.setMngr_nm(mngr_nm);
dm.setMngr_phon(mngr_phon);
dm.setRpt_dt(rpt_dt);
dm.setPay_frdt(pay_frdt);
dm.setPay_todt(pay_todt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 29 18:28:21 KST 2016 */