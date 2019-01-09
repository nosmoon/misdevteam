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


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String selldeptcd;
	public String mode_ar;
	public String yymm_ar;
	public String bo_cd_ar;
	public String ufth_dedu_ar;
	public String remk_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_TRG_1920_ADM(){}
	public SE_TRG_1920_ADM(String cmpy_cd, String selldeptcd, String mode_ar, String yymm_ar, String bo_cd_ar, String ufth_dedu_ar, String remk_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.selldeptcd = selldeptcd;
		this.mode_ar = mode_ar;
		this.yymm_ar = yymm_ar;
		this.bo_cd_ar = bo_cd_ar;
		this.ufth_dedu_ar = ufth_dedu_ar;
		this.remk_ar = remk_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSelldeptcd(String selldeptcd){
		this.selldeptcd = selldeptcd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setYymm_ar(String yymm_ar){
		this.yymm_ar = yymm_ar;
	}

	public void setBo_cd_ar(String bo_cd_ar){
		this.bo_cd_ar = bo_cd_ar;
	}

	public void setUfth_dedu_ar(String ufth_dedu_ar){
		this.ufth_dedu_ar = ufth_dedu_ar;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSelldeptcd(){
		return this.selldeptcd;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getYymm_ar(){
		return this.yymm_ar;
	}

	public String getBo_cd_ar(){
		return this.bo_cd_ar;
	}

	public String getUfth_dedu_ar(){
		return this.ufth_dedu_ar;
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
		 return "{ call CRMSAL_COM.SP_SE_TRG_1920_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1920_ADM dm = (SE_TRG_1920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.selldeptcd);
		cstmt.setString(5, dm.mode_ar);
		cstmt.setString(6, dm.yymm_ar);
		cstmt.setString(7, dm.bo_cd_ar);
		cstmt.setString(8, dm.ufth_dedu_ar);
		cstmt.setString(9, dm.remk_ar);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1920_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("selldeptcd = " + getSelldeptcd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("yymm_ar = " + getYymm_ar());
        System.out.println("bo_cd_ar = " + getBo_cd_ar());
        System.out.println("ufth_dedu_ar = " + getUfth_dedu_ar());
        System.out.println("remk_ar = " + getRemk_ar());
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
String selldeptcd = req.getParameter("selldeptcd");
if( selldeptcd == null){
	System.out.println(this.toString+" : selldeptcd is null" );
}else{
	System.out.println(this.toString+" : selldeptcd is "+selldeptcd );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String yymm_ar = req.getParameter("yymm_ar");
if( yymm_ar == null){
	System.out.println(this.toString+" : yymm_ar is null" );
}else{
	System.out.println(this.toString+" : yymm_ar is "+yymm_ar );
}
String bo_cd_ar = req.getParameter("bo_cd_ar");
if( bo_cd_ar == null){
	System.out.println(this.toString+" : bo_cd_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cd_ar is "+bo_cd_ar );
}
String ufth_dedu_ar = req.getParameter("ufth_dedu_ar");
if( ufth_dedu_ar == null){
	System.out.println(this.toString+" : ufth_dedu_ar is null" );
}else{
	System.out.println(this.toString+" : ufth_dedu_ar is "+ufth_dedu_ar );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String selldeptcd = Util.checkString(req.getParameter("selldeptcd"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String yymm_ar = Util.checkString(req.getParameter("yymm_ar"));
String bo_cd_ar = Util.checkString(req.getParameter("bo_cd_ar"));
String ufth_dedu_ar = Util.checkString(req.getParameter("ufth_dedu_ar"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String selldeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selldeptcd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String yymm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_ar")));
String bo_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd_ar")));
String ufth_dedu_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("ufth_dedu_ar")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSelldeptcd(selldeptcd);
dm.setMode_ar(mode_ar);
dm.setYymm_ar(yymm_ar);
dm.setBo_cd_ar(bo_cd_ar);
dm.setUfth_dedu_ar(ufth_dedu_ar);
dm.setRemk_ar(remk_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 14:09:24 KST 2009 */