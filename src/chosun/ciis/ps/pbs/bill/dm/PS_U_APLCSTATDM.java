/***************************************************************************************************
* 파일명 : PS_U_APLCSTAT.java
* 기능   : 자동이체신청 확인/취소
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체신청 확인/취소
 *
 */

public class PS_U_APLCSTATDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String aplcyn;
	public String aplcno;
	public String shftclsf;
	public String aplcdt;

	public PS_U_APLCSTATDM(){}
	public PS_U_APLCSTATDM(String incmgpers, String aplcyn, String aplcno, String shftclsf, String aplcdt){
		this.incmgpers = incmgpers;
		this.aplcyn = aplcyn;
		this.aplcno = aplcno;
		this.shftclsf = shftclsf;
		this.aplcdt = aplcdt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcyn(String aplcyn){
		this.aplcyn = aplcyn;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcyn(){
		return this.aplcyn;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getSQL(){
		 return "{ call SP_PS_U_APLCSTAT( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_U_APLCSTATDM dm = (PS_U_APLCSTATDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.aplcyn);
		cstmt.setString(5, dm.aplcno);
		cstmt.setString(6, dm.shftclsf);
		cstmt.setString(7, dm.aplcdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_U_APLCSTATDataSet();
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
String aplcyn = req.getParameter("aplcyn");
if( aplcyn == null){
	System.out.println(this.toString+" : aplcyn is null" );
}else{
	System.out.println(this.toString+" : aplcyn is "+aplcyn );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String shftclsf = req.getParameter("shftclsf");
if( shftclsf == null){
	System.out.println(this.toString+" : shftclsf is null" );
}else{
	System.out.println(this.toString+" : shftclsf is "+shftclsf );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcyn = Util.checkString(req.getParameter("aplcyn"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String shftclsf = Util.checkString(req.getParameter("shftclsf"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcyn = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcyn")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String shftclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsf")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAplcyn(aplcyn);
dm.setAplcno(aplcno);
dm.setShftclsf(shftclsf);
dm.setAplcdt(aplcdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 24 13:44:35 KST 2006 */