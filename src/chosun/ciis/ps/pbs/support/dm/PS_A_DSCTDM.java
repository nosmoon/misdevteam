/***************************************************************************************************
* 파일명 : PS_A_DSCTDM
* 기능 :  불편접수처리 상세내역보기
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편접수된 리스트에서 선택된 상세내역을 보여준다.
 *
 */
public class PS_A_DSCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String cns_empnm;
	public String accflag;
	public String regdt;
	public String regno;
	public String proccont;
	public String boprocyn;
	public String procpers;

	public PS_A_DSCTDM(){}
	public PS_A_DSCTDM(String incmgpers, String cns_empnm, String accflag, String regdt, String regno, String proccont, String boprocyn, String procpers){
		this.incmgpers = incmgpers;
		this.cns_empnm = cns_empnm;
		this.accflag = accflag;
		this.regdt = regdt;
		this.regno = regno;
		this.proccont = proccont;
		this.boprocyn = boprocyn;
		this.procpers = procpers;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setProccont(String proccont){
		this.proccont = proccont;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getProccont(){
		return this.proccont;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getSQL(){
		 return "{ call SP_PS_A_DSCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_A_DSCTDM dm = (PS_A_DSCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.cns_empnm);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.regdt);
		cstmt.setString(7, dm.regno);
		cstmt.setString(8, dm.proccont);
		cstmt.setString(9, dm.boprocyn);
		cstmt.setString(10, dm.procpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_A_DSCTDataSet();
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
String cns_empnm = req.getParameter("cns_empnm");
if( cns_empnm == null){
	System.out.println(this.toString+" : cns_empnm is null" );
}else{
	System.out.println(this.toString+" : cns_empnm is "+cns_empnm );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
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
String proccont = req.getParameter("proccont");
if( proccont == null){
	System.out.println(this.toString+" : proccont is null" );
}else{
	System.out.println(this.toString+" : proccont is "+proccont );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String procpers = req.getParameter("procpers");
if( procpers == null){
	System.out.println(this.toString+" : procpers is null" );
}else{
	System.out.println(this.toString+" : procpers is "+procpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cns_empnm = Util.checkString(req.getParameter("cns_empnm"));
String accflag = Util.checkString(req.getParameter("accflag"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String proccont = Util.checkString(req.getParameter("proccont"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String procpers = Util.checkString(req.getParameter("procpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String proccont = Util.Uni2Ksc(Util.checkString(req.getParameter("proccont")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setCns_empnm(cns_empnm);
dm.setAccflag(accflag);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setProccont(proccont);
dm.setBoprocyn(boprocyn);
dm.setProcpers(procpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jan 03 14:34:02 KST 2004 */