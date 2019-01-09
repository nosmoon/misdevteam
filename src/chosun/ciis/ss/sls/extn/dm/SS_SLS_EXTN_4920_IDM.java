/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4920_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String mode;
	public String yymm;
	public String dncomp;
	public String adv_id;
	public String adv_nm;
	public String medi_qty;
	public String mob_qty;
	public String medi_amt;
	public String mob_amt;
	public String regdt;
	public String regno;

	public SS_SLS_EXTN_4920_IDM(){}
	public SS_SLS_EXTN_4920_IDM(String incmgpers, String mode, String yymm, String dncomp, String adv_id, String adv_nm, String medi_qty, String mob_qty, String medi_amt, String mob_amt, String regdt, String regno){
		this.incmgpers = incmgpers;
		this.mode = mode;
		this.yymm = yymm;
		this.dncomp = dncomp;
		this.adv_id = adv_id;
		this.adv_nm = adv_nm;
		this.medi_qty = medi_qty;
		this.mob_qty = mob_qty;
		this.medi_amt = medi_amt;
		this.mob_amt = mob_amt;
		this.regdt = regdt;
		this.regno = regno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setAdv_id(String adv_id){
		this.adv_id = adv_id;
	}
	
	public void setAdv_nm(String adv_nm){
		this.adv_nm = adv_nm;
	}

	public void setMedi_qty(String medi_qty){
		this.medi_qty = medi_qty;
	}

	public void setMob_qty(String mob_qty){
		this.mob_qty = mob_qty;
	}

	public void setMedi_amt(String medi_amt){
		this.medi_amt = medi_amt;
	}

	public void setMob_amt(String mob_amt){
		this.mob_amt = mob_amt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getAdv_id(){
		return this.adv_id;
	}
	
	public String getAdv_nm(){
		return this.adv_nm;
	}

	public String getMedi_qty(){
		return this.medi_qty;
	}

	public String getMob_qty(){
		return this.mob_qty;
	}

	public String getMedi_amt(){
		return this.medi_amt;
	}

	public String getMob_amt(){
		return this.mob_amt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4920_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4920_IDM dm = (SS_SLS_EXTN_4920_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.dncomp);
		cstmt.setString(7, dm.adv_id);
		cstmt.setString(8, dm.adv_nm);
		cstmt.setString(9, dm.medi_qty);
		cstmt.setString(10, dm.mob_qty);
		cstmt.setString(11, dm.medi_amt);
		cstmt.setString(12, dm.mob_amt);
		cstmt.setString(13, dm.regdt);
		cstmt.setString(14, dm.regno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4920_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("dncomp = [" + getDncomp() + "]");
		System.out.println("adv_id = [" + getAdv_id() + "]");
		System.out.println("medi_qty = [" + getMedi_qty() + "]");
		System.out.println("mob_qty = [" + getMob_qty() + "]");
		System.out.println("medi_amt = [" + getMedi_amt() + "]");
		System.out.println("mob_amt = [" + getMob_amt() + "]");
		System.out.println("regdt = [" + getRegdt() + "]");
		System.out.println("regno = [" + getRegno() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String dncomp = req.getParameter("dncomp");
if( dncomp == null){
	System.out.println(this.toString+" : dncomp is null" );
}else{
	System.out.println(this.toString+" : dncomp is "+dncomp );
}
String adv_id = req.getParameter("adv_id");
if( adv_id == null){
	System.out.println(this.toString+" : adv_id is null" );
}else{
	System.out.println(this.toString+" : adv_id is "+adv_id );
}
String medi_qty = req.getParameter("medi_qty");
if( medi_qty == null){
	System.out.println(this.toString+" : medi_qty is null" );
}else{
	System.out.println(this.toString+" : medi_qty is "+medi_qty );
}
String mob_qty = req.getParameter("mob_qty");
if( mob_qty == null){
	System.out.println(this.toString+" : mob_qty is null" );
}else{
	System.out.println(this.toString+" : mob_qty is "+mob_qty );
}
String medi_amt = req.getParameter("medi_amt");
if( medi_amt == null){
	System.out.println(this.toString+" : medi_amt is null" );
}else{
	System.out.println(this.toString+" : medi_amt is "+medi_amt );
}
String mob_amt = req.getParameter("mob_amt");
if( mob_amt == null){
	System.out.println(this.toString+" : mob_amt is null" );
}else{
	System.out.println(this.toString+" : mob_amt is "+mob_amt );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String mode = Util.checkString(req.getParameter("mode"));
String yymm = Util.checkString(req.getParameter("yymm"));
String dncomp = Util.checkString(req.getParameter("dncomp"));
String adv_id = Util.checkString(req.getParameter("adv_id"));
String medi_qty = Util.checkString(req.getParameter("medi_qty"));
String mob_qty = Util.checkString(req.getParameter("mob_qty"));
String medi_amt = Util.checkString(req.getParameter("medi_amt"));
String mob_amt = Util.checkString(req.getParameter("mob_amt"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
String adv_id = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_id")));
String medi_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_qty")));
String mob_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("mob_qty")));
String medi_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_amt")));
String mob_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mob_amt")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setMode(mode);
dm.setYymm(yymm);
dm.setDncomp(dncomp);
dm.setAdv_id(adv_id);
dm.setMedi_qty(medi_qty);
dm.setMob_qty(mob_qty);
dm.setMedi_amt(medi_amt);
dm.setMob_amt(mob_amt);
dm.setRegdt(regdt);
dm.setRegno(regno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 15 19:03:17 KST 2016 */