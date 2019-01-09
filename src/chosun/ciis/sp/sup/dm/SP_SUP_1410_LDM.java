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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acpn_frdt;
	public String acpn_todt;
	public String cns_clsf;
	public String clsf;
	public String cont;
	public String incmg_pers;

	public SP_SUP_1410_LDM(){}
	public SP_SUP_1410_LDM(String cmpy_cd, String acpn_frdt, String acpn_todt, String cns_clsf, String clsf, String cont, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.acpn_frdt = acpn_frdt;
		this.acpn_todt = acpn_todt;
		this.cns_clsf = cns_clsf;
		this.clsf = clsf;
		this.cont = cont;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_frdt(String acpn_frdt){
		this.acpn_frdt = acpn_frdt;
	}

	public void setAcpn_todt(String acpn_todt){
		this.acpn_todt = acpn_todt;
	}

	public void setCns_clsf(String cns_clsf){
		this.cns_clsf = cns_clsf;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_frdt(){
		return this.acpn_frdt;
	}

	public String getAcpn_todt(){
		return this.acpn_todt;
	}

	public String getCns_clsf(){
		return this.cns_clsf;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getCont(){
		return this.cont;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1410_LDM dm = (SP_SUP_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acpn_frdt);
		cstmt.setString(5, dm.acpn_todt);
		cstmt.setString(6, dm.cns_clsf);
		cstmt.setString(7, dm.clsf);
		cstmt.setString(8, dm.cont);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_frdt = [" + getAcpn_frdt() + "]");
		System.out.println("acpn_todt = [" + getAcpn_todt() + "]");
		System.out.println("cns_clsf = [" + getCns_clsf() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("cont = [" + getCont() + "]");
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
String acpn_frdt = req.getParameter("acpn_frdt");
if( acpn_frdt == null){
	System.out.println(this.toString+" : acpn_frdt is null" );
}else{
	System.out.println(this.toString+" : acpn_frdt is "+acpn_frdt );
}
String acpn_todt = req.getParameter("acpn_todt");
if( acpn_todt == null){
	System.out.println(this.toString+" : acpn_todt is null" );
}else{
	System.out.println(this.toString+" : acpn_todt is "+acpn_todt );
}
String cns_clsf = req.getParameter("cns_clsf");
if( cns_clsf == null){
	System.out.println(this.toString+" : cns_clsf is null" );
}else{
	System.out.println(this.toString+" : cns_clsf is "+cns_clsf );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
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
String acpn_frdt = Util.checkString(req.getParameter("acpn_frdt"));
String acpn_todt = Util.checkString(req.getParameter("acpn_todt"));
String cns_clsf = Util.checkString(req.getParameter("cns_clsf"));
String clsf = Util.checkString(req.getParameter("clsf"));
String cont = Util.checkString(req.getParameter("cont"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_frdt")));
String acpn_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_todt")));
String cns_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_clsf")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_frdt(acpn_frdt);
dm.setAcpn_todt(acpn_todt);
dm.setCns_clsf(cns_clsf);
dm.setClsf(clsf);
dm.setCont(cont);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 23:12:32 KST 2012 */