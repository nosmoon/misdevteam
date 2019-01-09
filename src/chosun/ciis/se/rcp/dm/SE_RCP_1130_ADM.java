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


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_1130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String trsf_bo_cd;
	public String trsf_bo_seq;
	public String trsf_amt;
	public String mode_ar;
	public String acpt_bo_cdseq_ar;
	public String acpt_amt_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_1130_ADM(){}
	public SE_RCP_1130_ADM(String cmpy_cd, String trsf_bo_cd, String trsf_bo_seq, String trsf_amt, String mode_ar, String acpt_bo_cdseq_ar, String acpt_amt_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.trsf_bo_cd = trsf_bo_cd;
		this.trsf_bo_seq = trsf_bo_seq;
		this.trsf_amt = trsf_amt;
		this.mode_ar = mode_ar;
		this.acpt_bo_cdseq_ar = acpt_bo_cdseq_ar;
		this.acpt_amt_ar = acpt_amt_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTrsf_bo_cd(String trsf_bo_cd){
		this.trsf_bo_cd = trsf_bo_cd;
	}

	public void setTrsf_bo_seq(String trsf_bo_seq){
		this.trsf_bo_seq = trsf_bo_seq;
	}

	public void setTrsf_amt(String trsf_amt){
		this.trsf_amt = trsf_amt;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setAcpt_bo_cdseq_ar(String acpt_bo_cdseq_ar){
		this.acpt_bo_cdseq_ar = acpt_bo_cdseq_ar;
	}

	public void setAcpt_amt_ar(String acpt_amt_ar){
		this.acpt_amt_ar = acpt_amt_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTrsf_bo_cd(){
		return this.trsf_bo_cd;
	}

	public String getTrsf_bo_seq(){
		return this.trsf_bo_seq;
	}

	public String getTrsf_amt(){
		return this.trsf_amt;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getAcpt_bo_cdseq_ar(){
		return this.acpt_bo_cdseq_ar;
	}

	public String getAcpt_amt_ar(){
		return this.acpt_amt_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1130_ADM dm = (SE_RCP_1130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.trsf_bo_cd);
		cstmt.setString(5, dm.trsf_bo_seq);
		cstmt.setString(6, dm.trsf_amt);
		cstmt.setString(7, dm.mode_ar);
		cstmt.setString(8, dm.acpt_bo_cdseq_ar);
		cstmt.setString(9, dm.acpt_amt_ar);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1130_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("trsf_bo_cd = " + getTrsf_bo_cd());
        System.out.println("trsf_bo_seq = " + getTrsf_bo_seq());
        System.out.println("trsf_amt = " + getTrsf_amt());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("acpt_bo_cdseq_ar = " + getAcpt_bo_cdseq_ar());
        System.out.println("acpt_amt_ar = " + getAcpt_amt_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String trsf_bo_cd = req.getParameter("trsf_bo_cd");
if( trsf_bo_cd == null){
	System.out.println(this.toString+" : trsf_bo_cd is null" );
}else{
	System.out.println(this.toString+" : trsf_bo_cd is "+trsf_bo_cd );
}
String trsf_bo_seq = req.getParameter("trsf_bo_seq");
if( trsf_bo_seq == null){
	System.out.println(this.toString+" : trsf_bo_seq is null" );
}else{
	System.out.println(this.toString+" : trsf_bo_seq is "+trsf_bo_seq );
}
String trsf_amt = req.getParameter("trsf_amt");
if( trsf_amt == null){
	System.out.println(this.toString+" : trsf_amt is null" );
}else{
	System.out.println(this.toString+" : trsf_amt is "+trsf_amt );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String acpt_bo_cdseq_ar = req.getParameter("acpt_bo_cdseq_ar");
if( acpt_bo_cdseq_ar == null){
	System.out.println(this.toString+" : acpt_bo_cdseq_ar is null" );
}else{
	System.out.println(this.toString+" : acpt_bo_cdseq_ar is "+acpt_bo_cdseq_ar );
}
String acpt_amt_ar = req.getParameter("acpt_amt_ar");
if( acpt_amt_ar == null){
	System.out.println(this.toString+" : acpt_amt_ar is null" );
}else{
	System.out.println(this.toString+" : acpt_amt_ar is "+acpt_amt_ar );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String trsf_bo_cd = Util.checkString(req.getParameter("trsf_bo_cd"));
String trsf_bo_seq = Util.checkString(req.getParameter("trsf_bo_seq"));
String trsf_amt = Util.checkString(req.getParameter("trsf_amt"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String acpt_bo_cdseq_ar = Util.checkString(req.getParameter("acpt_bo_cdseq_ar"));
String acpt_amt_ar = Util.checkString(req.getParameter("acpt_amt_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String trsf_bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("trsf_bo_cd")));
String trsf_bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("trsf_bo_seq")));
String trsf_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trsf_amt")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String acpt_bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_bo_cdseq_ar")));
String acpt_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_amt_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTrsf_bo_cd(trsf_bo_cd);
dm.setTrsf_bo_seq(trsf_bo_seq);
dm.setTrsf_amt(trsf_amt);
dm.setMode_ar(mode_ar);
dm.setAcpt_bo_cdseq_ar(acpt_bo_cdseq_ar);
dm.setAcpt_amt_ar(acpt_amt_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 19:10:13 KST 2009 */