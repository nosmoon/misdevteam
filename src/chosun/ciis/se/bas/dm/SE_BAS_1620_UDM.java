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


package chosun.ciis.se.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.ds.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1620_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode_ar;
	public String sell_net_clsf_ar;
	public String aply_mm_ar;
	public String aply_bgn_dd_ar;
	public String enty_rate_ar;
	public String remk_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_BAS_1620_UDM(){}
	public SE_BAS_1620_UDM(String cmpy_cd, String mode_ar, String sell_net_clsf_ar, String aply_mm_ar, String aply_bgn_dd_ar, String enty_rate_ar, String remk_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode_ar = mode_ar;
		this.sell_net_clsf_ar = sell_net_clsf_ar;
		this.aply_mm_ar = aply_mm_ar;
		this.aply_bgn_dd_ar = aply_bgn_dd_ar;
		this.enty_rate_ar = enty_rate_ar;
		this.remk_ar = remk_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setSell_net_clsf_ar(String sell_net_clsf_ar){
		this.sell_net_clsf_ar = sell_net_clsf_ar;
	}

	public void setAply_mm_ar(String aply_mm_ar){
		this.aply_mm_ar = aply_mm_ar;
	}

	public void setAply_bgn_dd_ar(String aply_bgn_dd_ar){
		this.aply_bgn_dd_ar = aply_bgn_dd_ar;
	}

	public void setEnty_rate_ar(String enty_rate_ar){
		this.enty_rate_ar = enty_rate_ar;
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

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getSell_net_clsf_ar(){
		return this.sell_net_clsf_ar;
	}

	public String getAply_mm_ar(){
		return this.aply_mm_ar;
	}

	public String getAply_bgn_dd_ar(){
		return this.aply_bgn_dd_ar;
	}

	public String getEnty_rate_ar(){
		return this.enty_rate_ar;
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
		 return "{ call CRMSAL_COM.SP_SE_BAS_1620_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BAS_1620_UDM dm = (SE_BAS_1620_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode_ar);
		cstmt.setString(5, dm.sell_net_clsf_ar);
		cstmt.setString(6, dm.aply_mm_ar);
		cstmt.setString(7, dm.aply_bgn_dd_ar);
		cstmt.setString(8, dm.enty_rate_ar);
		cstmt.setString(9, dm.remk_ar);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bas.ds.SE_BAS_1620_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("sell_net_clsf_ar = " + getSell_net_clsf_ar());
        System.out.println("aply_mm_ar = " + getAply_mm_ar());
        System.out.println("aply_bgn_dd_ar = " + getAply_bgn_dd_ar());
        System.out.println("enty_rate_ar = " + getEnty_rate_ar());
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
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String sell_net_clsf_ar = req.getParameter("sell_net_clsf_ar");
if( sell_net_clsf_ar == null){
	System.out.println(this.toString+" : sell_net_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : sell_net_clsf_ar is "+sell_net_clsf_ar );
}
String aply_mm_ar = req.getParameter("aply_mm_ar");
if( aply_mm_ar == null){
	System.out.println(this.toString+" : aply_mm_ar is null" );
}else{
	System.out.println(this.toString+" : aply_mm_ar is "+aply_mm_ar );
}
String aply_bgn_dd_ar = req.getParameter("aply_bgn_dd_ar");
if( aply_bgn_dd_ar == null){
	System.out.println(this.toString+" : aply_bgn_dd_ar is null" );
}else{
	System.out.println(this.toString+" : aply_bgn_dd_ar is "+aply_bgn_dd_ar );
}
String enty_rate_ar = req.getParameter("enty_rate_ar");
if( enty_rate_ar == null){
	System.out.println(this.toString+" : enty_rate_ar is null" );
}else{
	System.out.println(this.toString+" : enty_rate_ar is "+enty_rate_ar );
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
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String sell_net_clsf_ar = Util.checkString(req.getParameter("sell_net_clsf_ar"));
String aply_mm_ar = Util.checkString(req.getParameter("aply_mm_ar"));
String aply_bgn_dd_ar = Util.checkString(req.getParameter("aply_bgn_dd_ar"));
String enty_rate_ar = Util.checkString(req.getParameter("enty_rate_ar"));
String remk_ar = Util.checkString(req.getParameter("remk_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String sell_net_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_net_clsf_ar")));
String aply_mm_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_mm_ar")));
String aply_bgn_dd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_bgn_dd_ar")));
String enty_rate_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("enty_rate_ar")));
String remk_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode_ar(mode_ar);
dm.setSell_net_clsf_ar(sell_net_clsf_ar);
dm.setAply_mm_ar(aply_mm_ar);
dm.setAply_bgn_dd_ar(aply_bgn_dd_ar);
dm.setEnty_rate_ar(enty_rate_ar);
dm.setRemk_ar(remk_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 19:13:07 KST 2009 */