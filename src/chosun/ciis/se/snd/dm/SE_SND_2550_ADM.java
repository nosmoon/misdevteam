/***************************************************************************************************
* 파일명 : SE_SND_2550_ADM.java
* 기능 : 판매-발송관리-발송비청구
* 작성일자 : 2009-02-26
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2550_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd			;
	public String mode				;
	public String reg_dt			;
	public String reg_seq			;
	public String selldeptcd		;
	public String incmg_pers_ip		;
	public String incmg_pers		;
	
	public SE_SND_2550_ADM(){}
	public SE_SND_2550_ADM( String cmpy_cd , String mode, String reg_dt, String reg_seq, String selldeptcd, String incmg_pers_ip, String incmg_pers ){
		this.cmpy_cd              = cmpy_cd            ;
		this.mode				  = mode			   ;
		this.reg_dt               = reg_dt             ;
		this.reg_seq              = reg_seq            ;
		this.selldeptcd			  = selldeptcd		   ;
		this.incmg_pers_ip		  = incmg_pers_ip	   ;
		this.incmg_pers			  = incmg_pers		   ;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2550_A( ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2550_ADM dm = (SE_SND_2550_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, cmpy_cd            );
		cstmt.setString( 4, mode               );
		cstmt.setString( 5, reg_dt             );
		cstmt.setString( 6, reg_seq            );
		cstmt.setString( 7, selldeptcd         );
		cstmt.setString( 8, incmg_pers_ip      );
		cstmt.setString( 9, incmg_pers         );
	}

	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2550_ADataSet();
	}
		
    public void print(){
    	System.out.println("cmpy_cd            = " + getCmpy_cd            ());
    	System.out.println("mode	           = " + getMode               ());
    	System.out.println("reg_dt             = " + getReg_dt             ());
    	System.out.println("reg_seq            = " + getReg_seq            ());
    	System.out.println("selldeptcd         = " + getSelldeptcd         ());
    	System.out.println("incmg_pers_ip      = " + getIncmg_pers_ip      ());
    	System.out.println("incmg_pers         = " + getIncmg_pers         ());
    }
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getReg_seq() {
		return reg_seq;
	}
	public void setReg_seq(String reg_seq) {
		this.reg_seq = reg_seq;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getSelldeptcd() {
		return selldeptcd;
	}
	public void setSelldeptcd(String selldeptcd) {
		this.selldeptcd = selldeptcd;
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
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 17:16:24 KST 2009 */