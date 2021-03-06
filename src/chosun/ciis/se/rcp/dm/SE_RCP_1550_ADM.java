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


public class SE_RCP_1550_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode_ar;
	public String area_cd_ar;
	public String occr_dt_ar;
	public String slip_clsf_ar;
	public String seq_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_1550_ADM(){}
	public SE_RCP_1550_ADM(String cmpy_cd, String mode_ar, String area_cd_ar, String occr_dt_ar, String slip_clsf_ar, String seq_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode_ar = mode_ar;
		this.area_cd_ar = area_cd_ar;
		this.occr_dt_ar = occr_dt_ar;
		this.slip_clsf_ar = slip_clsf_ar;
		this.seq_ar = seq_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setArea_cd_ar(String area_cd_ar){
		this.area_cd_ar = area_cd_ar;
	}

	public void setOccr_dt_ar(String occr_dt_ar){
		this.occr_dt_ar = occr_dt_ar;
	}

	public void setSlip_clsf_ar(String slip_clsf_ar){
		this.slip_clsf_ar = slip_clsf_ar;
	}

	public void setSeq_ar(String seq_ar){
		this.seq_ar = seq_ar;
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

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getArea_cd_ar(){
		return this.area_cd_ar;
	}

	public String getOccr_dt_ar(){
		return this.occr_dt_ar;
	}

	public String getSlip_clsf_ar(){
		return this.slip_clsf_ar;
	}

	public String getSeq_ar(){
		return this.seq_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_1550_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_1550_ADM dm = (SE_RCP_1550_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode_ar);
		cstmt.setString(5, dm.area_cd_ar);
		cstmt.setString(6, dm.occr_dt_ar);
		cstmt.setString(7, dm.slip_clsf_ar);
		cstmt.setString(8, dm.seq_ar);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_1550_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("area_cd_ar = " + getArea_cd_ar());
        System.out.println("occr_dt_ar = " + getOccr_dt_ar());
        System.out.println("slip_clsf_ar = " + getSlip_clsf_ar());
        System.out.println("seq_ar = " + getSeq_ar());
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
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String area_cd_ar = req.getParameter("area_cd_ar");
if( area_cd_ar == null){
	System.out.println(this.toString+" : area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : area_cd_ar is "+area_cd_ar );
}
String occr_dt_ar = req.getParameter("occr_dt_ar");
if( occr_dt_ar == null){
	System.out.println(this.toString+" : occr_dt_ar is null" );
}else{
	System.out.println(this.toString+" : occr_dt_ar is "+occr_dt_ar );
}
String slip_clsf_ar = req.getParameter("slip_clsf_ar");
if( slip_clsf_ar == null){
	System.out.println(this.toString+" : slip_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_ar is "+slip_clsf_ar );
}
String seq_ar = req.getParameter("seq_ar");
if( seq_ar == null){
	System.out.println(this.toString+" : seq_ar is null" );
}else{
	System.out.println(this.toString+" : seq_ar is "+seq_ar );
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
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String area_cd_ar = Util.checkString(req.getParameter("area_cd_ar"));
String occr_dt_ar = Util.checkString(req.getParameter("occr_dt_ar"));
String slip_clsf_ar = Util.checkString(req.getParameter("slip_clsf_ar"));
String seq_ar = Util.checkString(req.getParameter("seq_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd_ar")));
String occr_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_ar")));
String slip_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_ar")));
String seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode_ar(mode_ar);
dm.setArea_cd_ar(area_cd_ar);
dm.setOccr_dt_ar(occr_dt_ar);
dm.setSlip_clsf_ar(slip_clsf_ar);
dm.setSeq_ar(seq_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 26 11:19:36 KST 2009 */