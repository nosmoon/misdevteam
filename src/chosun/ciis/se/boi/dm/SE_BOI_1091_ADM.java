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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1091_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String bo_cd;
	public String bo_seq;
	public String mode_ar;
	public String vexc_mang_pers_ar;
	public String empno_ar;
	public String remk_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BOI_1091_ADM(){}
	public SE_BOI_1091_ADM(String accflag, String cmpy_cd, String bo_cd, String bo_seq, String mode_ar, String vexc_mang_pers_ar, String empno_ar, String remk_ar, String incmg_pers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.mode_ar = mode_ar;
		this.vexc_mang_pers_ar = vexc_mang_pers_ar;
		this.empno_ar = empno_ar;
		this.remk_ar = remk_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setVexc_mang_pers_ar(String vexc_mang_pers_ar){
		this.vexc_mang_pers_ar = vexc_mang_pers_ar;
	}

	public void setEmpno_ar(String empno_ar){
		this.empno_ar = empno_ar;
	}

	public void setRemk_ar(String remk_ar){
		this.remk_ar = remk_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getVexc_mang_pers_ar(){
		return this.vexc_mang_pers_ar;
	}

	public String getEmpno_ar(){
		return this.empno_ar;
	}

	public String getRemk_ar(){
		return this.remk_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_1091_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1091_ADM dm = (SE_BOI_1091_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bo_cd);
		cstmt.setString(6, dm.bo_seq);
		cstmt.setString(7, dm.mode_ar);
		cstmt.setString(8, dm.vexc_mang_pers_ar);
		cstmt.setString(9, dm.empno_ar);
		cstmt.setString(10, dm.remk_ar);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1091_ADataSet();
	}



    public void print(){
        System.out.println("accflag = " + getAccflag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("bo_seq = " + getBo_seq());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("vexc_mang_pers_ar = " + getVexc_mang_pers_ar());
        System.out.println("empno_ar = " + getEmpno_ar());
        System.out.println("remk_ar = " + getRemk_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String vexc_mang_pers_ar = req.getParameter("vexc_mang_pers_ar");
if( vexc_mang_pers_ar == null){
	System.out.println(this.toString+" : vexc_mang_pers_ar is null" );
}else{
	System.out.println(this.toString+" : vexc_mang_pers_ar is "+vexc_mang_pers_ar );
}
String empno_ar = req.getParameter("empno_ar");
if( empno_ar == null){
	System.out.println(this.toString+" : empno_ar is null" );
}else{
	System.out.println(this.toString+" : empno_ar is "+empno_ar );
}
String remk_ar = req.getParameter("remk_ar");
if( remk_ar == null){
	System.out.println(this.toString+" : remk_ar is null" );
}else{
	System.out.println(this.toString+" : remk_ar is "+remk_ar );
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

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String vexc_mang_pers_ar = Util.checkString(req.getParameter("vexc_mang_pers_ar"));
String empno_ar = Util.checkString(req.getParameter("empno_ar"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String vexc_mang_pers_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_mang_pers_ar")));
String empno_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("empno_ar")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setMode_ar(mode_ar);
dm.setVexc_mang_pers_ar(vexc_mang_pers_ar);
dm.setEmpno_ar(empno_ar);
dm.setRemk_ar(remk_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 15:41:54 KST 2009 */