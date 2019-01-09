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


public class SS_SLS_EXTN_5030_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String mode;
	public String empseq;
	public String medi_qty;
	public String mob_qty;
	public String regdt;
	public String regno;

	public SS_SLS_EXTN_5030_IDM(){}
	public SS_SLS_EXTN_5030_IDM(String incmgpers, String mode, String empseq, String medi_qty, String mob_qty, String regdt, String regno){
		this.incmgpers = incmgpers;
		this.mode = mode;
		this.empseq = empseq;
		this.medi_qty = medi_qty;
		this.mob_qty = mob_qty;
		this.regdt = regdt;
		this.regno = regno;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setMedi_qty(String medi_qty){
		this.medi_qty = medi_qty;
	}

	public void setMob_qty(String mob_qty){
		this.mob_qty = mob_qty;
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

	public String getEmpseq(){
		return this.empseq;
	}

	public String getMedi_qty(){
		return this.medi_qty;
	}

	public String getMob_qty(){
		return this.mob_qty;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5030_I(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5030_IDM dm = (SS_SLS_EXTN_5030_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.empseq);
		cstmt.setString(6, dm.medi_qty);
		cstmt.setString(7, dm.mob_qty);
		cstmt.setString(8, dm.regdt);
		cstmt.setString(9, dm.regno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5030_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("empseq = [" + getEmpseq() + "]");
		System.out.println("medi_qty = [" + getMedi_qty() + "]");
		System.out.println("mob_qty = [" + getMob_qty() + "]");
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
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
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
String empseq = Util.checkString(req.getParameter("empseq"));
String medi_qty = Util.checkString(req.getParameter("medi_qty"));
String mob_qty = Util.checkString(req.getParameter("mob_qty"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String medi_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_qty")));
String mob_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("mob_qty")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setMode(mode);
dm.setEmpseq(empseq);
dm.setMedi_qty(medi_qty);
dm.setMob_qty(mob_qty);
dm.setRegdt(regdt);
dm.setRegno(regno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 20 10:50:43 KST 2016 */